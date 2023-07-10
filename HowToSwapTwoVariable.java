package saturdayproject;

public class HowToSwapTwoVariable {

	public static void main(String[] args) {
		
		String x = "water";
		String y = "kool-Aid";
		String temp = null;
		
		temp = x;
		x=y;
		y=temp;
		
		
		System.out.println("x:   "+x);
		System.out.println("y:   "+y);
				
	}

}
