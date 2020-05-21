import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewClassLR4 implements ActionListener {
		
		JFrame okno2;
        JLabel text44;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				okno2 = new JFrame("panel3");
				
				JPanel panel3 = new JPanel();
				
				text44=new JLabel ("Новое окно, появившееся благодаря созданию нового класса");
				
				JFrame win = new JFrame();
				win.setSize(new Dimension(100, 50));
				win.add(panel3);
				win.setVisible(false);

				panel3.add(text44);
				okno2.add(panel3);

				okno2.setSize(440, 80);

				okno2.show();
				
			}


}
