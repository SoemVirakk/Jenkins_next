def call() {
    def dockerfileContent = libraryResource 'api.dockerfile'
    writeFile file: 'Dockerfile', text: dockerfileContent
    // sh 'docker build -t myapp:latest .'
}
