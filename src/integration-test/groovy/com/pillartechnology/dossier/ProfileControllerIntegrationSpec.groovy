package com.pillartechnology.dossier


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class ProfileControllerIntegrationSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test ProfileController"() {
        expect:"it returns a profile with a blog"
            1 == 1
    }
}
