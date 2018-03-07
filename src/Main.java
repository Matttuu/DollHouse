public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        DollHouseSingleton instance = DollHouseSingleton.getInstance();
        DollHouseSingleton instance1 = DollHouseSingleton.getInstance();

        if (instance == instance1) {
            System.out.println("De to dollhouses er det samme sgu!");
        }
        else
        {
            System.out.println("De to dollhouses er sgu IKKE DET SAMME!");

        }

    }
}
