package com.example

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import spock.lang.Specification

@MicronautTest
class TestRepositoryTest extends Specification {

    @Inject
    FailingTestRepository failingRepository

    @Inject
    WorkingTestRepository workingRepository

    def "failing test with base class from lib"() {
        when:
        failingRepository.save(new FailingTestEntity(1, "test"))

        then:
        noExceptionThrown()
    }

    def "failing test with local base class"() {
        when:
        workingRepository.save(new WorkingTestEntity(1, "test"))

        then:
        noExceptionThrown()
    }
}
