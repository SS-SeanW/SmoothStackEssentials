package com.ss.jb.four;

import java.util.LinkedList;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		
		ProducerConsumer pc = new ProducerConsumer();
		Thread producer = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}			
		});
		
		Thread consumer = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		producer.start();
		consumer.start();
		producer.join();
		consumer.join();

	}
	
	public static class ProducerConsumer {
		
		LinkedList<Integer> list = new LinkedList<>();
		int max = 2;
		
		public void produce() throws InterruptedException {
			int value = 0;
			while(true) {
				synchronized(this) {
					while(list.size() == max) {
						wait();
					}
					System.out.println("Producer made: " + value);
					list.add(value++);
					notify();
					Thread.sleep(100);
				}
			}
		}
        public void consume() throws InterruptedException {
        	while(true) {
        		synchronized(this) {
        			while(list.size() == 0) {
        				wait();
        			}
        			int valueRemoved = list.removeFirst();
        			System.out.println("Consumer used: " + valueRemoved);
        			notify();
        			Thread.sleep(100);
        		}
        	}
        }
	}
}