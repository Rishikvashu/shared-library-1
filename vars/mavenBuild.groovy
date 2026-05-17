def call() {

    stage('Compile') {
        sh 'mvn compile'
    }

    stage('Unit Test') {
        sh 'mvn test'
    }

    stage('Build') {
        sh 'mvn package'
    }
}
