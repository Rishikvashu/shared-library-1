def call(branchName) {

    withCredentials([usernamePassword(
        credentialsId: 'github-creds',
        usernameVariable: 'GIT_USERNAME',
        passwordVariable: 'GIT_PASSWORD'
    )]) {

        sh """
        git config user.name "Rishikvashu"
        git config user.email "vashishtha123456789@gmail.com"

        git remote set-url origin https://${GIT_USERNAME}:${GIT_PASSWORD}@github.com/Rishikvashu/shared-library-1.git

        git push origin ${branchName}
        """
    }
}
