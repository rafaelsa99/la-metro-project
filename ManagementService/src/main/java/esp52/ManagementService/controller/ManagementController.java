package esp52.ManagementService.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import esp52.ManagementService.service.ManagementService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class ManagementController {

	private ManagementService managementService = new ManagementService();
	private static final Logger logger = LogManager.getLogger(ManagementController.class);
	
	@GetMapping("/parkinglots")
	public String getAllParks(){
		logger.info("Request for Parking Lots Information");
		return managementService.getParkingInfo();
	}
	
	@GetMapping("/agencies")
	public String getAllAgencies(){
		logger.info("Request for informations about all agencies");
		return managementService.getAllAgenciesInfo();
	}
	
	@GetMapping("/agencies/{agency}")
	public String getAgency(@PathVariable("agency") String agency){
		logger.info("Request for informations about the agency " + agency);
		return managementService.getAgencyInfo(agency);
	}
}