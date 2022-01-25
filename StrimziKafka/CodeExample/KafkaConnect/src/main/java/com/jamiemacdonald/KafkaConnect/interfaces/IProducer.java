package com.jamiemacdonald.KafkaConnect.interfaces;

import java.util.concurrent.ExecutionException;

public interface IProducer {  
    public void produceRecord(String ktopic,String kvalue) throws InterruptedException, ExecutionException;
}  