node {

    stage('Checkout') { 
        echo 'Checkout' 
        git poll: true, url: 'https://github.com/poluz86/api-demo.git'
        bat 'dir'
    }
    stage('Compile') { sleep(4) }
    stage('Unit Test') { sleep(5) }
    stage('Code Analysis') { sleep(4) }
    stage('Packaging') { sleep(2) }
    stage('Testing Deploy') { sleep(4) }
    stage('Smoke Test') { sleep(4) }

    stage('Api Test') { 
        try {
            bat 'mvn clean test' 
            bat 'dir'
        }catch(err) {

        } finally {
            cucumber fileIncludePattern: '**/*.json', jsonReportDirectory: 'target/', sortingMethod: 'ALPHABETICAL'
        }

    }

    stage('Performance Test') { sleep(1) }
    stage('CleanUp Environment') { sleep(3) }
    stage('Promote') { sleep(1) }
}