/*
ABCDE
_BCDE
__CDE
___DE
____E
*/
public class patspace11 {
    public static void main(String args[])
    {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            {
                System.out.print("_");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
    
}


