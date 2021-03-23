

import java.util.Random;

public class snake_and_ladder {

	public static void main(String args[]) {

		int position = 0;

		String[] storer={"One" ,"Two", "Three" ,"Four","Five","Six"};
        	Random dice = new Random();

		int displayer = dice.nextInt(6);
        	System.out.println(storer[displayer]);


		int ladder_or_snake = dice.nextInt(3);    
            	switch (ladder_or_snake) {
                	case 0:
                    		System.out.println("No play");
                    		System.out.println(position);
                    		                
                    	break;
        
                	case 1:
                    		System.out.println("Ladder");
                    		position += roll;
                        	System.out.println(position);
                       	break;
                    		                    		    
                	case 2:
                    		System.out.println("Snake");
                    		position = position - roll;
                    		System.out.println(position);
                    	break;

                	default :
                    	break;






	}

}
