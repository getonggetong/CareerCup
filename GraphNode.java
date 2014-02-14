import java.util.ArrayList;

public class GraphNode{
	int value;
	ArrayList<GraphNode> nextList = new ArrayList<GraphNode>();
	public GraphNode(int value){
		this.value = value;
	}
	public boolean equals(GraphNode gn){
		// System.out.println("in equals()");

		if(gn.value == this.value){
			// System.out.println("same value");

			if(this.nextList.size() != gn.nextList.size()){
				// System.out.println("not same size");
				return false;
			}
			if(this.nextList.size() == 0)
				return true;
			for(int i = 0; i < this.nextList.size(); i++){

				if(this.nextList.get(i) != gn.nextList.get(i))
					return false;
			}
			// System.out.println(this.nextList.size());
			return true;
		}
		else
			return false;
	}
}