
;this file is automatically generated: Wed May 11 14:29:34 IST 2022

;declarations generated

(declare-fun Gender ( Int) Int)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Child ( Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun obj_215652ef_e73c_446b_a233_a5849344cbaf ( Int) Int)
(declare-fun type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_University ( Int) Bool)
(declare-fun type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Person ( Int) Bool)
(declare-fun type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Department ( Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun container_ ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Student ( Int) Bool)
(declare-fun type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Module ( Int) Bool)
(declare-fun student_id ( Int) Int)
(declare-fun ObjAt ( Int Int) Int)

;formula(s) generated
(assert (! (forall ((s1 Int)(s2 Int)) (=> (and (and ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Student s1 )  ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Person s1 ) ) (and ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Student s2 )  ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Person s2 ) )) (=> (not (= ( obj_215652ef_e73c_446b_a233_a5849344cbaf s1 )  ( obj_215652ef_e73c_446b_a233_a5849344cbaf s2 ) ) ) (not (= ( student_id ( obj_215652ef_e73c_446b_a233_a5849344cbaf s1 )  )  ( student_id ( obj_215652ef_e73c_446b_a233_a5849344cbaf s2 )  ) ) )))):named l0))
(assert (! (exists ((o Int)) (and ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Child ( obj_215652ef_e73c_446b_a233_a5849344cbaf o )  )  ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Person ( obj_215652ef_e73c_446b_a233_a5849344cbaf o )  ) )):named c0))
(assert (! (exists ((o Int)) ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Department ( obj_215652ef_e73c_446b_a233_a5849344cbaf o )  ) ):named c1))
(assert (! (exists ((o Int)) ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Module ( obj_215652ef_e73c_446b_a233_a5849344cbaf o )  ) ):named c2))
(assert (! (exists ((o Int)) (and ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Student ( obj_215652ef_e73c_446b_a233_a5849344cbaf o )  )  ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_Person ( obj_215652ef_e73c_446b_a233_a5849344cbaf o )  ) )):named c4))
(assert (! (exists ((o Int)) ( type_64a1f7be_a1e2_4184_9b3a_c8e0346213d0_University ( obj_215652ef_e73c_446b_a233_a5849344cbaf o )  ) ):named c5))

 ;end of formula 