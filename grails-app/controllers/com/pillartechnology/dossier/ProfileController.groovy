package com.pillartechnology.dossier

import grails.rest.RestfulController

class ProfileController extends RestfulController<Profile> {
    static responseFormats = ['json']

    ProfileController() {
        super(Profile)
    }

    def index() {
        render(contentType:"application/json") {
            profile = new Profile()
        }
    }
}
