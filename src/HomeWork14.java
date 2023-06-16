public class HomeWork14 {

    static class Person {
        public String personInfo(String firstName, String secondName, String city, int phoneNumber) {
            return "Зателефонувати громадянинові " + firstName + " " + secondName + " з міста " + city + " можна за номером " + phoneNumber + ".";
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        System.out.println(person1.personInfo("Will", "Smith", "New York", 12345367));
        System.out.println(person2.personInfo("Jackie", "Chan", "Shanghai", 376583265));
        System.out.println(person3.personInfo("Sherlock", "Holmes", "London", 3765325));
    }
}
