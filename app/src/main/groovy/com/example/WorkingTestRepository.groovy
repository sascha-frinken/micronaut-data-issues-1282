package com.example

import io.micronaut.data.annotation.Id
import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository

@JdbcRepository(dialect = Dialect.H2)
interface WorkingTestRepository extends CrudRepository<WorkingTestEntity, Long> {
    @Id
    long id
    String name
}