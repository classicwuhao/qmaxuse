
;this file is automatically generated: Tue May 10 13:41:08 IST 2022

;declarations generated

(declare-fun A0 () Int)
(declare-fun A1 () Int)
(declare-fun s0 () Int)
(declare-fun s1 () Int)
(declare-fun s2 () Int)
(declare-fun s3 () Int)
(declare-fun s4 () Int)
(declare-fun s5 () Int)
(declare-fun s6 () Int)
(declare-fun a_0_6 () Int)
(declare-fun a_1_4 () Int)

;formula(s) generated
(assert (and (>= A0 0) (<= A0 1)))
(assert (and (>= A1 0) (<= A1 1)))
(assert (and (>= s0 0) (<= s0 1)))
(assert (and (>= s1 0) (<= s1 1)))
(assert (and (>= s2 0) (<= s2 1)))
(assert (and (>= s3 0) (<= s3 1)))
(assert (and (>= s4 0) (<= s4 1)))
(assert (and (>= s5 0) (<= s5 1)))
(assert (and (>= s6 0) (<= s6 1)))
(assert (and (>= a_0_6 0) (<= a_0_6 1)))
(assert (and (>= a_1_4 0) (<= a_1_4 1)))
(assert (= s0 0))
(assert (= s1 0))
(assert (= s2 0))
(assert (= s3 0))
(assert (=> (= s4 1) (= a_1_4 1)))
(assert (=> (= s4 0) (= a_1_4 0)))
(assert (= s5 0))
(assert (=> (= s6 1) (= a_0_6 1)))
(assert (=> (= s6 0) (= a_0_6 0)))
(assert (=> (= a_0_6 1) (= A0 1)))
(assert (=> (= a_0_6 0) (= A0 0)))
(assert (=> (= a_1_4 1) (= A1 1)))
(assert (=> (= a_1_4 0) (= A1 0)))
(assert (not (and (= s4 1) (= s6 1)) ))
(assert (= (+ (+ (+ (+ (+ (+ s0 s1) s2) s3) s4) s5) s6) 8))
