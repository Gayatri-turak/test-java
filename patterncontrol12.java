/*
12345
22345
33345
44445
55555
*/
class patterncontrol12
 {
    public static void main(String[] args)
     {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
            if(i>j)
            System.out.print(i);
            else
            System.out.print(j);

             }
        System.out.println();
         }
     }
}   
