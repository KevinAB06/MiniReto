package impresoras;

    import java.util.*;

    public class ImpresoraMultifuncional implements ImpresoraService{

        private String modelo;
        private int tinta=100;
        private int impresiones=0;
        private List<String> logs=new ArrayList<>();

        public ImpresoraMultifuncional(String modelo){
            this.modelo=modelo;
        }

        public void imprimir(Documento documento){

            registrarLog("Inicio impresion");

            validarDocumento(documento);

            prepararImpresion(documento);

            ejecutarProcesoImpresion(documento);

            finalizarImpresion(documento);

        }

        private void validarDocumento(Documento d){

            if(d==null){
                throw new RuntimeException("Documento null");
            }

            if(d.getPaginas()<=0){
                System.out.println("Documento sin paginas");
            }

            if(d.esConfidencial()){
                registrarLog("Documento confidencial");
            }

            d.analizarContenido();
        }

        private void prepararImpresion(Documento d){

            System.out.println("Preparando impresion...");

            if(tinta<10){
                System.out.println("Advertencia tinta baja");
            }

            simulacionPesada();

        }

        private void ejecutarProcesoImpresion(Documento d){

            for(int p=0;p<d.getPaginas();p++){

                System.out.println("Imprimiendo pagina "+(p+1));

                for(int i=0;i<200;i++){
                    for(int j=0;j<200;j++){
                        int x=i*j;
                    }
                }

            }

            tinta-=d.getPaginas();

            impresiones++;

        }

        private void finalizarImpresion(Documento d){

            System.out.println("Documento impreso "+d.getNombre());

            registrarLog("Documento impreso");

        }

        private void registrarLog(String log){

            logs.add(new Date()+" "+log);

        }

        private void simulacionPesada(){

            long total=0;

            for(int i=0;i<400;i++){
                for(int j=0;j<400;j++){
                    total+=i*j;
                }
            }

            if(total==-1){
                System.out.println("never");
            }

        }

        public void escanear(Documento documento){

            System.out.println("Escaneando documento");

            documento.analizarContenido();

            simulacionPesada();

        }

        public void enviarFax(String numero,Documento documento){

            System.out.println("Preparando fax");

            validarNumero(numero);

            documento.calcularMetricasInutiles();

            simulacionPesada();

            System.out.println("Fax enviado");

        }

        private void validarNumero(String n){

            if(n==null||n.isEmpty()){
                System.out.println("numero invalido");
            }

            if(n.length()<5){
                System.out.println("numero sospechoso");
            }

        }

        public void limpiarCabezal(){

            System.out.println("Limpiando cabezal");

            simulacionPesada();

        }

        public void autodiagnostico(){

            System.out.println("Iniciando diagnostico");

            simulacionPesada();

            simulacionPesada();

        }

        public void calibrar(){

            System.out.println("Calibrando");

            simulacionPesada();

        }

        public void actualizarFirmware(){

            System.out.println("Actualizando firmware");

            simulacionPesada();

            simulacionPesada();

        }

        public void sincronizarRed(){

            System.out.println("Sincronizando red");

            simulacionPesada();

        }

    }
