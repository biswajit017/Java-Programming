class Sample
{
	 final int x ; //Blank final field	
	 
	public Sample()
	{
	   x = 100;
	   System.out.println(x);
	}
	
	public Sample(int y)
	{
		x = y;
		System.out.println(y);
	}
}


public class BlankFinalFieldDemo1 {

	public static void main(String[] args) 
	{
		Sample s1 = new Sample();
		Sample s2 = new Sample(200);

	}

}