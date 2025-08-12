package com.aaslin.SpringCore.Value;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class ServerConfig {

	@Value("${server.host}")
	private String host;
	
	@Value("${server.port}")
	private String port;
	
	@Value("${server.username}")
	private String username;
	
	@Value("${server.password}")
	private String password;
	
	public void printConfig() {
        System.out.println("Server Configuration :");
        System.out.println("Host : " + host);
        System.out.println("Port : " + port);
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
    }
}