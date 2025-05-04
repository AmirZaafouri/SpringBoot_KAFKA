package com.springkafka.demo;

public record MessageRequest(String message) {
}
// a record class is a special kind of class introduced in Java 14 (preview)
// and standardized in Java 16 that is used to model immutable data. It automatically provides: use finale varibale
//can assigned one time only
