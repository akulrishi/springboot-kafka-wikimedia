Problem statement:
My project is a Kafka-based real-time data processing pipeline that fetches live data from Wikimedia using a producer-consumer model. The producer reads the data from the Wikimedia API and pushes it to the Kafka broker, which is then consumed by a Kafka consumer. The consumer processes the data and stores it in a MySQL database for persistence.

Technology Stack:
1. Java
2. Spring Boot
3. Apache Kafka
4. MySQL
5. Spring Data JPA (Hibernate)

Contents:
1. Kafka Producer Service written using SpringBoot
2. Kafka Consumer Service written using SpringBoot
3. MySQL Database

Flow:
<img width="1006" alt="Kafka Screen" src="https://user-images.githubusercontent.com/38141800/234531515-89f869fb-5577-47c4-b4ad-c5e17e90f171.png">
