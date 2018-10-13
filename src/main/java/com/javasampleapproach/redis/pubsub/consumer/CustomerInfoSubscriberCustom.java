package com.javasampleapproach.redis.pubsub.consumer;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;

public class CustomerInfoSubscriberCustom implements MessageListener {

	@Override
	public void onMessage(Message message, byte[] pattern) {
		System.out.println("Received costommmmmm >> " + message +  ", " + Thread.currentThread().getName() );
	}
}
