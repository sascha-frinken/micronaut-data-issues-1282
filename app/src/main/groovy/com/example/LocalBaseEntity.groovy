package com.example

import io.micronaut.data.annotation.DateCreated

import java.time.Instant

class LocalBaseEntity {
    @DateCreated
    Instant created
}
