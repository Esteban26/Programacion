package CursoIntroduccionJavaSE;

public class Casting {
    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        //cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimación
        int estimatedMonthlyDogs  = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

        double c = a/b;

        System.out.println(c);


    }
}
