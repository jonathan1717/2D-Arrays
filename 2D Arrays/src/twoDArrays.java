import java.lang.reflect.Array;
import java.util.Scanner;

public class twoDArrays
	{

				public static void main(String[] args)
					{
//							exercise1();
//							exercise2();
//							exercise3();						
					}
			
		public static void exercise1()
		{
		 int myMatrix [] [] = { {10,20}, {30,40}, {50,60}};
			System.out.println(myMatrix [2][1]);
				                                 
		}
		
		public static void exercise2()
		{
			 String mullenMatrix [] [] = new String [4] [3];
				 {
				for (int row = 0; row < 4; row++)
					{
						System.out.println();
						for (int col = 0; col < 3; col++)
							{
								System.out.print(mullenMatrix[row][col]= "MHS ");
							}
						
					}
				 }
			
		}
	
		public static void exercise3()
			{
				int numberMatrix [][] = { {1,2,3},{4,5,6},{7,8,9}};
				{
				for(int row = 0; row < 3; row++)
					{
						System.out.println( );
						for(int col = 0; col < 3; col++)
							{
								System.out.print(numberMatrix[row][col]);
							}
				System.out.println( );
					}
				System.out.println("The thing is " + (numberMatrix[0][0] + numberMatrix[0][2] + numberMatrix[2][0] + numberMatrix[2][2]) + ".");
				}
			}
		}
	
	



