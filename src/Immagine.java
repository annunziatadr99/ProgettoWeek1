public class Immagine extends Multimediale implements Luminosita {
 private int luminosita;

 public Immagine(String titolo, int luminosita){
     super(titolo);
     this.luminosita = luminosita;
 }

    @Override
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
public void show(){
    System.out.println(getTitolo()+ " " + "-".repeat(luminosita));}

public String toString(){
    return "Titolo dell'immagine: " + getTitolo() + "- Luminosita" + luminosita;
}
}


