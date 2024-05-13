public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Sveiki susirinkę į java kursą! =)");
        int temperatura = 17;
        System.out.println(temperatura);
        temperatura = 19;
        System.out.println(temperatura);
        float price = 20.14F;// F...
        double koefecientas = 145.661564;
        byte age = 28;
        short salary = 4250;
        long  postsInfbTotal = 1646469451486146246L;// L....
        boolean isCold = true;
        boolean isHot = false;
        char letter = 'h';
        char number = '7';
        String name = "Naglis";

        if(5 > 3){
            System.out.println("tiesa");
        }else {
            System.out.println("netiesa");
        }

        if (5 > 3){
            System.out.println("daugiau");
        } else if (5 == 3) {
            System.out.println("lygu");
        }else{
            System.out.println("maziau");
        }

        if (true && true){//ir
            System.out.println("abu tiesa");
        }else{
            System.out.println("Bent vienas netiesa");
        }

        if (true || true){//arba
            System.out.println("bent vienas tiesa");
        }else{
            System.out.println("abu netiesa");
        }

        System.out.println( "labas " + " rytas");
        System.out.println( 5 + 10);
        System.out.println( 7 + " yra dazniausiai pasirenkamas skaicius");
        System.out.println( 3 + 4 + " yra dazniausiai pasirenkamas skaicius");
        System.out.println( " dazniausiai pasirenkamas skaicius yra " + 3 + 4 );
        System.out.println( " dazniausiai pasirenkamas skaicius yra " + (3 + 4) );

        System.out.println(Math.random());
        //nuo 0 iki 10
        System.out.println(Math.round( Math.random() * 10) );
        // nuo x iki y
        int min = 10;
        int max = 20;
        //           10  +                            0       *      10 = 0; = 10;
        //           10  +                      0.00      *  20 - 10;

        //           10  +                      0.99      *  10 = 9.9 ~ = 10; 10 + 10 = 20;
        //           10  +                      0.99      *  20 - 10;
        int result = min + (int) Math.round(Math.random() * (max - min));
        System.out.println(result);
        System.out.print("labas");
        System.out.print("labas");
        System.out.print("labas");
        System.out.print("labas");

//        5 < x < 8 // tik pitone
//        5 < x && x < 8 // visose kitose kalbose















    }
}