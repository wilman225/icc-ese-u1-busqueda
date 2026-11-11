import java.util.List;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        List <Persona> personas = List.of(
            new Persona("Juan", 20, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("Diego", 25, "M"),
            new Persona("Ana", 35, "F")
        );


        BusquedaBinaria bB= new BusquedaBinaria(personas);
        int resultado = bB.findByName("Ana");
        

        if(resultado>=0 ){
            System.out.println("Se encontro en la posicion= " + resultado);
        } else{
            System.out.println("No se encontro");
        } 

        int res= bB.findByName("Pedro");
        //Operador Ternario
        //cond ? accion TRUE :: accion FALSE

        System.out.println(res >=0 ? "Se encontro en la pos=" + res: "No se encontro nada ");

        int res2 = bB.findByAge(25);

        System.out.println(res2 >=0 ? "Se encontro en la pos=" + res2: "No se encontro nada ");








    }

    // 1. BUSQUE UNA PERSONA con nombre "Maria"
    // RETORNE LA PERSONA SI LA ENCONTRO
    // 2. BUSQUE UNA PERSONA con nombre "Diego"
    // RETORNE LA PERSONA SI LA ENCONTRO
    // 3. BUSQUE UNA PERSONA con nombre "Ana"
    // Imprima la posicion de la persona si la encontro
    
    public static void searchPersonas(List<Persona> personas) {
        BusquedaLineal busqueda = new BusquedaLineal(personas);

        // 1. Buscar "Maria"
        Persona maria = busqueda.FindByName("Maria");
        if (maria != null) {
            System.out.println("Encontrado: " + maria);
        } else {
            System.out.println("Maria no encontrada.");
        }

        // 2. Buscar "Diego"
        Persona diego = busqueda.FindByName("Diego");
        if (diego != null) {
            System.out.println("Encontrado: " + diego);
        } else {
            System.out.println("Diego no encontrado.");
        }

        // 3. Buscar "Ana" y obtener su posición
        int posAna = busqueda.FindPosByNamePos("Ana");
        if (posAna != -1) {
            System.out.println("Ana encontrada en la posición: " + posAna);
        } else {
            System.out.println("Ana no encontrada.");
        }
    }

}
