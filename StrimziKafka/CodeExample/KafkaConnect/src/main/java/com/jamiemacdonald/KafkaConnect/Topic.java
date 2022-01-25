package com.jamiemacdonald.KafkaConnect;

import java.util.Collections;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ExecutionException;

import com.jamiemacdonald.KafkaConnect.interfaces.ITopic;

import org.apache.kafka.clients.admin.Admin;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.CreateTopicsResult;
import org.apache.kafka.clients.admin.ListTopicsResult;
import org.apache.kafka.common.KafkaFuture;

public class Topic implements ITopic {
    public boolean NewTopic(String topicName) throws InterruptedException, ExecutionException
    {
        Properties properties = new Properties();
        properties.put(
          AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.64.17:31901"
        );
        
        try (Admin admin = Admin.create(properties)) {
            int partitions = 1;
            short replicationFactor = 1;
            org.apache.kafka.clients.admin.NewTopic newTopic = new org.apache.kafka.clients.admin.NewTopic(topicName, partitions, replicationFactor);
            
            CreateTopicsResult result = admin.createTopics(
              Collections.singleton(newTopic)
            );
        
            KafkaFuture<Void> future = result.values().get(topicName);
            future.get();
        }

        return true;
    }

    public Set<String> ListTopics() throws InterruptedException, ExecutionException
    {
        KafkaFuture<Set<String>> future;
        Properties properties = new Properties();
        properties.put(
          AdminClientConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.64.17:31901"
        );
        
        try (Admin admin = Admin.create(properties)) {            
            ListTopicsResult result = admin.listTopics();
            future = result.names();  
        }



        Set<String> topics = future.get();
        topics.removeIf(name -> name.contains("__"));
        return topics;
    }
}
