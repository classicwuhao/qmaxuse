
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_516e5089_b7df_4d6c_89b8_f819d6e8a0ba_Class39 ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun class39_Class39IntAttr2 ( Int) Int)
(declare-fun obj_756c3993_15ff_46fb_8b9e_a3c80faccb44 ( Int) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((v Int)) (=> ( type_516e5089_b7df_4d6c_89b8_f819d6e8a0ba_Class39 v )  (not (= ( class39_Class39IntAttr2 ( obj_756c3993_15ff_46fb_8b9e_a3c80faccb44 v )  )  10) ))):named l0))
(assert (! (forall ((c1 Int)) (=> ( type_516e5089_b7df_4d6c_89b8_f819d6e8a0ba_Class39 c1 )  (not (= ( class39_Class39IntAttr2 ( obj_756c3993_15ff_46fb_8b9e_a3c80faccb44 c1 )  )  16) ))):named l1))
(assert (exists ((o Int)) ( type_516e5089_b7df_4d6c_89b8_f819d6e8a0ba_Class39 ( obj_756c3993_15ff_46fb_8b9e_a3c80faccb44 o )  ) ))

 ;end of formula 