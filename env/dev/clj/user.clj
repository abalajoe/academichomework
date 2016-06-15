(ns user
  (:require [mount.core :as mount]
            academichomework.core))

(defn start []
  (mount/start-without #'academichomework.core/repl-server))

(defn stop []
  (mount/stop-except #'academichomework.core/repl-server))

(defn restart []
  (stop)
  (start))


