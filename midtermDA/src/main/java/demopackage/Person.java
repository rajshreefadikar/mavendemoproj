package demopackage;

public class Person {
    public String validatePerson(String name, int id) {
        if ("ram".equals(name) && id == 3025) {
            return "Correct Input";
        } else {
            return "Incorrect Input";
        }
    }
}
