package ch.hslu.saqt.refactoring.e_hide_delegate;

public class Person {
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static void main(String[] args) {
        Person person = new Person();
        // Wer ist der Manager dieser Person?
        person.getDepartment().getManager();
    }
}
