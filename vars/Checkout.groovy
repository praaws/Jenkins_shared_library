// Jenkinsfile.groovy

def call() {
    stage('Checkout') {
        steps {
            script {
                // Define the Git credentials

                // Clone the Git repository
                git(
                    branch: 'main',
                    url: 'https://github.com/praaws/gite2e.git'
                )
            }
        }
    }
}

return this
