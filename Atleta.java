package projeto.de.ed;

public class Atleta extends Pessoa{

    private String pais;
    private double altura;

    public Atleta(String nome, char sexo, String pais, double altura){
        super(nome, sexo);
        this.pais = pais;
        this.altura = altura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
