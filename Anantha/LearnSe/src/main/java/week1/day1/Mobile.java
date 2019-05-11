package week1.day1;

public class Mobile {
			
	// print mobile brand & model
	public String printMobileModel(String brandName) {
		String model = "";
		if (brandName == "Moto"){
				model= "MotoG5sPlus";		
		}
		else if (brandName == "iPhone")
		{
			model= "iPhone6s";
		}
		return model;
	}
	
	public int activeSims() {
		return 2;
	}
	
	// get number
		public String callNumber(String getContactNumber) {
			
		return "Calling "+getContactNumber+" ...";	
		}
	
	// attend call
	// reject call
		
		public String saveContact(String contactNumber) {
			String[] contacts= {"Ananth","SriDevi","Punitha","Ranjith","Friend5","Unknown"};
			if (contactNumber.isEmpty()) {
				return "provide valid number";
			}
			else if (contactNumber.equals("+919894691648")) {
				return contacts[0];
			}
			else if (contactNumber.equals("+919876543210"))
			{
				return contacts[1];
			}
			else if (contactNumber.equals("+910123456789")) {
				return contacts[2];
			}
			else if (contactNumber.equals("+911472583690")) {
				return contacts[3];
			}
			else if (contactNumber.equals("+919638527410")) {
				return contacts[4];
			}
			else if (contactNumber.equals("+91025871369")) {
				return contacts[5];
			}
			else
			{
				return contacts[6];
			}
			
		}
		
		public String saveContactSwitch(String contactNumber) {
			String[] contacts= {"Ananth","SriDevi","Punitha","Ranjith","Friend5"};
			for (String names: contacts) {
				System.out.println(names);
			}
			switch (contactNumber) {
				case "":
				return "provide valid number";
				//break;
				case "+919894691648":
				return contacts[0];
				//break;
				case "+919876543210":
				return contacts[1];
				//break;
				case "+910123456789":
				return contacts[2];
				//break;
				case "+911472583690":
				return contacts[3];
				//break;
				case "+919638527410":
				return contacts[4];
				//break;
				default:
				return "Unknown";				
				//break;
				}
			}		
		}