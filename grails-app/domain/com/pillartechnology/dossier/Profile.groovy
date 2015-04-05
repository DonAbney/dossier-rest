package com.pillartechnology.dossier

class Profile {
    static hasMany = [sourceControlAccounts: SourceControlAccount]
    static hasOne = [blog: Blog]

    Profile() {
        blog = new Blog()
        sourceControlAccounts = new ArrayList<SourceControlAccount>()
    }

    static constraints = {
    }
}
