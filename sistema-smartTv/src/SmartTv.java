public class SmartTv {
    private boolean ligada;
    private int canal;
    private int volume;


    public SmartTv(){
        this.ligada = false;
        this.canal = 3;
        this.volume = 10;
    }

    public SmartTv(boolean ligada, int canal, int volume){
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }
    
    public void ligar(){
        this.ligada = true;
    }
    public void desligar(){
        this.ligada = true;
    }
    public void aumentarVolume(){
        this.volume++;
    }
    public void diminuirVolume(){
        this.volume--;
    }
    public void aumentarCanal(){
        this.canal ++;
    }
    public void diminuirCanal(){
        this.canal--;
    }
    public void mudarCanal(int canal){
        this.canal = canal;
    }
    public void imprimir(){
        System.out.println("Tv: " +(ligada ? "ligada":"desligada"));
        System.out.println("Canal atual: "+this.canal);
        System.out.println("Volume atual "+this.volume);
    }

}
