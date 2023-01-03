package ec.edu.pucem;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;

public class EventFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public EventFrame() {
		setTitle("Demostración del uso de eventos en JAVA");
		setSize(600, 440);
		Container contenido = getContentPane();
		contenido.add(new ButtonPanel());

	}
}

class ButtonPanel extends JPanel implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JButton redButton;
	private JButton greenButton;
	private JButton blueButton;

	public ButtonPanel() {
		redButton = new JButton("Rojo");
		greenButton = new JButton("Verde");
		blueButton = new JButton("Azul");
		this.add(redButton);
		this.add(greenButton);
		this.add(blueButton);
		redButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		Color color = getBackground();
		if (source == redButton) {
			color = Color.RED;
			JDialog d = new JDialog();
			JLabel l = new JLabel("Este es un diálogo");
			d.add(l);
			d.setSize(400, 100);
			d.setVisible(true);

		} else if (source == greenButton)
			color = Color.GREEN;
		else if (source == blueButton)
			color = Color.BLUE;
		this.setBackground(color);
		repaint();
	}
}