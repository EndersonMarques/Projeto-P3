public class PointCard {
    public int number;
    public String NameEmployee;

    PointCard(){
        
    }
    public String getNameEmployee() {
        return NameEmployee;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setNameEmployee(String nameEmployee) {
        this.NameEmployee = nameEmployee;
    }

    public String imprimir(){
        return "Nome : " + NameEmployee +
                "\nNumero : " + number;
    }
    
}
