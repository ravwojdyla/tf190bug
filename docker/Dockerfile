FROM ubuntu:14.04

# Install OpenJDK-8
RUN apt-get update && \
    apt-get install -y default-jdk && \
    apt-get install -y ant && \
    apt-get clean;

# Fix certificate issues
RUN apt-get update && \
    apt-get install ca-certificates-java && \
    apt-get clean && \
    update-ca-certificates -f;

COPY tf190bug-0.1.0-SNAPSHOT-jar-with-dependencies.jar /
ENTRYPOINT ["java", "-jar", "/tf190bug-0.1.0-SNAPSHOT-jar-with-dependencies.jar"]
