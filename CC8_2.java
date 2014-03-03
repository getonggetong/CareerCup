import java.util.ArrayList;


public class CC8_2{
	static ArrayList<ArrayList<String>> allPaths = new ArrayList<ArrayList<String>>();
	static int N = 5;
	public static void main(String[] args){
		ArrayList<String> onePath = new ArrayList<String>();
		findPath(onePath, 0, 0);
		System.out.println(allPaths);
	}

	public static void findPath(ArrayList<String> onePath, int x, int y){
	
		//reach goal
		if(x == N && y == N){
			//-------------- arraylist pass by reference turn to pass by VALUE!!!!!!!!!!!!!!!!!!!!!!!
			ArrayList<String> tmp = new ArrayList<String>(onePath);
			//---------------------------------------------
			allPaths.add(tmp);
			System.out.println(onePath);
		}
		//can move right
		if(is_free(x + 1, y) && x + 1 <= N && y <= N){
			onePath.add("r");
			findPath(onePath, x + 1, y);
			onePath.remove(onePath.size() - 1);
		}
		//can move down
		if(is_free(x, y + 1) && x <= N && y + 1 <= N){
			onePath.add("d");
			findPath(onePath, x, y + 1);
			onePath.remove(onePath.size() - 1);

		}
	}

	public static boolean is_free(int x, int y){
		return true;
	}
}