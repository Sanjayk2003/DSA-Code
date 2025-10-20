/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class zohopat
{
	public static void main(String[] args) {
		int n=7,l=1,k=1,count=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		      if(i<=n/2)
		      {
		          if((i+j)<=n/2||(i+j)>=(n/2)+(i*2))
		          {
		              System.out.printf("%03d ",(i+1)+(j*n));
					}
					else{
						System.out.print("    ");
						count++;
					}
				}
				else{
					if(i+j<=i+l||i+j>=n+(n/2)-1)
					{
						System.out.printf("%03d ",(i+1)+(j*n));
						
					}
					else{
						System.out.print("    ");
                        count++;
					}
			  }
		    }
			if(i>n/2)
			l++;
		    System.out.println();
		}
	}
}

// 00 01 02 03 04 05 06 07 08 09 010
// 10 11 12 13 14 15 16 17 18 19 110
// 20 21 22 23 24 25 26 27 28 29 210
// 30 31 32 33 34 35 36 37 38 39 310
// 40 41 42 43 44 45 46 47 48 49 410
// 50 51 52 53 54 55 56 57 58 59 510
// 60 61 62 63 64 65 66 67 68 69 610
// 70 71 72 73 74 75 76 77 78 79 710
// 80 81 82 83 84 85 86 87 88 89 810
// 90 91 92 93 94 95 96 97 98 99 910


// 00 01 02 03 04 05 06 
// 10 11 12 13 14 15 16 
// 20 21 22 23 24 25 26 
// 30 31 32 33 34 35 36 
// 40 41 42 43 44 45 46 
// 50 51 52 53 54 55 56 
// 60 61 62 63 64 65 66