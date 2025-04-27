/*
____1
___22
__333
_4444
55555
*/
class patspace5 {
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
                System.out.print(i);
            }
        System.out.println();
        }
    }
    
}
