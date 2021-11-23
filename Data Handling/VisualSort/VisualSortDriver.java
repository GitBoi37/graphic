package VisualSort;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class VisualSortDriver extends JFrame{
	private static final long serialVersionUID = 1L;
	public VisualSort(){
        initUI();
    }
    private void initUI(){
        add(new Visual());
        pack();
        setResizable(false);
        pack();
        setTitle("Dear god... so many rectangles");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args){
        EventQueue.invokeLater(() -> { 
            JFrame ex = new VisualSort();
            ex.setVisible(true);
        });
    }
}
