import human.Human;
import tree.Tree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        Human human1 = new Human("Иван", 'm');
        tree.addHuman(human1);
        Human human2 = new Human("Вася", 'f');
        human2.getFather();
        System.out.println(tree.getInfo());
        Human human3 = new Human("Гена", 'm');
        tree.addHuman(human3);
        Human human4 = new Human("John", 'm');
        tree.addHuman(human4);

        human2.addChild(new Human("Петя", 'm'));
        tree.addHuman(human2);
        System.out.println(tree.getInfo());

        tree.getByName(human1.getName()).addChild(new Human("Лиза", 'f'));
        human2.getInfo();
        System.out.println(tree.getInfo());

        tree.saveFile();
        Tree newTree = new Tree();
        newTree.readFile();
        System.out.println(newTree.getInfo());

        Tree iterablePeople = new Tree();
        Service service = new Service(iterablePeople);
        service.addHuman(human1.getName());
        service.addHuman(human2.getName());
        service.addHuman(human3.getName());
        service.addHuman(human4.getName());

//        Iterator<human.Human> iterator = tree.iterator();
//        while (iterator.hasNext()) {
//            human.Human human = iterator.next();
//            System.out.println(human);
//        }

        for (Human human: iterablePeople) {
            System.out.println(human);
        }
        System.out.println();
        service.sortByName();

        for (Human human: iterablePeople) {
            System.out.println(human);
        }
        System.out.println();
        service.sortById();

        for (Human human: iterablePeople) {
            System.out.println(human);
        }
    }
}
