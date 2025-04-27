/*
*****
_*__*
__*_*
___**
____*
*/
class starpattern8
 {
    public static void main(String[] args)
     {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            System.out.print("_");
          {
            for(int j=i;j>=1;j--)
            {
                if(j==i||j==1||i==n)
                System.out.print("*");
                else
                System.out.print("_");
            }
            System.out.println();
          }
        
        }
     }
}
