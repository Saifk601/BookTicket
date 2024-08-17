package in.saifit.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.saifit.response.TicketDetails;
import insaifit.request.PassangerInfo;

@RestController
@RequestMapping("api")
public class AirIndiaRestController {
	
	@CrossOrigin(origins = "https://your-swagger-ui-domain.com")
	@PostMapping("/BookTicket")
	public ResponseEntity<TicketDetails> getBookTicket(@RequestBody PassangerInfo passanger){
		
		TicketDetails tck = new TicketDetails();
		tck.setName(passanger.getFname()+" "+passanger.getLname());
		tck.setFrom(passanger.getFrom());
		tck.setTo(passanger.getTo());
		tck.setJourneyDate(passanger.getJDate());
		tck.setFlightId(passanger.getFlightId());
		tck.setPhone(passanger.getPhone());
		tck.setTicketStatus("Confirmed");
		tck.setTckPrice("7500.00");
		
		System.out.println(tck);
		return new ResponseEntity<>(tck , HttpStatus.OK);
		
	}

}
