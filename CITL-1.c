#include <stdio.h>

void main()
{
/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
#include <stdbool.h>

int main()
{
    char text[13];
	int i = 0, alphabets = 0, words = 0;
	bool flag = false;
	printf("Please enter a text string : ");
	scanf("%s", &text);

	for(i = 0; i < 13; i++)
	{
		while(((int)text[i] >= 65 && (int)text[i] <= 90) || ((int)text[i] >= 97 && (int)text[i] <= 122))
		{
			alphabets = alphabets + 1;
			printf("%d", (int)text[i]);
			i++;
		}
		words = words + 1;
		flag = false;
		while(!((int)text[i] >= 65 && (int)text[i] <= 90) || ((int)text[i] >= 97 && (int)text[i] <= 122)){
			i++;
			flag = true;
		}
		if(flag)
		{
			i--;
		}
	}
	
	printf("alphabets : %d", alphabets);
	printf("words : %d", words);

    return 0;
}

}