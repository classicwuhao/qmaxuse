
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun obj_33425024_93e1_407c_a54f_ca0312a0e920 ( Int) Int)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun type_0bb677bf_e9a2_46fe_8f80_5562df6ebb50_Class32 ( Int) Bool)
(declare-fun class32_Class32IntAttr0 ( Int) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((c1 Int)) (=> ( type_0bb677bf_e9a2_46fe_8f80_5562df6ebb50_Class32 c1 )  (> ( class32_Class32IntAttr0 ( obj_33425024_93e1_407c_a54f_ca0312a0e920 c1 )  )  15))):named l0))
(assert (exists ((o Int)) ( type_0bb677bf_e9a2_46fe_8f80_5562df6ebb50_Class32 ( obj_33425024_93e1_407c_a54f_ca0312a0e920 o )  ) ))

 ;end of formula 