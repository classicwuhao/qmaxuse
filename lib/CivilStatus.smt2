
;this file is automatically generated: Fri Jul 26 18:12:28 IST 2019

;declarations generated

(declare-fun Gender ( Int) Int)
(declare-fun oclExcludes ( Int Int) Bool)
(declare-fun oclSelect ( Int Bool) Int)
(declare-fun rel_082963e3_d390_4953_a0bf_dba2e874a535_Marriage ( Int Int) Bool)
(declare-fun Cardinality ( Int) Int)
(declare-fun container_ ( Int) Int)
(declare-fun obj_85bccade_fd00_4ef8_ba78_34a6651f34aa ( Int) Int)
(declare-fun type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person ( Int) Bool)
(declare-fun CivilStatus ( Int) Int)
(declare-fun oclIncludes ( Int Int) Bool)
(declare-fun person_name ( Int) Int)
(declare-fun aux1 () Int)
(declare-fun aux0 () Int)
(declare-fun aux3 () Int)
(declare-fun aux2 () Int)
(declare-fun aux4 () Int)
(declare-fun weight4 () Int)
(declare-fun weight3 () Int)
(declare-fun ObjAt ( Int Int) Int)
(declare-fun weight2 () Int)
(declare-fun weight1 () Int)
(declare-fun weight0 () Int)

;formula(s) generated
(assert (forall ((p Int)) (=> ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person p )  (and (>= ( CivilStatus ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )  )  0) (<= ( CivilStatus ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )  )  3)))))
(assert (forall ((p Int)) (=> ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person p )  (and (>= ( Gender ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )  )  0) (<= ( Gender ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )  )  1)))))
(assert (and (>= aux0 0) (<= aux0 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_082963e3_d390_4953_a0bf_dba2e874a535_Marriage ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa x )   ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa y )  )  (and ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person x )  ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  0)) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1))))) (and (= aux0 1) true)) (and (= aux0 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_082963e3_d390_4953_a0bf_dba2e874a535_Marriage ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa x )   ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa y )  )  (and ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person x )  ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  0)) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1))))))
(assert (and (=> (= aux0 0) (= weight0 3)) (=> (= aux0 1) (= weight0 0))))
(assert (and (>= aux1 0) (<= aux1 1)))
(assert (or (or (forall ((p1 Int)(p2 Int)) (=> (and ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person p1 )  ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person p2 ) ) (=> (not (= ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p1 )  ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p2 ) ) ) (not (= ( person_name ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p1 )  )  ( person_name ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p2 )  ) ) )))) (and (= aux1 1) true)) (and (= aux1 0) false)))
(assert (and (=> (= aux1 0) (= weight1 3)) (=> (= aux1 1) (= weight1 0))))
(assert (and (>= aux2 0) (<= aux2 1)))
(assert (or (or (forall ((p Int)) (=> ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person p )  (=> (= ( Gender ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )  )  0) (not (exists ((v Int)) (and ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person v )  ( rel_082963e3_d390_4953_a0bf_dba2e874a535_Marriage ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )   ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa v )  ) )) )))) (and (= aux2 1) true)) (and (= aux2 0) false)))
(assert (and (=> (= aux2 0) (= weight2 3)) (=> (= aux2 1) (= weight2 0))))
(assert (and (>= aux3 0) (<= aux3 1)))
(assert (or (or (forall ((p Int)) (=> ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person p )  (=> (= ( Gender ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )  )  1) (not (exists ((v Int)) (and ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person v )  ( rel_082963e3_d390_4953_a0bf_dba2e874a535_Marriage ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )   ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa v )  ) )) )))) (and (= aux3 1) true)) (and (= aux3 0) false)))
(assert (and (=> (= aux3 0) (= weight3 3)) (=> (= aux3 1) (= weight3 0))))
(assert (and (>= aux4 0) (<= aux4 1)))
(assert (or (or (exists ((p Int)) ( type_c15fcff7_9fa2_47c2_9e47_c976506091cc_Person ( obj_85bccade_fd00_4ef8_ba78_34a6651f34aa p )  ) ) (and (= aux4 1) true)) (and (= aux4 0) false)))
(assert (and (=> (= aux4 0) (= weight4 3)) (=> (= aux4 1) (= weight4 0))))
(assert (= (+ (+ (+ (+ aux0 aux1) aux2) aux3) aux4) 0))

 ;end of formula 