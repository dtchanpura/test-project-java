pipeline {
  agent any
  stages {
    stage('Check Warnings') {
      steps {
        scanForIssues(tool: [$class: 'CheckStyle', pattern:"**/checkstyle.xml"])
        recordIssues(tool: [$class: 'CheckStyle', pattern:"src/main/resources/checkstyle.xml"], aggregatingResults: true, healthy: 1, unhealthy: 10)
      }
    }
  }
}
