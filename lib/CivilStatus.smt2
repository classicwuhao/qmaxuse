
;this file is automatically generated: Fri Mar 24 17:56:07 GMT 2017

;declarations generated

(declare-fun Gender ( Int) Int )
(declare-fun rel_9fb5c5d8_b175_42c6_ad3e_31cc6a831a80_Marriage ( Int Int) Bool )
(declare-fun oclExcludes ( Int Int) Bool )
(declare-fun oclSelect ( Int Bool) Int )
(declare-fun type_e6f89011_46e8_4f96_a045_874a04f05a34_Person ( Int) Bool )
(declare-fun Cardinality ( Int) Int )
(declare-fun obj_454e4764_f681_4e03_9477_bcb12af68f7b ( Int) Int )
(declare-fun container_ ( Int) Int )
(declare-fun CivilStatus ( Int) Int )
(declare-fun oclIncludes ( Int Int) Bool )
(declare-fun person_name ( Int) Int )
(declare-fun aux1 () Int )
(declare-fun aux0 () Int )
(declare-fun aux3 () Int )
(declare-fun aux2 () Int )
(declare-fun aux4 () Int )
(declare-fun weight4 () Int )
(declare-fun weight3 () Int )
(declare-fun ObjAt ( Int Int) Int )
(declare-fun weight2 () Int )
(declare-fun weight1 () Int )
(declare-fun weight0 () Int )

;formula(s) generated
(assert (forall ((p Int)) (=> ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person p )  (and (>= ( CivilStatus ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )  )  0) (<= ( CivilStatus ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )  )  3)))))
(assert (forall ((p Int)) (=> ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person p )  (and (>= ( Gender ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )  )  0) (<= ( Gender ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )  )  1)))))
(assert (and (>= aux0 0) (<= aux0 1)))
(assert (or (or (forall ((x Int)(y Int)) (=> (and ( rel_9fb5c5d8_b175_42c6_ad3e_31cc6a831a80_Marriage ( obj_454e4764_f681_4e03_9477_bcb12af68f7b x )   ( obj_454e4764_f681_4e03_9477_bcb12af68f7b y )  )  (and ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person x )  ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  0)) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1))))) (and (= aux0 1) true)) (and (= aux0 0) false)))
(assert (forall ((x Int)(y Int)) (=> (and ( rel_9fb5c5d8_b175_42c6_ad3e_31cc6a831a80_Marriage ( obj_454e4764_f681_4e03_9477_bcb12af68f7b x )   ( obj_454e4764_f681_4e03_9477_bcb12af68f7b y )  )  (and ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person x )  ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person y ) )) (or (or (or (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  0)) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  0))) (= (* ( Cardinality ( container_ x )  )  0) (* ( Cardinality ( container_ y )  )  1))) (= (* ( Cardinality ( container_ x )  )  1) (* ( Cardinality ( container_ y )  )  1))))))
(assert (and (=> (= aux0 0) (= weight0 3)) (=> (= aux0 1) (= weight0 0))))
(assert (and (>= aux1 0) (<= aux1 1)))
(assert (or (or (forall ((p1 Int)(p2 Int)) (=> (and ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person p1 )  ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person p2 ) ) (=> (not (= ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p1 )  ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p2 ) ) ) (not (= ( person_name ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p1 )  )  ( person_name ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p2 )  ) ) )))) (and (= aux1 1) true)) (and (= aux1 0) false)))
(assert (and (=> (= aux1 0) (= weight1 3)) (=> (= aux1 1) (= weight1 0))))
(assert (and (>= aux2 0) (<= aux2 1)))
(assert (or (or (forall ((p Int)) (=> ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person p )  (=> (= ( Gender ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )  )  0) (not (exists ((v Int)) (and ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person v )  ( rel_9fb5c5d8_b175_42c6_ad3e_31cc6a831a80_Marriage ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )   ( obj_454e4764_f681_4e03_9477_bcb12af68f7b v )  ) )) )))) (and (= aux2 1) true)) (and (= aux2 0) false)))
(assert (and (=> (= aux2 0) (= weight2 3)) (=> (= aux2 1) (= weight2 0))))
(assert (and (>= aux3 0) (<= aux3 1)))
(assert (or (or (forall ((p Int)) (=> ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person p )  (=> (= ( Gender ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )  )  1) (not (exists ((v Int)) (and ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person v )  ( rel_9fb5c5d8_b175_42c6_ad3e_31cc6a831a80_Marriage ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )   ( obj_454e4764_f681_4e03_9477_bcb12af68f7b v )  ) )) )))) (and (= aux3 1) true)) (and (= aux3 0) false)))
(assert (and (=> (= aux3 0) (= weight3 3)) (=> (= aux3 1) (= weight3 0))))
(assert (and (>= aux4 0) (<= aux4 1)))
(assert (or (or (exists ((p Int)) ( type_e6f89011_46e8_4f96_a045_874a04f05a34_Person ( obj_454e4764_f681_4e03_9477_bcb12af68f7b p )  ) ) (and (= aux4 1) true)) (and (= aux4 0) false)))
(assert (and (=> (= aux4 0) (= weight4 3)) (=> (= aux4 1) (= weight4 0))))
(assert (= (+ (+ (+ (+ aux0 aux1) aux2) aux3) aux4) 0))

 ;end of formula 