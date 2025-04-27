/*
____1
___212
__32123
_4321234
543212345
_4321234
__32123
___212
____1
*/
class perimid5 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for(int j=i;j<n;j++)
            System.out.print("_");
            for(int j=i;j>=1;j--)
            System.out.print(j);
            for(int j=2;j<=i;j++)
            System.out.print(j);
            System.out.println();

        }
        for (int i = n-1; i >=1; i--) 
        {
            for(int j=i;j<n;j++)
            System.out.print("_");
            for(int j=i;j>=1;j--)
            System.out.print(j);
            for(int j=2;j<=i;j++)
            System.out.print(j);
            System.out.println();
        }
    }
}
