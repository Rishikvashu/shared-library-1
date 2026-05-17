def call() {

    sh '''
    git branch
    git add .
    git commit -m "Updated from Jenkins build" || true
    git push origin HEAD:master
    '''
}
