public class Porta {

    private boolean aberta;

    // Construtor
    public Porta(boolean aberta) {
        this.aberta = aberta;
    }

    // Getter
    public boolean isAberta() {
        return aberta;
    }

    // Setter
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public void abrir() {
        this.aberta = true;
        System.out.println("Porta Aberta");
    }

    public void fechar() {
        this.aberta = false;
        System.out.println("Porta Fechada");
    }
}
