public class Main {
    public static void main(String[] args) {

        //se crea objeto de la clase cliente
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        //se le da valor a las propiedades
        cliente.edad = 31;
        cliente.nombre = "Karen";
        cliente.telefono = 123456;
        cliente.setCredito("Tiene credito");
        trabajador.setSalario(1500);

        //mostrar por pantalla
        System.out.println("Cliente: " + (cliente.nombre));
        System.out.println("Edad: " + (cliente.edad));
        System.out.println("Numero de telefono: " + (cliente.telefono));
        System.out.println("Cuenta con credito: " + cliente.getCredito());
        System.out.println("$" + trabajador.getSalario());
    }
}
// crear clase Persona con las variables edad, nombre, telefono
class Persona{
    int edad;
    String nombre;
    int telefono;

    //Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
    //esta nueva clase tendrá la variable credito solo para esa clase
}

class Cliente extends Persona {
    private String credito;

    public void setCredito (String credito){
        this.credito = credito;
    }
    public String getCredito (){
        return this.credito;
    }
}

class Trabajador extends Persona{
    private int salario;

    public void setSalario (int salario){
        this.salario = salario;
    }
    public int getSalario (){
        return this.salario;
    }
}
