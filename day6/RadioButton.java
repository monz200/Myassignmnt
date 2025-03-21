package week3.day6;

public class RadioButton extends Button {

		
		public void selectRadioButton() {
			System.out.println("Clicked radio button");
		}
		
		public static void main(String[] args) {
			RadioButton r = new RadioButton();
			r.selectRadioButton();
			r.submit();
		}
	}

