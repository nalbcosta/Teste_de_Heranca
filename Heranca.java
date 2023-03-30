/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heranca;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;
        
/**
 *
 * @author 1212111173
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa ps = new Pessoa();
        Fisica fs = new Fisica();
        Juridica jr = new Juridica();
        int escolha = 0;
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("-------------------------------------");
        System.out.println("Informe o tipo de pessoa: ");
        System.out.println("1- Jurídica \n 2- Física \n 0- Sair");
        escolha = sc.nextInt();
        while (escolha != 0){
            if (escolha == 1){
                System.out.println("Informe o nome: ");
                sc = new Scanner(System.in);
                String nome = sc.nextLine();
                ps.setNome(nome);
                System.out.println("Informe o endereço: ");
                sc = new Scanner(System.in);
                String endereco = sc.nextLine();
                ps.setEndereco(endereco);
                System.out.println("Informe o telefone: ");
                sc = new Scanner(System.in);
                String telefone = sc.nextLine();
                ps.setTelefone(telefone);
                
                
            }
        }
        
        
        
    }
    
}
