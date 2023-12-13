

FROM amazoncorretto:17.0.9

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container
COPY bolhinhos-be-0.0.1-SNAPSHOT.jar /app/bolhinhos-be-0.0.1-SNAPSHOT.jar

# Command to run the JAR file
CMD ["java", "-jar", "bolhinhos-be-0.0.1-SNAPSHOT.jar"]

