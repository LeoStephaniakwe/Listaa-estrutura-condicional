import javax.swing.JOptionPane;
public class ExercicioSolicitacao08{
    public static void main(String[] args){

        double preco1 = 0;
        double preco2 = 0;
        double preco3 = 3;

        String Padaria = JOptionPane.showInputDialog(null,
         "Bolo  \nBolo Brigadeiro                              VALOR                          | R$ 29,50" +
         " \nBolo Floresta Negra                      VALOR                         | R$ 2,00"+
         " \nBolo Leite com Nutella                 VALOR                       | R$ 29,23" +
         " \nBolo Mousse de Chocolate         VALOR                          | R$ 7,10"+
         " \nBolo Nega Maluca                         VALOR                           | R$ 19,33" +
         " \nBomba de Creme                          VALOR                              | R$ 17,71" +
         " \nFilé-Mignon fritas e cheddar      VALOR                                 | R$ 4,82" +             
         " \nHambúrguer 4 Queijos                VALOR                    | R$ 12,70" +
         " \nSanduíche Cheddar e salame    VALOR                  | R$ 19,70" +
         " \nSanduíche Vegetariano de berinjela          VALOR                 | R$ 28,22" +
         " \nPizza Napolitana                            VALOR                        | R$ 8,98" ,
        "sISTEMA",

         JOptionPane.QUESTION_MESSAGE,
         null,
         new Object[]{
            "Bolo Brigadeiro",
            ""

         }, "").toString();
    
      

        
         
      

        }
   
    }

