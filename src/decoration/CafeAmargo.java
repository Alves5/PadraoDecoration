/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decoration;

/**
 *
 * @author 1-2021221706
 */
public class CafeAmargo extends Bebida{
    Bebida bebida;
    
    public CafeAmargo(){
        descricao = "Café amargo";
    }
    
    @Override
    public Double preco() {
       switch (size) {
            case GRANDE:
                return 1.23 + 3;
            case MEDIO:      
                return 1.23 + 2;
            default:
                return 1.23;
        }
    }
    
}
