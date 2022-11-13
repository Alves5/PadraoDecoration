/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoration;

/**
 *
 * @author 1-2021221706
 */
public class CafeDoce extends Bebida{

    public CafeDoce(){
        descricao = "Café doce";
    }
    
    @Override
    public Double preco() {
         switch (size) {
            case GRANDE:
                return 1.99 + 0.70;
            case MEDIO:      
                return 1.99 + 0.40;
            default:
                return 1.99;
        }
    }
    
}
