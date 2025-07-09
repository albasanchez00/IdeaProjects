public class Coche {
    private String coche;
    enum Marca {
        AUDI,SEAT,BMW,OPEL,KIA,CITROEN;
        private Marca coche;

        public Marca getCoche() {
            return coche;
        }

        public void setCoche(Marca coche) {
            this.coche = coche;
        }
    }

    private String combustible;
    enum TipoCombustible{
        GASOLINA,GASOIL,ELECTRICO,HIBRIDO;
        private TipoCombustible combustible;

        public TipoCombustible getCombustible() {
            return combustible;
        }

        public void setCombustible(TipoCombustible combustible) {
            this.combustible = combustible;
        }
    }




}
