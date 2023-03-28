public class Human {
    private String name;
    private String birthDay;
    private String nameMother;
    private String nameFather;
    private char sex;
    public  Human(String name, String birthDay) {
        this.name = name;
        this.birthDay = birthDay;
        this.nameFather = getNameFather();
        this.nameMother = getNameMother();
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getNameMother() {
        return nameMother;
    }

    public void setNameMother(String nameMother) {
        this.nameMother = nameMother;
    }

    public String getNameFather() {
        return nameFather;
    }

    public void setNameFather(String nameFather) {
        this.nameFather = nameFather;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Пол: " + sex + " Дата рождения: " + birthDay + " Отец: " + nameFather + " Мать: " + nameMother;
    }
}
