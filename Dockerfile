FROM openjdk:8
VOLUME /tmp
ADD ./target/https-tests-0.0.1-SNAPSHOT.jar https-tests.jar
ENTRYPOINT ["java", "-jar", "/https-tests.jar"]