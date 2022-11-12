package it.univaq.disim.bpd.soap;

import java.util.Random;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import it.univaq.disim.bpd.domain.FarmRegistrationNotificationType;
import it.univaq.disim.bpd.domain.FarmSiteInspectionRequestType;

@Endpoint
public class VeterinaryEndpoint {

	private static final String NAMESPACE_URI = "http://eu.chorevolution.farmbusinessstartup/veterinary";

	@Autowired
	private RuntimeService runtimeService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmSiteInspectionRequestElementRequest")
	public void requestFarmInspection(@RequestPayload FarmSiteInspectionRequestType request) {
		
		System.out.println("Received SOAP message farmSiteInspectionRequestType");
		

		runtimeService.createMessageCorrelation("farmSiteInspectionRequestType")
				.processInstanceBusinessKey(request.getChoreographyId().getChoreographyId())
				.setVariable("farmSiteInspectionRequestType", request)
				.correlate();

	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmRegistrationNotificationElementRequest")
	public void requestFarmInspection(@RequestPayload FarmRegistrationNotificationType request) {
		
		System.out.println("Received SOAP message farmRegistrationNotificationType");
		
		runtimeService.createMessageCorrelation("farmRegistrationNotificationType")
				.processInstanceBusinessKey(request.getChoreographyId().getChoreographyId())
				.setVariable("farmRegistrationNotificationType", request)
				.correlate();

	}

}
