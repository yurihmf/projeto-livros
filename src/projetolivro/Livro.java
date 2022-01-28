package projetolivro;

public class Livro {
    
   private String titulo;
   private String autor;
   private int anoPub;
   private String editora;

    public Livro(String ti, String au, int ap, String ed) {
        this.titulo = ti;
        this.autor = au;
        this.anoPub = ap;
        this.editora = ed;
    }
    
    
    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de publicação: " + anoPub + ", Editora: " + editora; 
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPub() {
        return anoPub;
    }

    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
   
   
}
