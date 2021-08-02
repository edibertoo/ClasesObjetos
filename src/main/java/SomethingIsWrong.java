/* Codigo No Funcional
//Creamos una clase con el Nombre de SomethingIsWrong

public class SomethingIsWrong {
    public static void main(String[] args){
        //para hacer que nuestro programa funcione es necesario crear una clase llamada Rectangle
        //lo que significa que ninguna de nuestra variables que ocupamos no esta instaciada
        //No cuenta con un constructor

        //Rectangle myRect;
        //myRect.width = 40;
        //myRect.height = 50;

        // Especificamos un valor predetermiando
        System.out.println("myRect's area is " + my React());
    }
}


 */

//Codigo Funcional
public class SomethingIsWrong {

    //Declaramos Varibles
    int width = 0;
    int height = 0;
    float area = 0;

    //Constructor
    public SomethingIsWrong() {
    }

    //Formula para obtener Area
    public float getArea() {
        area = width * height;
        return area;
    }

    public static void main(String[] args) {


        SomethingIsWrong myRect = new SomethingIsWrong();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.getArea());
    }
}