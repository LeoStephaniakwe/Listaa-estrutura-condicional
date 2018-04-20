import javax.swing.JOptionPane;

public class ExercicioSolicitacao02{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite um numero"));
        int entrada = 1;
        if(numero < 1){
            JOptionPane.showMessageDialog(null, "Negativo");
        }else if( numero > entrada){
            JOptionPane.showMessageDialog(null, "positivo");

        }
        


    }
    
}
