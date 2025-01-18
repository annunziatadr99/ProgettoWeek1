 class Audio extends Multimediale implements Riproduttore, Volume {
    private int durata;
    private int volume;


    public  Audio(String titolo, int durata, int volume){
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }

    public int getDurata(){
        return this.durata;
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

public void play(){
    for (int i = 0; i < durata; i++) {
        System.out.println(this.getTitolo()+ " " + "!".repeat(volume));
    }
}
public String toString(){
        return "Audio--Titolo: "+ this.getTitolo() + "durata=" + durata +"/ volume= " + volume;
}
}


