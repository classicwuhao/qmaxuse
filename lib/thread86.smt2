
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun type_d9382793_df24_4a49_9630_70b2eaeb7637_Class2 ( Int) Bool)
(declare-fun type_d9382793_df24_4a49_9630_70b2eaeb7637_Class7 ( Int) Bool)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_d9382793_df24_4a49_9630_70b2eaeb7637_Class29 ( Int) Bool)
(declare-fun type_d9382793_df24_4a49_9630_70b2eaeb7637_Class56 ( Int) Bool)
(declare-fun class7_Class7IntAttr3 ( Int) Int)
(declare-fun class7_Class7IntAttr4 ( Int) Int)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun obj_4c88ce61_8379_40a9_a7ab_149cdd4b4ea5 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((v Int)) (=> (and (and (and ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class7 v )  ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class56 v ) ) ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class29 v ) ) ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class2 v ) ) (<= ( class7_Class7IntAttr3 ( obj_4c88ce61_8379_40a9_a7ab_149cdd4b4ea5 v )  )  9))):named l0))
(assert (! (forall ((c7_2 Int)(c7_1 Int)) (=> (and (and (and (and ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class7 c7_1 )  ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class56 c7_1 ) ) ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class29 c7_1 ) ) ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class2 c7_1 ) ) (and (and (and ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class7 c7_2 )  ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class56 c7_2 ) ) ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class29 c7_2 ) ) ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class2 c7_2 ) )) (> ( class7_Class7IntAttr4 ( obj_4c88ce61_8379_40a9_a7ab_149cdd4b4ea5 c7_1 )  )  ( class7_Class7IntAttr3 ( obj_4c88ce61_8379_40a9_a7ab_149cdd4b4ea5 c7_2 )  ) ))):named l1))
(assert (exists ((o Int)) (and (and (and ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class7 ( obj_4c88ce61_8379_40a9_a7ab_149cdd4b4ea5 o )  )  ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class56 ( obj_4c88ce61_8379_40a9_a7ab_149cdd4b4ea5 o )  ) ) ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class29 ( obj_4c88ce61_8379_40a9_a7ab_149cdd4b4ea5 o )  ) ) ( type_d9382793_df24_4a49_9630_70b2eaeb7637_Class2 ( obj_4c88ce61_8379_40a9_a7ab_149cdd4b4ea5 o )  ) )))

 ;end of formula 