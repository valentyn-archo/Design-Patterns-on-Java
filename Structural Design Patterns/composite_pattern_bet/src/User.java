import java.util.ArrayList;

class User {
    private String name;
    private ArrayList includedBets = new ArrayList();

    public User(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includedBets.add(obj);
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + "----------------------------------------------------------------------\nUser: "
                + name + "\n----------------------------------------------------------------------");
        CompositeDemo.compositeBuilder.append("   ");
        for (Object obj : includedBets) {
            String name = obj.getClass().getSimpleName();
            if (name.equals("User")) {
                ((User)obj).ls();
            } else {
                ((Bet)obj).ls();
            }
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}