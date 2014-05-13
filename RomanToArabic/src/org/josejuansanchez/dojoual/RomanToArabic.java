package org.josejuansanchez.dojoual;

import java.util.HashMap;

public class RomanToArabic {

	private HashMap<String, Integer> roman_symbols;		
	
	public RomanToArabic() {
		roman_symbols = new HashMap<String, Integer>();
		roman_symbols.put("I",1);
		roman_symbols.put("V",5);
		roman_symbols.put("X",10);
		roman_symbols.put("L",50);		
		roman_symbols.put("C",100);
		roman_symbols.put("D",500);
		roman_symbols.put("M",1000);		
	}
	
	public int roman_to_arabic(String roman_number) {		
		roman_number = roman_number.toUpperCase();				
		int arabic_number = 0;
		int length = roman_number.length();
		for(int i=0; i < length - 1; i++) {			
			int current_value = get_value_of_roman_symbol(roman_number.charAt(i));
			int next_value = get_value_of_roman_symbol(roman_number.charAt(i+1));
						
			if (current_value < next_value) {
				arabic_number = arabic_number - current_value;
			} else {
				arabic_number = arabic_number + current_value;				
			}						
		}
		arabic_number = arabic_number + get_value_of_roman_symbol(roman_number.charAt(length-1));
		return arabic_number;
	}

	private Integer get_value_of_roman_symbol(char symbol) {				
		return roman_symbols.get(Character.toString(symbol));
	}
}