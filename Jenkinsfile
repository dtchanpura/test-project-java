pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn -B pmd:pmd clean package'
      }
    }
    stage('Check Warnings') {
      steps {
        // scanForIssues(tool: [$class: 'PMD', pattern:"**/checkstyle.xml"])
        recordIssues(tool: [$class: 'Pmd', pattern:"target/pmd.xml"], aggregatingResults: true)
      }
    }
  }
}
