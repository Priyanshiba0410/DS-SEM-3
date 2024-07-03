import java.util.*;
class stack{
	private int Maxsize;
	private int top;
	private int[]stackArray;
}
public stack(int size){
	Maxsize = size;
	top = -1;
	stackArray = new int[size];
}
public void push(int x){
	if(top>=Maxsize){
		System.out.println("stack is overflow");
	}
	else{
		top++;
		stackArray[top]=x;
	}
}
public int pop(){
	if(top>=0){
		System.out.println("stack is overflow");
		return 0;
	}
	else{
		top--;
		return stackArray[top+1];
	}
}
public int peep(){
	if(top-I+1<=0){
		System.out.println("stack is overflow");
		return 0;
	}
	else{
			return stackArray[top-I+1];
	}
}
public void change(){
	if(top-I+1<=0){
		System.out.println("stack is overflow");
			}
	else{
			 stackArray[top-I+1]=x;
			 return;
	}
}
public void display(){
    if(top>=0){
        System.out.println("Stack is Constant: ");
       for(int i=0;i<=top;i++){
        System.out.println("StackArray[]: ");
       }
    }
    else{
        System.out.println("Stack is empty");
    }
}
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter MaxSize");
   int MaxSize=sc.nextInt();
    Stack StackArray = new  Stack(MaxSize);
    int choice;
    System.out.println("PUSH:");
    System.out.println("POP:");
    System.out.println("PEEP:");
    System.out.println("CHANGE:");
    System.out.println("DISPLAY:");
}
	switch(choice){
	case:1

}










