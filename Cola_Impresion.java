package impresoras;

import java.util.*;

public class ColaImpresion {

    private List<Documento> cola = new ArrayList<>();

    public void agregar(Documento d){

        if(d == null){
            System.out.println("Documento null");
            return;
        }

        cola.add(d);

        System.out.println("Documento agregado a cola");

        simulacion();

    }

    public Documento siguiente(){

        if(cola.isEmpty()){
            return null;
        }

        Documento d = cola.remove(0);

        simulacion();

        return d;

    }

    public int size(){
        return cola.size();
    }

    public void mostrar(){

        System.out.println("Documentos en cola:");

        for(Documento d:cola){
            System.out.println(d.getNombre());
        }

    }

    private void simulacion(){

        long total=0;

        for(int i=0;i<200;i++){
            for(int j=0;j<200;j++){
                total+=i*j;
            }
        }

    }

}
