
;this file is automatically generated: Thu Dec 26 17:44:16 GMT 2019

;declarations generated

(declare-fun obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c ( Int) Int)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun person_age ( Int) Int)
(declare-fun type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Person ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Student ( Int) Bool)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((v Int)) (=> (and ( type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Student v )  ( type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Person v ) ) (> ( person_age ( obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c v )  )  18))):named l0))
(assert (! (forall ((p Int)) (=> ( type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Person p )  (and (> ( person_age ( obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c p )  )  0) (< ( person_age ( obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c p )  )  18)))):named l1))
(assert (exists ((o Int)) (and ( type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Student ( obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c o )  )  ( type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Person ( obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c o )  ) )))
(assert (exists ((o Int)) (and (and ( type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Student ( obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c o )  )  ( type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Person ( obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c o )  ) ) ( type_dc9ff0d7_1ad0_47a3_b896_39098d5a32e8_Person ( obj_dee1c0dc_7bc0_4956_bc04_ba1d6bd08f5c o )  ) )))

 ;end of formula 