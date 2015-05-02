import com.sun.glass.ui.win.WinDnDClipboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @Author: Scorpion
 * @Date: 3/16/2015.
 */
public class MainFrame extends JFrame {

    /*Attributes*/
    private Form mainFrameForm;
    private Container mainFrameContainer;
    private JFileChooser mainFrameFileChooser;

    /* Constructor*/

    public MainFrame(String title) {
        super(title);

        /// Initialize attributes //
        mainFrameForm = new Form();
        mainFrameContainer = getContentPane();
        mainFrameFileChooser = new JFileChooser();

        // position attributes on the frame (windows) //
        mainFrameContainer.add(mainFrameForm, BorderLayout.CENTER);

        /// set properties //
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        setJMenuBar(createMenuBar());




    }

    /*Methods*/
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu windowMenu = new JMenu("Window");
        JMenu showMenu = new JMenu("Show");
        JMenuItem importDataItem = new JMenuItem("Import data...");
        JMenuItem exportDataItem = new JMenuItem("export data...");
        final JMenuItem exitItem = new JMenuItem("Exit");
        JMenuItem personalDetails = new JMenuItem("personal details");

        menuBar.add(fileMenu);
        menuBar.add(windowMenu);

        /// add staff to the 'fileMenu'
        fileMenu.add(importDataItem);
        fileMenu.add(exportDataItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        // add staff to the 'windowMenu'
        windowMenu.add(showMenu);

        // add staff to the 'showMenu'
        showMenu.add(personalDetails);

        /// Add behaviour(s) ///
        /*exitItem behaviour */
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int exitOption = JOptionPane.showConfirmDialog(MainFrame.this, "Are you sure you want to exit?"
                        , "Confirm exit", JOptionPane.OK_CANCEL_OPTION);

                if (exitOption == JOptionPane.OK_OPTION) {
                    System.exit(0);
                }
            }
        });


        /*importDataItem behaviour*/
        importDataItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mainFrameFileChooser.showOpenDialog(MainFrame.this) == JFileChooser.APPROVE_OPTION) {
                    System.out.println(mainFrameFileChooser.getSelectedFile());
                }
            }
        });


        return menuBar;
    }


}
