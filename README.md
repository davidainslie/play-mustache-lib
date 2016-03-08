Scala Play with Mustache Example Library
========================================
Example libary to use with project play-mustache

Application built with the following (main) technologies:

- Scala

- SBT

Introduction
------------
TODO

Application
-----------
The application is configured as per any Scala application, where the default configuration file is "application.conf".
This default file can be overridden with other "conf" files and then given to the application upon boot with the following example Java option:
```bash
> -Dconfig.file=test-classes/application.test.conf
```

Individual configuration properties can be overridden again by Java options e.g. to override which Mongodb to connect:
```bash
> -Dmongo.db=some-other-mongo
```

where this overrides the default in application.conf.

Build and Deploy
----------------
The project is built with SBT. On a Mac (sorry everyone else) do:
```bash
> brew install sbt
```

It is also a good idea to install Typesafe Activator (which sits on top of SBT) for when you need to create new projects - it also has some SBT extras, so running an application with Activator instead of SBT can be useful. On Mac do:
```bash
> brew install typesafe-activator
```

To compile:
```bash
> sbt compile
```

or
```bash
> activator compile
```

To run the specs:
```bash
> sbt test
```

To actually run the application:
```bash
> sbt run
```