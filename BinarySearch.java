//binary search in java

import java.util.Scanner;

class BinarySearch
{
	
	static void binarySearch(int arr[],int low,int high,int search,int num)
	{
		int mid=(low+high)/2;
		
			if(arr[mid]==search)
			{
				System.out.println("Array element is found at "+mid+"th index");	
			}
			else if(arr[mid]<search)
			{
				binarySearch(arr,mid+1,high,search,num);
			}
			else if(arr[mid]>search)
			{
				binarySearch(arr,low,mid-1,search,num);
			}
			/*else 
			{
				System.out.println("Element not found");
			}*/
		
		
			
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("----BINARY SEARCH----");
		System.out.println("Enter a size of an array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter an array Elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array Elements is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(i+"=>"+arr[i]+ " ");
		}
		System.out.println();
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}

		System.out.println("array Elements in sorted order is(using selection sort):");
		for(int i=0;i<n;i++)
		{
			System.out.print(i+"=>"+arr[i]+ " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("Enter an search element");
		int search=sc.nextInt();
		BinarySearch.binarySearch(arr,0,n-1,search,n);
		
	}
}