import java.util.ArrayList;

public class CC8_3{
	static ArrayList<ArrayList<Integer>> allSubsets = new ArrayList<ArrayList<Integer>>();

	public static void main(String[] args){
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		ArrayList<Integer> subset = new ArrayList<Integer>();
		subset(set,subset,0);
		System.out.println(allSubsets);

	}

	public static void subset(ArrayList<Integer> set, ArrayList<Integer> subset, int i){
		ArrayList<Integer> tmpSub1 = new ArrayList<Integer>(subset);
		ArrayList<Integer> tmpSub2 = new ArrayList<Integer>(subset);

		if(set.size() == i){
			allSubsets.add(subset);
		}
		else{
			tmpSub1.add(set.get(i));
			subset(set, tmpSub1, i + 1);
			subset(set, tmpSub2, i + 1);
		}
	} 
}