
;this file is automatically generated: Mon Oct 26 19:31:24 CST 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class15 ( Int) Bool)
(declare-fun obj_b37d7abf_1805_49c1_b88d_461d308f9214 ( Int) Int)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class22 ( Int) Bool)
(declare-fun type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class35 ( Int) Bool)
(declare-fun type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class0 ( Int) Bool)
(declare-fun type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class2 ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((c_0 Int)) (=> (and (and (and ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class0 c_0 )  ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class22 c_0 ) ) ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class35 c_0 ) ) ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class2 c_0 ) ) (forall ((c_15 Int)) (=> (and ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class15 c_15 )  ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class2 c_15 ) ) (not (= ( obj_b37d7abf_1805_49c1_b88d_461d308f9214 c_0 )  ( obj_b37d7abf_1805_49c1_b88d_461d308f9214 c_15 ) ) ))))):named l0))
(assert (exists ((o Int)) (and (and (and ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class0 ( obj_b37d7abf_1805_49c1_b88d_461d308f9214 o )  )  ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class22 ( obj_b37d7abf_1805_49c1_b88d_461d308f9214 o )  ) ) ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class35 ( obj_b37d7abf_1805_49c1_b88d_461d308f9214 o )  ) ) ( type_b7f60a63_8420_4279_9f3b_1627789ca7c5_Class2 ( obj_b37d7abf_1805_49c1_b88d_461d308f9214 o )  ) )))

 ;end of formula 