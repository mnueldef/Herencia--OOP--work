public class Estudiante extends persona { // CLASE HIJA. 'extends' = hereda todo lo publico de Persona.

        // Prueba de que tiene sentido: un Estudiante ES UNA Persona.

    private String programa; // Atributo PROPIO: solo el estudiante tiene programa.

    public Estudiante(String nombre, String programa) { // Constructor de la hija.
        super(nombre); // 'super' llama al constructor del padre. DEBE ir primero.
        this.programa = programa; // Despues guarda lo propio.
    }

    public String estudiar() { // Metodo PROPIO: el padre no lo tiene.
        return getNombre() + " estudia " + programa; // Usa getNombre(), que heredo de Persona.
    }
}

// Juan Jose Zapata Gutierrez
// Manuel Davida Fernandez Bedoya