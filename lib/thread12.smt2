
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun class13_Class13IntAttr3 ( Int) Int)
(declare-fun type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class13 ( Int) Bool)
(declare-fun type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class29 ( Int) Bool)
(declare-fun type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class56 ( Int) Bool)
(declare-fun type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class2 ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun obj_4f5d6aca_24e7_4239_a420_cf1c9e121d85 ( Int) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((v Int)) (=> (and (and (and ( type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class13 v )  ( type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class56 v ) ) ( type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class29 v ) ) ( type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class2 v ) ) (< ( class13_Class13IntAttr3 ( obj_4f5d6aca_24e7_4239_a420_cf1c9e121d85 v )  )  5))):named l0))
(assert (exists ((o Int)) (and (and (and ( type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class13 ( obj_4f5d6aca_24e7_4239_a420_cf1c9e121d85 o )  )  ( type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class56 ( obj_4f5d6aca_24e7_4239_a420_cf1c9e121d85 o )  ) ) ( type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class29 ( obj_4f5d6aca_24e7_4239_a420_cf1c9e121d85 o )  ) ) ( type_7c7aa2ee_8575_45cc_8674_3b41843d7630_Class2 ( obj_4f5d6aca_24e7_4239_a420_cf1c9e121d85 o )  ) )))

 ;end of formula 