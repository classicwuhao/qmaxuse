
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class21 ( Int) Bool)
(declare-fun type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class29 ( Int) Bool)
(declare-fun type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class27 ( Int) Bool)
(declare-fun type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class36 ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class56 ( Int) Bool)
(declare-fun type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class2 ( Int) Bool)
(declare-fun obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f ( Int) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun class21_Class21BoolAttr1 ( Int) Bool)
(declare-fun class21_Class21BoolAttr0 ( Int) Bool)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (or (and (forall ((v Int)) (=> (and (and (and (and (and ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class21 v )  ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class56 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class36 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class27 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class29 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class2 v ) ) ( class21_Class21BoolAttr1 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f v )  ) )) (forall ((v Int)) (=> (and (and (and (and (and ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class21 v )  ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class56 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class36 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class27 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class29 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class2 v ) ) ( class21_Class21BoolAttr0 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f v )  ) ))) (or (forall ((v Int)) (=> (and (and (and (and (and ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class21 v )  ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class56 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class36 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class27 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class29 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class2 v ) ) ( class21_Class21BoolAttr1 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f v )  ) )) (forall ((v Int)) (=> (and (and (and (and (and ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class21 v )  ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class56 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class36 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class27 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class29 v ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class2 v ) ) ( class21_Class21BoolAttr0 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f v )  ) )))):named l0))
(assert (exists ((o Int)) (and (and (and (and (and ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class21 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f o )  )  ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class56 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f o )  ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class36 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f o )  ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class27 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f o )  ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class29 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f o )  ) ) ( type_614c0c9e_9b4d_4905_980b_e9482dba9d16_Class2 ( obj_2eef1a0e_d0bd_46b3_abcd_bba1b9e4041f o )  ) )))

 ;end of formula 