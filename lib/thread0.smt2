
;this file is automatically generated: Fri Dec 17 15:00:13 GMT 2021

;declarations generated

(declare-fun Gender ( Int) Int)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun type_ef134910_3447_49f9_bb02_9c08f5608ab7_Student ( Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_ef134910_3447_49f9_bb02_9c08f5608ab7_Child ( Int) Bool)
(declare-fun obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 ( Int) Int)
(declare-fun type_ef134910_3447_49f9_bb02_9c08f5608ab7_Module ( Int) Bool)
(declare-fun type_ef134910_3447_49f9_bb02_9c08f5608ab7_Department ( Int) Bool)
(declare-fun type_ef134910_3447_49f9_bb02_9c08f5608ab7_University ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun module_year ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun type_ef134910_3447_49f9_bb02_9c08f5608ab7_Person ( Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (and (forall ((v Int)) (=> ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Module v )  (>= ( module_year ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 v )  )  1))) (forall ((v Int)) (=> ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Module v )  (<= ( module_year ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 v )  )  5)))):named l0))
(assert (! (exists ((o Int)) (and ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Child ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 o )  )  ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Person ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 o )  ) )):named c0))
(assert (! (exists ((o Int)) ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Department ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 o )  ) ):named c1))
(assert (! (exists ((o Int)) ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Module ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 o )  ) ):named c2))
(assert (! (exists ((o Int)) ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Person ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 o )  ) ):named c3))
(assert (! (exists ((o Int)) (and ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Student ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 o )  )  ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_Person ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 o )  ) )):named c4))
(assert (! (exists ((o Int)) ( type_ef134910_3447_49f9_bb02_9c08f5608ab7_University ( obj_2e2c73cf_f5e8_4ff5_b8c7_0198d7637044 o )  ) ):named c5))

 ;end of formula 