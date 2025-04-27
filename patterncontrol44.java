/*
1
12
123
1234
12345
1234
123
12
1
*/
public class patterncontrol44 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<=i;j++)
                System.out.print(j);
            }
            else
            {
                for(int j=(n*2)-1;j>=i;j--)
                System.out.print(n*2-j);
            }
            System.out.println();
        }
    }
    
}
