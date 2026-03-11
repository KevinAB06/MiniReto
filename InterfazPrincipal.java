#Interfaz Principal (Mal diseñada)

    package impresoras;

    public interface ImpresoraService{

        void imprimir(Documento documento);

        void escanear(Documento documento);

        void enviarFax(String numero,Documento documento);

        void limpiarCabezal();

        void autodiagnostico();

        void calibrar();

        void actualizarFirmware();

        void sincronizarRed();

    }
