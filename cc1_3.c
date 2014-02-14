#include <stdio.h>
#include <string.h>

void rm_dup(char *string){
	unsigned long length = strlen(string);

	for (int i = 0; i < length; i++){
		
		char cur = *(string + i);
		// printf("%d",i);
		// printf("%c\n",cur);
		if (cur == '_')
			continue;
		else{
			char *cmpr = string + i + 1;

			for (int j = 0; j < length - i; j++){
				// printf("%c\n",*cmpr);
				if (cur == *(cmpr + j)){
					*(cmpr + j) = '_';
				}
			}
		}
		
	}
	// for (int i = 0; i < strlen(string); i++){
	// 	printf("%c", *(string+i));
	// }
}

int main(){
	char string[] = "ababab";
	rm_dup(string);
	// printf("---");
	for (int i = 0; i < strlen(string); i++){
		printf("%c\n", *(string+i));
	}
	
}