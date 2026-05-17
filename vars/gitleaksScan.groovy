def call() {

    stage('GitLeaks Scan') {

        sh '''
        gitleaks detect \
        --report-format json \
        --report-path gitleaks-report.json \
        || true
        '''
    }
}
