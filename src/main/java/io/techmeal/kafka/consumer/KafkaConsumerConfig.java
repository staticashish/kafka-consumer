package io.techmeal.kafka.consumer;

import java.util.List;

public class KafkaConsumerConfig {

	String bootstrapServer;
	String groupId;
	List<String> topics;
	String offSetConfig = "latest";
	
	public String getBootstrapServer() {
		return bootstrapServer;
	}
	
	public void setBootstrapServer(String bootstrapServer) {
		this.bootstrapServer = bootstrapServer;
	}
	
	public String getGroupId() {
		return groupId;
	}
	
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	public List<String> getTopics() {
		return topics;
	}
	
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}
	
	public String getOffSetConfig() {
		return offSetConfig;
	}
	
	public void setOffSetConfig(String offSetConfig) {
		this.offSetConfig = offSetConfig;
	}
}
