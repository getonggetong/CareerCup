//这个写的不太对 因为出来的是排列结果而不是组合结果 应该首先考虑要拿几个25的 然后几个10的 然后几个5的 然后几个1的

public class CC8_7{
	static int N = 10;
	static int[] numOfWays = new int[N + 1];
	public static void main(String[] args){
		for(int i = 0; i < N + 1; i++){
			numOfWays[i] = -1;
		}

		// change(2);
		System.out.println(change(N));
		// System.out.println(numOfWays[0]);
		// System.out.println(numOfWays[1]);
		// System.out.println(numOfWays[2]);


	}
	public static int change(int cents){
		if(cents != 0){
			if(numOfWays[cents] != -1){
				return numOfWays[cents];
			}
			else{
				//不应该每次递归把找零方法的数加一传下去，而是应该永远用0作为base case，永远返回0，然后给返回的结果再加，不然每次加1往下传，等到剩余钱数是0（base case）的时候，找零方法就已经很大了
				//返回的每一层这个数就都是一样的了，而不是递增的

				//***不能这样取！这样是排列数 全是重复 需要组合数！所以每个结果需要除一个东西
				if(cents >= 25){
					numOfWays[cents] = change(cents - 25) + 1 + change(cents - 10) + 1 + change(cents - 5) + 1 + change(cents - 1) + 1;
					return numOfWays[cents];
				}
				else if(cents >= 10){
					numOfWays[cents] = change(cents - 10) + 1 + change(cents - 5) + 1 + change(cents - 1) + 1;
					return numOfWays[cents];
				}
				else if(cents >= 5){
					numOfWays[cents] = change(cents - 5) + 1 + change(cents - 1) + 1;
					return numOfWays[cents];
				}
				else{
					numOfWays[cents] = change(cents - 1) + 1; 
					// System.out.println(numOfWays[cents] + "     " + cents);
					return numOfWays[cents];
				}
			}
		}
		else{
			return 0;
		}
	}
}