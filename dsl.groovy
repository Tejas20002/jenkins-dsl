job('demo') {
    scm{
        git('git://github.com/Tejas20002/jenkins-dsl.git'){
            node -> node / gitConfigName('tjhirani')
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
        shell('echo Hello World!')
    }
}
