/*
____*
___***
__*****
_*******
*********
_*******
__*****
___***
____*
*/
class perimid1
{
    public static void main(String[] args)
    
    {
        int n=5;
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=i;j<n;j++)
                System.out.print("_");
                 for(int j=1;j<=(i*2)-1;j++)
                 System.out.print("*");  
              System.out.println();    
        }
        for(int i=n-1;i>=1;i--)
            {
                for(int j=i;j<n;j++)
                System.out.print("_");
                 for(int j=1;j<=(i*2)-1;j++)
                 System.out.print("*");  
              System.out.println();    
        }
     }
    }
}