#include <stdio.h>
#include <stdlib.h>

int fib(int n, int *fib_result){
	if(n == 0){
		return 0;
	}
	else if(n == 1){
		return 1;
	}
	//actually no need to discuss condtion of n == 2
	else if(n == 2){
		return 1;
	}
		//should deal with condition when input n < 0
	/*
	else if(n < 0){
		return -1;
	}
	*/
	else{
		// dynammic programming
		if(fib_result[n] == 0){
			fib_result[n] = fib(n - 2, fib_result) + fib(n - 1, fib_result);
		}
		return fib_result[n];
		// return fib(n - 2, fib_result) + fib(n - 1, fib_result);
	}

}

int main(){
	//can use DP, assuming n will not be larger than 100
	int *fib_result;
	fib_result = calloc(0, sizeof(int) * 100);

	int n = 50;
	printf("fib %dth is %d\n", n, fib(n, fib_result));
}