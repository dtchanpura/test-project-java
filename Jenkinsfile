pipeline {
  agent any
  stages {
    stage('Build') {
      sh 'mvn pmd:pmd clean package'
    }
    stage('Check Warnings') {
      steps {
        // scanForIssues(tool: [$class: 'PMD', pattern:"**/checkstyle.xml"])
        recordIssues(tool: [$class: 'PMD', pattern:"target/pmd.xml"], aggregatingResults: true)
      }
    }
  }
}
