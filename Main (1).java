/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int m,n;
	    System.out.println("Enter the number of Rows:");
	    n=sc.nextInt();
//	    System.out.println("Enter the number of Columns:");
//	    m=sc.nextInt();
//------------------------------------------------------------------------------------------------------------------
// 	    for(int i=1;i<=n;i++)
// 	    {
// 	        for(int j=1;j<=i;j++)
// 	        {
// 	            System.out.print(j);
// 	        }
// 		System.out.println();
// 	    }
//------------------------------------------------------------------------------------------------------------------
//      for(int i=1;i<=n;i++)
//      {
//          for(int j=1;j<=m;j++)
//          {
//              if(i==1 || i==n || j==1 || j==m)
//              {
//                 System.out.print("*");    
//              }
//              else
//              {
//                 System.out.print(" ");
//              }
//          }
//          System.out.println();
//      }
//------------------------------------------------------------------------------------------------------------------
//      for(int i=1;i<=n;i++)
//      {
//         for(int j=n-i+1,k=1;j>=1;j--,k++)
//         {
//             System.out.print(k);
//         }
//         System.out.println();
//      }
//------------------------------------------------------------------------------------------------------------------
//     for(int i=1;i<=n;i++)
//     {
//         for(int sp=n-1;sp>=i;sp--)
//         {
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------
//     int k=1;
//     for(int i=1;i<=n;i++)
//     {
//         for(int j=1;j<=i;j++,k++)
//         {
//             System.out.print(k+" ");
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------
//     int k=1;
//     for(int i=1;i<=n;i++)
//     {
//         if(i%2==0)
//             {
//                 k=0;
//             }
//             else
//             {
//                 k=1;
//             }
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print(k+" ");
//             if(k==0)
//             {
//                 k=1;
//             }
//             else
//             {
//                 k=0;
//             }
//         }
//         System.out.println();
// 	}
//------------------------------------------------------------------------------------------------------------------	
//     for(int i=1;i<=n;i++)
//     {
//         for(int j=1;j<=i;j++)
//         {
//             int sum=i+j;
//             if(sum%2==0)
//             {
//                 System.out.print("1 ");
//             }
//             else
//             {
//                 System.out.print("0 ");    
//             }
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------	
//     for(int i=1;i<=n;i++)
//     {
//         int k=1;
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("*");
//         }
//         for(int sp=n-i;sp>=1;sp--)
//         {
//             System.out.print("  ");
//         }
//         while(k<=i)
//         {
//             System.out.print("*");
//             k++;
//         }
//         System.out.println();
//     }
//     for(int i=1;i<=n;i++)
//     {
//         int t=n-i+1;
//         for(int j=n-i+1;j>=1;j--)
//         {
//             System.out.print("*");
//         }
//         for(int sp=1;sp<i;sp++)
//         {
//             System.out.print("  ");
//         }
//         while(t>=1)
//         {
//             System.out.print("*");
//             t--;
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------	
//     for(int i=1;i<=n;i++)
//     {
//         for(int sp=n-i;sp>=1;sp--)
//         {
//             System.out.print(" ");
//         }
//         for(int j=1;j<=n;j++)
//         {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------
//     int k=1;
//     for(int i=1;i<=n;i++,k++)
//     {
//         for(int sp=n-i;sp>=1;sp--)
//         {
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print(k+" ");
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------
//     for(int i=1;i<=n;i++)
//     {
//         for(int sp=n-i;sp>=1;sp--)
//         {
//             System.out.print(" ");
//         }
//         int k=i;
//         for(int j=1;j<=i;j++,k--)
//         {
//             System.out.print(k);
//         }
//         k=2;
//         for(int t=1;t<i;t++,k++)
//         {
//             System.out.print(k);
//         }
//         System.out.println();
//  	}
//------------------------------------------------------------------------------------------------------------------
//     for(int i=1;i<=n;i++)
//     {
//         for(int sp=n-1;sp>=i;sp--)
//         {
//             System.out.print(" ");
//         }
//         for(int j=1;j<=i;j++)
//         {
//             System.out.print("*");
//         }
//         for(int t=1;t<i;t++)
//         {
//             System.out.print("*");
//         }
//         System.out.println();
//     }    
//     for(int i=1;i<n;i++)
//     {
//         for(int sp=1;sp<=i;sp++)
//         {
//             System.out.print(" ");
//         }
//         for(int t=n-i;t>=1;t--)
//         {
//             System.out.print("*");
//         }
//         for(int j=n-1;j>i;j--)
//         {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------
//     for(int i=1;i<=n;i++)
//     {
//         for(int sp=n-i;sp>=1;sp--)
//         {
//             System.out.print(" ");
//         }
//         for(int j=1;j<=n;j++)
//         {
//              if(i==1 || i==n || j==1 || j==n)
//              {
//                 System.out.print("*");    
//              }
//              else
//              {
//                 System.out.print(" ");
//              }
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------
//     for(int i=1;i<=n;i++)
//     {
//         int k=1;
//         for(int j=1;j<=i;j++)
//         {
//             if(i==1 || i==n || j==1 || j==i)
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//         }
//         for(int sp=n-i;sp>=1;sp--)
//         {
//             System.out.print("  ");
//         }
//         while(k<=i)
//         {
//             if(k==i || i==n || i==1 ||k==1)
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//             k++;
//         }
//         System.out.println();
//     }
//     for(int i=1;i<=n;i++)
//     {
//         int t=n-i+1;
//         for(int j=n-i+1;j>=1;j--)
//         {
//             if(i==1 || i==n || j==1 || j==n-i+1)
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//         }
//         for(int sp=1;sp<i;sp++)
//         {
//             System.out.print("  ");
//         }
//         while(t>=1)
//         {
//             if(t==n-i+1 || t==1 || i==1 || i==n)
//                 System.out.print("*");
//             else
//                 System.out.print(" ");
//             t--;
//         }
//         System.out.println();
//     }
//------------------------------------------------------------------------------------------------------------------
	}
}
