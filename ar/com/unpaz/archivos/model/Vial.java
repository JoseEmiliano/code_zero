package ar.com.unpaz.archivos.model;

    public class Vial {

        private int idVial;
        private String descripcion;
        private int numero;
        private String ruta;
        private int km;


        public Vial (int idvial, String descripcion, int numero, String ruta, int km) {
            this.idVial = idvial;
            this.descripcion = descripcion;
            this.numero = numero;
            this.ruta = ruta;
            this.km = km;
        }



        public int getIdVial() {
            return idVial;
        }

        public void setIdVial(int idVial) {
            this.idVial = idVial;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public String getRuta() {
            return ruta;
        }

        public void setRuta(String ruta) {
            this.ruta = ruta;
        }

        public int getKm() {
            return km;
        }

        public void setKm(int km) {
            this.km = km;
        }



    }

