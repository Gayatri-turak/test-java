/*
55555
4444
333
22
1
22
333
4444
55555
*/
class patterncontrol21
{
    public static void main(String[] args)
     {
        int n=5;
        for(int i=n;i>=1;i--)
         {
            for(int j=i;j>=1;j--)
            {
                if(i%2!=0)
            System.out.print(i);
         else
              System.out.print(i); 
            }
            System.out.println();
         }  
         for(int i=2;i<=n;i++)
         {
            for(int j=i;j>=1;j--)
            {
                if(i%2!=0)
            System.out.print(i);
         else
              System.out.print(i); 
            }
            System.out.println(); 
        }        
    }
}
