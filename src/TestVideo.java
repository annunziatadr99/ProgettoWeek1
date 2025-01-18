public class TestVideo {
    public static void main(String[] args) {
        Video video= new Video("Pino Daniele - Sara non Piangere",5,6,7);
        System.out.println(video);
        video.play();
        for (int i = 0; i < 10; i++) {
            video.alzaLuminosita();
        }
        System.out.println(video);
        video.play();
        for (int i = 0; i < 10; i++) {
            video.abbassaLuminosita();
        }
        System.out.println(video);
        video.play();
        for (int i = 0; i < 13; i++) {
            video.abbassaVolume();
        }
        System.out.println(video);
        video.play();
        for (int i = 0; i < 13; i++) {
            video.alzaVolume();
        }
        System.out.println(video);
        video.play();
    }
}
