FROM openjdk:8-jdk-alpine 
RUN apk --no-cache add curl
COPY build/libs/*.jar micronaut-rabbitmq-listener.jar
CMD java ${JAVA_OPTS} -jar micronaut-rabbitmq-listener.jar