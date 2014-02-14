// char * reverse(char *string){
// 	char *str = string;
// 	char *str2 = string;
// 	char *new = string;
// 	while (str != '\0'){
// 		str = str + 1;
// 		str2 = str2 + 1;
// 	}
// 	new = str - 1;
// 	while (string != new){
// 		str = str + 1;
// 		*str = *new;
// 		new = new - 1;
// 	}
// 	*str = *new;
// 	str = str + 1;
// 	*str = '\0';
// 	str2 = str2 + 1;
// 	return str2;
// }

#include <stdio.h>
void reverse(char *string);

int main(){
	char string[4] = {'a','b','c','d'};
	char *str = &string[0];
	reverse(str);
	while (*str != '\0'){
		printf ("%c",*str);
		str = str + 1;
	}
	return 0;
}
// void reverse(char *string){
// 	char *orig = string;
// 	char tmp = *string;
// 	char *str = string;
// 	while (*str != '\0'){
// 		str = str + 1;
// 	}
// 	while (str != string){
// 		str = str - 1;
// 		*string = *str;
// 		*str = tmp;
// 		string = string + 1;
// 		tmp = *string;
// 	}
// 	string = orig;
	
	

// }

void reverse(char *string){
	char *start = string;
	char *end = start;
	char temp;

	while(*end != '\0') {
		end++;
	}
	end--;
	while (end>=start) {

		temp = *start;
		*start++ = *end;
		*end-- = temp;
	}
}