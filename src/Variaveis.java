public class Variaveis {
    private double peso;
    private double altura;

    public Double calcularImc() {
        return (this.getPeso() / (this.getAltura() * this.getAltura()));
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
