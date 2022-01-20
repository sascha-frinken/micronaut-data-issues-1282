package com.example

import io.micronaut.data.annotation.DateCreated

import java.time.Instant

abstract class BaseEntity {

    @DateCreated
    Instant created
}
