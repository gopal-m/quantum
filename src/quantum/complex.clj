(ns quantum.complex)

(deftype Complex [^double real ^double imag])
(defmethod print-method Complex 
  [this]
  (print-simple (.real this) (.imag this)))

; Constructor function
(defn complex [real imag] (Complex. real imag))

(defn add [^Complex z1 ^Complex z2]
  (let [x1 (double (.real z1))
        y1 (double (.imag z1))
        x2 (double (.real z2))
        y2 (double (.imag z2))]
    (Complex. (+ x1 x2) (+ y1 y2))))

(defn multiply [^Complex z1 ^Complex z2]
  (let [x1 (double (.real z1))
        y1 (double (.imag z1))
        x2 (double (.real z2))
        y2 (double (.imag z2))]
    (Complex. (- (* x1 x2) (* y1 y2)) (+ (* x1 y2) (* y1 x2)))))
