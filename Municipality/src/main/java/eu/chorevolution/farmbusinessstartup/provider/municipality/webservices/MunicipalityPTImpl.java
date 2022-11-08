package eu.chorevolution.farmbusinessstartup.provider.municipality.webservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import eu.chorevolution.farmbusinessstartup.provider.municipality.FarmBusinessCodeStartupNotification;
import eu.chorevolution.farmbusinessstartup.provider.municipality.MunicipalityPT;

@Component(value="MunicipalityPTImpl")
public class MunicipalityPTImpl implements MunicipalityPT{

	private static Logger LOGGER = LoggerFactory.getLogger(MunicipalityPTImpl.class);
	
	@Override
	public void farmBusinessCodeStartupNotification(FarmBusinessCodeStartupNotification parameters) {
		
		LOGGER.info("******* Municipality *******");
		LOGGER.info("* Farm Business Code Startup Notification *");
		LOGGER.info("* Farm Code "+parameters.getFarmCode()+" *");			
		LOGGER.info("* Farm Name "+parameters.getFarm().getFarmName()+" *");
		LOGGER.info("* Company Name "+parameters.getFarm().getCompanyName()+" *");		
		LOGGER.info("******* Municipality *******");		
	}

}
