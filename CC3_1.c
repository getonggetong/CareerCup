#include <stdio.h>

int array[300];
int top1 = 0;
int top2 = 100;
int top3 = 200;

int pop(int stackNum){
	int top;
	if(stackNum == 1){
		if(top1 >= 0){
			top = array[top1];
			top1--;
		}
		else
			printf("no data in this stack");
	}
	else if(stackNum == 2){
		if(top2 >= 100){
			top = array[top2];
			top2--;
		}
		else
			printf("no data in this stack");
	}
	else if(stackNum == 3){
		if(top3 >= 0){
			top = array[top3];
			top3--;
		}
		else
			printf("no data in this stack");
	}
	return top;
}

void push(int stackNum, int data){
	if(stackNum == 1){
		if(top1 < 99){
			top1++;
			array[top1] = data;
		}
		else{
			printf("the stack is full");
		}
	}
	else if(stackNum == 2){
		if(top2 < 199){
			top2++;
			array[top2] = data;
		}
		else{
			printf("the stack is full");
		}
	}
	else if(stackNum == 3){
		if(top3 < 299){
			top3++;
			array[top3] = data;
		}
		else{
			printf("the stack is full");
		}
	}
}

int main(){
	for(int i = 0; i < 300; i++)
		array[i] = 0;
	push(1, 6);
	printf("%d\n", pop(1));
	return 0;
}


