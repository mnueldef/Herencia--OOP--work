
public class main {                                  // El archivo DEBE llamarse Main.java.

    public static void main(String[] args) {         // Punto de entrada: aqui arranca el programa.

        Estudiante e = new Estudiante("Ana", "Ingenieria de Software"); // Crea una hija.

        System.out.println(e.saludar()); // HEREDADO: Estudiante nunca escribio saludar().
        System.out.println(e.estudiar()); // PROPIO: solo existe en Estudiante.

        docente d = new docente("Juan Jose", "Calculo Integral");
        System.out.println(d.saludar());
        System.out.println(d.Clase());
    }
}