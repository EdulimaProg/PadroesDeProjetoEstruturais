interface SerSupremo{
    public String responder(String pergunta);
}
class SerSupremoReal implements SerSupremo{

    @Override
    public String responder(String pergunta) {
        return "Por que 42 é resposta pra tudo";
    }
}
class Intermediario implements SerSupremo{
    private SerSupremo real;

    public Intermediario() {
        real = new SerSupremoReal();
    }

    @Override
    public String responder(String pergunta) {
        return real.responder(pergunta);
    }
}
public class Proxy {
    public static void main(String[] args) {
        new Proxy().problema();
    }
    public void problema(){
        SerSupremo ser = new Intermediario();
        System.out.println(ser.responder("Qual sentido da vida"));
    }
}
