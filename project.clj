(defproject feedburner-pinger-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.tenfactorial.web.feeds/feedburner-pinger-java "1.0.0"]
                 [org.apache.httpcomponents/httpclient "4.3.1"]
                 [com.google.code.gson/gson "2.3.1"]]
  :repositories {"local" ~(str (.toURI (java.io.File. "maven-repo")))})
