import javax.swing.JOptionPane;
public class ExercicioSolicitacao06{
    public static void main(String[] args){

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        if(numero == 1 ){
            JOptionPane.showMessageDialog(null,"Esse numero não é diferente");

        }else if(numero != 1){
            JOptionPane.showMessageDialog(null, "Esse numero é diferente");
        }
        }
        
    }
