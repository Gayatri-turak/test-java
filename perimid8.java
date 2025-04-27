/*
____5
___454
__34543
_2345432
123454321
_2345432
__34543
___454
____5
*/
class perimid8 {
    public static void main(String[] args) 
     {
        int n=5;
        for (int i=n;i>=1;i--)
        {
            for(int j=i;j>1;j--)
            System.out.print("_");
            for(int j=i;j<=n;j++)
            System.out.print(j);
            for(int j=n-1;j>=i;j--)
            System.out.print(j);
            System.out.println();
        }
        for (int i=2;i<=n;i++)
        {
            for(int j=i;j>1;j--)
            System.out.print("_");
            for(int j=i;j<=n;j++)
            System.out.print(j);
            for(int j=n-1;j>=i;j--)
            System.out.print(j);
            System.out.println();
        }
    }
    
}
