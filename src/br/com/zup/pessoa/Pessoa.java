package br.com.zup.pessoa;

public class Pessoa {
    private String nome;
    private int peso;
    private double altura;
    private double nivelCaloria;

    public Pessoa(String nome, int peso, double altura, double nivelCaloria) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.nivelCaloria = nivelCaloria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getNivelCaloria() {
        return nivelCaloria;
    }

    public void setNivelCaloria(double nivelCaloria) {
        this.nivelCaloria = nivelCaloria;
    }

    @Override
    public String toString() {
       StringBuffer retorno = new StringBuffer();
       retorno.append("Nome: " + nome);
       retorno.append("\nPeso: " + peso);
       retorno.append("\nAltura: " + altura);
       retorno.append("\nNivel de Caloria: " + nivelCaloria);
       return retorno.toString();
    }
}
