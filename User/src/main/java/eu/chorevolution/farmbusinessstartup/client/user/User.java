package eu.chorevolution.farmbusinessstartup.client.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.chorevolution.farmbusinessstartup.client.AddressDetails;
import eu.chorevolution.farmbusinessstartup.client.BreedingMethodTypology;
import eu.chorevolution.farmbusinessstartup.client.CompanyTypology;
import eu.chorevolution.farmbusinessstartup.client.FarmBusinessStartupRequest;
import eu.chorevolution.farmbusinessstartup.client.FarmBusinessStartupRequestFormDetails;
import eu.chorevolution.farmbusinessstartup.client.FarmBusinessStartupRequestType;
import eu.chorevolution.farmbusinessstartup.client.FarmBusinessStartupResponse;
import eu.chorevolution.farmbusinessstartup.client.FarmDetails;
import eu.chorevolution.farmbusinessstartup.client.PersonData;
import eu.chorevolution.farmbusinessstartup.client.ProductionTypology;
import eu.chorevolution.farmbusinessstartup.client.UserPT;
import eu.chorevolution.farmbusinessstartup.client.UserService;

public class User {

	private static Logger LOGGER = LoggerFactory.getLogger(User.class);
	
	public static void main(String[] args) {
		
		LOGGER.info("******* USER *******");
		LOGGER.info("* Farm Business Code Request *");
		UserService userService = new UserService();
		UserPT userPT = userService.getUserPort();
		FarmBusinessStartupRequestType farmBusinessStartupRequestType = new FarmBusinessStartupRequestType();
		FarmBusinessStartupRequest farmBusinessStartupRequest = new FarmBusinessStartupRequest();
		FarmBusinessStartupRequestFormDetails farmBusinessStartupRequestFormDetails = new FarmBusinessStartupRequestFormDetails();
		FarmDetails farmDetails = new FarmDetails();
		farmDetails.setBreedingMethodologyType(BreedingMethodTypology.INTENSIVE);
		AddressDetails farmHeadquarterAddress = new AddressDetails();
		farmHeadquarterAddress.setCity("Vernon, Texas");
		farmHeadquarterAddress.setPostcode(76384);
		farmHeadquarterAddress.setStreet("1700 Deaf Smith St");
		farmDetails.setCompanyHeadquarter(farmHeadquarterAddress);
		farmDetails.setCompanyName("Los Angeles Rams");
		farmDetails.setCompanyType(CompanyTypology.INDIVIDUAL_COMPANY);
		farmDetails.setEmail("waggoner_ranch@gmail.com");
		farmDetails.setFarmName("Waggoner Ranch");
		farmDetails.setFarmSurface(510527);
		farmDetails.setPhoneNumber("(940) 552-2521");
		farmDetails.setProductionType(ProductionTypology.FATTENING_CATTLE_ADULTS);
		farmDetails.setVatNumber("23366701TXS");
		farmBusinessStartupRequestFormDetails.setFarm(farmDetails);
		PersonData farmOwnerData = new PersonData();
		AddressDetails farmOwnerAddress = new AddressDetails();
		farmOwnerAddress.setCity("Columbia, Missouri");
		farmOwnerAddress.setPostcode(65203);
		farmOwnerAddress.setStreet("2201 W Nifong Blvd");
		farmOwnerData.setAddress(farmOwnerAddress);
		farmOwnerData.setEmail("stan_kroenke@gmail.com");
		farmOwnerData.setFiscalCode("921797873");
		farmOwnerData.setName("Stan");
		farmOwnerData.setSurname("Kroenke");
		farmOwnerData.setPhoneNumber("816-318-6581");
		farmBusinessStartupRequestFormDetails.setOwner(farmOwnerData);
		farmBusinessStartupRequest.setFarmBusinessStartupRequestForm(farmBusinessStartupRequestFormDetails);
		farmBusinessStartupRequestType.setMessageData(farmBusinessStartupRequest);
		LOGGER.info("******* USER *******");
		FarmBusinessStartupResponse farmBusinessStartupResponse = userPT.farmBusinessCodeRequest(farmBusinessStartupRequestType).getMessageData();
		LOGGER.info("******* USER *******");
		LOGGER.info("* Farm Code Assigned "+ farmBusinessStartupResponse.getFarmCode() +" *");	
		LOGGER.info("******* USER *******");
	}
	
}
