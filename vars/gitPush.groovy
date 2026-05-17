def call() {

    sh '''
    git branch
    git checkout master
    git add .
    git commit -m "Updated from Jenkins build" || true
    git push origin master
    '''
}
