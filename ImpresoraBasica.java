package impresoras;

    public class ImpresoraBasica implements ImpresoraService{

        private String modelo;
        private int impresiones;

        public ImpresoraBasica(String modelo){
            this.modelo=modelo;
        }

        public void imprimir(Documento documento){

            documento.analizarContenido();

            for(int i=0;i<documento.getPaginas();i++){
                System.out.println("Imprimiendo pagina "+i);
                simulacion();
            }

            impresiones++;

        }

        public void escanear(Documento documento){

            simulacion();

            throw new UnsupportedOperationException("No scanner");

        }

        public void enviarFax(String numero,Documento documento){

            simulacion();

            throw new UnsupportedOperationException("No fax");

        }

        public void limpiarCabezal(){

            simulacion();

        }

        public void autodiagnostico(){

            simulacion();

        }

        public void calibrar(){

            simulacion();

        }

        public void actualizarFirmware(){

            simulacion();

        }

        public void sincronizarRed(){

            simulacion();

        }

        private void simulacion(){

            long total=0;

            for(int i=0;i<300;i++){
                for(int j=0;j<300;j++){
                    total+=i*j;
                }
            }

        }

    }
