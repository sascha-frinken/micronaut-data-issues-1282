package com.example

import groovy.transform.TupleConstructor
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity

@MappedEntity
@TupleConstructor
class WorkingTestEntity extends LocalBaseEntity {
    @Id
    long id
    String name
}
