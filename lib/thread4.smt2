
;this file is automatically generated: Mon Nov 02 10:43:03 CST 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun class12_Class12BoolAttr2 ( Int) Bool)
(declare-fun class12_Class12BoolAttr1 ( Int) Bool)
(declare-fun class12_Class12BoolAttr0 ( Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun class12_Class12IntAttr4 ( Int) Int)
(declare-fun class12_Class12IntAttr3 ( Int) Int)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class0 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class4 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class3 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class2 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class1 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class8 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class7 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class6 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class5 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class9 ( Int) Bool)
(declare-fun obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 ( Int) Int)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class14 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class15 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class16 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class17 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class10 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class11 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 ( Int) Bool)
(declare-fun type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class13 ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (forall ((p Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 p )  (and (>= ( Enum0 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 p )  )  0) (<= ( Enum0 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 p )  )  4)))))
(assert (! (or (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  (or ( class12_Class12BoolAttr0 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  )  (or (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  (not (= ( Enum0 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  )  2) ))) (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  ( class12_Class12BoolAttr1 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  ) )))))) (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  (< ( class12_Class12IntAttr4 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  )  18)))):named l0))
(assert (! (or (or (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  ( class12_Class12BoolAttr1 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  ) )) (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  ( class12_Class12BoolAttr0 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  ) ))) (or (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  ( class12_Class12BoolAttr2 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  ) )) (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  (<= ( class12_Class12IntAttr3 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  )  7))))):named l1))
(assert (! (forall ((c2_1 Int)(c2_2 Int)) (=> (and ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 c2_1 )  ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 c2_2 ) ) (< ( class12_Class12IntAttr3 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 c2_1 )  )  ( class12_Class12IntAttr4 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 c2_2 )  ) ))):named l2))
(assert (! (forall ((c2_1 Int)(c2_2 Int)) (=> (and ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 c2_1 )  ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 c2_2 ) ) (< ( class12_Class12IntAttr4 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 c2_1 )  )  ( class12_Class12IntAttr3 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 c2_2 )  ) ))):named l3))
(assert (! (forall ((c2_1 Int)(c2_2 Int)) (=> (and ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 c2_1 )  ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 c2_2 ) ) (> ( class12_Class12IntAttr4 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 c2_1 )  )  ( class12_Class12IntAttr3 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 c2_2 )  ) ))):named l4))
(assert (! (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  (> ( class12_Class12IntAttr3 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  )  18))):named l5))
(assert (! (forall ((v Int)) (=> ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 v )  (= ( class12_Class12IntAttr4 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 v )  )  3))):named l6))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class0 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c0))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class1 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c1))
(assert (! (exists ((o Int)) (and (and ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class10 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  )  ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class14 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class16 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) )):named c2))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class11 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c3))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class12 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c4))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class13 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c5))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class14 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c6))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class15 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c7))
(assert (! (exists ((o Int)) (and ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class16 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  )  ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class14 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) )):named c8))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class17 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c9))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class2 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c10))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class3 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c11))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class4 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c12))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class5 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c13))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class6 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c14))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class7 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c15))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class8 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c16))
(assert (! (exists ((o Int)) ( type_e16227a7_7342_4d4b_b183_ba5f16e850ed_Class9 ( obj_f5e8af88_7bd6_4f48_8011_a8e4cb752466 o )  ) ):named c17))

 ;end of formula 