class new8 {
    public static void main(String[] args) {
        int n=5;
        int count=(n*(n-1)/2)+1;
        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<=n;j++)
            {
                System.out.print(count+"    "); 
                count-=i+1;

            }
            System.out.println();
        }

    }
    
}
