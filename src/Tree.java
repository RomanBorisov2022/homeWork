import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tree implements Serializable{
    @Override
    public void save() {

    }

    @Override
    public void read() {

    }

    private List<Human> humans;

    public Tree(){
        this(new ArrayList<>());
    }
    private Tree(List<Human> humans){
        this.humans = humans;
    }

    public List<Human> getNameByBirthday(Date birthDay) {
        List<Human> res = new ArrayList<>();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getBirthDay() == birthDay) {
                res.add(humans.get(i));
            }
        }
        return res;
    }

    public boolean addHuman(Human human){
        if (human == null){
            return false;
        }
        if (!humans.contains(human)){
            humans.add(human);
            if(human.getFather() != null){
                human.getFather().addChild(human);
            }
            if(human.getMother() != null){
                human.getMother().addChild(human);
            }
            return true;
        }
        return false;
    }

    public Human getByName(String name){
        for (Human human: humans){
            if (human.getName().equals(name)){
                return human;
            }
        }
        return null;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("В дереве ");
        sb.append(humans.size());
        sb.append(" обьектов: \n");
        for(Human human: humans){
            sb.append(human.getInfo());
            sb.append("\n");
        }
        return sb.toString();
    }
}
