
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun type_3d4e306c_8cf9_4f45_987d_41dcb763efd3_Class30 ( Int) Bool)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun class30_Class30IntAttr0 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun obj_34a04dfd_deaf_4250_a6f7_35ae87419272 ( Int) Int)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((c1 Int)) (=> ( type_3d4e306c_8cf9_4f45_987d_41dcb763efd3_Class30 c1 )  (= ( class30_Class30IntAttr0 ( obj_34a04dfd_deaf_4250_a6f7_35ae87419272 c1 )  )  17))):named l0))
(assert (exists ((o Int)) ( type_3d4e306c_8cf9_4f45_987d_41dcb763efd3_Class30 ( obj_34a04dfd_deaf_4250_a6f7_35ae87419272 o )  ) ))

 ;end of formula 