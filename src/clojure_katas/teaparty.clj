(ns clojure-katas.teaparty)

;; welcome should return the greeting with the proper title depending
;; on whether it is a man, woman, or knight
;; A woman is addressed as Ms.
;; A man is addressed as Mr.
;; A knight is addressed as Sir
;; The return string should be "Hello (the title) (last name)

(defn welcome [last-name is-woman? is-sir?]
  (let [greeting (cond
                   (and is-woman? is-sir?) "Lady "
                   is-sir? "Sir "
                   is-woman? "Ms. "
                   :else "Mr. ")]
    (str "Welcome " greeting last-name)))

