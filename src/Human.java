import javax.xml.crypto.Data;
import java.io.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Human extends People {

    @Override
    public void save() {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("save.bin"));
        objectOutputStream.writeObject();
        objectOutputStream.close();
    }

    @Override
    public void read() {
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("read.bin"));
        Human human = (Human) objectInputStream.readObject();
        objectInputStream.close();
    }

    private String name;
    private Date birthDay;
    private Date deathDay;
    private Human mother;
    private Human father;
    private char gender;
    private List<Human> children;

    public boolean addChild(Human child) {
        if (!children.contains(child)){
            children.add(child);
            return true;
        }
        return false;
    }

    public Human(String name, char gender) {
        this.name = name;
        this.gender = gender;
        children = new ArrayList<>();
    }
    public Human(String name, char gender, Human mother, Human father) {
        this.name = name;
        this.father = father;
        this.mother = mother;
        this.gender = gender;
        children = new ArrayList<>();
    }

    public char getSex() {
        return gender;
    }

    public void setSex(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Пол: " + gender + " Дата рождения: " + birthDay + " Отец: " + father +
                " Мать: " + mother;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        } if (!(obj instanceof Human)){
            return false;
        }
        Human human = (Human) obj;
        return human.getName().equals(getName());
    }

    public String getMotherInfo(){
        String res = "Мать: ";
        if (mother != null) {
            res += mother.getName();
        } else {
            res += "Неизвестна";
        }
        return res;
    }

    public String getFatherInfo(){
        String res = "Отец: ";
        if (father != null) {
            res += father.getName();
        } else {
            res += "Неизвестен";
        }
        return res;
    }

    public String getChildrenInfo(){
        StringBuilder res = new StringBuilder();
        res.append("Дети: ");
        if (children.size() != 0) {
            res.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) {
                res.append(", ");
                res.append(children.get(i).getName());
            }
        } else {
            res.append("Отсутствует");
        }
        return res.toString();
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        sb.append("Имя: ");
        sb.append(name);
        sb.append(", ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        return sb.toString();
    }
}
