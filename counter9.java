/*
11	12	13	14	15
7	8	9	10
4	5	6
2	3
1
*/
class counter9
{
 public static  void main(String args[])
 {
  int n=5;
  int count=(n*(n-1)/2)+1;
  for(int i=n;i>=1;i--)//row
 	{ 
           int c = count;
           for(int j=1;j<=i;j++)//col
     	  {
	   System.out.print(c+" ");
           c++;
           }
         System.out.println();
         count-=i-1;
         }          
     }
}
