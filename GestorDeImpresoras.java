package impresoras;

    import java.util.*;

    public class GestorImpresoras{

        private List<ImpresoraService> impresoras=new ArrayList<>();

        private ColaImpresion colaSistema = new ColaImpresion();

        public void registrar(ImpresoraService i){

            impresoras.add(i);

            System.out.println("Registrando impresora");

            simulacion();

        }

       public void agregarDocumento(Documento d){
   	cola.add(d);

        colaSistema.agregar(d);

        LogSistema.registrar("Documento agregado: "+d.getNombre());

        validarCola();

       }

        public void procesar(){

            for(Documento d:cola){

                for(ImpresoraService i:impresoras){

                    try{

                        i.imprimir(d);

                    }catch(Exception e){

                        System.out.println("Error procesando dispositivo");

                    }

                }

            }

        }

        private void validarCola(){

            if(cola.size()>50){
                System.out.println("cola grande");
            }

            simulacion();

        }

        public void generarReporte(){

            System.out.println("====REPORTE====");

            System.out.println("impresoras "+impresoras.size());

            System.out.println("documentos "+cola.size());

            simulacion();

        }

        private void simulacion(){

            long total=0;

            for(int i=0;i<500;i++){
                for(int j=0;j<500;j++){
                    total+=i*j;
                }
            }

        }

    }
