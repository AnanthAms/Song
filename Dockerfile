FROM eclipse-temurin:17
COPY target/song.jar song.jar 
CMD ["java","-jar","song.jar"]