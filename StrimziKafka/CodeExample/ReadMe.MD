# produce
java -cp target/KafkaConnect-1.0-SNAPSHOT-jar-with-dependencies.jar com.jamiemacdonald.KafkaConnect.Kafka "produce" "BagPipes" "how to train a dragon"

# Get topics 
java -cp target/KafkaConnect-1.0-SNAPSHOT-jar-with-dependencies.jar com.jamiemacdonald.KafkaConnect.Kafka "topics"

# add a topic 
java -cp target/KafkaConnect-1.0-SNAPSHOT-jar-with-dependencies.jar com.jamiemacdonald.KafkaConnect.Kafka "AddTopics" "Goeorge"