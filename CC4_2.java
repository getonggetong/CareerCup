import java.util.ArrayList;

public class CC4_2{

	ArrayList<GraphNode> visited = new ArrayList<GraphNode>();
	public static void main(String[] args){

		CC4_2 cc = new CC4_2();
		GraphNode g1 = new GraphNode(1);
		GraphNode g2 = new GraphNode(2);
		GraphNode g3 = new GraphNode(3);

		g1.nextList.add(g2);
		g1.nextList.add(g3);
		if(cc.hasRoute(g1, g3))
			System.out.println("has route");
		else
			System.out.println("no route");
	}

	public boolean hasRoute(GraphNode g1, GraphNode g2){

		boolean equal = false;
		if (g1 == g2){ //这里我还复写了equals函数 其实不用 只用 == 判断就行了 因为二者指向同一地址
			// System.out.println("true");
			return true;
		}
		for(int i = 0; i < g1.nextList.size(); i++){
			if (equal)
				return true;
			if (visited.indexOf(g1.nextList.get(i)) <= 0){
				visited.add(g1.nextList.get(i));
				// System.out.println(g1.nextList.get(i).value);
				equal = hasRoute(g1.nextList.get(i), g2);	
			}
		}
		return equal;
	}
}