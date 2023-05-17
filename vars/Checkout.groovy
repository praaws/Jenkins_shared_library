def call(repositoryUrl, branch = 'master') {
  node {
    stage('Checkout') {
      git([url: repositoryUrl, branch: branch])
    }
  }
}

return this
