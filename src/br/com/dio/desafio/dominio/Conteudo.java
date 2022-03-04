package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private string titulo;
    private string descricao;

    public abstract double calcularXp();

    public string getTitulo() {
        return titulo;
    }

    public void setTitulo(string titulo) {
        this.titulo = titulo;
    }

    public string getDescricao() {
        return descricao;
    }

    public void setDescricao(string descricao) {
        this.descricao = descricao;
    }
}
