import javax.swing.JOptionPane;
public class ExercicioSolicitacao08{
    public static void main(String[] args){

        double preco1 = 0;
        double preco2 = 0;
        double preco3 = 0;
      

        String padaria1 = JOptionPane.showInputDialog(null,
         "Bolo  \nBolo Brigadeiro                              VALOR                           R$ 29,50" +
         " \nBolo Floresta Negra                      VALOR                           R$ 2,00"+
         " \nBolo Leite com Nutella                 VALOR                           R$ 29,23" +
         " \nBolo Mousse de Chocolate         VALOR                           R$ 7,10"+
         " \nBolo Nega Maluca                         VALOR                            R$ 19,33" +
         " \nBomba de Creme                          VALOR                           R$ 17,71" +
         " \nFilé-Mignon fritas e cheddar      VALOR                           R$ 4,82" +             
         " \nHambúrguer 4 Queijos                VALOR                           R$ 12,70" +
         " \nSanduíche Cheddar e salame   VALOR                           R$ 19,70" +
         " \nSanduíche de berinjela               VALOR                            R$ 28,22" +
         " \nPizza Napolitana                           VALOR                        R$ 8,98" ,
         "SISTEMA",

         JOptionPane.QUESTION_MESSAGE,
         null,
         new Object[]{"",
            "Bolo Brigadeiro",
            "Bolo Floresta Negra",
            "Bolo Leite com Nutella",
            "Bolo Mousse de Chocolate",
            "Bolo Nega Maluca",
            "Bomba de Creme",
            "Filé-Mignon fritas e cheddar",
            "Hambúrguer 4 Queijos",
            "Sanduíche Cheddar e salame",
            "Sanduíche de berinjela",
            "Pizza Napolitana"}, 

            ""
         
         )
         .toString();
         if(padaria1.equals("Bolo Brigadeiro")){
             preco1 = 29.50;
         }else if(padaria1.equals("Bolo Floresta Negra")){
             preco1 = 2.00;
         }else if(padaria1.equals("Bolo Leite com Nutella")){
             preco1 = 29.23;
         }else if(padaria1.equals("Bolo Mousse de Chocolate")){
             preco1 = 7.10;
         }else if(padaria1.equals("Bolo Nega Maluca")){
             preco1 = 19.33;
         }else if(padaria1.equals("Bomba de Creme")){
             preco1 = 17.71;
         }else if(padaria1.equals("Filé-Mignon fritas e cheddar")){
             preco1 = 4.82;
         }else if(padaria1.equals("Hambúrguer 4 Queijos")){
             preco1 = 12.70;
         }else if(padaria1.equals("Sanduíche de berinjela")){
             preco1 = 28.98;
         }else if(padaria1.equals("Pizza Napolitana")){
             preco1 = 8.98;
         }

        String padaria2 =JOptionPane.showInputDialog(null,
            "Bolo  \nBolo Brigadeiro                              VALOR                           R$ 29,50" +
            " \nBolo Floresta Negra                      VALOR                           R$ 2,00"+
            " \nBolo Leite com Nutella                 VALOR                           R$ 29,23" +
            " \nBolo Mousse de Chocolate         VALOR                           R$ 7,10"+
            " \nBolo Nega Maluca                         VALOR                            R$ 19,33" +
            " \nBomba de Creme                          VALOR                           R$ 17,71" +
            " \nFilé-Mignon fritas e cheddar      VALOR                           R$ 4,82" +             
            " \nHambúrguer 4 Queijos                VALOR                           R$ 12,70" +
            " \nSanduíche Cheddar e salame   VALOR                           R$ 19,70" +
            " \nSanduíche de berinjela               VALOR                            R$ 28,22" +
            " \nPizza Napolitana                           VALOR                        R$ 8,98" ,
            "SISTEMA",

            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{"",
                "Bolo Brigadeiro",
                "Bolo Floresta Negra",
                "Bolo Leite com Nutella",
                "Bolo Mousse de Chocolate",
                "Bolo Nega Maluca",
                "Bomba de Creme",
                "Filé-Mignon fritas e cheddar",
                "Hambúrguer 4 Queijos",
                "Sanduíche Cheddar e salame",
                "Sanduíche de berinjela",
                "Pizza Napolitana"
            }, "").toString();

        if(padaria2.equals("Bolo Brigadeiro")){
            preco2 = 29.50;
        }else if(padaria2.equals("Bolo Floresta Negra")){
            preco2 = 2.00;
        }else if(padaria2.equals("Bolo Leite com Nutella")){
            preco2 = 29.23;
        }else if(padaria2.equals("Bolo Mousse de Chocolate")){
            preco2 = 7.10;
        }else if(padaria2.equals("Bolo Nega Maluca")){
            preco2 = 19.33;
        }else if(padaria2.equals("Bomba de Creme")){
            preco2 = 17.71;
        }else if(padaria2.equals("Filé-Mignon fritas e cheddar")){
            preco2 = 4.82;
        }else if(padaria2.equals("Hambúrguer 4 Queijos")){
            preco2 = 12.70;
        }else if(padaria2.equals("Sanduíche de berinjela")){
            preco2 = 28.98;
        }else if(padaria2.equals("Pizza Napolitana")){
            preco2 = 8.98;
        }
        
        String padaria3 = JOptionPane.showInputDialog(null,
            "Bolo  \nBolo Brigadeiro                              VALOR                           R$ 29,50" +
            " \nBolo Floresta Negra                      VALOR                           R$ 2,00"+
            " \nBolo Leite com Nutella                 VALOR                           R$ 29,23" +
            " \nBolo Mousse de Chocolate         VALOR                           R$ 7,10"+
            " \nBolo Nega Maluca                         VALOR                            R$ 19,33" +
            " \nBomba de Creme                          VALOR                           R$ 17,71" +
            " \nFilé-Mignon fritas e cheddar      VALOR                           R$ 4,82" +             
            " \nHambúrguer 4 Queijos                VALOR                           R$ 12,70" +
            " \nSanduíche Cheddar e salame   VALOR                           R$ 19,70" +
            " \nSanduíche de berinjela               VALOR                            R$ 28,22" +
            " \nPizza Napolitana                           VALOR                        R$ 8,98" ,
            "SISTEMA",

            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[]{"",
                "Bolo Brigadeiro",
                "Bolo Floresta Negra",
                "Bolo Leite com Nutella",
                "Bolo Mousse de Chocolate",
                "Bolo Nega Maluca",
                "Bomba de Creme",
                "Filé-Mignon fritas e cheddar",
                "Hambúrguer 4 Queijos",
                "Sanduíche Cheddar e salame",
                "Sanduíche de berinjela",
                "Pizza Napolitana"
            }, "").toString();

        if(padaria3.equals("Bolo Brigadeiro")){
            preco3 = 29.50;
        }else if(padaria3.equals("Bolo Floresta Negra")){
            preco3 = 2.00;
        }else if(padaria3.equals("Bolo Leite com Nutella")){
            preco3 = 29.23;
        }else if(padaria3.equals("Bolo Mousse de Chocolate")){
            preco3 = 7.10;
        }else if(padaria3.equals("Bolo Nega Maluca")){
            preco3 = 19.33;
        }else if(padaria3.equals("Bomba de Creme")){
            preco3 = 17.71;
        }else if(padaria3.equals("Filé-Mignon fritas e cheddar")){
            preco3 = 4.82;
        }else if(padaria3.equals("Hambúrguer 4 Queijos")){
            preco3 = 12.70;
        }else if(padaria3.equals("Sanduíche de berinjela")){
            preco3 = 28.98;
        }else if(padaria3.equals("Pizza Napolitana")){
            preco3 = 8.98;
        }else{


        }  
        double total  = preco1 + preco2 + preco3;
            JOptionPane.showMessageDialog(null, 
                "Pedido 1: " + padaria1 + " R$ " + preco1 
                 + "\nPedido 2: " + padaria2 + " R$ " + preco2
                 + "\nPedido 3: " + padaria3 + " R$ " + preco3
                 + "\nTotal:R$ " + total,
                "Seu total foi: ", JOptionPane.INFORMATION_MESSAGE);        
    }
        
}

    
    

         
        
         
         

