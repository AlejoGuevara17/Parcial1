package src.Factorymethod;

public class JugueteCarrito implements Juguete, Cloneable{

    private String marca;
    private String color;

    private int numeropuertas;

    private long id;

    public JugueteCarrito(){}
    public JugueteCarrito(JugueteCarrito carrito){
        this.marca = carrito.marca;
        this.color = carrito.color;
        this.numeropuertas = carrito.numeropuertas;
    }

    private JugueteCarrito(String marca, String color, int numeropuertas) {
        this.marca = marca;
        this.color = color;
        this.numeropuertas = numeropuertas;
    }


    @Override
    public String toString() {
        return "JugueteCarrito{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", numeropuertas=" + numeropuertas +
                ", id=" + id +
                '}';
    }

    public static CarritoBuilder builder() {

        return new CarritoBuilder();
    }

    @Override
    public void color(String color) {
        this.color = color;
    }

    @Override
    public Juguete clone() {
        return new JugueteCarrito(this);
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public static class CarritoBuilder {
        private String marca;
        private String color;

        private int numeropuertas;

        private long id;

        public CarritoBuilder marca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarritoBuilder color(String color) {
            this.color = color;
            return this;

        }

        public CarritoBuilder numeropuertas(int numeropuertas) {
            this.numeropuertas = numeropuertas;
            return this;
        }

        public CarritoBuilder id(long id) {
            this.id = id;
            return this;
        }

        public JugueteCarrito build() {
            return new JugueteCarrito(marca, color, numeropuertas);
        }
    }
}







