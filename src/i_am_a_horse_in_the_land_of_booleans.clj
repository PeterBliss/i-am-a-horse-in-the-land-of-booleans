(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x
    true
    false))

(defn abs [n]
  (if (> n 0)
    n
    (- n)))

(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn fizzbuzz [n]
  (cond 
    (= 0 (mod n 15)) "gotcha!"
    (= 0 (mod n  3)) "fizz"
    (= 0 (mod n  5)) "buzz"
    :else ""))

(defn teen? [age]
  (and (>= age 13) (<= age 19)))

(defn not-teen? [age]
  (not (teen? age)))

(defn generic-doublificate [x]
  (cond
    (number? x) (+ x x)
    (empty? x) nil
    (list? x) (* 2 (count x))
    (vector? x) (* 2 (count x))
    :else true))

(defn leap-year? [year]
  (cond
    (= 0 (mod year 400)) true
    (and (= 0 (mod year 4)) 
         (not (= 0 (mod year 100)))) true
    :else false))

; '_______'
