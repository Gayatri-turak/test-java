class patterncontrol34 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2!=0)
                System.out.print((char)(j+64));
        else
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j%2!=0)
                System.out.print((char)(j+64));
        else
                System.out.print((char)(j+96));
            }
            System.out.println();
        }
    }
    
}

