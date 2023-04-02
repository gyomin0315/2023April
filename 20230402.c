/*
#include <stdio.h>

void swap_ptr(char** ppa, char** ppb);

int main(void)
{
	char* pa = "success";
	char* pb = "failure";

	printf("pa->%s, pb -> %s\n", pa, pb);
	swap_ptr(&pa, &pb);
	printf("pa->%s, pb->%s\n", pa, pb);

	return 0;



}

void swap_ptr(char** ppa, char** ppb)
{
	char* pt;
	pt = *ppa;
	*ppa = *ppb;
	*ppb = pt;


}
*/
//��� ���
/*
pa->success, pb -> failure
pa->failure, pb->success
*/

#include <stdio.h>

void print_str(char** pps, int cnt);

int main(void)
{

	char* ptr_array[] = { "eagle","tiger","lion","squirrel" };
	int count;

	count = sizeof(ptr_array) / sizeof(ptr_array[0]);
	print_str(&ptr_array, count);

	return 0;


}

void print_str(char** pps, int cnt)
{

	int i;

	for (i = 0; i < cnt; i++)
	{
		//printf("%s\n", pps[i]);
		printf("%s\n", *(pps+i)); // &s�ϱ� �ּڰ� ���� ����. ������ 2������ ����. 
	}
}


//��� ���
/*
eagle
tiger
lion
squirrel
*/