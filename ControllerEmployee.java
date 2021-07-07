import java.util.ArrayList;

public class ControllerEmployee {

    
    private static ArrayList<Employee> ListEmployees = new ArrayList<>();
    private static ArrayList<PointCard> ListPointCard = new ArrayList<>();
    private static int Id = 0;
    private static int number = 1000;
    
    
    //Método GET
    public static ArrayList<Employee> getListEmployees(){
        return ListEmployees;
    }
    
    //Metodo de Criação - Cria um novo Cartão de Ponto
    public static void CreateNewPointCrad(PointCard pc, Employee e){
        number++;
        ListPointCard.add(pc);
        pc.setNumber(number);
        pc.setNameEmployee(e.getName());
    }

    //Metodo de Criação - Adciona um novo Employee
    public static void CreateNewEmployee(Employee e, PointCard pc){
        Id++;
        ListEmployees.add(e);
        e.setId(Id);
        e.setPointCardNumber(pc.getNumber());
    }

    public static boolean DeleteEmployee(String Name){

        for(Employee e: ListEmployees){
            if(e.getName().equalsIgnoreCase(Name)){
                ListEmployees.remove(e);
                for(PointCard pc: ListPointCard){
                    if(pc.getNameEmployee().equalsIgnoreCase(Name)){
                        ListPointCard.remove(pc);
                        return true;
                    }
                }
            }
        }
        
        return false;
        
    }
    public static Employee Search(String Name){
        
        for(Employee e: ListEmployees){
            if(e.getName().equalsIgnoreCase(Name))
            {
                return e;
            }
        }
        
        return null;
    }

    public static String listar(){
        String saida = "";

        for(Employee e: ListEmployees){
            saida += "\n*==*==*==*==*==*==*==*==*==*==*==*==*==*==\n";
            saida += e.imprimir() + "\n";
        }

        return saida;
    }
    public static String listar2(){
        String saida = "";

        for(PointCard pc: ListPointCard){
            saida += "\n*==*==*==*==*==*==*==*==*==*==*==*==*==*==\n";
            saida += pc.imprimir() + "\n";
        }

        return saida;
    }



}
