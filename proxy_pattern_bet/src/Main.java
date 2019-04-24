public class Main {

    public static void main(String[] args) {
        UserAvatar userAvatar = new ProxyUserAvatar("valik.jpg");

        userAvatar.display();
        System.out.println("");

        userAvatar.display();
    }
}
