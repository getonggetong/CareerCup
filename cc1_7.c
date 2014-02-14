#include <stdio.h>
#include <stdbool.h>

void check0(int matrix[6][8]){
	bool row0[6];
	bool col0[8];
	for (int i = 0;i < 6; i++){
		row0[i] = false;
	}
	for (int i = 0;i < 8; i++){
		col0[i] = false;
	}
	for (int i = 0; i < 6; i++){
		for (int j = 0; j < 8; j++){
			if (matrix[i][j] == 0){
				row0[i] = true;
				col0[j] = true;
			}
				
		}
	}
	for (int i = 0; i < 6; i++){
		if (row0[i]){
			for (int j = 0; j < 8; j++)
				matrix[i][j] = 0;
		}
	}
	for (int i = 0; i < 8; i++){
		if (col0[i]){
			for (int j = 0; j < 6; j++)
				matrix[j][i] = 0;
		}
	}
}

int main(){
	int matrix[6][8] = {{1,1,0,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,0,1,1,1},{1,1,1,1,1,1,1,1},{1,1,1,1,1,1,1,0}};
	check0(matrix);
	for (int i = 0; i < 6; i++){
		for (int j = 0; j < 8; j++)
			printf("%d",matrix[i][j]);
		printf("\n");
	}
	return 0;
}