import javax.swing.JOptionPane;
public class ExercicioSOlicitacao09{
    public static void main(String[] args){

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Digite um numero: "));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Digite o segundo numero: "));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Digite o terceiro numero: "));
        int numero4 = Integer.parseInt(JOptionPane.showInputDialog
        (null, "Digite o ultimo numero: "));

        if(numero1 == numero2 && numero3 == numero4 && numero1 == numero3){
            JOptionPane.showMessageDialog(null, "Essa condicao é valida!!");
        }else{
            JOptionPane.showMessageDialog(null, "Essa condicao é invalida");
            
        }

    
    }
}


        
    
