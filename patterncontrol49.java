class patterncontrol49{
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=(n*2)-1;i++)
        {
            if(i<=n)
            {
                for(int j=n-i+1;j>=1;j--)
                System.out.print(n-j+1);
                
            }
            else
            {
                for(int j=(n*2)-i;j<=n;j++)
                System.out.print(j);
                
            }
            System.out.println();
        }

    }
    
}
