def call() {

    stage('Git Push') {

        sh '''
        git status
        git add .
        git commit -m "Build changes"
        git push origin main
        '''
    }
}
