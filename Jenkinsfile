stage 'build'

node {
    sendStatus('started')
    try {
        checkout scm
        env.JAVA_HOME = "${tool 'jdk8'}"
        env.PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
        sh "./gradlew --stacktrace clean test"
        sendStatus('success')
        currentBuild.result = 'SUCCESS'
    } catch(error) {
        sendStatus('failed')
        currentBuild.result = 'FAILURE'
    }
}

def sendStatus(status) {
    build job: 'send-build-status', parameters: [[$class: 'StringParameterValue', name: 'build', value: 'project1'], [$class: 'StringParameterValue', name: 'status', value: status]]
}