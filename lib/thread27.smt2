
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun obj_feae1391_85c9_4b4f_b46c_281971661159 ( Int) Int)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_f6a2d8ac_5d97_4ae2_afe0_1c5cdfcf14cc_Class22 ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun class22_Class22IntAttr2 ( Int) Int)
(declare-fun class22_Class22IntAttr3 ( Int) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (or (forall ((v Int)) (=> ( type_f6a2d8ac_5d97_4ae2_afe0_1c5cdfcf14cc_Class22 v )  (<= ( class22_Class22IntAttr3 ( obj_feae1391_85c9_4b4f_b46c_281971661159 v )  )  16))) (forall ((c2_1 Int)(c2_2 Int)) (=> (and ( type_f6a2d8ac_5d97_4ae2_afe0_1c5cdfcf14cc_Class22 c2_1 )  ( type_f6a2d8ac_5d97_4ae2_afe0_1c5cdfcf14cc_Class22 c2_2 ) ) (= ( class22_Class22IntAttr2 ( obj_feae1391_85c9_4b4f_b46c_281971661159 c2_1 )  )  ( class22_Class22IntAttr3 ( obj_feae1391_85c9_4b4f_b46c_281971661159 c2_2 )  ) )))):named l0))
(assert (! (forall ((v Int)) (=> ( type_f6a2d8ac_5d97_4ae2_afe0_1c5cdfcf14cc_Class22 v )  (>= ( class22_Class22IntAttr3 ( obj_feae1391_85c9_4b4f_b46c_281971661159 v )  )  7))):named l1))
(assert (exists ((o Int)) ( type_f6a2d8ac_5d97_4ae2_afe0_1c5cdfcf14cc_Class22 ( obj_feae1391_85c9_4b4f_b46c_281971661159 o )  ) ))

 ;end of formula 