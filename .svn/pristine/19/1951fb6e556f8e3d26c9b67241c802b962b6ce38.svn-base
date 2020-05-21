import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.AffineTransformOp;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ButtonAction implements ActionListener {
	
static JFrame okno1;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		okno1 = new JFrame("panel2");
		
		JPanel panel = new JPanel();
		
		String Path = "src/mnemo.png";
		Image img = null;
		File f;
		f = new File(Path);
		try {
		img = ImageIO.read(f);
		} catch(IOException ioe) {
		JOptionPane.showConfirmDialog(null, "что-то не так!\n" + ioe.toString(),
		"Error!", JOptionPane.PLAIN_MESSAGE);
		System.exit(0);
		}
		Image scaledImg = img.getScaledInstance(600, 450, AffineTransformOp.TYPE_BILINEAR);
		JLabel picLabel = new JLabel(new ImageIcon(scaledImg));
		
		panel.add(picLabel);
		
		JFrame win = new JFrame();
		win.setSize(new Dimension(100, 50));
		win.add(panel);
		win.setVisible(false);

		okno1.add(panel);

		okno1.setSize(640, 500);

		okno1.show();
		
	}

}
