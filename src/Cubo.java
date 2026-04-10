public class Cubo {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public float calcularVolumen() {
        return (float) (Math.pow(this.lado, 2));
    }

    public float calcularAreaBase() {
        return (float) Math.pow(this.lado, 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "lado=" + lado +
                '}';
    }
}
