package array;

import java.util.Scanner;

public class A4_and_B8
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int []a=new int[4];
		int []b=new int[8];
		
		Scanner x=new Scanner(System.in);
		System.out.println("enter any 4 integer elements to read into 'a' array");
		for(int i=0; i<4; i++)
		{
			a[i]=x.nextInt();
		}
		System.out.println("enter any 8 integer elements to read into 'b' array");
		for(int i=0; i<8; i++)
		{
			b[i]=x.nextInt();
		}
		System.out.println("'a' array stored elements are");
		for(int i=0; i<4; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("'b' array stored elements are");
		for(int i=0; i<8; i++)
		{
			System.out.println(b[i]);
		}

	}

}
