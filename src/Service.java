public class Service {
    private int id;
    private Tree tree;

    public Service(Tree tree) {
        this.tree = tree;
    }

    public void addHuman(String name) {
        tree.addHuman(new Human(++id, name));
    }
}
