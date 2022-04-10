import java.util.Scanner;
public class DesafioJava {
    public static void main(String[] args) {
        Scanner leitor= new Scanner(System.in);
        System.out.println(" BEM VINDO AO SISTEMA SIMCITY");
        System.out.println("CADASTRE SEUS SALARIOS");
        System.out.println();
        System.out.println();
                
        double[] salarios= cadastrosalario(12);        
        String nome="";
        String profissao="";
        
        while(true){
            System.out.println("DIGITE 1 PARA CADASTRAR NOME E PROFISSÃO");
            System.out.println("DIGITE 2 PARA VISUALIZAR SEUS SALARIOS");
            System.out.println("DIGITE 3 PARA VISUALIZAR OS IMPOSTOS DE SEUS SALARIOS");
            System.out.println("DIGITE 4 PARA VISUALIZAR NOME E PROFISSAO DO  USUARIO");
            System.out.println("DIGITE 5 PARA SAI DO SISTEMA");
            int opcao= leitor.nextInt();
            leitor.nextLine();
            if(opcao==1){
                System.out.println("DIGITE SEU NOME");
                nome=leitor.nextLine();
                System.out.println("DIGITE SUA PROFISSAO");
                profissao=leitor.nextLine();              
            }
            else if(opcao==2){
                System.out.println();
                System.out.println();
                System.out.println("SALARIOS DOS MESES");
                for(int i = 0; i<salarios.length;i++){
                    System.out.println("SALARIO "+(i+1)+" : "+salarios[i]);
                }
                System.out.println();
                System.out.println();
                
            }
            else if(opcao==3){
                System.out.println("ESSES SAO SEUS IMPOSTOS");
                calcimposto(salarios);
                System.out.println();
                System.out.println();
                
            }
            else if(opcao==4){
                System.out.println("NOME: "+nome);
                System.out.println("PROFISSAO: "+profissao);
            }
            else if(opcao==5){
                System.exit(0);
            }
            else{
                System.out.println("OPÇÃO INVALIDA");
                System.out.println();
                System.out.println();
                
            }
        } 
        
    }
    public static double[] cadastrosalario(int num){
        Scanner leitor= new Scanner(System.in);
        double[] salario= new double[num];

        for(int i = 0; i<salario.length;i++){
            System.out.println("Digite o salario "+(i+1));
            salario[i]=leitor.nextDouble();
        }
        return salario;
    }

    public static void calcimposto(double[]salario){
        double[]imposto= new double[salario.length];
        for (int i=0;i<salario.length;i++){
            if (salario[i] <= 2000.00) {
                imposto[i] = 0.00;
            } else if (salario[i] <= 3000.00) {
                imposto[i] = salario[i] * 8 / 100;
            } else if (salario[i] <= 4500.00) {
                imposto[i] = salario[i] * 18 / 100;
            } else {
                imposto[i] = salario[i] * 28 / 100;
            }
            System.out.println("IMPOSTO REFERENTE AO MES "+ (i+1)+ ": "+ imposto[i]);
        }
    }
}