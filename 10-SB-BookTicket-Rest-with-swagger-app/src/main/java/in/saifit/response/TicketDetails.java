package in.saifit.response;

import lombok.Data;

@Data
public class TicketDetails {
	
	private String name;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;
	private String tckPrice;
	private String ticketStatus;
	private Long phone;

}
