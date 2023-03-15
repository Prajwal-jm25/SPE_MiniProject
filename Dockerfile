FROM openjdk:11
LABEL author = "Prajwal J M"
LABEL version = 1.0
LABEL description = "Scientific Calculator is implemented"

COPY ./target/scientificCalculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "ScientificCalculator-1.0-SNAPSHOT.jar", "calci.ScientificCalculator"]