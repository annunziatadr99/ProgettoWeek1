public class TestImmagine{
    public static void main(String[] args){
        Immagine immagine= new Immagine("Dario",5);
        System.out.println(immagine);
        immagine.show();
        for (int i = 0; i < 6; i++) {
            immagine.alzaLuminosita();

        }
        System.out.println(immagine);
        immagine.show();
        for (int i = 0; i < 11; i++) {
            immagine.abbassaLuminosita();

        }
        System.out.println(immagine);
        immagine.show();
    }
}
