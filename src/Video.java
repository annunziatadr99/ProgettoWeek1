public class Video extends Multimediale implements Riproduttore,Volume,Luminosita {
    private int durata;
    private int luminosita;
    private int volume;

    public Video(String titolo, int durata,int luminosita, int volume){
        super(titolo);
        this.durata= durata;
        this.luminosita= luminosita;
        this.volume= volume;
    }

    public int getDurata(){
        return durata;
    }
    public void abbassaLuminosita() {
        if (this.luminosita> 0){
            this.luminosita--;
        }else{
            System.out.println("Luminosità al minimo");
        }

    }
    public  void alzaLuminosita(){
        if(this.luminosita < 10){
            this.luminosita++;
        }else {
            System.out.println("Luminosità al massimo");

        }

}
    public void alzaVolume(){
        if (this.volume > 0){
            this.volume--;

        }else{
            System.out.println("Volume al minimo");}
    }

    public void abbassaVolume(){
        if (this.volume < 10){
            this.volume++;

        }else{
            System.out.println("Volume al massimo");}
    }
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume) + " *".repeat(luminosita));
        }
    }

    public String toString(){
        return "Video-- titolo= " + getTitolo() + "/ durata= " + durata + "/ volume" + volume + "/ luminosita=" + luminosita;
    }
}
