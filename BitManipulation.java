public class BitManipulation{
	public static void main(String[] args){
		int i = 2;
		int j = 6;
		int n = Integer.parseInt("10000000000",2);
		int m = Integer.parseInt("10101", 2);
		int max = ~0;
		System.out.println("max is: " + Integer.toBinaryString(max));
		int left = max - ((1 << j) - 1);
		System.out.println("left is: " + Integer.toBinaryString(left));
		int right = (1 << i) - 1;
		System.out.println("right is: " + Integer.toBinaryString(right));
		System.out.println("n is: " + Integer.toBinaryString(n));
		System.out.println("m is: " + Integer.toBinaryString(m));
		n = n & (left + right);
		m = m << i;
		System.out.println("n is: " + Integer.toBinaryString(n));
		System.out.println("m is: " + Integer.toBinaryString(m));

		int sum = m + n;
		System.out.println("m + n is: " + Integer.toBinaryString(sum));
	}
}