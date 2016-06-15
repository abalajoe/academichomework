(ns academichomework.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [academichomework.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[academichomework started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[academichomework has shut down successfully]=-"))
   :middleware wrap-dev})
