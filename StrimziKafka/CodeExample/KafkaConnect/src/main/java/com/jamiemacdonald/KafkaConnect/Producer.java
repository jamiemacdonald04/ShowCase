package com.jamiemacdonald.KafkaConnect;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import javax.security.sasl.Sasl;

import com.jamiemacdonald.KafkaConnect.interfaces.IProducer;

import org.apache.kafka.clients.CommonClientConfigs;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.config.SslConfigs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Producer implements IProducer
{
    private static final Logger LOG = LoggerFactory.getLogger(Producer.class);
    //private static Logger LOG =  LoggerFactory.getLogger(Producer.class);
    public void produceRecord(String ktopic, String kvalue) throws InterruptedException, ExecutionException
    {
    

        System.setProperty("org.slf4j.simpleLogger.defaultLogLevel","info");
        System.setProperty("org.slf4j.simpleLogger.showThreadName","false");

        Map<String, Object> properties = new HashMap<String,Object>();

        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.64.19:30535");
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(CommonClientConfigs.SECURITY_PROTOCOL_CONFIG, "SSL");
        properties.put(SslConfigs.SSL_TRUSTSTORE_PASSWORD_CONFIG, "KYQ1qBGlfqek");
        properties.put(SslConfigs.SSL_TRUSTSTORE_LOCATION_CONFIG, "./ca.p12");
        properties.put(SslConfigs.SSL_ENDPOINT_IDENTIFICATION_ALGORITHM_CONFIG,"");
        
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);
        
        ProducerRecord<String,String> record = new ProducerRecord<String,String>(ktopic,kvalue);
        
        RecordMetadata result = (RecordMetadata) producer.send(record).get();

        LOG.info("message sent (topic {}, partition {}, offset {})",
        result.topic(),
        result.partition(),
        result.offset());

        producer.close();
    }
}
