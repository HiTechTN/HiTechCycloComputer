package com.hitechcyclocomputer.domain

interface UseCase<in P, out R> {
  operator fun invoke(parameters: P): R
}
