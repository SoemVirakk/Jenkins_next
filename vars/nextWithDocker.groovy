def call(String DOCKER_USER, String DOCKER_PASS) {
    def dockerfileContent = libraryResource 'next.dockerfile'
    writeFile file: 'Dockerfile', text: dockerfileContent
    sh 'docker login -u $DOCKER_USER -p $DOCKER_PASS'
    sh 'docker build -t myapp:latest .'
}
