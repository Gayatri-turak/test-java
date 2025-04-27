/*
*
**
***
****
*****
****
***
**
*
*/
//using three time for loop
//if condition
//1-9(n*2-1)
//6-4(n*2-i)
//1-5 5-1 n-i+1
//6-2 i-n+1
class patterncontrol17
{
    public static void main(String[] args)
     {
        int n = 5;
        for(int i=1; i<=(n*2)-1; i++)
        {
            if(i<=n)
            {
                for(int j=i;j>=1;j--)
                   System.out.print("*");
            }
            else
            {
                for(int j=i;j<=(n*2)-1;j++)
                    System.out.print("*");

            }
            System.out.println();
        }
     }
 }

