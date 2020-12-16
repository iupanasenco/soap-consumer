package com.trip.demosoap;

import com.trip.demosoap.client.SoapClient;
import com.trip.demosoap.model.OTAHotelResNotifRQ;
import com.trip.demosoap.model.OTAHotelResNotifRS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSoapApplication {

	SoapClient soapClient;

	public DemoSoapApplication(SoapClient soapClient) {
		this.soapClient = soapClient;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSoapApplication.class, args);
	}

	@PostMapping(value = "/invoke-soap-reservation")
	public OTAHotelResNotifRS showHotelNotification (@RequestBody OTAHotelResNotifRQ request) {
		return soapClient.validateHotelReservation(request);
	}

	@GetMapping(value="/test")
	public ResponseEntity<String> test(@RequestBody OTAHotelResNotifRQ request){
		return new ResponseEntity<>(request.getVersion().toString(), HttpStatus.ACCEPTED);
	}

}
