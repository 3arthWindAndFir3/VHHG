
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NewClassLR4 implements ActionListener {
		
		JFrame okno2;
		JLabel text43;
        JLabel text44;
        JLabel text45;
			@Override
			public void actionPerformed(ActionEvent e) {
				
				okno2 = new JFrame("panel3");
				
				JPanel panel3 = new JPanel();
				
				text43=new JLabel ("Что такое GitHub?");
				text44=new JLabel ("GitHub — крупнейший веб-сервис для хостинга IT-проектов и их совместной разработки. ");
				text45=new JLabel ("Основан на системе контроля версий Git и разработан на Ruby on Rails и Erlang компанией GitHub, Inc. ");

				panel3.add(text43);
				panel3.add(text44);
				panel3.add(text45);
				okno2.add(panel3);

				okno2.setSize(640, 150);

				okno2.show();
				
			}

}
