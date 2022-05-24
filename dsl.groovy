job('demo') {
    scm{
        git('git://github.com/Tejas20002/jenkins-dsl.git'){
            node -> node / gitConfigName('Tejas20002')
            node / gitCongifEmail('tejashirani@gmail.com')
        }
    }
    triggers{
        scm('H/S * * * *')
    }
    wrappers{
        nodejs('nodejs')
    }
    steps {
        shell('npm install')
    }
}
