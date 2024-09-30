package com.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionCountListener implements HttpSessionListener {

	int counter =0;
	public void sessionCreated(HttpSessionEvent s) {
		counter++;
		System.out.println("TOTAL ++ => "+counter);
	}

	public void sessionDestroyed(HttpSessionEvent s) {
		counter--;
		System.out.println("TOTAL -- => "+counter);

	}
}
