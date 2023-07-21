public class ControleRemoto implements Controlador {

    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //métodos especiais
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    private int getVolume(){
        return this.volume;
    }
    private void setVolume(int v){
        this.volume = v;
    }
    private boolean getLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }
    private boolean getTocando(){
        return this.tocando;
    }
    private void setTocando(boolean t){
        this.tocando = t;
    }

    // métodos abstratos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado() == true){
            this.setVolume(getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() == true && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() == true && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() == true && !(this.getTocando())){
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if(this.getLigado() == true && (this.getTocando())){
            this.setTocando(false);
        }
    }
}
