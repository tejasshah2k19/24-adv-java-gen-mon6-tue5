package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ServerListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent s) {
		System.out.println("NSE CONNECTION OPEN");

	}

	public void contextDestroyed(ServletContextEvent s) {
		System.out.println("NSE CONNECTION CLOSE");
	}
}
