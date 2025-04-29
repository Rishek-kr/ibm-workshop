package ibm.com.arrays;

public class Application
{
	public static void main( String[] args )
	{
//		int nums[];
//		nums=new int[5];
//		for(int value:nums) {
//			System.out.println(value);
//		}
		int nums[][];
		nums=new int[2][5];
		for(int value[]:nums) {
			for(int digit:value) {
				System.out.println(digit);
			}
			System.out.println();
		}
	}
}