//stack in java

import java.util.Scanner;
class StackDemo
{
	int size;
	static int[] stack_array;
	int top;
	Scanner sc;
	
	StackDemo(int size)
	{
		this.size=size;
		top=0;
		stack_array=new int[size];
	}
	
	void push()
	{
		sc=new Scanner(System.in);
		
		System.out.println("Enter the element:");
		int element=sc.nextInt();
		stack_array[top++]=element;
		
	}
	
	int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
		{
			return stack_array[top--];
		}
	}
	
	
	public boolean isEmpty()
	{
		return(top==-1);
	}
	
	public boolean isFull()
	{
		return(top==size-1);
	}
	
	void display_stack()
	{
		System.out.print("stack is:");
		for(int i=0;i<stack_array.length;i++)
		{
			System.out.print(stack_array[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		StackDemo d=new StackDemo(size);
		
		int choice=0;
	
			
		do
		{
			System.out.println("--------Stack Implementation--------");
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Display Stack");
			System.out.println("0.EXIT");
			System.out.println("Enter your choice:");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:d.push();
					   break;
				case 2:d.pop();
					   System.out.println("removed element is:"+d.pop());
					   break;
				case 3:d.display_stack();
					   break;
				default:System.out.println("Invalid Choice");
				
			}
		}while(choice!=0);
	}
