job('NodeJS example') {
    scm {
        git('git://github.com/span22030/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('Stella Pan')
            node / gitConfigEmail('span60540@gmail.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
