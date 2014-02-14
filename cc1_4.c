#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool anagrams(char *s1, char *s2){
	int str1[128];
	int str2[128];
	for (int i = 0; i < 128; i++){
		str1[i]=0;
		str2[i]=0;
	}
	if (strlen(s1) != strlen(s2)){
		printf("not anagrams");
		return false;
	}
	else{
		for (int i = 0; i < strlen(s1); i++){
			str1[(int)(*(s1+i))]++;
			str2[(int)(*(s2+i))]++;
		}
		for (int i = 0; i < 128; i++){
			if (str1[i] != str2[i]){
				printf("not anagrams");
				return false;
			}
		}
		return true;
	}
	
}

int main(){
	char s1[] = "hello";
	char s2[] = "holle";
	if (anagrams(s1,s2))
		printf("is anagrams");

	return 0;
}