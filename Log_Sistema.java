package impresoras;

import java.util.*;

public class LogSistema {

    private static List<String> logs = new ArrayList<>();

    public static void registrar(String mensaje){

        String log = new Date()+" - "+mensaje;

        logs.add(log);

        if(logs.size()>1000){
            limpiar();
        }

    }

    public static void mostrar(){

        System.out.println("==== LOG SISTEMA ====");

        for(String l:logs){
            System.out.println(l);
        }

    }

    private static void limpiar(){

        logs = logs.subList(logs.size()-500, logs.size());

    }

}
