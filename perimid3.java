 /*
 ____1
___222
__33333
_4444444
555555555
1111111111
_22222222
__333333
___4444
____55
*/
class perimid3 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            System.out.print("_");
            for(int j=1;j<=i*2-1;j++)
            System.out.print(i);
            System.out.println();
        }
        for(int i=n-1;i>=1;i--)
        {
            for(int j=i;j<n;j++)
            System.out.print("_");
            for(int j=1;j<=i*2-1;j++)
            System.out.print(i);
            System.out.println();
        }
        
        
        
    }
    
}
