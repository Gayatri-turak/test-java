/*
____5
___444
__33333
_2222222
111111111
_2222222
__33333
___444
____5
*/class perimid2 
{
    public static void main(String[] args)
     {
        int n=5;
        {
            for (int i=n;i>=1;i--)
            {
                for(int j=i;j>1;j--)
                    System.out.print("_");
                    for(int j=1;j<=((n-i+1)*2)-1;j++)
                    System.out.print(i);
            System.out.println();
                }
for (int i=2;i<=n;i++)
                {
                    for(int j=i;j>1;j--)
                        System.out.print("_");
                        for(int j=1;j<=((n-i+1)*2)-1;j++)
                        System.out.print(i);
                System.out.println();
                    }

            }
        }
        
    }
    

