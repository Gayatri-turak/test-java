
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
class pcs11 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<n)
            {
                for (int j=i;j<n;j++)
                System.out.print("_");
                for(int j=1;j<=i;j++)
                System.out.print(i);
            }
            else
            {
                for(int j=i;j>n;j--)
                System.out.print("_");
                for(int j=1;j<=(n*2)-i;j++)
                System.out.print(n*2-i);
            }
            System.out.println();
        }
        
    }
}
