package br.com.zup.pessoa;

public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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


    @Override
    public String toString() {
       StringBuffer retorno = new StringBuffer();
       retorno.append("Nome da pessoa: " + nome);
       retorno.append("\nPeso da pessoa: " + peso);
       retorno.append("\nAltura da pessoa: " + altura);
       return retorno.toString();
    }
}
