
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun obj_6e73ced2_c504_478d_838d_cb1b58614eec ( Int) Int)
(declare-fun type_b4c31006_c06a_4b72_86bb_429ee2946ab2_Class2 ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun class2_Class2IntAttr4 ( Int) Int)
(declare-fun class2_Class2IntAttr3 ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((c2_1 Int)(c2_2 Int)) (=> (and ( type_b4c31006_c06a_4b72_86bb_429ee2946ab2_Class2 c2_1 )  ( type_b4c31006_c06a_4b72_86bb_429ee2946ab2_Class2 c2_2 ) ) (>= ( class2_Class2IntAttr4 ( obj_6e73ced2_c504_478d_838d_cb1b58614eec c2_1 )  )  ( class2_Class2IntAttr3 ( obj_6e73ced2_c504_478d_838d_cb1b58614eec c2_2 )  ) ))):named l0))
(assert (! (forall ((v Int)) (=> ( type_b4c31006_c06a_4b72_86bb_429ee2946ab2_Class2 v )  (not (= ( class2_Class2IntAttr3 ( obj_6e73ced2_c504_478d_838d_cb1b58614eec v )  )  7) ))):named l1))
(assert (exists ((o Int)) ( type_b4c31006_c06a_4b72_86bb_429ee2946ab2_Class2 ( obj_6e73ced2_c504_478d_838d_cb1b58614eec o )  ) ))

 ;end of formula 