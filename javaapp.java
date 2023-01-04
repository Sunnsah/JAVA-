import javax.swing.*;
public class javaapp {
    public static void main(String[] args){
        JFrame frame=new JFrame("Form App");

        JPanel p=new JPanel();
        // ImageIcon icon =new ImageIcon("C:/Users/DELL/Downloads/nims.jpg");
        // ImageIcon appIcon=new ImageIcon("C:/Users/DELL/Downloads/wp.jpg");
        
        // JLabel lbl= new JLabel("This is a house",icon,SwingConstants.HORIZONTAL);
        JLabel l = new JLabel("Name:");
        JLabel l2 = new JLabel("Address:");
        JLabel l3 = new JLabel("Age:");
        
        JTextField tf = new JTextField("Enter your name:");
        JTextField tf2 = new JTextField("Enter your Address:");
        JTextField tf3 = new JTextField("Enter your Age:");
        JPasswordField pw = new JPasswordField("Password");

        JCheckBox cb1 = new JCheckBox("Male");
        JCheckBox cb2 = new JCheckBox("Fe-male", true);
        JRadioButton rbt = new JRadioButton("Cricket");
        JRadioButton rbt1 = new JRadioButton("Football");
        JRadioButton rbt2 = new JRadioButton("Hockey");
        JTextArea ta = new JTextArea("I am a Bachelor of Computer Application Student");
        JButton btn = new JButton("Submit");

        // lbl.setText("Namaste ");
        l.setBounds(5, 100, 100, 30);
        l2.setBounds(5, 140, 100, 30);
        l3.setBounds(5, 180, 100, 30);
        
        tf.setBounds(100, 100, 200, 30);
        tf2.setBounds(100, 140, 200, 30);
        tf3.setBounds(100, 180, 200, 30);
        pw.setBounds(100, 215, 200, 30);
        cb1.setBounds(100, 255, 100, 30);
        cb2.setBounds(210, 255, 100, 30);
        rbt.setBounds(100, 350, 100, 30);
        rbt1.setBounds(100, 370, 100, 30);
        rbt2.setBounds(100, 480, 100, 30);
        ta.setBounds(100, 695, 200, 60);
        btn.setBounds(5, 800, 100, 30);
        // p.add(lbl);
        frame.add(p);
        // frame.setIconImage(appIcon.getImage());
        // frame.setSize(900,600);
        frame.add(l);
        frame.add(l2);
        frame.add(l3);
        frame.add(tf);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(pw);
        frame.add(ta);
        frame.add(btn);
        frame.add(cb1);
        frame.add(cb2);
        frame.add(rbt);
        frame.add(rbt1);
        frame.add(rbt2);
        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        

    }
}
 