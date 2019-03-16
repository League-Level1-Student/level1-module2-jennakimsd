import java.util.jar.Attributes.Name;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		//If the guest has been knighted by the Queen and is male, use the title "Sir" before their name to greet them,
		if (isKnighted == true && isWoman == false) {
			return "Sir " + name;
		}
		//If the guest has been knighted by the Queen and is female, use the title "Lady" before their name to greet them,
		else if (isKnighted == true && isWoman == true) {
			return "Lady " + name;
		}
		//otherwise if the guest is a male, use the title "Mr." before their name.
		else if (isKnighted == false && isWoman == false) {
			return "Mr. " + name;
		}
		//otherwise if the guest is a female, use the title "Ms." before their name.
		else {
			return "Ms. " + name;
		}
		
	}
}
