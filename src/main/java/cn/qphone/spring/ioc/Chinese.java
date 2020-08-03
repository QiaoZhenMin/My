package cn.qphone.spring.ioc;

public class Chinese extends Person {

    public Chinese() {}
    public Chinese(String name, int age, String feature) {
        setName(name);
        setAge(age);
        setFeature(feature);
    }

    @Override
    public void showinfo() {
        System.out.println(getName() + "今年" + getAge() + "岁， 特征是" + getFeature());
    }
}