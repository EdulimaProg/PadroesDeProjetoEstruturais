package Adapter;

interface Vetor{
    int getPosX();
    int getPosY();
    int getLargura();
    int getAltura();
}
class Figura implements Vetor{
    private int posX,posY,largura,altura;

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public int getLargura() {
        return largura;
    }

    @Override
    public int getAltura() {
        return altura;
    }
}
class CaixaArraste{
    private Coordenada topoEsq, rodapeDir;

    public Coordenada getTopoEsq(){
        return topoEsq;
    }

    public Coordenada getRodapeDir() {
        return rodapeDir;
    }
}
class Coordenada{
    private int x, y;

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

}
// criar-se uma nova classe que implementa vetor
class CaixaArrasteAdapter implements Vetor{
    //objeto privado que chama a classe caixa arraste
    private CaixaArraste  caixaArraste = new CaixaArraste();

    @Override
    public int getPosX() {
        Coordenada c = caixaArraste.getTopoEsq();
        return c.getX();
    }

    @Override
    public int getPosY() {
        Coordenada c = caixaArraste.getTopoEsq();
        return c.getY();    }

    @Override
    public int getLargura() {
        Coordenada c1 = caixaArraste.getTopoEsq();
        Coordenada c2 = caixaArraste.getRodapeDir();

        return c2.getX() - c1.getX();
    }

    @Override
    public int getAltura() {
        Coordenada c1 = caixaArraste.getTopoEsq();
        Coordenada c2 = caixaArraste.getRodapeDir();

        return c2.getY() - c1.getY();
    }
}
public class Adp {
}
