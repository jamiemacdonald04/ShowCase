package com.jamiemacdonald.KafkaConnect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.jamiemacdonald.KafkaConnect.interfaces.IProducer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Consume implements IConsume
{
    private static final Logger LOG = LoggerFactory.getLogger(Producer.class);
    //private static Logger LOG =  LoggerFactory.getLogger(Producer.class);
    public void ConsumeRecords(String ktopic, String kvalue) throws InterruptedException, ExecutionException
    {
        Properties props = new Properties();
        props.put("bootstrap.servers", "192.168.64.19:31876");
        props.put("group.id", "test");
        props.put("enable.auto.commit", "false");
        props.put("auto.commit.interval.ms", "1000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
        consumer.subscribe(Arrays.asList("foo", "bar"));
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(100);
            for (ConsumerRecord<String, String> record : records)
                System.out.printf("offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
        }
       
        
      
    }
}
