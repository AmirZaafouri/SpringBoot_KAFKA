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
# Linux/macOS/Windows
mvn clean install
```

---

## ⚙️ 3. Set Up Kafka (Version 4.0)

Download and extract Kafka from the [Apache Kafka Downloads](https://kafka.apache.org/downloads) page.

### ✅ Generate a Cluster UUID

```bash
# Linux/macOS
KAFKA_CLUSTER_ID="$(bin/kafka-storage.sh random-uuid)"

# Windows (PowerShell)
$env:KAFKA_CLUSTER_ID = & .\bin\windows\kafka-storage.bat random-uuid
```

### ✅ Format Log Directories

```bash
# Linux/macOS
bin/kafka-storage.sh format --standalone -t $KAFKA_CLUSTER_ID -c config/server.properties

# Windows (PowerShell)
bin\windows\kafka-storage.bat format --standalone -t $env:KAFKA_CLUSTER_ID -c config\server.properties
```

---

### 🔸 Start Kafka Services

#### ➤⚠️ No need for Zookeeper any more ❌❌

```bash
# Linux/macOS
bin/zookeeper-server-start.sh config/zookeeper.properties

# Windows
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```

#### ➤ Start Kafka Server

```bash
# Linux/macOS
bin/kafka-server-start.sh config/server.properties

# Windows
bin\windows\kafka-server-start.bat config\server.properties
```

#### ➤ Create a Kafka Consumer

```bash
# Linux/macOS
bin\kafka-console-consumer.bat --topic amir --from-beginning --bootstrap-server localhost:9092

# Windows
bin\windows\kafka-console-consumer.bat --topic amir --from-beginning --bootstrap-server localhost:9092
```

---

### 🔹 4. Run the Spring Boot Application

```bash
# Linux/macOS/Windows
mvn spring-boot:run
```

---


## ✅ Prerequisites

• Java JDK 17+  
• Apache Kafka 4.0 (running locally or remotely)

---

Let me know if you need help setting up Kafka or running the app!
