package com.jamiemacdonald.KafkaConnect;

import java.util.concurrent.ExecutionException;

import com.jamiemacdonald.KafkaConnect.interfaces.IProducer;
import com.jamiemacdonald.KafkaConnect.interfaces.ITopic;

public class Kafka 
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
            if(!args[0].isEmpty() && args[0].toLowerCase().equals("consume")){

            }
            if(!args[0].isEmpty() && args[0].toLowerCase().equals("produce")){
               
                IProducer producer = new Producer();
                producer.produceRecord(args[1],args[2]);
            }
            if(!args[0].isEmpty() && args[0].toLowerCase().equals("topics")){
                ITopic topics= new Topic();
                int where = 1;
                for(String i : topics.ListTopics()){
                    System.out.println(String.format("%o: %s", where,i));
                    where++;
                }
               
            }
            if(!args[0].isEmpty() && args[0].toLowerCase().equals("AddTopics")){
                ITopic topics= new Topic();
                topics.NewTopic(args[1]);
            }

    }
}