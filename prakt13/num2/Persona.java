package prakt13.num2;
class Person {
    private String name;
    private String surname;
    private String middleName;
    public Person(String surname, String name, String middleName) {
        this.name = surname;
        this.surname = surname;
        this.middleName = middleName;
    }
    public String getFormattedName() {
        StringBuilder formattedName = new StringBuilder();
        formattedName.append(surname);
        if (name != null && !name.isEmpty()) {
            formattedName.append(" ").append(name.charAt(0)).append(".");
        }
        if (middleName != null && !middleName.isEmpty()) {
            formattedName.append(" ").append(middleName.charAt(0)).append(".");
        }
        return formattedName.toString();
    }
    public static void main(String[] args) {
        Person person1 = new Person("Иванов", "Иван", "Иванович");
        System.out.println(person1.getFormattedName());
        Person person2 = new Person("Петров", "Петр", null);
        System.out.println(person2.getFormattedName());
    }
}