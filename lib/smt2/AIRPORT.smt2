
;this file is automatically generated: Mon Oct 02 16:50:25 IST 2017

;declarations generated

(declare-fun type_93ef4476_355d_4770_9857_1189b7286745_Taxiway ( Int) Bool )
(declare-fun type_73d28623_3b34_4012_8251_c61bac316893_Area ( Int) Bool )
(declare-fun k75295ba4_48a7_4f06_bb1e_568f48c08ab1 () Int )
(declare-fun oclExcludes ( Int Int) Bool )
(declare-fun rel_ba416685_ca40_449b_833e_c239a8dab95b_Check ( Int Int) Bool )
(declare-fun Area_Status ( Int) Int )
(declare-fun type_9039a904_d235_4b9c_9ec3_38c01f470a9a_ControlTower ( Int) Bool )
(declare-fun oclSelect ( Int Bool) Int )
(declare-fun Airplane_Status ( Int) Int )
(declare-fun Cardinality ( Int) Int )
(declare-fun rel_1ca2dfde_62f6_45a8_9582_b7f66cf6dc74_ListensTo ( Int Int) Bool )
(declare-fun obj_07890ae6_453b_41ff_adf3_47fc05a21868 ( Int) Int )
(declare-fun kb9523b46_8ee1_41e1_8fe9_a27eab661e9f () Int )
(declare-fun k8c534149_3842_4f38_8b6c_2b462fab3580 () Int )
(declare-fun Command ( Int) Int )
(declare-fun kd14bc276_a8aa_4372_b0b6_a04617b33274 () Int )
(declare-fun type_2572346f_4eeb_4b41_a44e_42096d186d7e_Runway ( Int) Bool )
(declare-fun container_ ( Int) Int )
(declare-fun type_b6f325ff_b03b_401b_bc50_c8601c2c0477_Airplane ( Int) Bool )
(declare-fun oclIncludes ( Int Int) Bool )
(declare-fun aux1 () Int )
(declare-fun aux0 () Int )
(declare-fun ObjAt ( Int Int) Int )

;formula(s) generated
(assert (forall ((p Int)) (=> ( type_b6f325ff_b03b_401b_bc50_c8601c2c0477_Airplane p )  (and (>= ( Command ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 p )  )  0) (<= ( Command ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 p )  )  2)))))
(assert (forall ((p Int)) (=> ( type_b6f325ff_b03b_401b_bc50_c8601c2c0477_Airplane p )  (and (>= ( Airplane_Status ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 p )  )  0) (<= ( Airplane_Status ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 p )  )  6)))))
(assert (forall ((p Int)) (=> ( type_73d28623_3b34_4012_8251_c61bac316893_Area p )  (and (>= ( Area_Status ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 p )  )  0) (<= ( Area_Status ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 p )  )  1)))))
(assert (and (>= aux0 0) (<= aux0 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_ba416685_ca40_449b_833e_c239a8dab95b_Check ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 x )   ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 y )  )  (and ( type_9039a904_d235_4b9c_9ec3_38c01f470a9a_ControlTower x )  ( type_73d28623_3b34_4012_8251_c61bac316893_Area y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k8c534149_3842_4f38_8b6c_2b462fab3580)) (>= k8c534149_3842_4f38_8b6c_2b462fab3580 0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k75295ba4_48a7_4f06_bb1e_568f48c08ab1)) (>= k75295ba4_48a7_4f06_bb1e_568f48c08ab1 0))))) (and (= aux0 1) true)) (and (= aux0 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_ba416685_ca40_449b_833e_c239a8dab95b_Check ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 x )   ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 y )  )  (and ( type_9039a904_d235_4b9c_9ec3_38c01f470a9a_ControlTower x )  ( type_73d28623_3b34_4012_8251_c61bac316893_Area y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k8c534149_3842_4f38_8b6c_2b462fab3580)) (>= k8c534149_3842_4f38_8b6c_2b462fab3580 0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k75295ba4_48a7_4f06_bb1e_568f48c08ab1)) (>= k75295ba4_48a7_4f06_bb1e_568f48c08ab1 0))))))
(assert (and (>= aux1 0) (<= aux1 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_1ca2dfde_62f6_45a8_9582_b7f66cf6dc74_ListensTo ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 x )   ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 y )  )  (and ( type_b6f325ff_b03b_401b_bc50_c8601c2c0477_Airplane x )  ( type_9039a904_d235_4b9c_9ec3_38c01f470a9a_ControlTower y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  0)) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  kd14bc276_a8aa_4372_b0b6_a04617b33274)) (>= kd14bc276_a8aa_4372_b0b6_a04617b33274 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  kb9523b46_8ee1_41e1_8fe9_a27eab661e9f)) (>= kb9523b46_8ee1_41e1_8fe9_a27eab661e9f 0))))) (and (= aux1 1) true)) (and (= aux1 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_1ca2dfde_62f6_45a8_9582_b7f66cf6dc74_ListensTo ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 x )   ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 y )  )  (and ( type_b6f325ff_b03b_401b_bc50_c8601c2c0477_Airplane x )  ( type_9039a904_d235_4b9c_9ec3_38c01f470a9a_ControlTower y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  0)) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  kd14bc276_a8aa_4372_b0b6_a04617b33274)) (>= kd14bc276_a8aa_4372_b0b6_a04617b33274 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  kb9523b46_8ee1_41e1_8fe9_a27eab661e9f)) (>= kb9523b46_8ee1_41e1_8fe9_a27eab661e9f 0))))))
(assert (exists ((o Int)) ( type_b6f325ff_b03b_401b_bc50_c8601c2c0477_Airplane ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 o )  ) ))
(assert (exists ((o Int)) ( type_73d28623_3b34_4012_8251_c61bac316893_Area ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 o )  ) ))
(assert (exists ((o Int)) ( type_9039a904_d235_4b9c_9ec3_38c01f470a9a_ControlTower ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 o )  ) ))
(assert (exists ((o Int)) (and ( type_2572346f_4eeb_4b41_a44e_42096d186d7e_Runway ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 o )  )  ( type_73d28623_3b34_4012_8251_c61bac316893_Area ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 o )  ) )))
(assert (exists ((o Int)) (and ( type_93ef4476_355d_4770_9857_1189b7286745_Taxiway ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 o )  )  ( type_73d28623_3b34_4012_8251_c61bac316893_Area ( obj_07890ae6_453b_41ff_adf3_47fc05a21868 o )  ) )))
(assert (= (+ aux0 aux1) 0))

 ;end of formula 