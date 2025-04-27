/*15	13	10	6	1
	14	11	7	2
		12	8	3
			9	4
				5
*/
class countspace4
{
public static void main(String args[])
 {
   int n = 5;
   int count = (n * (n+1) )/2;
   for(int i = 1; i <= n; i++)
    {
       int c = count;
       for(int j = 1; j < i; j++)
       {
           System.out.print("  ");
       }
       for(int j = i; j <= n; j++)
       {
	  System.out.print(c+ "  ");
           c -= j+1;
       }
       System.out.println();
       count -= i;
    }
  }
}