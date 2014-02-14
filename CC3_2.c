#include <stdio.h>

int min_value = 32767;
int min_pos = -1;
int stack[100];
int min_stack[100];
int top = 0;

int pop(){
	int top_value = 0;
	if(top > 0){
		top_value = stack[--top];

	}
	else
		printf("the stack is empty");
	return top_value;
}

void push(int value){
	if(top < 100){
		stack[top] = value;
		
		if(value <= min_value){
			min_value = value;
			min_pos = top;

		}
		min_stack[top] = min_value;
		top++;
	}
	else
		printf("the stack is full");
}

int min(){
	if(top > 0)
		return min_stack[top - 1];
	else
		printf("the stack is empty");
}
int main(){
	for(int i = 0; i < 100; i++){
		stack[i] = 0;
		min_stack[i] = 0;
	}
	push(6);
	push(4);
	push(7);
	push(9);
	push(1);
	printf("%d\n", min());
	printf("%d\n", pop());
	printf("%d\n", min());
}