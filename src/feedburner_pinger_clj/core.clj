(ns feedburner-pinger-clj.core
  (:require [feedburner-pinger :as pinger]))

(defn ping [url]
  (let [[request (pinger/PingRequest. url)]
        [client (pinger/HttpPingingClient.)]]
    (to-map (.ping client request))))

(defn- to-map [response]
  {:status (.getStatus response)
   :message (.getMessage response)})
