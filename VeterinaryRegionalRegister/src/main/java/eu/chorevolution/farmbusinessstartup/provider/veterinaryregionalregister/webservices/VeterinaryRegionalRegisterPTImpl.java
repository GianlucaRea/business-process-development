package eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister.webservices;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister.FarmRegistrationRequest;
import eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister.FarmRegistrationResponse;
import eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister.VeterinaryRegionalRegisterPT;

@Component(value = "VeterinaryRegionalRegisterPTImpl")
public class VeterinaryRegionalRegisterPTImpl implements VeterinaryRegionalRegisterPT{

	private static Logger LOGGER = LoggerFactory.getLogger(VeterinaryRegionalRegisterPTImpl.class);
	
	@Override
	public FarmRegistrationResponse farmRegistration(FarmRegistrationRequest parameters) {
		
		LOGGER.info("******* VETERINARY REGIONAL REGISTER *******");
		LOGGER.info("*         Farm Registration 			*");
		LOGGER.info("* Farm Name "+parameters.getFarm().getFarmName()+" *");
		LOGGER.info("* Company Name "+parameters.getFarm().getCompanyName()+" *");	
		String farmCode = UUID.randomUUID().toString();
		LOGGER.info("* Farm Code "+farmCode+" *");		
		LOGGER.info("******* VETERINARY REGIONAL REGISTER *******");
		FarmRegistrationResponse farmRegistrationResponse = new FarmRegistrationResponse();
		farmRegistrationResponse.setFarmCode(farmCode);
		return farmRegistrationResponse;
	}

}
