Type-safe immutable/persistent collections for Kotlin.
This is a subset of the [Paguro](https://github.com/GlenKPeterson/Paguro) project.
The exact relationship between Paguro and PaguroKx will become more clear over time.
For now, PaguroKx is intended to be just collections, just for Kotlin.
You could think of it as "Extract of Paguro" or "Paguro Lite".

# Features

* **Immutable collections**
* **Tiny**

[API Docs](https://glenkpeterson.github.io/PaguroKx/apidocs/index.html)

[![Build Status](https://travis-ci.org/GlenKPeterson/PaguroKx.svg?branch=master)](https://travis-ci.org/GlenKPeterson/PaguroKx)
[![Code Coverage](http://codecov.io/github/GlenKPeterson/PaguroKx/coverage.svg?branch=master)](http://codecov.io/github/GlenKPeterson/PaguroKx?branch=master)

[![Join the chat at https://gitter.im/GlenKPeterson/PaguroKx](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/GlenKPeterson/PaguroKx?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Available from the [Maven Repository](http://mvnrepository.com/artifact/org.organicdesign/PaguroKx) as:
```xml
<!--
If you're new to PaguroKx, consider starting with the streamlined
3.0 Alpha version instead (on the 2016-05-22_RRB-Tree branch)
 -->
<dependency>
        <groupId>org.organicdesign</groupId>
        <artifactId>PaguroKx</artifactId>
        <version>0.1-SNAPSHOT</version>
</dependency>
```

# Details

* OBSOLETE: [Class/Interface Hierarchy](inheritanceHierarchy.pdf) (PDF)

# Manifesto

* Immutability promotes correct code as much as type safety does.
* Minimal, easy-to-understand interface covering the most critical building blocks for higher functionality.

# License Overview
Java&trade; is a registered trademark of the Oracle Corporation in the US and other countries.
PaguroKx is not part of Java.
Oracle is in no way affiliated with the PaguroKx project.

PaguroKx is not part of Clojure.
Rich Hickey and the Clojure team are in no way affiliated with the PaguroKx project, though it borrows heavily from their thoughts and is partly a derivative work of their open-source code.

The Clojure collections are licensed under the Eclipse Public License.
Versions of them have been included in this project and modified to add type safety and implement different interfaces.
These files are still derivative works under the EPL.

Unless otherwise stated, the rest of this work is licensed under the Apache 2.0 license.
New contributions should be made under the Apache 2.0 license whenever practical.
I believe it is more popular, clearer, and has been better tested in courts of law.

PaguroKx *is* related to Paguro.

# License Details
The [EPL is not compatable with the GPL version 2 or 3](https://eclipse.org/legal/eplfaq.php#GPLCOMPATIBLE).
You can [add an exception to the GPL to allow you to release EPL code under this modified GPL](http://www.gnu.org/licenses/gpl-faq.html#GPLIncompatibleLibs), but not the other way around.

[The Apache 2.0 license is one-way compatible with the GPL version 3](http://www.apache.org/licenses/GPL-compatibility.html), so that everything *except* the Clojure collections can be combined and re-distributed with GPLv3 code.
Apache is not compatible with GPLv2, though you might try the GPL modification mentioned in the previous paragraph.

As of 2015-03-24, the following statements made me think the Apache and EPL licenses were compatible enough for my purposes and for general enterprise adoption:

### From Apache
> For the purposes of being a dependency to an Apache product, which licenses
> are considered to be similar in terms to the Apache License 2.0?
>
> Works under the following licenses may be included within Apache products:
>
> ...
>
> Eclipse Distribution License 1.0
>
> ...
>
> Many of these licenses have specific attribution terms that need to be
> adhered to, for example CC-A, often by adding them to the NOTICE file. Ensure
> you are doing this when including these works. Note, this list is
> colloquially known as the Category A list.

Source (as of 2015-05-13): https://www.apache.org/legal/resolved#category-a

### From Eclipse
> What licenses are acceptable for third-party code redistributed by Eclipse
> projects?
>
> Eclipse views license compatibility through the lens of enabling successful
> commercial adoption of Eclipse technology in software products and services.
> We wish to create a commercial ecosystem based on the redistribution of
> Eclipse software technologies in commercially licensed software products.
> Determining whether a license for third-party code is acceptable often
> requires the input and advice of Eclipse’s legal advisors. If you have any
> questions, please contact license@eclipse.org.
>
> The current list of licenses approved for use by third-party code
> redistributed by Eclipse projects is:
>
> Apache Software License 1.1
>
> Apache Software License 2.0
>
> ...

Source (as of 2015-05-13): https://eclipse.org/legal/eplfaq.php#3RDPARTY


# Thank You
Some of the people I'm listing as contributors may not actually be aware of this project, but I found them inspiring in various ways.

As Norm Zeck pointed out by sending me [Ropes: an Alternative to Strings](http://citeseer.ist.psu.edu/viewdoc/download?doi=10.1.1.14.9450&rep=rep1&type=pdf), an RRB-Tree might make a great implementation of *both* String and StringBuilder.  We might want to add a Char8 (UTF-8 Character class pronounced "crate") and make Str8 (UTF-8 String pronounced "straight") a sub-class of RRB-Tree.  Just a thought.

The bulk of this project started as a simple question on StackExchange: [Why doesn't Java 8 include immutable collections?](http://programmers.stackexchange.com/questions/221762/why-doesnt-java-8-include-immutable-collections)  People's answers were a big help in figuring out what this project should and shouldn't do.

Paul Philips [Scala Collections talk](https://www.youtube.com/watch?v=uiJycy6dFSQ&t=26m19s) was a huge inspiration to me.  I watched it over and over and tried to learn from his experience as much as possible.

Greenville Clojure (and Jeff Dik before that): for bearing with my newbie Clojure questions.

John Tollison, Norm Zeck, Mike Greata, Nathan Williams, and Landon Burch: For encouragement, advice, and patiently listening to me drone on about this project ad nauseum.

GreenJUG: for bearing with talks on early versions of this code two years in a row.

Context-sensitive equality: prefer Equator and Comparator to <code>equals()</code>, <code>hashcode()</code> and <code>compareTo()</code> ([Daniel Spiewak, Viktor Klang, Rúnar Óli Bjarnason, Hughes Chabot](http://glenpeterson.blogspot.com/2013/09/object-equality-is-context-relative.html), java.util.TreeSet, java.util.TreeMap)

Everyone whose ideas are collected in this project: I tried to put names in as close as possible to the contributions.

Bodil Stokke for pointing out the EPL/GPL compatibility issue and work-around.

Joshua Bloch for his book, Effective Java.

Rich Hickey for Clojure

# Build from Source

- Java 8
- Maven
- First `mvn clean install` on: https://github.com/GlenKPeterson/TestUtils
- Then `mvn clean test` on Paguro
