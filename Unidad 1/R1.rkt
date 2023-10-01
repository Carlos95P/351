#lang racket
(define(SCN x y)
(+(SQ x) (SQ y)))
(define(SQ x)
(* x x))