


#include <stdio.h>

void rotate(int pixel[4][4], int n){
	int tmp = 0;
	// n/2, not n. for n/2, rotate 90 degree, for n, rotate 360 degree
	for (int i = 0; i < n/2; i++){
		for (int j = 0; j < n/2; j++){
			tmp = pixel[i][j];
			// four elements trans! 
			pixel[i][j] = pixel[n - j - 1][i];
			pixel[n - j - 1][i] = pixel[n - i - 1][n - j - 1];
			pixel[n - i - 1][n - j - 1] = pixel[j][n - i - 1];
			pixel[j][n - i - 1] = tmp;
		}
	}
}

int main(){
	int pixel[4][4] = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
	rotate(pixel, 4);
	for (int i = 0; i < 4; i++){
		printf("\n");
		for (int j = 0; j < 4; j++)
			printf("%d", pixel[i][j]);
	}
	return 0;
}