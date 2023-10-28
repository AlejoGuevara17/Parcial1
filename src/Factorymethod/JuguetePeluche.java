package src.Factorymethod;

public class JuguetePeluche implements Juguete, Cloneable{

    private String materialexterior;
    private String relleno;
    private String color;
    private int id;

    public JuguetePeluche(){}
    public JuguetePeluche(JuguetePeluche juguetePeluche){
        this.materialexterior = juguetePeluche.materialexterior;
        this.relleno = juguetePeluche.relleno;
        this.color = juguetePeluche.color;
    }
    public JuguetePeluche(String materialexterior, String relleno, String color){
        this.materialexterior= materialexterior;
        this.relleno= relleno;
        this.color=color;
    }

    public static PelucheBuilder builder(){
        return new PelucheBuilder();
   }

    @Override
    public String toString() {
        return "Juguete Peluche{" +
                "materialexterior='" + materialexterior + '\'' +
                ", relleno='" + relleno + '\'' +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }
    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Juguete clone() {
        return new JuguetePeluche(this);
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public static class PelucheBuilder{
        private String materialexterior;
        private String relleno;
        private String color;
        private Long id;

        public PelucheBuilder materialexterior(String materialexterior){
            this.materialexterior = materialexterior;
            return this;
        }

        public PelucheBuilder relleno(String relleno){
            this.relleno = relleno;
            return this;
        }
        public PelucheBuilder color(String color){
            this.color = color;
            return this;
        }
        public long getId() {
            return this.id;
        }
        public String getColor() {
            return this.color;
        }
        public PelucheBuilder id(Long id){
            this.id = id;
            return this;
        }
        public JuguetePeluche build() {
            return new JuguetePeluche( materialexterior, relleno, color);
        }
    }

}
