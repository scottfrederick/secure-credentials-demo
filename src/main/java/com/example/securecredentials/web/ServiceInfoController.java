package com.example.securecredentials.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceInfoController {
	private ServiceInfo serviceInfo;

	public ServiceInfoController(ServiceInfo serviceInfo) {
		this.serviceInfo = serviceInfo;
	}

	@GetMapping("/")
	public ServiceInfo getServiceInfo() {
		return serviceInfo;
	}
}
