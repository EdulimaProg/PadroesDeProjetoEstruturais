enum Categoria{
    PROMOCIONAL,
    LANCAMENTO,
    NORMAL
}
class CD{
    private float preco;

    public CD(Categoria categoria) {
        switch (categoria){
            case PROMOCIONAL: preco = 9.99f;
            case LANCAMENTO: preco = 29.99f;
            case NORMAL: preco = 19.99f;
        }
    }
    public float getPreco(){
        return preco;
    }
}
class Cliente {
    private short comprar;
    private short alugar;

    public void addComprar(){
        this.comprar++;
    }

    public void addAlugar() {
        this.alugar++;
    }

    @Override
    public String toString() {
        return "[Cliente] compras: " + this.comprar + " aluguel " + this.alugar;
    }
}
class Gravadora{
    private float repasse;

    public void setRepasse(float repasse) {
        this.repasse = repasse;
    }

    @Override
    public String toString() {
        return "[Gravadora] repasse : " + this.repasse;
    }
}

class RNFacade{
    private Cliente cliente;
    private Gravadora gravadora;

    public RNFacade() {
        cliente = new Cliente();
        gravadora = new Gravadora();
    }

    public void comprar(Categoria c){
        CD cd = new CD(c);
        cliente.addComprar();
        System.out.println(cliente.toString());
        gravadora.setRepasse(cd.getPreco() * 0.5f);
        System.out.println(gravadora.toString());
    }
    public void alugar(Categoria c){
        CD cd = new CD(c);
        cliente.addAlugar();
        System.out.println(cliente.toString());
        gravadora.setRepasse(cd.getPreco() * 0.4f);
        System.out.println(gravadora.toString());
    }

}

public class Facade {
    RNFacade rn = new RNFacade();
    public static void main(String[] args) {
        new Facade().trabalhar();
    }
    public void trabalhar(){
        rn.comprar(Categoria.NORMAL);
        rn.alugar(Categoria.NORMAL);
        rn.comprar(Categoria.PROMOCIONAL);
        rn.alugar(Categoria.PROMOCIONAL);
        rn.comprar(Categoria.LANCAMENTO);
        rn.alugar(Categoria.LANCAMENTO);
    }
}
