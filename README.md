# svc-public-news
rest service for publicly available news 

#Prerequisites
Java 17
Gradle 8.7

#Steps to run the project
1. Clone the project
2. Open terminal run ./gradlew clean build
3. Update the news.api.key value in application.yml file with your corresponding key
4. Run java -jar build/libs/gNews-0.0.1-SNAPSHOT.jar
5. The application will start on port 9735 with the context path /gnews
6. You can access the API at http://localhost:9735/gnews
7. There are two REST GET API's available
8. http://localhost:9735/gnews/v1/articles?count=4
9. http://localhost:9735/gnews/v1/articles/search?keyword=ronaldo&count=30

