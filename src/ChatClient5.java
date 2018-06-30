import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient5 extends Frame{

    TextField tfTxt = new TextField();
    TextArea taContext = new TextArea();

    public static void main(String[] args){
        ChatClient5 cc = new ChatClient5();
        cc.launchFrame();
    }

    public void launchFrame(){
        setLocation(400,300);
        setSize(300,300);
        add(taContext, BorderLayout.NORTH);
        add(tfTxt,BorderLayout.SOUTH);
        pack();
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        tfTxt.addActionListener(new TFListener());
        setVisible(true);
    }

    private class TFListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String s = tfTxt.getText().trim();
            taContext.setText(s); //set Text into TextArea
            tfTxt.setText("");// delete the String at TextField
        }
    }
}
