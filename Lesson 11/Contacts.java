/**
 * Created by sachinhaldipur on 6/24/17.
 */

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;



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


        try{

            File file = new File("Lesson 11/data.txt");

            FileWriter writer = new FileWriter(file);

            for( int i = 0; i < model.getRowCount(); i++ )
            {
                for( int j = 0; j < model.getColumnCount(); j++ )
                {

                    //Create your File Writer

                    writer.write(model.getValueAt(i,j).toString());
                    writer.write(" ");
                }
                writer.write("\n");
            }

            writer.flush();
            writer.close();

        }catch (IOException ex) {
            ex.printStackTrace();

        }


        }
    }

}
