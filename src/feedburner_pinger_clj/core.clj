(ns feedburner-pinger-clj.core
  (import com.tenfactorial.web.feeds.PingRequest)
  (import com.tenfactorial.web.feeds.PingResponse)
  (import com.tenfactorial.web.feeds.HttpPingingClient)
  (import com.tenfactorial.web.feeds.PingStatus))

(defn- to-keyword [status]
  (cond
   (.equals status PingStatus/SUCCEEDED) :succeeded
   (.equals status PingStatus/THROTTLED) :throttled
   (.equals status PingStatus/FAILED) :failed
   :else :unknown))

(defn- to-map [response]
  {:status (to-keyword (.getStatus response))
   :message (.getMessage response)})

(defn ping [url]
  (let [request (PingRequest. url)
        client (HttpPingingClient.)]
    (to-map (.ping client request))))
