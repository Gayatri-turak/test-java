class perimid14 {
    public static void main(String[] args) {
        int n=5;
        for (int i =n ; i >=1; i--) 
        {
            for(int j=i;j<n;j++)
            System.out.print("_");
            for(int j=1;j<=i;j++)
            System.out.print(j);
            for(int j=i-1;j>=1;j--)
            System.out.print(j);
            System.out.println();
        }
            
    }
    
}
