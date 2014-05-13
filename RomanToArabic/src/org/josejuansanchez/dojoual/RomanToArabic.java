package org.josejuansanchez.dojoual;

public class RomanToArabic {

	public static int roman_to_arabic(String roman_number) {
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

	private static int get_value_of_roman_symbol(char symbol) {
		int value = -1;
		switch(symbol) {
			case 'i': 
				value = 1;
				break;
			
			case 'v': 
				value = 5;
				break;
			
			case 'x': 
				value = 10;
				break;
				
			case 'l':
				value = 50;
				break;
				
			case 'c':
				value = 100;
				break;
				
			case 'd':
				value = 500;
				break;
				
			case 'm':
				value = 1000;
				break;
		
		}
		return value;
	}
}