job('demo') {
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
        shell('npm install && node index.js')
    }
}
