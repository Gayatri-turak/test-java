public class patterncontrol35 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        
        }
    }
    
