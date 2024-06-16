def call() {
    def dockerfileContent = libraryResource 'api.dockerfile'
    writeFile file: 'Dockerfile', text: dockerfileContent
    // sh 'docker build -t myapp:latest .'
    def image = cofig.get('image', 'my-default-image')
    def registry =config.get('tag', 'latest') 
    def tag = config.get('containerPort,''8080')
    def hostPort = config.get('hostPort', '8080')
    def projectName = config.get('projectName', 'my-projectname')
    
}
