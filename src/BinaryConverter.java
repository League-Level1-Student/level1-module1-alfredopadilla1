import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField(20);
	JButton button = new JButton();

	public void createUI() {
		panel.add(textfield);
		panel.add(button);

		button.addActionListener((ActionListener) this);
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(200, 200);

	}

	public String convert(String input) {

		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}

	}

	public static void main(String[] args) {
		new BinaryConverter().createUI();

	}
public void actionPerformed(ActionEvent e) {
System.out.println(textfield.getText());

}
	
}