pipeline {
  agent any
  stages {
    stage('Check Warnings') {
      steps {
        scanForIssues(tool: [$class: 'CheckStyle', pattern:"**/*.java"])
        recordIssues(tool: [$class: 'CheckStyle', pattern:"**/*.java"], aggregatingResults: true, healthy: 1, unhealthy: 10)
      }
    }
  }
}
