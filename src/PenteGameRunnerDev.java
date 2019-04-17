import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class PenteGameRunnerDev {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int gWidth = 19*30;
        int gHeight = 19*30;
        int sbWidth = (int)(gWidth * 0.50);
        
        JFrame theGame = new JFrame("Play Pente!!");   
       
        theGame.setLayout(new BorderLayout());
        theGame.getContentPane().setBackground(Color.BLACK);
        //theGame.setResizable(false);

        theGame.setSize(gWidth +sbWidth, gHeight+20);
        theGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PenteScoreDev sb = new PenteScoreDev(sbWidth, gHeight);
        sb.setPreferredSize(new Dimension(sbWidth, gHeight));
        //sb.setMaximumSize(new Dimension(sbWidth, gHeight));
        Border sbBorder = BorderFactory.createLineBorder(Color.BLACK, 4, false);
        sb.setBorder(sbBorder);
        
        PenteGameBoardDev gb = new PenteGameBoardDev(gWidth, gHeight, sb);
        gb.setPreferredSize(new Dimension(gWidth, gHeight));
        Border gbBorder = BorderFactory.createLineBorder(Color.BLACK, 4, false);
        gb.setBorder(gbBorder);
        
        //Link the Score Panel to the gameboard
        sb.setPenteGameBoard(gb);
        
        theGame.add(gb, BorderLayout.CENTER);
        theGame.add(sb,  BorderLayout.EAST);
      
        theGame.setVisible(true); // this is how you see the initial display
        gb.startNewGame(true);  //true if this is a first game
        
        

    }

}
