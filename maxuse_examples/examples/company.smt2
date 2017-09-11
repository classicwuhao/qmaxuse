(declare-fun a_0 () Int)
(declare-fun a_1 () Int)
(declare-fun a_2 () Int)
(declare-fun a_3 () Int)
(declare-fun salary (Int) Int)


;assert
(assert  (= (salary a_0) 1600) )
(assert  (= (salary a_1) (+ (* (salary a_0)  1.0) (salary a_0))))
(assert  (= (salary a_2) (+ (* (salary a_1)  1.0) (salary a_1))))
(assert  (= (salary a_3) (+ (* (salary a_2)  1.0) (salary a_2))))

(assert (and (>= (salary a_0) 1500) (<= (salary a_0) 5000)))
(assert (and (>= (salary a_1) 1500) (<= (salary a_1) 5000)))
(assert (and (>= (salary a_2) 1500) (<= (salary a_2) 5000)))
(assert (and (>= (salary a_3) 1500) (<= (salary a_3) 5000)))

(check-sat)
(get-model)
