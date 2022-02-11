package My_Package;
public class Foreachloop_2D {

	public static void main(String[] args) {
		int y[][] = {{10,20,30,40},{50,60}};
		for(int[] y1:y)
		{
			for(int y2: y1)
            {
				System.out.println(y2);
			}
		}
	}

}
