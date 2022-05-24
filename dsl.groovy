job('demo') {
    scm{
        git('git://github.com/Tejas20002/jenkins-dsl.git')
    }
    wrappers{
        nodejs('nodejs')
    }
    steps {
        shell('npm install')
    }
}
