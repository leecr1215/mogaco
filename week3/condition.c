#include <stdio.h>
#include <time.h>

int main(void)
{/*
	//������ ź�ٰ� ����. �л�, �Ϲ������� ����(�Ϲ���: 20��)
	int age = 15;
	//if (����){} else{}
	if (age <= 20) {
		printf("�Ϲ��� �Դϴ�");
	}
	else {
		printf("�л��Դϴ�\n");
	}*/

	//break�� continue

	//1������ 30������ �ִ� �ݿ��� 1������ 5������ ���� ��ǥ�� �մϴ�.
	/*for (int i = 1; i <= 30; i++) {
		if (i >= 6) {
			printf("������ �л��� ���� ������\n");
			break;		//break�� if���� ����� ������ �������� ��.
		}
		printf("%d�� �л��� ���� ��ǥ �غ� �ϼ���\n", i);
	}*/
	
	//1������ 30������ �ִ� �ݿ��� 7���л��� ���ļ� �Ἦ
	//7���л��� �����ϰ� 6������ 10������ ���� ��ǥ.
	/*for (int i = 1; i <= 30; i++) {
		if (i >= 6 && i <= 10) {
			if (i == 7) {
				printf("%d�� �л��� �Ἦ�Դϴ�\n", i);
				continue;	//continue�� �ٷ� ���� for�� �ٽ�. �ؿ� ���� x
			}
			printf("%d�� �л��� ���� ��ǥ �غ� �ϼ���\n", i);
		}
	}*/

	// And Or ����
	/*int a = 10;
	int b = 11;
	int c = 12;
	int d = 13;
	if (a == b && c == d) {
		printf("a�� b�� ����, c�� d�� �����ϴ�\n");
	}
	else {
		printf("���� ���� �ٸ��׿�\n");
	}*/

	/*
	int a = 10;
	int b = 11;
	int c = 12;
	int d = 13;
	if (a == b || c == d) {
		printf("a�� b�� ���ų� c�� d�� �����ϴ�\n");
	}
	else {
		printf("���� ���� �ٸ��׿�\n");
		}
	*/

	//����:0 ����:1 ��:2
	/*srand(time(NULL));	// srand: ����
	int i = rand() % 3;	//0~2��ȯ
	
	if (i == 0) {
		printf("����\n");
	}
	else if (i == 1) {
		printf("����\n");
	}
	else if (i == 2) {
		printf("��\n");
	}
	else {
		printf("�����\n");
	}*/

	/*srand(time(NULL));
	int i = rand() % 3; 
	switch (i) {
	case 0: printf("����\n");
		break;
	case 1: printf("����\n");
		break;
	case 2: printf("��\n");
		break;
	default: printf("�����\n");
	}*/

	// Up and Down
	srand(time(NULL));
	int num = rand() % 100+1;	//0~100
	printf("����: %d\n", num);
	int answer = 0;	// ����
	int chance = 5;	// ��ȸ
	while (chance > 0) {
		printf("���� ��ȸ %d ��\n", chance--);
		printf("���ڸ� ����������(1~100) : ");
		scanf_s("%d", &answer);

		if (answer > num) {
			printf("DOWN ��\n\n");
		}
		else if (answer < num) {
			printf("UP ��\n\n");
		}
		else if (answer == num) {
			printf("�����Դϴ� !\n\n");
		}
		else {
			printf("�� �� ���� ������ �߻��߾��.");
		}
		
	}
	if (chance == 0) {
		printf("��ȸ�� �� ���̽��ϴ�.");
	}

	return 0;
}