package project1;

import java.util.Random;
////backend 
public class passwordGenerator {
	
	public static final String LOWERCASE_CHARACTERS="abcdefghijklmnopqrstuvwxyz";
	public static final String UPPERCASE_CHARACTERS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public static final String NUMBERS ="0123456789";
	public static final String SPECIAL_CHARACTERS = "!@#$%^&*()_+=-;',./:<>?";
	
	
	
	private final Random random ;
	public passwordGenerator() {random=new Random();}
	public String generatePassword(int length,boolean includeUpperCase,boolean includeLowerCase,boolean includeNumbers,boolean includeSpecialSymbols) {
		StringBuilder passwordBuilder=new StringBuilder();
		String validCharacters="";
		if(includeUpperCase) validCharacters +=UPPERCASE_CHARACTERS;
		if(includeLowerCase) validCharacters +=LOWERCASE_CHARACTERS;
		if(includeNumbers) validCharacters +=NUMBERS;
		if(includeSpecialSymbols) validCharacters += SPECIAL_CHARACTERS;
		
		// build password
		
		for(int i=0;i<length;i++) {
			//generate randomindex
			int randomIndex=random.nextInt(validCharacters.length());
			//get the char based on random index 
			
			char randomChar=validCharacters.charAt(randomIndex);
			
			//store char into password builder
			passwordBuilder.append(randomChar);
			
			
			
		}
		
		//return 
		return passwordBuilder.toString();
		
	}

	}
