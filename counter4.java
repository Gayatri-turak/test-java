/*
15	14	13	12	11	
10	9	8	7
6	5	4
3	2
1 
*/
class counter4
{
 public static  void main(String args[])
 {
  int n=5;
  int count=(n*(n+1)/2);
  for(int i=n;i>=1;i--)
 	{ 
	   for(int j=i;j>=1;j--)
     	  {
	   System.out.print(count+" ");
	   count--;
           }
         System.out.println();
          }
     }
}
