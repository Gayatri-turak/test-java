 class logical {
    public static void main(String[] args) {
        System.out.println((10<11)&&(20>10));//t&&t=t other wise false
        //logical or
        System.out.println((false||true));// f||f=t
        System.out.println((false||false));// f||f=f
        System.out.println((true||true));// t||t=t 
        System.out.println((true||false));// t||f=t
        //logical not
        System.out.println(!(10<20));// f=t 
        System.out.println(!(true));// t=f
    }

    
}