# jrelisp
JRE Lisp Runtime - A common lisp implementing the clapi java api

This is the jrelisp application front-end.

## Status

As of the date of the release of v0.0.2 this implementation passed all
ansi conformance tests on the trunk of the ansi-tests repository.

This code is not suitable for any particular purpose and is released under the MIT licence to do with as you please.

## Installing

Clone this git repository and using maven execute

```
mvn package
```

An executable jar will be produced in the target\ folder.

## Embedding JRE Lisp


For embedding jrelisp in your applications see [jrelisp-core](https://github.com/rritoch/jrelisp)
