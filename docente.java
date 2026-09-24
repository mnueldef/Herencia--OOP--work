public class docente extends persona {
    private String Materia; 

    public docente(String nombre, String Materia) { 
        super(nombre); 
        this.Materia = Materia; 
    }

    public String Clase() { 
        return getNombre() + " El profe da esta materia:  " + Materia; 
    }
}
// Juan Jose Zapata Gutierrez
// Manuel Davida Fernandez Bedoya
