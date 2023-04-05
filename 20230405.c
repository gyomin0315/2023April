#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#define PI 3.14159
#define LIMIT 100.0
#define MSG "passed!"
#define ERR_PRN printf("허용 범위가 아님\n")

int main(void)
{
	double radius, area;

	printf("반지름을 입력하시오(10이하) :");
	scanf("%lf", &radius);
	area = PI * radius * radius;
	if (area > LIMIT) ERR_PRN;
	else printf("원의 면적 : %.2lf(%s)\n", area, MSG);

	return 0;


}

//출력 결과
/*
반지름을 입력하시오(10이하) :3
원의 면적 : 28.27(passed!)
*/