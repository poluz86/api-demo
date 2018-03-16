node {

    stage('Checkout') { 
        echo 'Checkout' 
        git poll: true, url: 'https://github.com/poluz86/api-demo.git'
        bat 'dir'
    }
    stage('Compile') { bat 'sleep 4' }
    stage('Unit Test') { echo 'Unit Test' }
    stage('Code Analysis') { echo 'Code Analysis' }
    stage('Packaging') { echo 'Packaging' }
    stage('Testing Deploy') { echo 'Testing Deploy' }
    stage('Smoke Test') { echo 'Smoke Test' }

    stage('Api Test') { 
        try {
            bat 'mvn clean test' 
            bat 'dir'
        }catch(err) {

        } finally {
            cucumber fileIncludePattern: '**/*.json', jsonReportDirectory: 'target/', sortingMethod: 'ALPHABETICAL'
        }

    }

    stage('Performance Test') { echo 'Performance Test' }
    stage('CleanUp Environment') { echo 'CleanUp Environment' }
    stage('Promote') { echo 'Promote' }
}