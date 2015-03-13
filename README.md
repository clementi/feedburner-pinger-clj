# feedburner-pinger-clj

A thin Clojure wrapper around [feedburner-pinger-java](http://github.com/clementi/feedburner-pinger-java), used to notify FeedBurner of feed updates.

## Usage

At the REPL:

    (use 'feedburner-pinger-clj.core)

Then, you can ping a feed like this:

```clojure
(ping "http://feeds.feedburner.com/my-feed")
```

You will get a response map like this:

```clojure
{:status :succeeded, :message "Successfully pinged"}
```

## License

Copyright © 2015

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
