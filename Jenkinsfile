stage 'build'

node {
    sendStatus('started')
    try {
        checkout scm
        sh "./gradlew --stacktrace clean test"
    } catch(error) {
        sendStatus('failure')
        currentBuild.result = 'FAILURE'
    }
    sendStatus('success')
    currentBuild.result = 'SUCCESS'
}

def sendStatus(status) {
    build job: 'send-build-status', parameters: [[$class: 'StringParameterValue', name: 'build', value: 'project1'], [$class: 'StringParameterValue', name: 'status', value: ${status}]]
}