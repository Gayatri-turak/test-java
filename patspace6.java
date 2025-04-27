/*
____1
___21
__321
_4321
54321
*/
class patspace6 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("_");
            }
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
        System.out.println();
        }
    }
    
}
