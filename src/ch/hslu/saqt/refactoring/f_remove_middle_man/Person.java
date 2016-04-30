package ch.hslu.saqt.refactoring.f_remove_middle_man;

public class Person {
    Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return department.getManager();
    }

    public static void main(String[] args) {
        Person person = new Person();
        // Wer ist der Manager dieser Person?
        person.getManager();
    }
}
