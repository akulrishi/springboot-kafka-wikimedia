Problem statement:
My project is a Kafka-based real-time data processing pipeline that fetches live data from Wikimedia using a producer-consumer model. The producer reads the data from the Wikimedia API and pushes it to the Kafka broker, which is then consumed by a Kafka consumer. The consumer processes the data and stores it in a MySQL database for persistence.

Technology Stack:
1. Java
2. Spring Boot
3. Apache Kafka
4. MySQL
5. Spring Data JPA (Hibernate)
6. Zookeeper

Contents:
1. Kafka Producer Service written using SpringBoot
2. Kafka Consumer Service written using SpringBoot
3. MySQL Database

Flow:
<img width="986" alt="image" src="https://user-images.githubusercontent.com/38141800/234537620-99fcf812-afe0-42fa-ac9d-86b47598e1b1.png">

URL for data source: https://stream.wikimedia.org/v2/stream/recentchange
