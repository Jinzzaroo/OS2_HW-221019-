import java.awt.*;
import javax.swing.*;

public class Practice3 extends JFrame {

	Practice3() {
		setTitle("Ten Buttons Frame");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		for (int i = 0; i < 10; i++) {
			c.add(new JButton(i + ""));
		}
		setSize(700, 300);

	}

	public static void main(String[] args) {
		new Practice3();
	}

}