// calloc : 할당 저장공간 0으로 초기화. void *calloc (unsigned int, unsigned int)형

#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
	int* pi;
	int size = 5;
	int count = 0;

	int num;
	int i;

	pi = (int*)calloc(size, sizeof(int));
	while (1)
	{
		printf("양수 : ");
		scanf("%d", &num);
		if (num <= 0)break;
		if (count == size)
		{
			size += 5;
			pi = (int*)realloc(pi, size * sizeof(int)); // 사이즈 조절

		}
		pi[count++] = num;

	}

	

	for (i = 0; i < count; i++)
	{
		printf("%5d", pi[i]);

	}

	free(pi);



	return 0;

}

//출력 결과
/*
양수 : 1
양수 : 2
양수 : 3
양수 : 4
양수 : 5
양수 : -1
	1    2    3    4    5

*/