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
        profile = new Profile()
    }

    def cleanup() {
    }

    void "test new profile has blog"() {
        expect:"blog to be type Blog"
            profile.blog instanceof Blog
    }

    void "test new profile has list of source control accounts"() {
        expect:"list of source control accounts exists"
            profile.sourceControlAccounts.size() == 0
    }

}
