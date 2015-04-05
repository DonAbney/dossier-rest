package com.pillartechnology.dossier

class Profile {

    Blog blog
    List<SourceControlAccount> sourceControlAccounts

    Profile() {
        blog = new Blog()
        sourceControlAccounts = new ArrayList<SourceControlAccount>()
    }

    static constraints = {
    }
}
