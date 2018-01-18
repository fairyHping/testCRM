package com.test;

public class WaitTime {
	/**
	 * 线程等待
	 * @param millis
	 */
	public static void waitMillis(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
