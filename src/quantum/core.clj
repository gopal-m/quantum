(ns quantum.core
  (:use quantum.complex))

(defn qregister
  "Initialise a uniform quantum register of length n."
  ([n] (qregister n [0 0])) 
  ([n [real imag]] 
    (vec (repeat n [(complex real imag) (complex real imag)]))))

(defn hadamard
  "Generate a symmetrical 2x2 Hadamard matrix."
  [delta] 
  [[(complex (Math/sqrt delta) 0) (complex 0 (Math/sqrt (- 1 delta)))] 
   [(complex 0 (Math/sqrt (- 1 delta))) (complex (Math/sqrt delta) 0)]])

(def H (hadamard 0.5))
