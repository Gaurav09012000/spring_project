pipeline {
	agent any
	tools {
		maven "MAVEN_HOME"
	}
	stages {
		stage('Build Maven project'){
			steps {
				git "https://github.com/devesh1721/jenkins-assignment.git"
				sh "mvn clean install -DskipTests"
			}
		}
		stage('Create docker image'){
			steps{
				script{
					sh "docker build -t  devesh29476/bookservicev9 ."
				}
			}
		}
		stage('Pushing dcoker image to docker hub '){
			steps{
				script{
					sh "docker login -u devesh29476 -p ''"
					sh "docker push /bookservicev9"
				}
			}
		}
		stage('Test'){
			steps{
				sh "mvn test"
			}
		}
	}
}
