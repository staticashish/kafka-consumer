package io.techmeal.kafka.consumer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class KafkaConsumerApplication {
	private static final String KAFKA_CONSUMER_TOPICS = "consumer.topics";
	private static final String KAFKA_CONSUMER_GROUP_ID = "consumer.group.id";
	private static final String KAFKA_SERVER = "kafka.server";
	private static List<String> topics;
	private static String kafkaServer;
	private static String groupId;
	
    public static void main( String[] args ) throws IOException {
    	setup();
    	KafkaConsumerConfig config = new KafkaConsumerConfig();
    	config.setBootstrapServer(kafkaServer);
    	config.setGroupId(groupId);
    	config.setTopics(topics);
        Consumer consumer = new Consumer(config);
        consumer.init();
    }

	private static void setup() throws IOException {
		InputStream is = KafkaConsumerApplication.class.getClassLoader().getResourceAsStream("kafka.properties");
    	Properties props = new Properties();
    	props.load(is);
    	kafkaServer = (String) props.get(KAFKA_SERVER);
    	groupId = (String) props.get(KAFKA_CONSUMER_GROUP_ID);
    	String[] topicArr = ((String) props.get(KAFKA_CONSUMER_TOPICS)).split(",");
    	topics = Arrays.asList(topicArr);
	}
}
