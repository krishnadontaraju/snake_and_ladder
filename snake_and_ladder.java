public class snake_and_ladder {

	public static void main(String args[]) {

		int position = 0;

		String[] storer={"One" ,"Two", "Three" ,"Four","Five","Six"};
        	Random dice = new Random();

		int displayer = dice.nextInt(6);
        	System.out.println(storer[displayer]);



	}

}
