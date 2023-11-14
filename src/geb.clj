(ns geb.core)

;; Define the base GebCategory
(defrecord GebCategory [objects morphisms])

;; Define the base GebMorphism
(defrecord GebMorphism [domain codomain])

;; Define the base GebObject
(defrecord GebObject [])
