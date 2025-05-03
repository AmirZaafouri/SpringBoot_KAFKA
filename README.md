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

#### ➤ Start Zookeeper

```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

#### ➤ Start Kafka Server

```bash
bin/kafka-server-start.sh config/server.properties
```

#### ➤ Create a Kafka Topic

```bash
bin/kafka-topics.sh --create --topic demo-topic --bootstrap-server localhost:9092
```

### 🔹 4. Run the Spring Boot Application

```bash
mvn spring-boot:run
```

---

## ✨ Features

• Kafka Producer & Consumer integration  
• Spring Boot Kafka configuration examples

---

## ✅ Prerequisites

• Java JDK 17+  
• Apache Kafka 4.0 (running locally or on a remote server)

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 📁 How to Add this README

1. Navigate to the `demo` directory in your GitHub repository  
2. Click on **"Add file"** → **"Create new file"**  
3. Name the file `README.md`  
4. Paste this content  
5. Click **"Commit new file"** to save it

---

Let me know if you need help setting up Kafka or running the app!
