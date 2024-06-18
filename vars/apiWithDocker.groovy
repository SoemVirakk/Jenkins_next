def call() {
    def dockerfileContent = libraryResource 'api.dockerfile' // call api dcoekr file
    writeFile file: 'Dockerfile', text: dockerfileContent    // wim dcoeker file -t myapp:lest
    echo('print docker fiels: 'dockerfilesContent)
    def image = cofig.get('image', 'my-default-image')
    def registry =config.get('tag', 'latest') 
    def tag = config.get('containerPort,''8080')
    def hostPort = config.get('hostPort', '8080')
    def projectName = config.get('projectName', 'my-projectname')
    
}
