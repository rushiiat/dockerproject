From jenkins/jenkins:lts
USER root 
RUN apt update
RUN apt -y install apt-transport-https ca-certificates curl software-properties-common
RUN curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add -
RUN add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu/ bionic stable"
RUN apt update  
RUN apt -y install docker-ce docker-ce-cli containerd.io
RUN usermod -aG docker jenkins
FROM openjdk:8
ADD target/java-jenkins-docker.jar java-jenkins-docker.jar
ENTRYPOINT ["java", "-jar","java-jenkins-docker.jar"]
EXPOSE 8080