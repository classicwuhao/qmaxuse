
;this file is automatically generated: Fri Mar 18 16:14:29 GMT 2016

;declarations generated

(declare-fun type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module ( Int) Bool )
(declare-fun aux11 () Int )
(declare-fun aux10 () Int )
(declare-fun kc5785b18_ba65_4fa2_b400_e76841394e8f () Int )
(declare-fun student_year ( Int) Int )
(declare-fun type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student ( Int) Bool )
(declare-fun obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 ( Int) Int )
(declare-fun weight11 () Int )
(declare-fun weight10 () Int )
(declare-fun module_code ( Int) Int )
(declare-fun module_year ( Int) Int )
(declare-fun container_ ( Int) Int )
(declare-fun module_credit ( Int) Int )
(declare-fun Cardinality ( Int) Int )
(declare-fun student_id ( Int) Int )
(declare-fun aux7 () Int )
(declare-fun aux6 () Int )
(declare-fun aux5 () Int )
(declare-fun aux4 () Int )
(declare-fun aux9 () Int )
(declare-fun aux8 () Int )
(declare-fun person_age ( Int) Int )
(declare-fun aux2 () Int )
(declare-fun aux3 () Int )
(declare-fun aux0 () Int )
(declare-fun aux1 () Int )
(declare-fun person_mature ( Int) Bool )
(declare-fun kf1b83311_c58e_48ef_b4bb_24cc98a3f317 () Int )
(declare-fun weight2 () Int )
(declare-fun weight3 () Int )
(declare-fun weight1 () Int )
(declare-fun weight6 () Int )
(declare-fun weight7 () Int )
(declare-fun weight4 () Int )
(declare-fun weight5 () Int )
(declare-fun rel_44677f35_b9fe_40fd_8cc3_94127852a844_study ( Int Int) Bool )
(declare-fun weight9 () Int )
(declare-fun weight8 () Int )
(declare-fun type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person ( Int) Bool )

;formula(s) generated
(assert (forall ((x Int)(y Int)) (=> (and ( rel_44677f35_b9fe_40fd_8cc3_94127852a844_study ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 x )   ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 y )  )  (and (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student x )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person x ) ) ( type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1)) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  kf1b83311_c58e_48ef_b4bb_24cc98a3f317)) (>= kf1b83311_c58e_48ef_b4bb_24cc98a3f317 0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (and (= (* ( Cardinality ( container_ y )  )  1) (* ( Cardinality ( container_ x )  )  kc5785b18_ba65_4fa2_b400_e76841394e8f)) (>= kc5785b18_ba65_4fa2_b400_e76841394e8f 0))))))
(assert (and (>= aux0 0) (<= aux0 1)))
(assert (or (or (and (forall ((v Int)) (=> ( type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module v )  (>= ( module_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  1))) (forall ((v Int)) (=> ( type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module v )  (<= ( module_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  5)))) (and (= aux0 1) true)) (and (= aux0 0) false)))
(assert (and (forall ((v Int)) (=> ( type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module v )  (>= ( module_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  1))) (forall ((v Int)) (=> ( type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module v )  (<= ( module_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  5)))))
(assert (and (>= aux1 0) (<= aux1 1)))
(assert (or (or (forall ((v Int)) (=> ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person v )  (< ( person_age ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  18))) (and (= aux1 1) true)) (and (= aux1 0) false)))
(assert (and (=> (= aux1 0) (= weight1 4)) (=> (= aux1 1) (= weight1 0))))
(assert (and (>= aux2 0) (<= aux2 1)))
(assert (or (or (forall ((v Int)) (=> ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person v )  (not (= ( person_mature ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  true) ))) (and (= aux2 1) true)) (and (= aux2 0) false)))
(assert (and (=> (= aux2 0) (= weight2 4)) (=> (= aux2 1) (= weight2 0))))
(assert (and (>= aux3 0) (<= aux3 1)))
(assert (or (or (forall ((v Int)) (=> (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student v )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person v ) ) (>= ( person_age ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  18))) (and (= aux3 1) true)) (and (= aux3 0) false)))
(assert (and (=> (= aux3 0) (= weight3 4)) (=> (= aux3 1) (= weight3 0))))
(assert (and (>= aux4 0) (<= aux4 1)))
(assert (or (or (and (forall ((v Int)) (=> (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student v )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person v ) ) (>= ( student_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  1))) (forall ((v Int)) (=> (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student v )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person v ) ) (<= ( student_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  )  6)))) (and (= aux4 1) true)) (and (= aux4 0) false)))
(assert (and (=> (= aux4 0) (= weight4 9)) (=> (= aux4 1) (= weight4 0))))
(assert (and (>= aux5 0) (<= aux5 1)))
(assert (or (or (forall ((s2 Int)(s1 Int)) (=> (and (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student s1 )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person s1 ) ) (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student s2 )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person s2 ) )) (=> (not (= ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s1 )  ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s2 ) ) ) (not (= ( student_id ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s1 )  )  ( student_id ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s2 )  ) ) )))) (and (= aux5 1) true)) (and (= aux5 0) false)))
(assert (and (=> (= aux5 0) (= weight5 12)) (=> (= aux5 1) (= weight5 0))))
(assert (and (>= aux6 0) (<= aux6 1)))
(assert (or (or (forall ((s1 Int)) (=> (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student s1 )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person s1 ) ) (forall ((m1 Int)) (=> (and ( type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module m1 )  ( rel_44677f35_b9fe_40fd_8cc3_94127852a844_study ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s1 )   ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 m1 )  ) ) (= ( student_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s1 )  )  ( module_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 m1 )  ) ))))) (and (= aux6 1) true)) (and (= aux6 0) false)))
(assert (and (=> (= aux6 0) (= weight6 10)) (=> (= aux6 1) (= weight6 0))))
(assert (and (>= aux7 0) (<= aux7 1)))
(assert (or (or (and (exists ((s Int)) (and (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student s )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person s ) ) (= ( student_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s )  )  6))) (exists ((s Int)) (and (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student s )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person s ) ) (< ( student_year ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s )  )  6)))) (and (= aux7 1) true)) (and (= aux7 0) false)))
(assert (and (=> (= aux7 0) (= weight7 13)) (=> (= aux7 1) (= weight7 0))))
(assert (and (>= aux8 0) (<= aux8 1)))
(assert (or (or (forall ((s Int)) (=> (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student s )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person s ) ) (exists ((v Int)) (and ( type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module v )  ( rel_44677f35_b9fe_40fd_8cc3_94127852a844_study ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 s )   ( obj_ab020e06_3d49_4b3e_af70_e98bf7fc8ec8 v )  ) )))) (and (= aux8 1) true)) (and (= aux8 0) false)))
(assert (and (=> (= aux8 0) (= weight8 5)) (=> (= aux8 1) (= weight8 0))))
(assert (and (>= aux9 0) (<= aux9 1)))
(assert (and (>= aux10 0) (<= aux10 1)))
(assert (and (>= aux11 0) (<= aux11 1)))
(assert (or (or (exists ((p Int)) ( type_8ec3c8b1_6322_440e_a16c_2cf303fa51c8_Module p ) ) (and (= aux9 1) true)) (and (= aux9 0) false)))
(assert (and (=> (= aux9 0) (= weight9 5)) (=> (= aux9 1) (= weight9 0))))
(assert (or (or (exists ((p Int)) ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person p ) ) (and (= aux10 1) true)) (and (= aux10 0) false)))
(assert (and (=> (= aux10 0) (= weight10 3)) (=> (= aux10 1) (= weight10 0))))
(assert (or (or (exists ((p Int)) (and ( type_b6a78f1f_0874_4858_be20_bed69a35f4c3_Student p )  ( type_3e69e1bf_cf54_4ea6_bc2b_41ffb4c180cd_Person p ) )) (and (= aux11 1) true)) (and (= aux11 0) false)))
(assert (and (=> (= aux11 0) (= weight11 6)) (=> (= aux11 1) (= weight11 0))))
(assert (= (+ (+ (+ (+ (+ (+ (+ (+ (+ (+ weight1 weight2) weight3) weight4) weight5) weight6) weight7) weight8) weight9) weight10) weight11) 66))

(assert (not (and (and (and (and (and (and (and (and (and (and (= weight1 0) (= weight2 4)) (= weight3 4)) (= weight4 9)) (= weight5 12)) (= weight6 10)) (= weight7 13)) (= weight8 0)) (= weight9 5)) (= weight10 3)) (= weight11 6)) ))

(assert (not (and (and (and (and (and (and (and (and (and (and (= weight1 4) (= weight2 4)) (= weight3 0)) (= weight4 9)) (= weight5 12)) (= weight6 10)) (= weight7 13)) (= weight8 0)) (= weight9 5)) (= weight10 3)) (= weight11 6)) ))
