import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GEmuGUI implements ActionListener {
	
	public void createGUI() {
		JFrame fMain = new JFrame("The Gunjan Gauri Emulator");
		fMain.setSize(720, 480);
		fMain.setResizable(true);
		fMain.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		/**
		JButton start = new JButton("Start");
		start.addActionListener(new ActionListener());
		start.setActionCommand("start");
		fMain.add(start, BorderLayout.NORTH);
		
		JButton exit = new JButton("Exit");
		exit.addActionListener(new ActionListener());
		exit.setActionCommand("exit");
		fMain.add(exit, BorderLayout.NORTH);
		*/
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
	}
}
