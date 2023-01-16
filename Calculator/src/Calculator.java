
public class Calculator {
int result;
void cal(int choice,int num1,int num2) {
	switch(choice) {
	case 1:
		result=num1+num2;
		break;
	case 2:
		result=num1-num2;
		break;
	case 3:
		result=num1*num2;
		break;
	case 4:
		result=num1/num2;
		break;
	default :
		System.out.println("Invalid Choice");
		break;
	}
}
void display() {
	System.out.println("Result is : "+result);
}

}
