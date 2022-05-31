job('nodeweatherapp') {
    scm {
        git{
            remote {
                url("https://github.com/Tejas20002/jenkins-dsl.git")
            }
            branch("*/master")
        }
    }
    wrappers{
        nodejs('nodejs')
    }
    steps {
        shell('npm install')
    }
    step{
        shell('npm --version')
    }
}
