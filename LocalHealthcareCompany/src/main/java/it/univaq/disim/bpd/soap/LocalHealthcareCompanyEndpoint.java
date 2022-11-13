package it.univaq.disim.bpd.soap;

import java.util.Random;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import it.univaq.disim.bpd.domain.FarmBusinessStartupRequest;
import it.univaq.disim.bpd.domain.FarmBusinessStartupRequestType;
import it.univaq.disim.bpd.domain.FarmRegistrationNotification;
import it.univaq.disim.bpd.domain.FarmRegistrationNotificationType;
import it.univaq.disim.bpd.domain.FarmSiteInspectionRequest;
import it.univaq.disim.bpd.domain.FarmSiteInspectionResponseType;

@Endpoint
public class LocalHealthcareCompanyEndpoint {

	private static final String NAMESPACE_URI = "http://eu.chorevolution.farmbusinessstartup/localhealthcarecompany";

	@Autowired
	private RuntimeService runtimeService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmBusinessStartupRequestElementRequest")
	public void requestFarmBusinessCode(@RequestPayload FarmBusinessStartupRequestType request) {
		
		System.out.println("Received SOAP message FarmBusinessStartupRequestType");
		

		runtimeService.createMessageCorrelation("farmBusinessStartupRequestType")
				.processInstanceBusinessKey(request.getChoreographyId().getChoreographyId())
				.setVariable("farmBusinessStartupRequestType", request)
				.correlate();

	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmSiteInspectionResponseElementRequest")
	public void receiveFarmSiteInspectionVerbal(@RequestPayload FarmSiteInspectionResponseType request) {

		System.out.println("Received SOAP message farmSiteInspectionResponseType");

		runtimeService.createMessageCorrelation("farmSiteInspectionResponseType")
				.processInstanceBusinessKey(request.getChoreographyId().getChoreographyId())
				.setVariable("farmSiteInspectionResponseType", request)
				.correlate();

	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmRegistrationNotificationElementRequest")
	public void receiveFarmBusinessStartupNotification(@RequestPayload FarmRegistrationNotificationType request) {
		
		System.out.println("Received SOAP message farmRegistrationNotificationType");

		runtimeService.createMessageCorrelation("farmRegistrationNotificationType")
				.processInstanceBusinessKey(request.getChoreographyId().getChoreographyId())
				.setVariable("farmRegistrationNotificationType", request)
				.correlate();
	}

}
