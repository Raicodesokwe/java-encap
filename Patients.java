package encap;

public class Patients {
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPat_no() {
        return pat_no;
    }

    public void setPat_no(int pat_no) {
        this.pat_no = pat_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private int pat_no;
}
