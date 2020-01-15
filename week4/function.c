#include <stdio.h>

// 선언
void p(int num);
void function_without_return();
int function_with_return();
void function_without_params();
void function_with_params(int num1, int num2, int num3);

int apple(int total, int ate);	//전체 total개에서 ate 개를 먹고 남은 수 반환

int add(int num1, int num2);
int sub(int num1, int num2);
int mull(int num1, int num2);
int div(int num1, int num2);

int main_function(void)
{/*
	//function
	//계산기

	int num = 2;
	p(num); // 2

	// 2 + 3은?
	num = num + 3; 
	p(num);	// 5

	// 5 - 1은?
	num -= 1;
	p(num); // 4


	// 4 x 3 은?
	num *= 3;
	p(num); // 12

	// 12 / 6 은?
	num /= 6;
	p(num); // 2
	*/

	// 함수 종류
	//①반환 값이 없는 함수
	//function_without_return();

	//②반환 값이 있는 함수
	//int ret = function_with_return();
	//p(ret);

	//③파라미터(전달값)이 없는 함수
	//function_without_params();

	//④파라미터(전달값)이 있는 함수
	//function_with_params(35, 27, 12);

	//⑤파라미터(전달값)도 받고, 반환값이 있는 함수
	//int ret = apple(5, 2);	//5개의 사과중에서 2개를 먹었음.
	//printf("사과 5개 중에 2개를 먹으면? %d 개가 남아요\n", ret);
	//printf("사과 %d개 중에 %d개를 먹으면? %d개가 남아요\n", 10, 4, apple(10, 4));


	//계산기 함수
	int num = 2;
	num = add(num, 3);
	p(num);

	num = sub(num, 1);
	p(num);

	num = mull(num, 3);
	p(num);

	num = div(num, 6);
	p(num);

	return 0;
}

// 정의
void p(int num)
{
	printf("num 은 %d 입니다\n", num);
}
// 전달값:36
// 함수: ㅁ + 4
// 반환형 : ?
//반환형 함수이름(매개변수){}

void function_without_return() 
{
	printf("반환값이 없는 함수입니다.\n");
}

int function_with_return()
{
	printf("반환값이 있는 함수입니다.\n");
	return 10;
}

void function_without_params() {
	printf("전달값이 없는 함수입니다.\n");
}

void function_with_params(int num1, int num2, int num3)
{
	printf("전달값이 있는 함수이며, 전달받은 값은 %d, %d, %d입니다", num1, num2, num3);
}

int apple(int total, int ate)
{
	printf("전달값과 반환값이 있는 함수입니다\n");
	return total - ate;
}

int add(int num1, int num2)
{
	return num1 + num2;
}

int sub(int num1, int num2)
{
	return num1 - num2;
}

int mull(int num1, int num2)
{
	return num1 * num2;
}

int div(int num1, int num2)
{
	return num1 / num2;
}
