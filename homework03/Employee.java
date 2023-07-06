package homework03;

public class Employee {

    private String name;
    private String secondName;
    private String patronymic;
    private  long  phoneNumber;

    public Employee(String secondName, String name, String patronymic, long phoneNumber) {
        this.name = name;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.phoneNumber = Math.abs(phoneNumber);
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public String toString() {
        return "<" + secondName + "><" + name + "><" + patronymic + "><" + phoneNumber + ">";
    }

}