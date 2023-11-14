
(ns autopoiesis
  (:require [clojure.java.io :as io]
            [clojure.string :as str]
            [cheshire.core :as json]
            [clj-http.client :as client]))




(defn generative-flow-framework [moment]
  (inc moment))

(defn omegacombinator [n]
  (let [realization (dec n)]
    (loop [moment realization]
      (if (>= moment n)
        moment
        (recur (generative-flow-framework moment))))))

(defn -main []
  (println (omegacombinator 10)))

