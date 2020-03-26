package Composite;

import java.util.ArrayList;
import java.util.List;

abstract class MenuComponente{
    private String link;
    private String descricao;

    public MenuComponente(String descricao, String link) {
        this.descricao = descricao;
        this.link = link;

    }
    @Override
    public String toString() {
       if (link != null){
           return "\t" + descricao + " - " + link ;
       }
       return descricao;
    }
    public abstract void print();
}
class MenuItem extends MenuComponente{

    public MenuItem(String link, String descricao) {
        super(descricao, link);
    }

    @Override
    public void print() {
        System.out.println(super.toString());
    }
}
class Menu extends MenuComponente{
    private List<MenuComponente> componentes;

    public Menu(String descricao) {
        super(descricao, null );
        componentes = new ArrayList<MenuComponente>();
    }
    public void add(MenuComponente componente){
        componentes.add(componente);
    }
    @Override
    public void print() {
        System.out.println(">> "+ super.toString());
        for (MenuComponente c: componentes){
            c.print();
        }
    }
}
public class Comp {
    public static void main(String[] args) {
        new Comp().montarMenu();
    }
    public void montarMenu(){
        Menu parte = new Menu("Parte 1");
        parte.add(new MenuItem("Item 1", "Evento 1"));
        parte.add(new MenuItem("Item 1", "Evento 1"));

        Menu parte2 = new Menu("Parte 2");
        parte2.add(new MenuItem("Item 3", "Evento 3"));
        parte2.add(new MenuItem("Item 4", "Evento 4"));

        Menu principal = new Menu("Menu Principal");
        principal.add(parte);
        principal.add(parte2);

        principal.print();
    }
}
