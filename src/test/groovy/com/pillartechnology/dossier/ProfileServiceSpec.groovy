package com.pillartechnology.dossier

import grails.test.mixin.TestFor
import grails.test.mixin.Mock
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ProfileService)
@Mock(Profile)
class ProfileServiceSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "Profile Service returns a profile"() {
        given:"asked for the mark profile"
            def actualProfile = service.findProfile("Mark")
        
        expect:"the profile is not null"
            actualProfile != null
    }
}