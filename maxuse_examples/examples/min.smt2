(declare-fun r () Int)
(declare-fun m1 () Int) ;m1..n1
(declare-fun n1 () Int)
(declare-fun m2 () Int) ;m2..n2
(declare-fun n2 () Int)
(declare-fun a () Int);# of As
(declare-fun b () Int);# of Bs

(assert   
  (and (<= (* n1 a)  r) (>= r (* m1 a)))
)

(assert   
  (and (<= (* n2 b)  r) (>= r (* m2 b)))
)

(assert (and (>=  a 1) (>= b 1)))
(assert (= m1 20))
(assert (>= n1 20))
(assert (= m2 1))
(assert (= n2 1))
(assert (>= (* a b) r))
(minimize a)
(minimize b)
(check-sat)
(get-value(a b m1 n1 m2 n2 r))

