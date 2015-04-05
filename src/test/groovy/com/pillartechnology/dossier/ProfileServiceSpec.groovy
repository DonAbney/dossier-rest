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

    void "test Profile Service returns a profile"() {
        given:"the service is provided by the framework"

        when:"the service is asked for the mark profile"
            def actualProfile = service.findProfile("Mark")
        
        then:"a profile is returned"
            actualProfile instanceof Profile
    }

}
