# SpringBoot_KAFKA

This repository demonstrates how to integrate **Spring Boot** with **Apache Kafka** for learning purposes.

---

## 🚀 Quick Start

### 🔹 1. Clone the Repository

```bash
git clone https://github.com/AmirZaafouri/SpringBoot_KAFKA.git
cd SpringBoot_KAFKA/demo
```

### 🔹 2. Build the Project

```bash
mvn clean install
```

### 🔹 3. Set Up Kafka (Version 4.0)

Download and extract Kafka from the [Apache Kafka Downloads](https://kafka.apache.org/downloads) page.


#### ➤ Start Kafka Server

```bash
# Linux/macOS
bin/kafka-server-start.sh config/server.properties

# Windows
bin\windows\kafka-server-start.bat config\server.properties
```

### 🔹 4. Run the Spring Boot Application

```bash
mvn spring-boot:run
```
#### ➤ Create a Kafka Topic

```bash
# Linux/macOS
bin/kafka-topics.sh --create --topic demo-topic --bootstrap-server localhost:9092

# Windows
bin\windows\kafka-topics.bat --create --topic demo-topic --bootstrap-server localhost:9092
```
---

## ✅ Prerequisites

• Java JDK 17+  
• Apache Kafka 4.0 (running locally or on a remote server)

---

---

Let me know if you need help setting up Kafka or running the app!
