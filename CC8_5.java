import java.util.ArrayList;

public class CC8_5{
	static ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
	public static void main(String[] args){
		ArrayList<Integer> comb = new ArrayList<Integer>();
		paren(5, comb);
		System.out.println(all);
		//iterate all permutations
		for(int i = 0; i < all.size(); i++){
			ArrayList<Integer> cur = all.get(i);
			//iterate integers in one permutation
			for(int j = 0; j < cur.size(); j++){
				int num = cur.get(j);
				//print parenthesis
				for(int k = 0; k < num; k++){
					System.out.print("(");
				}
				for(int k = 0; k < num; k++){
					System.out.print(")");
				}
			}
			System.out.print("    ");
		}
	}
	public static void paren(int n, ArrayList<Integer> comb){
		if(n == 0){
			all.add(comb);
		}
		else{
			for(int i = 1; i <= n; i++){//i should start from 1 instead of 0!!! infinite loop
				ArrayList<Integer> tmpComp = new ArrayList<Integer>(comb);
				tmpComp.add(i);
				paren(n - i, tmpComp);
			}
		}
	}
}