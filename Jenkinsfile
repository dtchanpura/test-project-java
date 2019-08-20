pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B clean package pmd:pmd'
      }
    }
    stage('Check Warnings') {
      steps {
        scanForIssues(tool: [$class: 'Pmd', pattern:"**/checkstyle.xml"])
        recordIssues(tool: [$class: 'Pmd', pattern:"target/pmd.xml"], aggregatingResults: true)
      }
    }
  }
}
