package Application;

public class Restauracao extends Servico{

    String denteTratado;

    public Restauracao(String descricao, double preco, String denteTratado) {
        super(descricao, preco);
        this.denteTratado = denteTratado;
    }
}
