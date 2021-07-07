import java.util.Scanner;

public class Menu {
    public void init()
    {
        int op =0;
        Scanner scan = new Scanner(System.in);
       
        String Name, Adress, TypeEmployee;

    
        do{
            System.out.println("1 - Adcionar um empregado");
            System.out.println("2 - Remover um empregado");
            System.out.println("3 - Lançar um cartão de Ponto");
            System.out.println("4 - Lançar um Resultado de Venda");
            System.out.println("5 - Lançar uma taxa de serviço");
            System.out.println("6 - Alterar detalhes do empregado");
            System.out.println("9999 - Listar");
    
            op =  scan.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Digite um nome : ");
                    Name = scan.next();
                    System.out.println("Digite um endereço : ");
                    Adress = scan.next();
                    System.out.println("Digite um tipo : ");
                    TypeEmployee = scan.next();
                    Employee employee = new Employee(Name, Adress, TypeEmployee);
                    PointCard pc = new PointCard();
                    
                    ControllerEmployee.CreateNewEmployee(employee, pc);
                    ControllerEmployee.CreateNewPointCrad(pc, employee);
                break;

                case 2:
                    System.out.println("Digite o nome do Empregado : ");
                    Name = scan.next();
                    if(!ControllerEmployee.getListEmployees().isEmpty()){
                        if(ControllerEmployee.DeleteEmployee(Name))
                        {
                            System.out.println("Empregado " + Name + " Foi Removido");
                        }
                        else{
                            System.out.println("Empregado não encontrado");
                        }
                    }
                    else{
                        System.out.println("Lista Vazia");
                    }
                    
                break;
                
                case 3:

                break;
                
                case 4:

                break;
                
                case 5:

                break;

                case 6:
                    System.out.println("Digite o nome do empregado que deseja alterar");
                    Name = scan.next();
                    if(ControllerEmployee.Search(Name) != null){

                        Employee e = ControllerEmployee.Search(Name);

                        System.out.println("Digite o novo Tipo : ");
                        TypeEmployee = scan.next();
                        e.setTypeEmployee(TypeEmployee);
                        System.out.println("Digite o novo Endereço : ");
                        Adress = scan.next();
                        e.setAdress(Adress);
                        
                    }
                    else{
                        System.out.println("Funcionario não encontrado");
                    }

                break;
                
                case 9999:
                    System.out.println(ControllerEmployee.listar());
                break;

                case 9998:
                    System.out.println(ControllerEmployee.listar2());
                break;

                default:
                    System.out.println("Opcao Invalida");
                
            }
            
        }while(op != 0);
    }
}