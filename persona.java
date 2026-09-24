public class persona { // CLASE PADRE (superclase). Tiene lo que es comun a todos.

    private String nombre; // private: ni siquiera la hija lo toca directo.

    public persona(String nombre) { // Constructor del padre.
        this.nombre = nombre; // 'this.nombre' es el atributo; 'nombre' es el parametro.
    }

    public String getNombre() { // Get: la hija lo usa para leer el nombre.
        return nombre;
    }

    public String saludar() { // Metodo del padre. La hija lo hereda sin escribirlo.
        return "Hola, soy " + nombre;
    }
}

// Juan Jose Zapata Gutierrez
// Manuel Davida Fernandez Bedoya