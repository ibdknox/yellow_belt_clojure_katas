(ns clojure-katas.fib)

;; Calculate the fibonacci sequence
;; f(0) = 0, f(1) = 1
;; f(n) = f(n-1) + f(n-2)
;;
(defn fib-seq 
  ([] (fib-seq 0 1))
  ([prev cur]
    (lazy-seq
      (cons prev (fib-seq cur  (+ prev cur))))))

(defn fib[n]
  (nth (fib-seq) n))

