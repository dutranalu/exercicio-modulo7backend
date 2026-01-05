public class Main {
    public static void main(String[] args) {

        Porta porta = new Porta(true);

        if (porta.isAberta()) {
            porta.abrir();
            porta.fechar();
        }
    }
}
