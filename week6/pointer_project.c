#include <stdio.h>
#include <time.h>

// ����Ⱑ 6������ �ִ�
// �̵��� ����(6��)�� ��� �ִµ� �縷��
// �縷�� �ʹ� ������ ���� ���� ������ ��
// ���� �� �����ϱ� ���� �������� ���׿� ���� �༭ ����� �������
// ������ �ð��� �������� ���� Ŀ���� .. �ȳ�..

int level;
int arrayFish[6];
int* cursor;	

void printfFishes();
void initData();
void decreaseWater(long elapsedTime);

int main(void)
{
	long startTime = 0;	// ���� ���� �ð�
	long totalElapsedTime = 0;	 // �� ��� �ð�
	long prevElapsedTime = 0;	// ���� ��� �ð� (�ֱٿ� ���� �� �ð� ����)

	int num;	// �� �� ���׿� ���� �� ������, ����� �Է�
	initData();

	cursor = arrayFish;	// cursor[0]..
	//�� cursor�� arrayFish�� ������ ��??
	// cursor�� ���׿� �� �ַ��� ����.
	// ���� ���� �ٲ�� �ϱ� ������.

	startTime = clock();	// ���� �ð��� millisencond(1/1000��)
	while (1)
	{
		printfFishes();
		printf("\n\n�� �� ���׿� ���� �ֽðھ��? ");
		scanf_s("%d", &num);


		// �Է°� üũ
		if (num < 1 || num>6)
		{
			printf("\n�Է°��� �߸��Ǿ����ϴ�\n");
			continue;
		}

		totalElapsedTime = (clock() - startTime) / CLOCKS_PER_SEC;
		printf("�� ��� �ð� : %ld ��\n", totalElapsedTime);

		// ���� �� �� �ð� (���������� �� �� �ð�) ���ķ� �帥 �ð�
		prevElapsedTime = totalElapsedTime - prevElapsedTime;
		printf("�ֱ� ��� �ð� : %ld ��\n", prevElapsedTime);

		// ������ ���� ����(����)
		decreaseWater(prevElapsedTime);

		// ����ڰ� �Է��� ���׿� ���� �ش�
		// 1. ������ ���� 0 �̸�? ���� ���� �ʴ´�(����� ���)
		if (cursor[num - 1] <= 0)
		{
			printf("%d �� ������ �̹� �׾����ϴ�.. ���� �� �� �����ϴ�\n", num);
		}
		// 2. ������ ���� 0�� �ƴ� ���? ���� �ش�! 100�� ���� �ʴ��� üũ
		else if (cursor[num - 1] + 1 <= 100)
		{
			// ���� �ش�
			printf("%d �� ���׿� ���� �ݴϴ�\n\n", num);
			cursor[num - 1] += 1;
		}

		// �������� �� ���� Ȯ��(�������� 20�� ���� �ѹ��� ����)
		if (totalElapsedTime / 20 > level - 1)
		{
			// ������
			level++;
			printf(" *** �� ������ ! ���� %d �������� %d ������ ���׷��̵� ***\n\n", level - 1, level);

			// ���� ���� : 5
			if (level == 5)
			{
				printf("\n\n�����մϴ�. �ְ� ������ �޼��Ͽ����ϴ�. ������ �����մϴ�\n\n");
				exit(0);
			}
		}

		// ��� ����Ⱑ �׾����� Ȯ��
		if (checkFishAlive() == 0)
		{
			//����Ⱑ ��� ����
			printf("��� ����Ⱑ �׾����ϴ�\n");
			exit(0);
		}
		else
		{
			// �ּ� �Ѹ��� �̻��� ������ �������
			printf("����Ⱑ ���� ����־��\n");
		}
		prevElapsedTime = totalElapsedTime;




	}

	return 0;
}

void initData()
{
	level = 1;	// ���� ���� (1~5)
	for (int i = 0; i < 6; i++)
	{
		arrayFish[i] = 100;	// ������ �� ���� (0~100)
	}
}

void printfFishes()	// ���� ���� ����
{
	printf("%3d�� %3d�� %3d�� %3d�� %3d�� %3d��\n", 1, 2, 3, 4, 5, 6);
	for (int i = 0; i < 6; i++)
	{
		printf(" %4d ", arrayFish[i]);
	}
}

void decreaseWater(long elapsedTime)
{
	for (int i = 0; i < 6; i++)
	{
		arrayFish[i] -= (level * 3 * (int)elapsedTime);	//3 : ���̵� ������ ���� ��
		if (arrayFish[i] < 0)
		{
			arrayFish[i] = 0;
		}
	}
}

int checkFishAlive()
{
	for (int i = 0; i < 6; i++)
	{
		if (arrayFish[i] > 0)
			return 1;	// ��
	}
	return 0;
}