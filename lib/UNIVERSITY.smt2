
<<<<<<< HEAD
;this file is automatically generated: Tue May 28 11:19:23 CST 2019

;declarations generated

(declare-fun oclExcludes ( Int Int) Bool )
(declare-fun obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f ( Int) Int )
(declare-fun oclSelect ( Int Bool) Int )
(declare-fun person_mature ( Int) Bool )
(declare-fun Cardinality ( Int) Int )
(declare-fun type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person ( Int) Bool )
(declare-fun module_year ( Int) Int )
(declare-fun k03142174_c8ed_4cee_9ae1_3e9a3238b34c () Int )
(declare-fun k4ab5b674_3659_455d_a675_f7a02fa8e559 () Int )
(declare-fun module_code ( Int) Int )
(declare-fun student_year ( Int) Int )
(declare-fun container_ ( Int) Int )
(declare-fun rel_bc0c6b89_c9dd_4bdc_b853_08f8e5896a48_study ( Int Int) Bool )
(declare-fun person_age ( Int) Int )
(declare-fun type_dabb23f9_070e_425f_8297_b3034c15f57e_Student ( Int) Bool )
(declare-fun type_f371334e_0c76_4997_846a_1bebfdbc7989_Module ( Int) Bool )
(declare-fun oclIncludes ( Int Int) Bool )
(declare-fun person_name ( Int) Int )
(declare-fun aux1 () Int )
(declare-fun aux0 () Int )
(declare-fun module_description ( Int) Int )
(declare-fun aux3 () Int )
(declare-fun aux2 () Int )
(declare-fun module_credits ( Int) Int )
(declare-fun aux8 () Int )
(declare-fun aux5 () Int )
(declare-fun aux4 () Int )
(declare-fun aux7 () Int )
(declare-fun aux6 () Int )
(declare-fun student_id ( Int) Int )
(declare-fun ObjAt ( Int Int) Int )

;formula(s) generated
(assert (and (>= aux0 0) (<= aux0 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_bc0c6b89_c9dd_4bdc_b853_08f8e5896a48_study ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f x )   ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f y )  )  (and (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student x )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person x ) ) ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k4ab5b674_3659_455d_a675_f7a02fa8e559)) (>= k4ab5b674_3659_455d_a675_f7a02fa8e559 0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k03142174_c8ed_4cee_9ae1_3e9a3238b34c)) (>= k03142174_c8ed_4cee_9ae1_3e9a3238b34c 0))))) (and (= aux0 1) true)) (and (= aux0 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_bc0c6b89_c9dd_4bdc_b853_08f8e5896a48_study ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f x )   ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f y )  )  (and (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student x )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person x ) ) ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k4ab5b674_3659_455d_a675_f7a02fa8e559)) (>= k4ab5b674_3659_455d_a675_f7a02fa8e559 0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k03142174_c8ed_4cee_9ae1_3e9a3238b34c)) (>= k03142174_c8ed_4cee_9ae1_3e9a3238b34c 0))))))
(assert (and (>= aux1 0) (<= aux1 1)))
(assert (or (or (and (forall ((v Int)) (=> ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module v )  (>= ( module_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  1))) (forall ((v Int)) (=> ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module v )  (<= ( module_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  5)))) (and (= aux1 1) true)) (and (= aux1 0) false)))
(assert (and (forall ((v Int)) (=> ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module v )  (>= ( module_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  1))) (forall ((v Int)) (=> ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module v )  (<= ( module_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  5)))))
(assert (and (>= aux2 0) (<= aux2 1)))
(assert (or (or (forall ((p Int)) (=> ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person p )  (and (> ( person_age ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f p )  )  0) (< ( person_age ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f p )  )  18)))) (and (= aux2 1) true)) (and (= aux2 0) false)))
(assert (forall ((p Int)) (=> ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person p )  (and (> ( person_age ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f p )  )  0) (< ( person_age ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f p )  )  18)))))
(assert (and (>= aux3 0) (<= aux3 1)))
(assert (or (or (forall ((v Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student v )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person v ) ) (> ( person_age ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  18))) (and (= aux3 1) true)) (and (= aux3 0) false)))
(assert (forall ((v Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student v )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person v ) ) (> ( person_age ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  18))))
(assert (and (>= aux4 0) (<= aux4 1)))
(assert (or (or (and (forall ((v Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student v )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person v ) ) (>= ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  1))) (forall ((v Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student v )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person v ) ) (<= ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  6)))) (and (= aux4 1) true)) (and (= aux4 0) false)))
(assert (and (forall ((v Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student v )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person v ) ) (>= ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  1))) (forall ((v Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student v )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person v ) ) (<= ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  )  6)))))
(assert (and (>= aux5 0) (<= aux5 1)))
(assert (or (or (forall ((s1 Int)(s2 Int)) (=> (and (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s1 )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s1 ) ) (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s2 )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s2 ) )) (=> (not (= ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s1 )  ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s2 ) ) ) (not (= ( student_id ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s1 )  )  ( student_id ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s2 )  ) ) )))) (and (= aux5 1) true)) (and (= aux5 0) false)))
(assert (forall ((s1 Int)(s2 Int)) (=> (and (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s1 )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s1 ) ) (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s2 )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s2 ) )) (=> (not (= ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s1 )  ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s2 ) ) ) (not (= ( student_id ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s1 )  )  ( student_id ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s2 )  ) ) )))))
(assert (and (>= aux6 0) (<= aux6 1)))
(assert (or (or (forall ((s1 Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s1 )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s1 ) ) (forall ((m1 Int)) (=> (and ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module m1 )  ( rel_bc0c6b89_c9dd_4bdc_b853_08f8e5896a48_study ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s1 )   ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f m1 )  ) ) (= ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s1 )  )  ( module_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f m1 )  ) ))))) (and (= aux6 1) true)) (and (= aux6 0) false)))
(assert (forall ((s1 Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s1 )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s1 ) ) (forall ((m1 Int)) (=> (and ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module m1 )  ( rel_bc0c6b89_c9dd_4bdc_b853_08f8e5896a48_study ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s1 )   ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f m1 )  ) ) (= ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s1 )  )  ( module_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f m1 )  ) ))))))
(assert (and (>= aux7 0) (<= aux7 1)))
(assert (or (or (and (exists ((s Int)) (and (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s ) ) (= ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s )  )  6))) (exists ((s Int)) (and (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s ) ) (< ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s )  )  6)))) (and (= aux7 1) true)) (and (= aux7 0) false)))
(assert (and (exists ((s Int)) (and (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s ) ) (= ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s )  )  6))) (exists ((s Int)) (and (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s ) ) (< ( student_year ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s )  )  6)))))
(assert (and (>= aux8 0) (<= aux8 1)))
(assert (or (or (forall ((s Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s ) ) (exists ((v Int)) (and ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module v )  ( rel_bc0c6b89_c9dd_4bdc_b853_08f8e5896a48_study ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s )   ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  ) )))) (and (= aux8 1) true)) (and (= aux8 0) false)))
(assert (forall ((s Int)) (=> (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student s )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person s ) ) (exists ((v Int)) (and ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module v )  ( rel_bc0c6b89_c9dd_4bdc_b853_08f8e5896a48_study ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f s )   ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f v )  ) )))))
(assert (exists ((o Int)) ( type_f371334e_0c76_4997_846a_1bebfdbc7989_Module ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f o )  ) ))
(assert (exists ((o Int)) ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f o )  ) ))
(assert (exists ((o Int)) (and ( type_dabb23f9_070e_425f_8297_b3034c15f57e_Student ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f o )  )  ( type_43fb24e8_a5b2_4971_a67b_d5b2a773221d_Person ( obj_db7ce988_1ebd_464e_8f18_5322ab50fb1f o )  ) )))
(assert (= (+ (+ (+ (+ (+ (+ (+ (+ aux0 aux1) aux2) aux3) aux4) aux5) aux6) aux7) aux8) 0))
=======
;this file is automatically generated: Mon May 20 16:24:39 IST 2019

;declarations generated

(declare-fun k194a1159c_4fab_40a6_9b02_8d26f70c9da3 () Int)
(declare-fun k26133747e_a073_43d6_8d9a_384bc9a3ee9f () Int)
(declare-fun type_58c18f1b_c348_4615_8bf1_6a1eb98ba73c_Department ( Int) Bool)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun k58a815a5_57c9_4cba_b78a_5889594664fe () Int)
(declare-fun assignment_code ( Int) Int)
(declare-fun aux12 () Int)
(declare-fun aux11 () Int)
(declare-fun aux10 () Int)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun rel_139c58ff_8318_4179_aa5d_4dc8aa8bac7b_contain ( Int Int) Bool)
(declare-fun k25702fce3_811d_43b9_9742_592d94a9fc1e () Int)
(declare-fun kd1c07fa9_61d2_4c73_938d_e08c2eee59fd () Int)
(declare-fun person_mature ( Int) Bool)
(declare-fun obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 ( Int) Int)
(declare-fun type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person ( Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun type_b9f47f47_5635_44e6_adc2_a56fba2e2e25_Assignment ( Int) Bool)
(declare-fun k1703e93a_158e_45bf_930f_892937859c58 () Int)
(declare-fun type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module ( Int) Bool)
(declare-fun k1f2a2f50a_f871_475d_8d99_9699a1855da7 () Int)
(declare-fun k55747269_ea02_4a45_a5bb_0ced3347fce9 () Int)
(declare-fun assignment_due ( Int) Int)
(declare-fun k9d7bc8b7_e479_4022_9b69_a8b4c8b79b51 () Int)
(declare-fun module_year ( Int) Int)
(declare-fun k24a245ea1_adfa_4bdd_a52f_c9a607505198 () Int)
(declare-fun module_code ( Int) Int)
(declare-fun student_year ( Int) Int)
(declare-fun rel_0e253d4d_501f_4292_89d1_90d6bc4b9da3_finish ( Int Int) Bool)
(declare-fun rel_2593071c_6c2a_4183_888c_a37aebbf9e61_design ( Int Int) Bool)
(declare-fun container_ ( Int) Int)
(declare-fun department_name ( Int) Int)
(declare-fun person_age ( Int) Int)
(declare-fun kc0e0f359_557d_4270_b3e4_e92990ec6804 () Int)
(declare-fun kb73390d7_3729_408e_878b_8137f0ad62bf () Int)
(declare-fun rel_e323dd1a_b5be_4afb_b609_ded6144eb654_study ( Int Int) Bool)
(declare-fun k114bb2cf5_3f03_4d80_95df_6c483cfa1429 () Int)
(declare-fun k86de8b35_72f5_40dc_90b3_d1a3d2dfe4c9 () Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun person_name ( Int) Int)
(declare-fun rel_fdb7173e_0c6a_49a6_8abc_a66283373e7f_homework ( Int Int) Bool)
(declare-fun k2d664c0ba_8276_4a28_a553_e51d7381069a () Int)
(declare-fun aux1 () Int)
(declare-fun aux0 () Int)
(declare-fun module_description ( Int) Int)
(declare-fun aux3 () Int)
(declare-fun aux2 () Int)
(declare-fun module_credits ( Int) Int)
(declare-fun aux9 () Int)
(declare-fun aux8 () Int)
(declare-fun aux5 () Int)
(declare-fun aux4 () Int)
(declare-fun aux7 () Int)
(declare-fun aux6 () Int)
(declare-fun type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student ( Int) Bool)
(declare-fun student_id ( Int) Int)
(declare-fun ObjAt ( Int Int) Int)
(declare-fun k16c088a90_8a6b_470c_a262_91e54a133169 () Int)
(declare-fun k6dd59744_7d0d_4afa_b5a6_0f29eeffedeb () Int)
(declare-fun k4d61358e_91ed_4859_94f9_fc1a50fe8223 () Int)

;formula(s) generated
(assert (and (>= aux0 0) (<= aux0 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_139c58ff_8318_4179_aa5d_4dc8aa8bac7b_contain ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student x )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person x ) ) ( type_58c18f1b_c348_4615_8bf1_6a1eb98ba73c_Department y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k1703e93a_158e_45bf_930f_892937859c58)) (>= k1703e93a_158e_45bf_930f_892937859c58 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  k9d7bc8b7_e479_4022_9b69_a8b4c8b79b51)) (>= k9d7bc8b7_e479_4022_9b69_a8b4c8b79b51 0))) (and (= (* ( Cardinality ( container_ x )  )  k1f2a2f50a_f871_475d_8d99_9699a1855da7) (* ( Cardinality ( container_ y )  )  k24a245ea1_adfa_4bdd_a52f_c9a607505198)) (and (>= k1f2a2f50a_f871_475d_8d99_9699a1855da7 0) (>= k24a245ea1_adfa_4bdd_a52f_c9a607505198 0)))))) (and (= aux0 1) true)) (and (= aux0 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_139c58ff_8318_4179_aa5d_4dc8aa8bac7b_contain ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student x )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person x ) ) ( type_58c18f1b_c348_4615_8bf1_6a1eb98ba73c_Department y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k1703e93a_158e_45bf_930f_892937859c58)) (>= k1703e93a_158e_45bf_930f_892937859c58 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  k9d7bc8b7_e479_4022_9b69_a8b4c8b79b51)) (>= k9d7bc8b7_e479_4022_9b69_a8b4c8b79b51 0))) (and (= (* ( Cardinality ( container_ x )  )  k1f2a2f50a_f871_475d_8d99_9699a1855da7) (* ( Cardinality ( container_ y )  )  k24a245ea1_adfa_4bdd_a52f_c9a607505198)) (and (>= k1f2a2f50a_f871_475d_8d99_9699a1855da7 0) (>= k24a245ea1_adfa_4bdd_a52f_c9a607505198 0)))))))
(assert (and (>= aux1 0) (<= aux1 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_2593071c_6c2a_4183_888c_a37aebbf9e61_design ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and ( type_58c18f1b_c348_4615_8bf1_6a1eb98ba73c_Department x )  ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  kd1c07fa9_61d2_4c73_938d_e08c2eee59fd)) (>= kd1c07fa9_61d2_4c73_938d_e08c2eee59fd 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  k6dd59744_7d0d_4afa_b5a6_0f29eeffedeb)) (>= k6dd59744_7d0d_4afa_b5a6_0f29eeffedeb 0))) (and (= (* ( Cardinality ( container_ x )  )  k114bb2cf5_3f03_4d80_95df_6c483cfa1429) (* ( Cardinality ( container_ y )  )  k2d664c0ba_8276_4a28_a553_e51d7381069a)) (and (>= k114bb2cf5_3f03_4d80_95df_6c483cfa1429 0) (>= k2d664c0ba_8276_4a28_a553_e51d7381069a 0)))))) (and (= aux1 1) true)) (and (= aux1 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_2593071c_6c2a_4183_888c_a37aebbf9e61_design ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and ( type_58c18f1b_c348_4615_8bf1_6a1eb98ba73c_Department x )  ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  kd1c07fa9_61d2_4c73_938d_e08c2eee59fd)) (>= kd1c07fa9_61d2_4c73_938d_e08c2eee59fd 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  k6dd59744_7d0d_4afa_b5a6_0f29eeffedeb)) (>= k6dd59744_7d0d_4afa_b5a6_0f29eeffedeb 0))) (and (= (* ( Cardinality ( container_ x )  )  k114bb2cf5_3f03_4d80_95df_6c483cfa1429) (* ( Cardinality ( container_ y )  )  k2d664c0ba_8276_4a28_a553_e51d7381069a)) (and (>= k114bb2cf5_3f03_4d80_95df_6c483cfa1429 0) (>= k2d664c0ba_8276_4a28_a553_e51d7381069a 0)))))))
(assert (and (>= aux2 0) (<= aux2 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_0e253d4d_501f_4292_89d1_90d6bc4b9da3_finish ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and ( type_b9f47f47_5635_44e6_adc2_a56fba2e2e25_Assignment x )  (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student y )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person y ) ))) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  kc0e0f359_557d_4270_b3e4_e92990ec6804)) (>= kc0e0f359_557d_4270_b3e4_e92990ec6804 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  k86de8b35_72f5_40dc_90b3_d1a3d2dfe4c9)) (>= k86de8b35_72f5_40dc_90b3_d1a3d2dfe4c9 0))) (and (= (* ( Cardinality ( container_ x )  )  k194a1159c_4fab_40a6_9b02_8d26f70c9da3) (* ( Cardinality ( container_ y )  )  k26133747e_a073_43d6_8d9a_384bc9a3ee9f)) (and (>= k194a1159c_4fab_40a6_9b02_8d26f70c9da3 0) (>= k26133747e_a073_43d6_8d9a_384bc9a3ee9f 0)))))) (and (= aux2 1) true)) (and (= aux2 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_0e253d4d_501f_4292_89d1_90d6bc4b9da3_finish ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and ( type_b9f47f47_5635_44e6_adc2_a56fba2e2e25_Assignment x )  (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student y )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person y ) ))) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  kc0e0f359_557d_4270_b3e4_e92990ec6804)) (>= kc0e0f359_557d_4270_b3e4_e92990ec6804 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  k86de8b35_72f5_40dc_90b3_d1a3d2dfe4c9)) (>= k86de8b35_72f5_40dc_90b3_d1a3d2dfe4c9 0))) (and (= (* ( Cardinality ( container_ x )  )  k194a1159c_4fab_40a6_9b02_8d26f70c9da3) (* ( Cardinality ( container_ y )  )  k26133747e_a073_43d6_8d9a_384bc9a3ee9f)) (and (>= k194a1159c_4fab_40a6_9b02_8d26f70c9da3 0) (>= k26133747e_a073_43d6_8d9a_384bc9a3ee9f 0)))))))
(assert (and (>= aux3 0) (<= aux3 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_fdb7173e_0c6a_49a6_8abc_a66283373e7f_homework ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and ( type_b9f47f47_5635_44e6_adc2_a56fba2e2e25_Assignment x )  ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k55747269_ea02_4a45_a5bb_0ced3347fce9)) (>= k55747269_ea02_4a45_a5bb_0ced3347fce9 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  k4d61358e_91ed_4859_94f9_fc1a50fe8223)) (>= k4d61358e_91ed_4859_94f9_fc1a50fe8223 0))) (and (= (* ( Cardinality ( container_ x )  )  k16c088a90_8a6b_470c_a262_91e54a133169) (* ( Cardinality ( container_ y )  )  k25702fce3_811d_43b9_9742_592d94a9fc1e)) (and (>= k16c088a90_8a6b_470c_a262_91e54a133169 0) (>= k25702fce3_811d_43b9_9742_592d94a9fc1e 0)))))) (and (= aux3 1) true)) (and (= aux3 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_fdb7173e_0c6a_49a6_8abc_a66283373e7f_homework ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and ( type_b9f47f47_5635_44e6_adc2_a56fba2e2e25_Assignment x )  ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k55747269_ea02_4a45_a5bb_0ced3347fce9)) (>= k55747269_ea02_4a45_a5bb_0ced3347fce9 0))) (and (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  k4d61358e_91ed_4859_94f9_fc1a50fe8223)) (>= k4d61358e_91ed_4859_94f9_fc1a50fe8223 0))) (and (= (* ( Cardinality ( container_ x )  )  k16c088a90_8a6b_470c_a262_91e54a133169) (* ( Cardinality ( container_ y )  )  k25702fce3_811d_43b9_9742_592d94a9fc1e)) (and (>= k16c088a90_8a6b_470c_a262_91e54a133169 0) (>= k25702fce3_811d_43b9_9742_592d94a9fc1e 0)))))))
(assert (and (>= aux4 0) (<= aux4 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_e323dd1a_b5be_4afb_b609_ded6144eb654_study ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student x )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person x ) ) ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  kb73390d7_3729_408e_878b_8137f0ad62bf)) (>= kb73390d7_3729_408e_878b_8137f0ad62bf 0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k58a815a5_57c9_4cba_b78a_5889594664fe)) (>= k58a815a5_57c9_4cba_b78a_5889594664fe 0))))) (and (= aux4 1) true)) (and (= aux4 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_e323dd1a_b5be_4afb_b609_ded6144eb654_study ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 x )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 y )  )  (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student x )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person x ) ) ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  kb73390d7_3729_408e_878b_8137f0ad62bf)) (>= kb73390d7_3729_408e_878b_8137f0ad62bf 0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  k58a815a5_57c9_4cba_b78a_5889594664fe)) (>= k58a815a5_57c9_4cba_b78a_5889594664fe 0))))))
(assert (and (>= aux5 0) (<= aux5 1)))
(assert (or (or (and (forall ((v Int)) (=> ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module v )  (>= ( module_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  1))) (forall ((v Int)) (=> ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module v )  (<= ( module_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  5)))) (and (= aux5 1) true)) (and (= aux5 0) false)))
(assert (and (forall ((v Int)) (=> ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module v )  (>= ( module_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  1))) (forall ((v Int)) (=> ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module v )  (<= ( module_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  5)))))
(assert (and (>= aux6 0) (<= aux6 1)))
(assert (or (or (forall ((p Int)) (=> ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person p )  (and (> ( person_age ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 p )  )  0) (< ( person_age ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 p )  )  18)))) (and (= aux6 1) true)) (and (= aux6 0) false)))
(assert (forall ((p Int)) (=> ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person p )  (and (> ( person_age ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 p )  )  0) (< ( person_age ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 p )  )  18)))))
(assert (and (>= aux7 0) (<= aux7 1)))
(assert (or (or (forall ((v Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student v )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person v ) ) (> ( person_age ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  18))) (and (= aux7 1) true)) (and (= aux7 0) false)))
(assert (forall ((v Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student v )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person v ) ) (> ( person_age ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  18))))
(assert (and (>= aux8 0) (<= aux8 1)))
(assert (or (or (and (forall ((v Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student v )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person v ) ) (>= ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  1))) (forall ((v Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student v )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person v ) ) (<= ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  6)))) (and (= aux8 1) true)) (and (= aux8 0) false)))
(assert (and (forall ((v Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student v )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person v ) ) (>= ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  1))) (forall ((v Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student v )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person v ) ) (<= ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  )  6)))))
(assert (and (>= aux9 0) (<= aux9 1)))
(assert (or (or (forall ((s1 Int)(s2 Int)) (=> (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s1 )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s1 ) ) (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s2 )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s2 ) )) (=> (not (= ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s1 )  ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s2 ) ) ) (not (= ( student_id ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s1 )  )  ( student_id ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s2 )  ) ) )))) (and (= aux9 1) true)) (and (= aux9 0) false)))
(assert (forall ((s1 Int)(s2 Int)) (=> (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s1 )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s1 ) ) (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s2 )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s2 ) )) (=> (not (= ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s1 )  ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s2 ) ) ) (not (= ( student_id ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s1 )  )  ( student_id ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s2 )  ) ) )))))
(assert (and (>= aux10 0) (<= aux10 1)))
(assert (or (or (forall ((s1 Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s1 )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s1 ) ) (forall ((m1 Int)) (=> (and ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module m1 )  ( rel_e323dd1a_b5be_4afb_b609_ded6144eb654_study ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s1 )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 m1 )  ) ) (= ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s1 )  )  ( module_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 m1 )  ) ))))) (and (= aux10 1) true)) (and (= aux10 0) false)))
(assert (forall ((s1 Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s1 )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s1 ) ) (forall ((m1 Int)) (=> (and ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module m1 )  ( rel_e323dd1a_b5be_4afb_b609_ded6144eb654_study ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s1 )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 m1 )  ) ) (= ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s1 )  )  ( module_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 m1 )  ) ))))))
(assert (and (>= aux11 0) (<= aux11 1)))
(assert (or (or (and (exists ((s Int)) (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s ) ) (= ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s )  )  6))) (exists ((s Int)) (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s ) ) (< ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s )  )  6)))) (and (= aux11 1) true)) (and (= aux11 0) false)))
(assert (and (exists ((s Int)) (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s ) ) (= ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s )  )  6))) (exists ((s Int)) (and (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s ) ) (< ( student_year ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s )  )  6)))))
(assert (and (>= aux12 0) (<= aux12 1)))
(assert (or (or (forall ((s Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s ) ) (exists ((v Int)) (and ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module v )  ( rel_e323dd1a_b5be_4afb_b609_ded6144eb654_study ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  ) )))) (and (= aux12 1) true)) (and (= aux12 0) false)))
(assert (forall ((s Int)) (=> (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student s )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person s ) ) (exists ((v Int)) (and ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module v )  ( rel_e323dd1a_b5be_4afb_b609_ded6144eb654_study ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 s )   ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 v )  ) )))))
(assert (exists ((o Int)) ( type_b9f47f47_5635_44e6_adc2_a56fba2e2e25_Assignment ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 o )  ) ))
(assert (exists ((o Int)) ( type_58c18f1b_c348_4615_8bf1_6a1eb98ba73c_Department ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 o )  ) ))
(assert (exists ((o Int)) ( type_6bb791fc_c6e1_4d85_94af_26ef348ee0e5_Module ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 o )  ) ))
(assert (exists ((o Int)) ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 o )  ) ))
(assert (exists ((o Int)) (and ( type_7f5ce68d_953b_447a_a0fb_f2ec072c947c_Student ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 o )  )  ( type_6bc477f7_eba6_4e40_9600_4fd18dab8819_Person ( obj_b4dcc1b7_2046_4cfc_9e47_4940b8c28d93 o )  ) )))
(assert (= (+ (+ (+ (+ (+ (+ (+ (+ (+ (+ (+ (+ aux0 aux1) aux2) aux3) aux4) aux5) aux6) aux7) aux8) aux9) aux10) aux11) aux12) 0))
>>>>>>> Qmaxuse

 ;end of formula 