import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.Persona;




public class BusquedaBinaria {
    
    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas ){
        this.personas= new ArrayList<>(personas);
    }

    public Integer findByName (String name){



        
        // ORDENADO → Nombre
        // personas.sort(

        personas.sort((persona1, persona2) ->
            persona1.getName().compareTo(persona2.getName()));
        //Comparaotr.
        //);



        //Busqueda binaria 
        //1. Definimos Limites
        //2. Definimos el bucle 
        //3. Calculamos mid
        
        int lo = 0;
        int hi = personas.size() - 1;

        while (lo <= hi){
            int mid = (lo + hi) / 2;



            //4. Preguntar si el [mid] es lo buscado

            if(personas.get(mid).getName().equals(name)){
                return mid;

            }

            //5. Actualizar limites
            //6.1 Verificar si es mayor o menor y escoger un lado 

            if(personas.get(mid).getName().compareTo(name) < 0){
                //5.2 Actualiza el limite  XXXX
                lo = mid + 1;
            } else {
                //5.2 Actualiza el limite YYYYY
                hi = mid -1;
            }

        }
        
        return -1;
    



    }

    
    public int findByAge(int age){

        personas.sort(Comparator.comparing(Persona::getAge));
        int lo = 0;
        int hi= personas.size()-1;
        while (lo <= hi){
            int mid = (lo + hi) / 2;



            //4. Preguntar si el [mid] es lo buscado

            if(personas.get(mid).getAge() == age){
                return mid;

            }

            //5. Actualizar limites
            //6.1 Verificar si es mayor o menor y escoger un lado 

            if(personas.get(mid).getAge() < age){
                //5.2 Actualiza el limite  XXXX
                lo = mid + 1;
            } else {
                //5.2 Actualiza el limite YYYYY
                hi = mid -1;
            }
        }

        return -1;
    }}
    
    


        
    

    
    
    
