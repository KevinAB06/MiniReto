package impresoras;

    public class Main{

        public static void main(String[] args){

            GestorImpresoras gestor=new GestorImpresoras();

            gestor.registrar(new ImpresoraMultifuncional("HP OfficeJet"));

            gestor.registrar(new ImpresoraBasica("Canon Basic"));

            Documento d1=new Documento("reporte",10,"contenido ejemplo",false);

            Documento d2=new Documento("contrato",5,"texto legal",true);

            gestor.agregarDocumento(d1);

            gestor.agregarDocumento(d2);

            gestor.procesar();

            gestor.generarReporte();

        }

    }
