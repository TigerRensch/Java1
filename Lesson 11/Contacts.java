/**
 * Created by sachinhaldipur on 6/24/17.
 */

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;


public class Contacts extends JFrame implements ActionListener {

    JTextField name = new JTextField(12);
    JTextField phoneNumber = new JTextField(12);
    JButton add = new JButton("Add");
    JButton save = new JButton("Save");

    JTable table = new JTable();


    DefaultTableModel model = new DefaultTableModel();

    public Contacts(){

        super("Add Contacts");
        setSize(1000,1000);
        setLayout(new FlowLayout());

        add(name);
        add(phoneNumber);
        add(add);
        add(save);


        table.setModel(model);
        model.addColumn("Name");
        model.addColumn("Phone Number");

        add(table);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add.addActionListener(this);
        save.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        String n = name.getText();
        String pn = phoneNumber.getText();



        if(e.getActionCommand().equals("Add")){
            model.addRow(new Object[]{n, pn});
        }

        if(e.getActionCommand().equals("Save")){

        }
    }

}
