node {

    stage('Checkout') { 
        echo 'Checkout' 
        git poll: true, url: 'https://github.com/poluz86/api-demo.git'
        bat 'dir'
    }
    stage('Compile') { echo 'Compile' }
    stage('Unit Test') { echo 'Unit Test' }
    stage('Code Analysis') { echo 'Code Analysis' }
    stage('Packaging') { echo 'Packaging' }
    stage('Testing Deploy') { echo 'Testing Deploy' }
    stage('Smoke Test') { echo 'Smoke Test' }

    stage('Api Test') { 
        echo 'Api Test'
        bat 'mvn clean test' 
        bat 'dir'
    }

    stage('Performance Test') { echo 'Performance Test' }
    stage('CleanUp Environment') { echo 'CleanUp Environment' }
    stage('Promote') { echo 'Promote' }
}