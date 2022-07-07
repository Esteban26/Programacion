package CursoIntroduccionJavaSE;

public class Funciones {
    public static void main(String[] args) {
        double y = 3;
        //area del circulo
        //pi * r2
        circleArea(y);

        //area de una esfera
        // 4 * pi * r2
        SphereArea(y);

        //volumen de una esfera
        //(4/3) * pi * r3
        SphereVolumen(y);

        System.out.println("PESOS A DOLARES: " + converToDolar(1000, "COP"));
    }

    /**
     * Given a radius, return the area of a circle with that radius.
     * 
     * @param r the radius of the circle
     * @return The area of a circle.
     */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Given a radius, return the area of a sphere with that radius.
     * 
     * @param r The radius of the sphere
     * @return The area of a sphere.
     */
    public static double SphereArea(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    /**
     * The function SphereVolumen takes a radius and returns a volume
     * 
     * @param r radius of the sphere
     * @return The volume of a sphere.
     */
    public static double SphereVolumen(double r) {
        return (4/3) * Math.PI * Math.pow(r, 3);
    }


    /**
     * DESCRIPTION: Función que especificando su moneda convierte una cantidad de dinero a dolares
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta MXN o COP
     * @return Devuelve al cantidad actualizada en dolares
     */
    public static double converToDolar(double quantity, String currency) {
        //MXN COP
        switch (currency){
            case "MXN":
                quantity *= 0.052;
                break;
            case "COP":
                quantity *= 0.00031;
                break;
        }
        return quantity;
    }
}
