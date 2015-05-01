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


        /// set properties //
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new BorderLayout());
        setJMenuBar(createMenuBar());


        // position attributes on the frame (windows) //
        mainFrameContainer.add(mainFrameForm, BorderLayout.CENTER);


    }

    /*Methods*/
    private JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        return menuBar;
    }


}
