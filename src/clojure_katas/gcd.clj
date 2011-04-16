(ns clojure-katas.gcd
   (:require [clojure.contrib.math :as math]))

;; Greatest Common divisor
;; gcd(a,0) = a
;; gcd(b, a mod b)

(defn gcd [a b]
  (let [m (min a b)]
    (if (= 0 m)
      (max a b)
      (loop [cur m]
        (if (or (= 1 cur)
                (and (zero? (mod a cur)) (zero? (mod b cur))))
          cur
          (recur (dec cur)))))))

