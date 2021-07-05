public class Employee {
    String name;
    String address;
    double timeCard;

    Employee(String name, String address, double timeCard){
        this.name = name;
        this.address = address;
        this.timeCard = timeCard;
    }

    String printEmployeeInfo(){
        return "Name: " + this.name +
                "\nAddress : " + this.address +
                "\nTime Card: " + this.timeCard;
    }
}
