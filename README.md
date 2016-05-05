# feedburner-pinger-clj

A small, idiomatic Clojure library for notifing FeedBurner of feed updates.

## Usage

At the REPL:

    (use 'feedburner-pinger-clj.core)

In code:

```clojure
(ns com.example.your-app
  (:require [feedburner-pinger-clj.core :as feedburner])
```

Then, you can ping a feed like this:

```clojure
(feedburner/ping "http://feeds.feedburner.com/my-feed")
```

You will get a response map like this:

```clojure
{:status :succeeded, :message "Successfully pinged"}
```

## License

Copyright © 2015

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
