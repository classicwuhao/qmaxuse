
;this file is automatically generated: Sat Dec 18 00:01:19 GMT 2021

;declarations generated

(declare-fun Gender ( Int) Int)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun type_3e882787_7877_4be8_a8b8_d64cb571af9c_Person ( Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun obj_50a58eb8_c3fe_4e4b_a1cb_c16c1960936a ( Int) Int)
(declare-fun person_age ( Int) Int)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (forall ((p Int)) (=> ( type_3e882787_7877_4be8_a8b8_d64cb571af9c_Person p )  (and (>= ( Gender ( obj_50a58eb8_c3fe_4e4b_a1cb_c16c1960936a p )  )  0) (<= ( Gender ( obj_50a58eb8_c3fe_4e4b_a1cb_c16c1960936a p )  )  1)))))

 ;end of formula 