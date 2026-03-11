package impresoras;

    import java.util.*;

    public class Documento {

        private String nombre;
        private int paginas;
        private String contenido;
        private boolean confidencial;
        private Date fechaCreacion;

        public Documento(String nombre,int paginas,String contenido,boolean confidencial){
            this.nombre=nombre;
            this.paginas=paginas;
            this.contenido=contenido;
            this.confidencial=confidencial;
            this.fechaCreacion=new Date();
        }

        public String getNombre(){
            return nombre;
        }

        public int getPaginas(){
            return paginas;
        }

        public boolean esConfidencial(){
            return confidencial;
        }

        public int calcularPesoImpresion(){

            int peso=0;

            for(int i=0;i<paginas;i++){
                peso+=2;
            }

            if(confidencial){
                peso+=5;
            }

            return peso;
        }

        public void analizarContenido(){

            int palabras=contenido.split(" ").length;

            int caracteres=contenido.length();

            int lineas=contenido.split("\n").length;

            System.out.println("Analisis documento:");
            System.out.println("Palabras: "+palabras);
            System.out.println("Caracteres: "+caracteres);
            System.out.println("Lineas: "+lineas);

            simulacionCarga();
        }

        private void simulacionCarga(){

            long total=0;

            for(int i=0;i<500;i++){
                for(int j=0;j<500;j++){
                    total+=i*j;
                }
            }

            if(total==-1){
                System.out.println("nunca pasa");
            }
        }

        public void imprimirContenido(){

            System.out.println("=====CONTENIDO=====");

            for(String linea:contenido.split("\n")){
                System.out.println(linea);
            }

            System.out.println("===================");
        }

        public void calcularMetricasInutiles(){

            double promedio=0;

            for(int i=0;i<1000;i++){
                promedio+=Math.sqrt(i);
            }

            promedio/=1000;

            if(promedio>0){
                promedio+=Math.random();
            }

        }

    }
