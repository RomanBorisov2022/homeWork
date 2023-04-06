import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.addHuman(new Human("Иван", 'm'));
        Human human2 = new Human("Вася", 'f');
        human2.getFather();
        System.out.println(tree.getInfo());
        human2.addChild(new Human("Петя", 'm'));
        tree.addHuman(human2);
        System.out.println(tree.getInfo());
        tree.getByName("Иван").addChild(new Human("Лиза", 'f'));
        human2.getInfo();
        System.out.println(tree.getInfo());
    }
}