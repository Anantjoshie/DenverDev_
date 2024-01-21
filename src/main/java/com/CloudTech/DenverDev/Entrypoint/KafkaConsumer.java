package com.CloudTech.DenverDev.Entrypoint;

import com.CloudTech.DenverDev.Core.JsonDataFormat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


  private static final Logger LOGGER = LogManager.getLogger(KafkaConsumer.class);
 /* //  @Value("${Listen.Kafka.topic}")
    public static String TOPIC_TO_Listen;


    @KafkaListener(topics = "dataEvents")
    public void ConsumeKafkaStream(JsonDataFormat format){

      LOGGER.info("Data Consumed is {}",format);
      System.out.println(format);



    }*/

  @KafkaListener(topics = "dataEvents")
  public void ConsumeKafkaString(String format){

    LOGGER.info("Data Consumed is {}",format);
    System.out.println(format);


  }

}
