public class ProxyUserAvatar implements UserAvatar{
    private RealUserAvatar realUserAvatar;
    private String fileName;

    public ProxyUserAvatar(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realUserAvatar == null){
            realUserAvatar = new RealUserAvatar(fileName);
        }
        realUserAvatar.display();
    }
}
