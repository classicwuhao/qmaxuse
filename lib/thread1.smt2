
;this file is automatically generated: Fri Dec 17 15:00:13 GMT 2021

;declarations generated

(declare-fun Gender ( Int) Int)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun type_3d8bf446_a3a5_4949_bc6c_1948c5523326_University ( Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Child ( Int) Bool)
(declare-fun person_age ( Int) Int)
(declare-fun obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 ( Int) Int)
(declare-fun type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Module ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Department ( Int) Bool)
(declare-fun type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Student ( Int) Bool)
(declare-fun container_ ( Int) Int)
(declare-fun type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Person ( Int) Bool)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((p Int)) (=> ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Person p )  (and (> ( person_age ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 p )  )  0) (< ( person_age ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 p )  )  18)))):named l0))
(assert (! (exists ((o Int)) (and ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Child ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 o )  )  ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Person ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 o )  ) )):named c0))
(assert (! (exists ((o Int)) ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Department ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 o )  ) ):named c1))
(assert (! (exists ((o Int)) ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Module ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 o )  ) ):named c2))
(assert (! (exists ((o Int)) ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Person ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 o )  ) ):named c3))
(assert (! (exists ((o Int)) (and ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Student ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 o )  )  ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_Person ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 o )  ) )):named c4))
(assert (! (exists ((o Int)) ( type_3d8bf446_a3a5_4949_bc6c_1948c5523326_University ( obj_d54b0dac_7ffd_4ffb_af00_046bf4acf572 o )  ) ):named c5))

 ;end of formula 