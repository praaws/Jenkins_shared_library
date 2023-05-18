// Jenkinsfile.groovy

def call() {
    stage('Checkout') {
        steps {
            script {
                // Clone the Git repository
                git(
                    branch: 'your-branch',
                    url: 'your-git-repo-url'
                )
            }
        }
    }
}

return this

