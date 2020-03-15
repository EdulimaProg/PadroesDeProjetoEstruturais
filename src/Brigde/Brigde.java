package Brigde;
//para evitar acesso a os metodos get e set da classe livro
//criar-se uma classe @BrigdePublicação
abstract class BrigdePublicacao{
    private Publicacao publicacao;

    public BrigdePublicacao(Publicacao publicacao) {
        this.publicacao = publicacao;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }
}

abstract class Publicacao{
// eu chamei ela dentro da classe publicaçã
    private BrigdePublicacao brigdePublicacao;

//criar-se get e set
    public BrigdePublicacao getBrigdePublicacao() {
        return brigdePublicacao;
    }

    public void setBrigdePublicacao(BrigdePublicacao brigdePublicacao) {
        this.brigdePublicacao = brigdePublicacao;
    }
}
class LivroImpl extends Publicacao{
    private String titulo;
    private String autor;

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
}
// criar um classe de chamada
class Livro extends BrigdePublicacao{
//implementa um construtor para enviar  a classe livroimpl,

    public Livro(String titulo, String autor) {
        super (new LivroImpl());
        ((LivroImpl)getPublicacao()).setTitulo(titulo);
        ((LivroImpl)getPublicacao()).setAutor(autor);
    }

    @Override
    public String toString() {
        return ((LivroImpl)getPublicacao()).getTitulo() + " De " +
                ((LivroImpl)getPublicacao()).getAutor();
    }
}
public class Brigde {
    public static void main(String[] args) {
        new Brigde().publicar();
    }
    public void publicar(){
        Livro livro = new Livro("Deixando de Ser noob", "Eduardo Lima");
        System.out.println(livro.toString());
    }
}
