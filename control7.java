class control7
{
    public static void main(String args[])
   {
    int a=20, b=30, c=10, d=90, e=400 ;
    String result=(a>b)?(a>c)?(a>d)?(a>e)?"a is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger":(c>d)?(c>e)?"c is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger":(b>c)?(b>d)?
(b>e)?"b is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger":(c>d)?(c>e)?"c is bigger":"e is bigger":(d>e)?"d is bigger":"e is bigger";
System.out.println(result);    
   }
}

