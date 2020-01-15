FROM openjdk:8
VOLUME /tmp
ADD ./target/shopify-orders-tests-0.0.1-SNAPSHOT.jar shopify-orders-tests.jar
ENTRYPOINT ["java", "-jar", "/shopify-orders-tests.jar"]