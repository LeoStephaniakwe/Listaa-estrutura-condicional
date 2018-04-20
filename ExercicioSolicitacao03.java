import javax.swing.JOptionPane;

public class ExercicioSolicitacao03{
    public static void main(String[] args){

        int valor1 = Integer.parseInt(JOptionPane.showInputDialog
        ("Digite um numero"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog
        ("Escolha mais um :D"));

        int operacao = Integer.parseInt(JOptionPane.showInputDialog
        ("                Menu \n1     Somar: \n2     Subtrair:\n3     Multiplicar: \n4     Dividir: "));
        
        if(operacao == 1){
            int soma = valor1 + valor2;
            JOptionPane.showMessageDialog(null, "Soma = "+ soma);
        }else if(operacao == 2){
            int subtrair = valor1 - valor2;
            JOptionPane.showMessageDialog(null, "Subtracao = " + subtrair);

        }else if(operacao == 3){
            int multiplicacao = valor1 * valor2;
            JOptionPane.showMessageDialog(null, "Multiplicacao = " + multiplicacao);
        }else if(operacao == 4){
            int divisao = valor1 / valor2;
            JOptionPane.showMessageDialog(null, "Divisao = ");
        }


    }

}