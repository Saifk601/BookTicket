package insaifit.request;

import lombok.Data;

@Data
public class PassangerInfo {
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String jDate;
	private Long phone;

	
}
