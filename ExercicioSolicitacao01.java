import javax.swing.JOptionPane;

public class ExercicioSolicitacao01{

    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite um numero"));
        int entrada = 0;
        if(numero < 0){
            JOptionPane.showMessageDialog(null, "Negativo");
        }else if( numero > entrada){
            JOptionPane.showMessageDialog(null, "positivo");
        }else if( numero <= 0){
            JOptionPane.showMessageDialog(null, "neutro");
        }

        }
        


    }
    
