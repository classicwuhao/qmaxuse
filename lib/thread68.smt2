
;this file is automatically generated: Thu Jan 02 16:54:47 GMT 2020

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun obj_2c2fd120_b10c_4329_b3c7_2195e656743b ( Int) Int)
(declare-fun Enum0 ( Int) Int)
(declare-fun Enum1 ( Int) Int)
(declare-fun Enum2 ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun type_39e64659_136f_4105_adf0_e40af6ba20ab_Class46 ( Int) Bool)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun type_39e64659_136f_4105_adf0_e40af6ba20ab_Class5 ( Int) Bool)
(declare-fun type_39e64659_136f_4105_adf0_e40af6ba20ab_Class2 ( Int) Bool)
(declare-fun type_39e64659_136f_4105_adf0_e40af6ba20ab_Class48 ( Int) Bool)
(declare-fun type_39e64659_136f_4105_adf0_e40af6ba20ab_Class19 ( Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((v Int)) (=> (and (and (and (and ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class48 v )  ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class46 v ) ) ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class5 v ) ) ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class19 v ) ) ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class2 v ) ) (not (= ( Enum2 ( obj_2c2fd120_b10c_4329_b3c7_2195e656743b v )  )  1) ))):named l0))
(assert (exists ((o Int)) (and (and (and (and ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class48 ( obj_2c2fd120_b10c_4329_b3c7_2195e656743b o )  )  ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class46 ( obj_2c2fd120_b10c_4329_b3c7_2195e656743b o )  ) ) ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class5 ( obj_2c2fd120_b10c_4329_b3c7_2195e656743b o )  ) ) ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class19 ( obj_2c2fd120_b10c_4329_b3c7_2195e656743b o )  ) ) ( type_39e64659_136f_4105_adf0_e40af6ba20ab_Class2 ( obj_2c2fd120_b10c_4329_b3c7_2195e656743b o )  ) )))

 ;end of formula 