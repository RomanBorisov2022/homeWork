import java.util.ArrayList;
import java.util.List;

public class Tree {
    private List<Human> humans;

    public Tree(){
        this(new ArrayList<>());
    }
    private Tree(List<Human> humans){
        this.humans = humans;
    }

    public List<Human> getNameByBirthday(String birthDay) {
        List<Human> res = new ArrayList<>();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getBirthDay() == birthDay) {
                res.add(humans.get(i));
            }
        }
        return res;
    }
}
