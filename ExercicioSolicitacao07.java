import javax.swing.JOptionPane;
public class ExercicioSolicitacao07{
    public static void main(String[] args){

int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero:"));
 


if(numero == 0){
    JOptionPane.showMessageDialog(null, "Esse numero é neutro!!");
}else if(numero % 2 == 0){
    JOptionPane.showMessageDialog(null, "Esse numero é par!");

}else if(numero % 2 != 0){
    JOptionPane.showMessageDialog(null, "Esse numero é impar!");

}if(numero >= 1){
    JOptionPane.showMessageDialog(null, "Esse numero é positivo!");
}else if(numero <= 0){
    JOptionPane.showMessageDialog(null, "Numero negativo!");
}if(numero > 10){
    JOptionPane.showMessageDialog(null, "Esse numero é maior que 10!");
}if(numero <= 50){
    JOptionPane.showMessageDialog(null, "Esse numero é menor que 50!");
}if(numero < -10){
    JOptionPane.showMessageDialog(null, "Esse numero é menor que -10!");
}if(numero >= 30){
    JOptionPane.showMessageDialog(null, "Maior ou igual a 30!");

}if(numero != 1){
    JOptionPane.showMessageDialog(null, "Esse numero é diferente de 1!");


}
}
}




    



