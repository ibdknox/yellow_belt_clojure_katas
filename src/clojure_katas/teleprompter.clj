(ns clojure-katas.teleprompter
  (:use [clojure.string :only [split]]))

;; Given an input text string and a list of slang words and their
;; translations
;; return the cleansed input string of the slang words

(defn translate [input-string dictionary]
  (let [parts (split input-string #"\b")]
    (reduce str (map #(if-let [replc (get dictionary %)]
                        replc
                        %)
                     parts))))



