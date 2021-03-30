class a
{
	static int add(int i,int j)
	{
		return i+j;
	}
}
public class hackkerrank extends a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// /* heryge// //hdbj */
		
		
		short s = 9;
		System.out.println(add(s,6));
		
		int mask = 0x000F;
		int value = 0x2222;
		System.out.println(value & mask);
		
		try
		{
			Float f1 = new Float("3.0");
			int x = f1.intValue();
			byte b = f1.byteValue();
			double d = f1.doubleValue();
			System.out.println(x+b+d);
			}
		catch(NumberFormatException e)
		{
			System.out.println("bad num");
		}

	}

}
