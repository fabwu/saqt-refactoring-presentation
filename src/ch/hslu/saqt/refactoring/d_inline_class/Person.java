package ch.hslu.saqt.refactoring.d_inline_class;

public class Person {

    private String name;
    private TelephoneNumber officeTelephone = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return officeTelephone.getTelephoneNumber();
    }

    TelephoneNumber getOfficeTelephone() {
        return officeTelephone;
    }

}
