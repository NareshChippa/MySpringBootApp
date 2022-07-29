pipeline {
    agent any
    tools {
        maven 'MAVEN_HOME'
    }
    stages {
        stage('Checkout') {
            steps {
                 checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'MyGitHub', url: 'https://github.com/NareshChippa/MySpringBootApp.git']]])
            }
        }
        stage('Build'){
           steps {
             bat 'mvn clean install -f C:/Users/pc/.jenkins/workspace/MyFirstDeclartivePipeline/MySpringBpptApp/pom.xml'
           }
        }
        stage('Dev Deploy') {
            steps {
               deploy adapters: [tomcat9(credentialsId: 'Tomcat_credentials', path: '', url: 'http://localhost:1989/')], contextPath: null, war: '**/*.war'
            }
        }
    }
}
