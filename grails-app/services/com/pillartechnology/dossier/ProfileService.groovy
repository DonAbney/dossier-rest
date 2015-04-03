package com.pillartechnology.dossier

import grails.transaction.Transactional

@Transactional
class ProfileService {
    def findProfile(String profileName)
    {
        new Profile()     
    }
}
