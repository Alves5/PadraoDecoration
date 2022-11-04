/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoration;

/**
 *
 * @author 1-2021221706
 */
public class MainBebida {
    public static void main(String args[]){
    Bebida bebida = new CafeAmargo();
    bebida.setSize(Bebida.Size.PEQUENO);
    System.out.println(bebida.getDescricao()+" - Tamanho: "+ bebida.getSize()+" - Preço: $ "+bebida.preco());
    
    Bebida bebida2 = new CafeDoce();
    bebida2.setSize(Bebida.Size.GRANDE);
    bebida2 = new Chantilly(bebida2);
    bebida2 = new Mel(bebida2);
    System.out.println(bebida2.getDescricao()+" - Tamanho: "+ bebida2.getSize()+" - Preço: $ "+bebida2.preco());
    
    Bebida bebida3 = new CafeAmargo();
    bebida3.setSize(Bebida.Size.MEDIO);
    bebida3 = new Leite(bebida3);
    bebida3 = new Chocolate(bebida3);
    System.out.println(bebida3.getDescricao()+" - Tamanho: "+ bebida3.getSize()+" - Preço: $ "+bebida3.preco());
    
    
  }
}
