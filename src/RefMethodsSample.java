import java.util.Arrays;

public class RefMethodsSample {

    public static void sayStaticHello() {
        System.out.println("Hey!!! i'am a static hello!");
    }

    public void sayInstanceHello() {
        System.out.println("Hey!!! i'am a instance hello");
    }

    public static void main(String[] args) {
        // Referencia a metodo estatico
        IHello sayStaticHello = RefMethodsSample::sayStaticHello;
        sayStaticHello.sayHello();

        // Referencia a un constructor
        IHello hello = Hello::new;
        hello.sayHello();

        //RefMethodsSample refSample = RefMethodsSample::new;

        // Referencia a un metodo interno de la instancia
        RefMethodsSample refSample = new RefMethodsSample();
        IHello sayInstanceHello = refSample::sayInstanceHello;
        sayInstanceHello.sayHello();

        //Referencia a un método de un objeto arbitrario
        String[] names = new String[]{"Oscar", "Alex", "Maria", "Samuel", "Perla", "Fausto"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println("Hey!!! i'am a ordered array " + Arrays.toString(names));
    }
}
