// Copyright 2014-02-15 PlanBase Inc. & Glen Peterson
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.organicdesign.fp.ephemeral;

import org.organicdesign.fp.Option;
import org.organicdesign.fp.function.Function1;

import java.util.Iterator;

class ViewFlatMapped<T,U> implements View<U> {
    private final View<T> outerView;

    private Iterator<U> innerIter = null;

    private final Function1<? super T,Iterable<U>> func;

    ViewFlatMapped(View<T> v, Function1<? super T,Iterable<U>> f) { outerView = v; func = f; }

    @SuppressWarnings("unchecked")
    public static <T,U> View<U> of(View<T> v, Function1<? super T,Iterable<U>> f) {
        // You can put nulls in, but you don't get nulls out.
        if (f == null) { return View.emptyView(); }
        // TODO: Is this comparison possible?
        if (Function1.IDENTITY.equals(f)) { return (View<U>) v; }
        if ( (v == null) || (v == EMPTY_VIEW) ) { return View.emptyView(); }
        return new ViewFlatMapped<>(v, f);
    }

    @Override
    public Option<U> next() {
        if (innerIter == null) {
            Option<T> item = outerView.next();
            if (!item.isSome()) { return Option.none(); }
            innerIter = func.apply(item.get()).iterator();
        }
        if (!innerIter.hasNext()) {
            innerIter = null;
            return next();
        }
        return Option.of(innerIter.next());
    }
}
