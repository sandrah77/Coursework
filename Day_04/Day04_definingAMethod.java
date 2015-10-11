public class Day04_definingAMethod  {
	
	public static void main (String[] args) {

boolean containsOnlyLowerCaseCharacters(String login) {
	for (int i = 0; i < login.length(); i++) {
		char c = login.charAt(i);
		if (!Character.isLetter(c) || !Character.isLowerCase(c)) {
			return false;
		}
	}
	return true;
}		