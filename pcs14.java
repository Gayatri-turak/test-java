class pcs14 {
    public static void main(String[] args) 
    
    {
        int n = 5;
        for (int i = 1; i <= (n * 2) - 1; i++)
         {
            if (i <= n)
             {
                for (int j = i; j > 1; j--)
                    System.out.print("_");
                for (int j = i; j <= n; j++)
                {
                    if(i%2==0)
                    System.out.print(i-n+1+64);
                    else
                    System.out.print(i-n+1+96);        
        }
            } 
            else
             {
                for (int j = i; j < (n * 2); j++)
                    System.out.print("_");
                for (int j = i; j >= n; j--)
                    {
                        if(i%2==0)
                        System.out.print(i-n+1+64);
                        else
                        System.out.print(i-n+1+96);        
                   }
                }
            System.out.println();
        }
    }
}


