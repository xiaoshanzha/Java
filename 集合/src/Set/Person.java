package Set;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age*31;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj){
            return true;
        }
        if(obj == null){
            return false;
        }

        if(obj instanceof Person){
            Person p = (Person)obj;
            return name.equals(p.name) && age == p.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return name+" is " + age ;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
