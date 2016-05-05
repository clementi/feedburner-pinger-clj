(ns feedburner-pinger-clj.core
  (:require [clj-http.client :as http]
            [clojure.data.json :as json]))

(defn- read-values [key value]
  (if (= key :status)
    (keyword (clojure.string/lower-case value))
    value))

(defn ping [url]
  (let [response (http/post "http://feedburner-pinger.herokuapp.com" {:form-params {:url url}})]
    (json/read-str (:body response) :key-fn keyword :value-fn read-values)))
