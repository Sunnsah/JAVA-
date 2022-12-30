import javax.swing.*;



public class javaApp {

    public static void main(String[] args) {

        // System.out.println("Hello bca students");

            JFrame frame = new JFrame("Example of java App");
            
            frame.setSize(800,500);
            JLabel lbl = new JLabel();
            ImageIcon icon = new ImageIcon("C:/Users/DELL/Desktop/java OOP/project/download.jpg");
            ImageIcon appicon = new ImageIcon("C:/Users/DELL/Desktop/java OOP/project/images.jpg");
            frame.setIconImage(appicon.getImage());

            lbl.setText("Namaste");
            lbl.setIcon(icon);
            JPanel p = new JPanel();
            p.add(lbl);
            frame.add(lbl);

            // frame.add(p);
            frame.setVisible(true);


            // JButton b=new JButton("click");//creating instance of JButton  
            // b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
          
            // frame.add(b);//adding button in JFrame  
          
            // frame.setSize(400,500);//400 width and 500 height  
            // frame.setLayout(null);//using no layout managers  
            // frame.setVisible(true);//making the frame visible  
        
    }
    
}
