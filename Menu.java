import java.util.Scanner;

public class Menu {
    public void init()
    {
        int op =0;
        Scanner scan = new Scanner(System.in);

        String Name, Adress;
        TypeEmployee Type = new TypeEmployee();

    
        do{

            

            System.out.println("1 - Adcionar um empregado");
            System.out.println("2 - Remover um empregado");
            System.out.println("3 - Lançar um cartão de Ponto");
            System.out.println("4 - Lançar um Resultado de Venda");
            System.out.println("5 - Lançar uma taxa de serviço");
            System.out.println("6 - Alterar detalhes do empregado");
    
            op =  scan.nextInt();
            
            switch(op){
                case 1:
                    Name = scan.nextLine();
                    Adress = scan.nextLine();
                    // Type = scan.nextLine();
                    Employee employee = new Employee(Name, Adress, Type);
                break;

                case 2:

                break;
                
                case 3:

                break;
                
                case 4:

                break;
                
                case 5:

                break;

                case 6:

                break;
                
                default:
                    System.out.println("Opcao Invalida");
                
            }
            
        }while(op != 0);
    }
}