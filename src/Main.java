public class Main {
    public static void main(String[] args){
//4
        Persona persona1 = new Persona();
        persona1.setEdad(34);
        persona1.setNombre("Rodo");
        persona1.setTelefono(313215454);

        String nombre = persona1.getNombre();
        int edad = persona1.getEdad();
        int telefono = persona1.getTelefono();

        System.out.println("La persona es: " + nombre + " de unos " + edad + " y su telefono es: " + telefono);


    }


}
//1
class Persona{
    //2
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad(){
        return edad;
    }

    //3
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}