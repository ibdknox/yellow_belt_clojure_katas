(ns clojure-katas.fizzbuzz)

;; answer should return "fizz" for n divisible by 3,
;; "buzz" for n divisible by 5
;; and "fizzbuzz" for n divisible by 5 and 3
;; otherwise just the number

(defn answer [n]
  (let [div3 (zero? (mod n 3))
        div5 (zero? (mod n 5))]
        (cond
          (and div3 div5) "fizzbuzz"
          div3 "fizz"
          div5 "buzz"
          :else n)))

