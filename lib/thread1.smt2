
;this file is automatically generated: Wed Sep 22 15:15:58 IST 2021

;declarations generated

(declare-fun Gender ( Int) Int)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Module ( Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Person ( Int) Bool)
(declare-fun person_age ( Int) Int)
(declare-fun type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Department ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e ( Int) Int)
(declare-fun type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Student ( Int) Bool)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Assignment ( Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((v Int)) (=> (and ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Student v )  ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Person v ) ) (> ( person_age ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e v )  )  18))):named l0))
(assert (! (forall ((p Int)) (=> ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Person p )  (and (> ( person_age ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e p )  )  0) (< ( person_age ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e p )  )  18)))):named l1))
(assert (! (exists ((o Int)) ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Assignment ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e o )  ) ):named c0))
(assert (! (exists ((o Int)) ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Department ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e o )  ) ):named c1))
(assert (! (exists ((o Int)) ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Module ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e o )  ) ):named c2))
(assert (! (exists ((o Int)) ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Person ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e o )  ) ):named c3))
(assert (! (exists ((o Int)) (and ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Student ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e o )  )  ( type_ac843e42_f3a7_47c7_b2b3_d19f873bb7ee_Person ( obj_d189a5f8_c29e_47a6_a2ac_2f5f7fe6321e o )  ) )):named c4))

 ;end of formula 