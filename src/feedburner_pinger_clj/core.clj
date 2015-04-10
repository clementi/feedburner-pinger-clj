(ns feedburner-pinger-clj.core
  (import com.tenfactorial.web.feeds.PingRequest)
  (import com.tenfactorial.web.feeds.PingResponse)
  (import com.tenfactorial.web.feeds.HttpPingingClient)
  (import com.tenfactorial.web.feeds.PingStatus))

(defn- to-map [response]
  {:status (keyword (clojure.string/lower-case (str (.getStatus response))))
   :message (.getMessage response)})

(defn ping [url]
  (let [request (PingRequest. url)
        client (HttpPingingClient.)]
    (to-map (.ping client request))))
