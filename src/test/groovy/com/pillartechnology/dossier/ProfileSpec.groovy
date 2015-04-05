package com.pillartechnology.dossier

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Profile)
class ProfileSpec extends Specification {

    def profile

    def setup() {
    }

    def cleanup() {
    }

    void "new profile has blog"() {
        when:"a new profile is created"
            profile = new Profile()
        then:"blog to be type Blog"
            profile.blog instanceof Blog
    }

    void "new profile has list of source control accounts"() {
        when:"a new profile is created"
            profile = new Profile()
        then:"list of source control accounts exists"
            profile.sourceControlAccounts.size() == 0
    }

}
