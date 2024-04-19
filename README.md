# svc-public-news
rest service for publicly available news 

#Prerequisites
Java 17
Gradle 8.7

#Steps to run the project
1. Clone the project
2. Open terminal run ./gradlew clean build
3. Run java -jar build/libs/gNews-0.0.1-SNAPSHOT.jar
4. The application will start on port 9735 with the context path /gnews
5. You can access the API at http://localhost:9735/gnews
6. There are two REST GET API's available
7. http://localhost:9735/gnews/v1/articles?count=4
8. http://localhost:9735/gnews/v1/articles/search?keyword=ronaldo&count=30

