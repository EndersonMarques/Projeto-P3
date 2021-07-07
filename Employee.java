public class Employee {
    //  Atributos
    //      - Nome, Endereço e Tipo de Funcionario !!
    
    private int Id;
    private String Name;
    private String Adress;
    private String TypeEmployee;
    private int PointCardNumber;

    //Construtores
    public Employee(){

    }

    public Employee(String Name, String Adress, String TypeEmployee){
        this.Name = Name;
        this.Adress = Adress;
        this.TypeEmployee = TypeEmployee;
    }
    
    //Metodos de Acesso - Getters - Setters
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name= Name;
    }
    //
    public String getAdress(){
        return Adress;
    }
    public void setAdress(String Adress){
        this.Adress= Adress;
    }
    //
    public String getTypeEmployee(){
        return TypeEmployee;
    }
    public void setTypeEmployee(String TypeEmployee){
        this.TypeEmployee= TypeEmployee;
    }
    //
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        this.Id = id;
    }
    //
    public void setPointCardNumber(int pointCardNumber) {
        this.PointCardNumber = pointCardNumber;
    }

    public String imprimir(){
        return  "Hash : " + Id +
                "\nNome : " + Name +
                "\nEndereço : " + Adress +
                "\nTipo : " + TypeEmployee;
    }
    
}
