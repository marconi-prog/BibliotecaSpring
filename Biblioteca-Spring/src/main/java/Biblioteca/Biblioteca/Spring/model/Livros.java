package Biblioteca.Biblioteca.Spring.model;


public class Livros {

    private long id;
    private String nome;
    private String autor;
    private Integer quantidade;

    public Livros(){
        this.autor = autor;
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public long getId() {
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}
