public class TestAudio {
    public static void main(String[] args) {
        Audio audio = new Audio("Che soddisfazione", 4,7);
        System.out.println(audio);
        audio.play();
        for (int i = 0; i < 10; i++) {
            audio.alzaVolume();

        }
        System.out.println(audio);
        audio.play();
        for (int i = 0; i < 13; i++) {
            audio.abbassaVolume();

        }
        System.out.println(audio);
        audio.play();
    }
}
