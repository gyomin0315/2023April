#define _CRT_SECURE_NO_WARNINGS

#include <stdio.h>
#define PI 3.14159
#define LIMIT 100.0
#define MSG "passed!"
#define ERR_PRN printf("��� ������ �ƴ�\n")

int main(void)
{
	double radius, area;

	printf("�������� �Է��Ͻÿ�(10����) :");
	scanf("%lf", &radius);
	area = PI * radius * radius;
	if (area > LIMIT) ERR_PRN;
	else printf("���� ���� : %.2lf(%s)\n", area, MSG);

	return 0;


}

//��� ���
/*
�������� �Է��Ͻÿ�(10����) :3
���� ���� : 28.27(passed!)
*/