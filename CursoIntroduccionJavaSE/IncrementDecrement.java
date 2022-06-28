package CursoIntroduccionJavaSE;

public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); //4
        
        lives--; //decrement
        System.out.println(lives); //3

        lives++; //Increment
        System.out.println(lives); //4

        //prefija
        // int gift = 100 + lives++; //postfijo
        int gift = 100 + ++lives; //prefijo
        System.out.println(gift);
        System.out.println(lives);

    }
}
