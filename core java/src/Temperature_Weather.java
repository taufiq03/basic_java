
public class Temperature_Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weatherCondition=2;
		
		int temperature =34;
		if (temperature <= 34) {
		    switch (weatherCondition) {
		    case 4:
		        System.out.println("freezingSnowing");
		        break;
		    case 3:
		    	System.out.println("freezingSnowing");
		        break;
		    case 2:
		    	System.out.println("freezingSnowing");
		        break;
		    default:
		    	System.out.println("freezingSunny");
		    }
		} else if (temperature <= 55) {
		    switch (weatherCondition) {
		    case 4:
		    	System.out.println("warmSnowing");
		        break;
		    case 3:
		    	System.out.println("warmCloudy");
		        break;
		    case 2:
		    	System.out.println("warmRain");
		        break;
		    default:
		    	System.out.println("warmSunny");
		    }
		} else {
		    // handle >=56
		}
		
	
	}
	}

	
