package com.example

import groovy.transform.TupleConstructor
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
@TupleConstructor
class FailingTestEntity extends BaseEntity {
    @Id
    long id
    String name
}
