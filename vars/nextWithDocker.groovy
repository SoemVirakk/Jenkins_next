def call(String DOCKER_USER, String DOCKER_PASS, String TAGS, String IMAGE_NAME) {
    def dockerfileContent = libraryResource 'next.dockerfile'
    writeFile file: 'Dockerfile', text: dockerfileContent
    sh 'docker login -u $DOCKER_USER -p $DOCKER_PASS'  -- Docker_Tag
    sh 'docker build -t myappspring:latest .'          -- docker build 
    sh 'docker push $DOCKER_USER/$MAGE_NAME:$TAGS'
}
