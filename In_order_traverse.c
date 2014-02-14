#include <stdio.h>
#include <stdlib.h>

struct Node;
struct Node {
	int value;
	struct Node* left;
	struct Node* right;
};

void print(struct Node* root){
	if(root->left != NULL){
		print(root->left);
	}
	printf("%d ", root->value);
	if(root->right != NULL){
		print(root->right);
	}
}

int main(){
	struct Node* root;
	struct Node* n1;
	struct Node* n2;
	struct Node* n3;

	root = (struct Node *)malloc(sizeof(*root));
	root->value = 2;
	n1 = (struct Node *)malloc(sizeof(*n1));
	n1->value = 1;
	n2 = (struct Node *)malloc(sizeof(*n2));
	n2->value = 3;
	n3 = (struct Node *)malloc(sizeof(*n3));
	n3->value = 0;

	root->left = n1;
	root->right = n2;
	n1->left = n3;

	print(root);
	return 0;
}
