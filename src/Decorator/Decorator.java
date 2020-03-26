package Decorator;

interface Ervilha{
    void combinar();
    void setErvilhaPai(Ervilha ervilhaPai);
}
abstract class ErvilhaDecorator implements Ervilha{
    private Ervilha ervilhaPai = null;

    public ErvilhaDecorator(Ervilha ervilhaPai) {
        this.ervilhaPai = ervilhaPai;
    }

    @Override
    public void setErvilhaPai(Ervilha ervilhaPai) {
        this.ervilhaPai = ervilhaPai;
    }

    @Override
    public void combinar() {
        if (ervilhaPai != null){
           ervilhaPai.combinar();
           System.out.println(" X ");
        }else {
            System.out.println();
        }
    }
}
class ErvilhaAmarela extends ErvilhaDecorator{

    public ErvilhaAmarela(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }

    public ErvilhaAmarela() {
        super(null);
    }

    @Override
    public void combinar() {
        super.combinar();
        mostrarCor();
    }
    public void mostrarCor(){
        System.out.println("Ervilha Amarela");
    }
}
class ErvilhaVermelha extends ErvilhaDecorator{

    public ErvilhaVermelha(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }

    public ErvilhaVermelha() {
        super(null);
    }

    @Override
    public void combinar() {
        super.combinar();
        mostrarCor();
    }
    public void mostrarCor(){
        System.out.println("Ervilha Vermelha");
    }
}
class ErvilhaVerde extends ErvilhaDecorator{

    public ErvilhaVerde(Ervilha ervilhaPai) {
        super(ervilhaPai);
    }

    public ErvilhaVerde() {
        super(null);
    }

    @Override
    public void combinar() {
        super.combinar();
        mostrarCor();
    }
    public void mostrarCor(){
        System.out.println("Ervilha Verde");
    }
}
public class Decorator {
    public static void main(String[] args) {
        new Decorator().combine();
    }
    public void combine(){
        new ErvilhaVerde(new ErvilhaVermelha()).combinar();
        new ErvilhaAmarela(new ErvilhaVerde()).combinar();
        new ErvilhaAmarela().combinar();


    }
}
