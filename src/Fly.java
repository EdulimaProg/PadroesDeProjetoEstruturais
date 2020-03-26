interface Ervilha{
    void combinar();
    void setErvilhaPai(Ervilha ervilhaPai);
}
abstract class ErvilhaCombinada implements Ervilha {
    private Ervilha ervilhaPai = null;

    public ErvilhaCombinada(Ervilha ervilhaPai) {
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
class ErvilhaAmarela extends ErvilhaCombinada {

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
class ErvilhaVermelha extends ErvilhaCombinada {

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
class ErvilhaVerde extends ErvilhaCombinada {

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
class ErvilhaFlyWeight{
    private Ervilha [] pool = {
            new ErvilhaVerde(),
            new ErvilhaVermelha(),
            new ErvilhaAmarela()
    };

    public void mostrar(Ervilha ervilhaPai) {
        for (int i = 0; i < pool.length; i++){
            ervilhaPai.setErvilhaPai(pool[i]);
            ervilhaPai.combinar();
        }
    }
}
public class Fly {
    public static void main(String[] args) {
        new Fly().combinar();
    }
    public void combinar(){
        ErvilhaFlyWeight fly = new ErvilhaFlyWeight();

        fly.mostrar(new ErvilhaVerde());
        fly.mostrar(new ErvilhaVermelha());
        fly.mostrar(new ErvilhaAmarela());
    }
}
