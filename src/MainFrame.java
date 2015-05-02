import com.sun.glass.ui.win.WinDnDClipboard;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Scorpion
 * @Date: 3/16/2015.
 */
public class MainFrame extends JFrame {

    /*Attributes*/
    private Form mainFrameForm;
    private Container mainFrameContainer;


    /* Constructor*/

    public MainFrame(String title) {
        super(title);

        /// Initialize attributes //
        mainFrameForm = new Form();
        mainFrameContainer = getContentPane();

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
        JMenuItem exitItem = new JMenuItem("Exit");
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


        return menuBar;
    }


}
