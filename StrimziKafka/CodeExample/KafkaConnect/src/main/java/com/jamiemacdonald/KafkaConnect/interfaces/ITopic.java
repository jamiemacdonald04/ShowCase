package com.jamiemacdonald.KafkaConnect.interfaces;

import java.util.Set;
import java.util.concurrent.ExecutionException;

public interface ITopic {
    public boolean NewTopic(String topicName) throws InterruptedException, ExecutionException;

    public Set<String> ListTopics() throws InterruptedException, ExecutionException;
}
