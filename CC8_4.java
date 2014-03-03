import java.util.ArrayList;

public class CC8_4{
	static ArrayList<String> allperm = new ArrayList<String>();
	public static void main(String[] args){
		String str = "abc";
		String sub = new String();
		permutations(str, sub);
		System.out.println(allperm);

	}
	public static void permutations(String str, String sub){
		if(str.length() == 0){
			allperm.add(sub);
		}
		else{
			for(int i = 0; i < str.length(); i++){
				String tmpSub = new String(sub);
				String tmpStr = new String(str);
				tmpSub = tmpSub + str.charAt(i);
				if(i + 1 < tmpStr.length())
					tmpStr = tmpStr.substring(0, i) + tmpStr.substring(i + 1, tmpStr.length());
				else
					tmpStr = tmpStr.substring(0, i);
				permutations(tmpStr, tmpSub);
			}
		}
	}
}