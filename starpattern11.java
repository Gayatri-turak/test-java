class starpattern11 
{
    public static void main(String[] args) 
    {
      int n=5;
      for(int i=n; i>=1; i--)
      {
        for(int j=i; j<=2*(n-1); j++)
            System.out.print(" ");
           {
          for(int j=1; j<=(2*i)-1; j++)
            {
            if(j==1 || j==(2*i)-1)
              System.out.print("*");
              else
                System.out.print("_");
            }
            System.out.println(); 
        }
    }
            
  }
}

      
    
    

