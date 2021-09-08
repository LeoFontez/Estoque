
package application;

import entities.Product;
import java.util.Scanner;

import entities.Product;

public class Program {
    
    public static void main(String[] args) {
        

Scanner sc = new Scanner(System.in);
    
    Product product = new Product();
    
        System.out.println("Dados do Produto: ");
        System.out.println("Nome: ");
        product.name = sc.nextLine();
        System.out.println("Preço: ");
        product.price = sc.nextDouble();
        System.out.println("Quantidade no estoque: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println("Dados do Produto " + product);
        
        System.out.println();
        System.out.println("Entre com a quantidade dos produtos a serem adicionados ao estoque: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        
        System.out.println();
        System.out.println("Dados atualizados: " + product);
        
        System.out.println();
        System.out.println("Entre com a quantidade dos produtos a serem retirados do estoque: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        
        System.out.println();
        System.out.println("Dados atualizados: " + product);
    
    }
}