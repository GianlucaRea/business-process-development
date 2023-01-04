package it.univaq.disim.bpd.soap;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import it.univaq.disim.bpd.domain.FarmBusinessStartupResponseRequestType;

@Endpoint
public class UserEndpoint {

	private static final String NAMESPACE_URI = "http://eu.chorevolution.farmbusinessstartup/user";

	@Autowired
	private RuntimeService runtimeService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmBusinessStartupResponseElementRequest")
	public void receiveFarmBusinessCode(@RequestPayload FarmBusinessStartupResponseRequestType request) {
												  
		System.out.println("Received SOAP message farmBusinessStartupResponseRequestType");
		System.out.println("ChoreographyID :" + request.getChoreographyId().getChoreographyId());
		System.out.println("Farm Code :" + request.getMessageData().getFarmCode());
		
		runtimeService.createMessageCorrelation("farmBusinessStartupResponseRequestType").processInstanceBusinessKey(request.getChoreographyId().getChoreographyId()).setVariable("farmBusinessStartupResponseRequestType", request).correlate(); 

	}	
}
