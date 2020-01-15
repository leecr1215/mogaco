#include <stdio.h>

int main_array(void)
{
	//배열
	
	// 여러 개의 변수를 함께, 동시에 생성
	/*int subway_array[3]; //[0],[1],[2]
	subway_array[0] = 30;
	subway_array[1] = 40;
	subway_array[2] = 50;

	for (int i = 0; i < 3; i++)
	{
		printf("지하철 %d호차에 %d 명이 타고 있습니다\n", i + 1, subway_array[i]);
	}*/

	// 값 설정 방법
	/*
	int arr[10] = { 1,2,3,4,5,6,7,8,9,10 };	
	for (int i = 0; i < 10; i++)
	{
		printf("%d\n", arr[i]);
	}*/

	//값은 초기화를 반드시 해야 함
	/*int arr[10];
	for(int i = 0; i < 10; i++)
	{
		printf("%d\n", arr[i])
		}*/

	//배열 크기는 항상 상수로 선언
	//변수 불가능
	/*int size = 10;
	int arr[10];*/

	/*int arr[10] = {1, 2}; // 3번째 값부터는 자동으로 '0'으로 초기화 됨
	for (int i = 0; i < 10; i++)
	{
		printf("%d\n", arr[i]);
	}*/

	//int arr = { 1, 2 } // arr[2]

	/*float arr_f[5] = { 1.0f,2.0f,3.0f };
	for (int i = 0; i < 5; i++)
	{
		printf("%.2f\n", arr_f[i]);
	}*/

	// 문자 vs 문자열
	/*char c = 'A';
	printf("%c\n", c);*/

	//문자열 끝에는 '끝'을 의미하는 NULL문자 '\0'이 포함되어야 함
	//포함 안하면 이상한글자 뒤에 붙음(size가 여유x경우)
	/*char str[7] = "coding"; // [c][o][d][i][n][g][\0]
	printf("%s\n", str);*/

	//char str[] = "coding";
	/*printf("%s\n", str);	//coding
	printf("%s\n", sizeof(str));	//7*/
	
	/*for (int i = 0; i < sizeof(str); i++)
	{
		printf("%c\n", str[i]);
	}*/
	
	//영어 1글자는 1byte
	//한글 1글자는 2byte
	//char 크기 : 1byte
	/*char kor[] = "나도코딩";
	printf("%s\n", kor);
	printf("%d\n", sizeof(kor));	//9->3*2+1*/

	// 배열의 크기가 글자 수 보다 많을 경우 \0(빈값)가 들어가는것.
	/*char c_array[10] = { 'c','o','d','i','n','g'};
	printf("%s\n", c_array);*/

	//문자열 입력받기
	/*char name[256];
	printf("이름을 입력하세요 : ");
	scanf_s("%s", name, sizeof(name));
	printf("%s\n", name);*/

	// ASCII 코드 : ANSI(미국표준협회) 에서 제시한 표준 코드 체계
	// 7bit, 총 128개 코드(0~127)
	// a : 97 (문자 a 의 아스키코드 정수값)
	// A : 65 
	// 0 : 48
	/*printf("%c\n", 'a');	//a
	printf("%d\n", 'a');	//97

	printf("%c\n", '\0');	//값이 찍히지 않음
	printf("%d\n", '\0');	//0

	printf("%c\n", '0');	//0
	printf("%d\n", '0');	//48*/

	//0~127 사이의 아스키코드 정수값에 해당하는 문자확인
	for (int i = 0; i < 128; i++)
	{
		printf("아스키코드 정수 %d : %c\n", i, i);
	}



	return 0;
}