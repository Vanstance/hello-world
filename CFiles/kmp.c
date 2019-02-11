#include <stdio.h>

void prefix_table(char pattern[], int prefix[], int n){
	pattern[0] = 0;
	int len    = 0;
	int i = 1;
	while(i<n){
		if(pattern[i] = pattern[len]){
			len++;
			prefix[i] = len;
			i++;
		}else{
		 
	}
