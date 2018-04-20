import javax.swing.JOptionPane;

public class ExercicioSolicitacao05{
    public static void main(String[] args){

        int valor = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite um numero:"));

        if(valor % 2 ==0){
            JOptionPane.showMessageDialog(null, "Legal o numero é par");

        }else if(valor % 2!= 0){
            JOptionPane.showMessageDialog(null, "Esse numero é impar jovem!!");
        }else if(valor == 0){
            JOptionPane.showMessageDialog(null, "Zero é neutro");
        }
    
        }


}            
