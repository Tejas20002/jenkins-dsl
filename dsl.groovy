job('demo') {
    scm {
        git{
            remote {
                url("https://github.com/m-goos/jenkins-jobdsl-seedrepo-example.git")
            }
            branch("*/main")
        }
    }
    wrappers{
        nodejs('nodejs')
    }
    steps {
        shell('npm install')
    }
}
