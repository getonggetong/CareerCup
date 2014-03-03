public class CC8_8{

	
	static int num = 0;
	public static void main(String[] args){
		int[][] map = new int[8][8];
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				map[i][j] = 0;
			}
		}
		eightQueens(0, map);
		System.out.println("There are " + num + " ways.");
	}

	//应该把map跟着传 不应该设成全局 每次递归回来的时候就是之前一个状态的map 不然全都满了 递归返回的时候看到的还是全都满了的map
	public static void eightQueens(int n, int[][] originMap){
		int[][] map = new int[8][8];
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				int tmp = originMap[i][j];
				map[i][j] = tmp;
			}
			System.out.println();
		}

		System.out.println();

		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		for(int i = 0; i < 8; i++){
			//current position is free to put a queen
			System.out.println("i is " + i);
			if(map[n][i] == 0){
				map[n][i] = 1;
				for(int j = 0; j < 8; j++){
					if(i != j){
						map[n][j] = -1;
					}
					if(n != j){
						map[j][i] = -1;
					}
				}
				int j = i;
				int k = n;
				while(j > 0 && k > 0){
					j--;
					k--;
					map[k][j] = -1;
				}
				j = i;
				k = n;
				while(j > 0 && k < 7){
					j--;
					k++;
					map[k][j] = -1;
				}
				j = i;
				k = n;
				while(j < 7 && k > 0){
					j++;
					k--;
					map[k][j] = -1;
				}
				j = i;
				k = n;
				while(j < 7 && k < 7){
					j++;
					k++;
					map[k][j] = -1;
				}

				if(n + 1 < 8){
					eightQueens(n + 1, map);
					//这需要restore之前的状态 因为这里面是个for循环
					for(int i2 = 0; i2 < 8; i2++){
						for(int j2 = 0; j2 < 8; j2++){
							int tmp = originMap[i2][j2];
							map[i2][j2] = tmp;
						}
					}
				}
				else{
					num++;
				}
			}
		}
	}
}