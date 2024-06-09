def call() {
    def dockerfileContent = libraryResource 'react.dockerfile'
    writeFile file: 'Dockerfile', text: dockerfileContent
    // sh 'docker build -t myapp:latest .'
}
