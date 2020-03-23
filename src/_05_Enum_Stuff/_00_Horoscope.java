package _05_Enum_Stuff;

import javax.swing.JOptionPane;


public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	Zodiac zodiac = Zodiac.GEMINI;
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void test() {
		
		switch(zodiac){
		case ARIES:
			JOptionPane.showMessageDialog(null, "You will have a great day, keep your head up!");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "You will have a difficult day but it will pay off in the near future");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Keep those you love close, it will benefit you greatly");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Dont let words get the best of you :)");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "Be bold and confident today Leo");
		}
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope horoscope = new _00_Horoscope();
		horoscope.test();
		//int selected = JOptionPane.showOptionDialog(null, "Choose your Zodiac", "Horoscopes", 0, -1, null, zodiac, 0);
		
		
	}
}
