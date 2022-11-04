/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoration;

/**
 *
 * @author 1-2021221706
 */
public class Mel extends BaseDecoracao{

   public Mel(Bebida bebida){
        this.bebida = bebida;
    }
    
    
    @Override
    public Double preco() {
       return bebida.preco()+ 0.50;
    }

    @Override
    public String getDescricao() {
       return bebida.getDescricao()+ ", Mel";
    }
    
}
