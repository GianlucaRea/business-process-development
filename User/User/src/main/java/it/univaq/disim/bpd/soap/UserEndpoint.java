package it.univaq.disim.bpd.soap;

import java.util.Random;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import it.univaq.disim.bpd.domain.FarmBusinessStartupResponseType;

public class UserEndpoint {

	private static final String NAMESPACE_URI = "http://eu.chorevolution.farmbusinessstartup/user";

	@Autowired
	private RuntimeService runtimeService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmBusinessStartupResponseElementRequest")
	public void requestBusinessCode(@RequestPayload FarmBusinessStartupResponseType request) {
		
		System.out.println("Received SOAP message farmBusinessStartupResponseType");
		

		runtimeService.createMessageCorrelation("farmBusinessStartupResponseType")
				.processInstanceBusinessKey(request.getChoreographyId().getChoreographyId())
				.setVariable("farmBusinessStartupResponseType", request)
				.correlate();

	}	
}
