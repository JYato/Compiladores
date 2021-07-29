%{
	#include <stdio.h>
	#include <string.h>
	int i, j;
%}

%%
[A-z]+ {
	for(i = 0; i < strlen(yytext); i++){
		int j;
		for(j = 0; j < i; j++){
			if(yytext[i] == yytext[j])
				break;
		}
		if(j == i){
			printf("%c",yytext[i]);
		}
	}
}
%%
