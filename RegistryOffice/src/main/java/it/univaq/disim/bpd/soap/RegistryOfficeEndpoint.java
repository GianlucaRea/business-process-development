package it.univaq.disim.bpd.soap;

import java.util.Random;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import it.univaq.disim.bpd.domain.FarmOpeningNotificationType;


@Endpoint
public class RegistryOfficeEndpoint {

	private static final String NAMESPACE_URI = "http://eu.chorevolution.farmbusinessstartup/registryoffice";

	@Autowired
	private RuntimeService runtimeService;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "farmOpeningNotificationElementRequest")
	public void requestFarmOpening(@RequestPayload FarmOpeningNotificationType request) {
		
		System.out.println("Received SOAP message farmOpeningNotificationType");
		

		runtimeService.createMessageCorrelation("farmOpeningNotificationType")
				.processInstanceBusinessKey(request.getChoreographyId().getChoreographyId())
				.setVariable("farmOpeningNotificationType", request)
				.correlate();

	}
}
