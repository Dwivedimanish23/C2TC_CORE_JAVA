package My_Package;
public class Forloop_2D 
{

	public static void main(String[] args) 
	{
		int y[][] = {{10,20,30,40},{50,60}};
		 
			for(int a=0;a<y.length;a++)   
				{
					for(int b=0;b<y[a].length;b++)   
					{
							System.out.println(y[a][b]);
					}
				}
	}
}
