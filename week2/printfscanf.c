#include <stdio.h>
int main_printf(void)
{	
	// ������ ������ ���� ����
	/*int age = 12; // �ڷ��� ������
	printf("%d\n", age);
	age = 13;
	printf("%d\n", age);*/

	// �Ǽ��� ������ ���� ����
	/*float f = 46.5f;
	printf("%.2f\n", f);	//�Ҽ��� ��°�ڸ����� ���
	double d = 4.428;
	printf("%.2lf\n", d);		//double�� f�տ� l���̱�
	*/

	//����� ���� ����
	/*const int YEAR = 2000;	
	printf("�¾ �⵵: %d\n", YEAR);*/

	//printf
	//����
	/*int add = 3+7;	//10
	printf("3+7=%d\n", add);
	printf("%d + %d = %d\n", 3,7,3+7);
	*/

	//scanf: Ű���� �Է��� �޾Ƽ� ����
	/*int input;
	printf("���� �Է��ϼ��� : ");
	scanf_s("%d", &input);
	printf("�Է°� : %d\n", input);*/
	/*
	char : %c
	int : %d
	float : %f
	double : %lf
	char[] : %s 
		-> �길 scanf_s���� &�ʿ�x. sizeof()����o.
	*/

	//����(�� ����), ���ڿ�(�� ���� �̻��� ����)
	/*char c = 'A';
	printf("%c\n", c);

	char str[256];
	scanf_s("%s", str, sizeof(str));
	printf("%s\n", str);*/

	//������Ʈ
	//�������� �������� ������ �Լ�(���� �ۼ�)
	//�̸�, ����, ������, Ű, ���˸�
	/*char name[256];
	printf("�̸��� ������? ");
	scanf_s("%s", name, sizeof(name));

	int age;
	printf("����̿���? ");
	scanf_s("%d", &age);

	float weight;
	printf("�����Դ� �� kg�̿���?");
	scanf_s("%f", &weight);

	double height;
	printf("Ű�� �� cm �̿���? ");
	scanf_s("%lf", &height);		//double�� lf

	char what[256];
	printf("���� ���˸� ���������? ");
	scanf_s("%s", what, sizeof(what));

	//���� ���� ���
	printf("\n\n--- ������ ���� ---\n\n");
	printf("�̸�       : %s\n", name);
	printf("����       : %d\n", age);
	printf("������     : %.2f\n", weight);
	printf("Ű         : %.2lf\n", height);
	printf("����       : %s\n", what);
	*/




	
}