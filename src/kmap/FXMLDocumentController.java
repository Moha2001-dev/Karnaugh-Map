package kmap;

import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Robot;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    @FXML
    private Rectangle cl_2;
    @FXML
    private Rectangle cl_3;
    @FXML
    private Rectangle cl_4;
    @FXML
    private Rectangle m0_2;
    @FXML
    private Rectangle m1_2;
    @FXML
    private Rectangle m2_2;
    @FXML
    private Rectangle m3_2;
    //======================
    @FXML
    private Rectangle m0_3;
    @FXML
    private Rectangle m1_3;
    @FXML
    private Rectangle m2_3;
    @FXML
    private Rectangle m3_3;
    @FXML
    private Rectangle m4_3;
    @FXML
    private Rectangle m5_3;
    @FXML
    private Rectangle m6_3;
    @FXML
    private Rectangle m7_3;
    //======================
    @FXML
    private Rectangle m0_4;
    @FXML
    private Rectangle m1_4;
    @FXML
    private Rectangle m2_4;
    @FXML
    private Rectangle m3_4;
    @FXML
    private Rectangle m4_4;
    @FXML
    private Rectangle m5_4;
    @FXML
    private Rectangle m6_4;
    @FXML
    private Rectangle m7_4;
    @FXML
    private Rectangle m8_4;
    @FXML
    private Rectangle m9_4;
    @FXML
    private Rectangle m10_4;
    @FXML
    private Rectangle m11_4;
    @FXML
    private Rectangle m12_4;
    @FXML
    private Rectangle m13_4;
    @FXML
    private Rectangle m14_4;
    @FXML
    private Rectangle m15_4;
    //for theme
    //main bar  objects
    @FXML
    private AnchorPane mainBar;
    //for themes & act like a buttons
    @FXML
    private Label Var2_bar;
    @FXML
    private Label Var3_bar;
    @FXML
    private Label Var4_bar;
    @FXML
    private Label help_bar;
    @FXML
    private Label close_bar;
    //to choose theme
    @FXML
    private RadioButton LightTheme;
    @FXML
    private RadioButton DarkTheme;

    //==============================================
    //Help Page
    //for theme
    @FXML
    private AnchorPane HelpPage;
    //for theme
    @FXML
    private Rectangle top_help;
    //for theme
    @FXML
    private Text title_help;
    @FXML
    private Text subtitle_help;
    @FXML
    private Text text_help;
    @FXML
    private Text Contact_help;
    @FXML
    private Text devoloped_help;
    @FXML
    private Text TComment_help;
    //for click and contact
    @FXML
    private ImageView twitter_help;
    @FXML
    private ImageView linkedin_help;
    //for theme
    @FXML
    private Rectangle comment_help;
    //for theme
    @FXML
    private ImageView Corner_help;
    //for  click
    @FXML
    private ImageView video_help;

    //==============================================
    //4 variable page
    //for theme
    @FXML
    private AnchorPane Page4variable;
    //for theme
    @FXML
    private Rectangle top_4;
    //for theme
    @FXML
    private Text title_4;
    @FXML
    private Text SP_4;
    @FXML
    private Text AX_4;
    @FXML
    private Text minterms_4;
    @FXML
    private Text dontcare_4;
    @FXML
    private Text result_4;
    @FXML
    private Text Contact_4;
    @FXML
    private Text devoloped_4;
    //for click and contact
    @FXML
    private ImageView twitter_4;
    @FXML
    private ImageView linkedin_4;
    //for theme
    @FXML
    private ImageView Corner_4;
    //for result theme
    @FXML
    private Rectangle resultBar_4;
    //RadioButton options
    @FXML
    private RadioButton ABCD_4;
    @FXML
    private RadioButton WXYZ_4;
    @FXML
    private RadioButton SOP_4;
    @FXML
    private RadioButton POS_4;
    //minterms text  Theme
    @FXML
    private Text TMzero_4;
    @FXML
    private Text TMone_4;
    @FXML
    private Text TMtwo_4;
    @FXML
    private Text TMthree_4;
    @FXML
    private Text TMfour_4;
    @FXML
    private Text TMfive_4;
    @FXML
    private Text TMsix_4;
    @FXML
    private Text TMseven_4;
    @FXML
    private Text TMeight_4;
    @FXML
    private Text TMnine_4;
    @FXML
    private Text TMten_4;
    @FXML
    private Text TMeleven_4;
    @FXML
    private Text TMtwelve_4;
    @FXML
    private Text TMthirteen_4;
    @FXML
    private Text TMfourteen_4;
    @FXML
    private Text TMfifteen_4;
    //DON'T CARE terms text   Theme
    @FXML
    private Text TDzero_4;
    @FXML
    private Text TDone_4;
    @FXML
    private Text TDtwo_4;
    @FXML
    private Text TDthree_4;
    @FXML
    private Text TDfour_4;
    @FXML
    private Text TDfive_4;
    @FXML
    private Text TDsix_4;
    @FXML
    private Text TDseven_4;
    @FXML
    private Text TDeight_4;
    @FXML
    private Text TDnine_4;
    @FXML
    private Text TDten_4;
    @FXML
    private Text TDeleven_4;
    @FXML
    private Text TDtwelve_4;
    @FXML
    private Text TDthirteen_4;
    @FXML
    private Text TDfourteen_4;
    @FXML
    private Text TDfifteen_4;
    //main terms radio buttons for show
    @FXML
    private RadioButton RMzero_4;
    @FXML
    private RadioButton RMone_4;
    @FXML
    private RadioButton RMtwo_4;
    @FXML
    private RadioButton RMthree_4;
    @FXML
    private RadioButton RMfour_4;
    @FXML
    private RadioButton RMfive_4;
    @FXML
    private RadioButton RMsix_4;
    @FXML
    private RadioButton RMseven_4;
    @FXML
    private RadioButton RMeight_4;
    @FXML
    private RadioButton RMnine_4;
    @FXML
    private RadioButton RMten_4;
    @FXML
    private RadioButton RMeleven_4;
    @FXML
    private RadioButton RMtwelve_4;
    @FXML
    private RadioButton RMthirteen_4;
    @FXML
    private RadioButton RMfourteen_4;
    @FXML
    private RadioButton RMfifteen_4;
    //DONT CARE  terms radio button for show
    @FXML
    private RadioButton RDzero_4;
    @FXML
    private RadioButton RDone_4;
    @FXML
    private RadioButton RDtwo_4;
    @FXML
    private RadioButton RDthree_4;
    @FXML
    private RadioButton RDfour_4;
    @FXML
    private RadioButton RDfive_4;
    @FXML
    private RadioButton RDsix_4;
    @FXML
    private RadioButton RDseven_4;
    @FXML
    private RadioButton RDeight_4;
    @FXML
    private RadioButton RDnine_4;
    @FXML
    private RadioButton RDten_4;
    @FXML
    private RadioButton RDeleven_4;
    @FXML
    private RadioButton RDtwelve_4;
    @FXML
    private RadioButton RDthirteen_4;
    @FXML
    private RadioButton RDfourteen_4;
    @FXML
    private RadioButton RDfifteen_4;
    //rectangles for clicks and theme minterms
    @FXML
    private Rectangle RRMzero_4;
    @FXML
    private Rectangle RRMone_4;
    @FXML
    private Rectangle RRMtwo_4;
    @FXML
    private Rectangle RRMthree_4;
    @FXML
    private Rectangle RRMfour_4;
    @FXML
    private Rectangle RRMfive_4;
    @FXML
    private Rectangle RRMsix_4;
    @FXML
    private Rectangle RRMseven_4;
    @FXML
    private Rectangle RRMeight_4;
    @FXML
    private Rectangle RRMnine_4;
    @FXML
    private Rectangle RRMten_4;
    @FXML
    private Rectangle RRMeleven_4;
    @FXML
    private Rectangle RRMtwelve_4;
    @FXML
    private Rectangle RRMthirteen_4;
    @FXML
    private Rectangle RRMfourteen_4;
    @FXML
    private Rectangle RRMfifteen_4;
    //rectangles for click and theme dontcare
    @FXML
    private Rectangle RRDzero_4;
    @FXML
    private Rectangle RRDone_4;
    @FXML
    private Rectangle RRDtwo_4;
    @FXML
    private Rectangle RRDthree_4;
    @FXML
    private Rectangle RRDfour_4;
    @FXML
    private Rectangle RRDfive_4;
    @FXML
    private Rectangle RRDsix_4;
    @FXML
    private Rectangle RRDseven_4;
    @FXML
    private Rectangle RRDeight_4;
    @FXML
    private Rectangle RRDnine_4;
    @FXML
    private Rectangle RRDten_4;
    @FXML
    private Rectangle RRDeleven_4;
    @FXML
    private Rectangle RRDtwelve_4;
    @FXML
    private Rectangle RRDthirteen_4;
    @FXML
    private Rectangle RRDfourteen_4;
    @FXML
    private Rectangle RRDfifteen_4;
    //result AND THEME
    @FXML
    private Text Tresult_4;
    // k-map
    //text latters for change and theme
    @FXML
    private Text K12Latters_4;
    @FXML
    private Text K34Latters_4;
    @FXML
    private Text K1Latter_4;
    @FXML
    private Text K2Latter_4;
    @FXML
    private Text K3Latter_4;
    @FXML
    private Text K4Latter_4;
    //numbers for theme and change
    @FXML
    private Text K0_4;
    @FXML
    private Text K1_4;
    @FXML
    private Text K2_4;
    @FXML
    private Text K3_4;
    @FXML
    private Text K4_4;
    @FXML
    private Text K5_4;
    @FXML
    private Text K6_4;
    @FXML
    private Text K7_4;
    @FXML
    private Text K8_4;
    @FXML
    private Text K9_4;
    @FXML
    private Text K10_4;
    @FXML
    private Text K11_4;
    @FXML
    private Text K12_4;
    @FXML
    private Text K13_4;
    @FXML
    private Text K14_4;
    @FXML
    private Text K15_4;
    //rectangles for click and theme
    @FXML
    private Rectangle KR0_4;
    @FXML
    private Rectangle KR1_4;
    @FXML
    private Rectangle KR2_4;
    @FXML
    private Rectangle KR3_4;
    @FXML
    private Rectangle KR4_4;
    @FXML
    private Rectangle KR5_4;
    @FXML
    private Rectangle KR6_4;
    @FXML
    private Rectangle KR7_4;
    @FXML
    private Rectangle KR8_4;
    @FXML
    private Rectangle KR9_4;
    @FXML
    private Rectangle KR10_4;
    @FXML
    private Rectangle KR11_4;
    @FXML
    private Rectangle KR12_4;
    @FXML
    private Rectangle KR13_4;
    @FXML
    private Rectangle KR14_4;
    @FXML
    private Rectangle KR15_4;
    //line for theme
    @FXML
    private Line KL_4;

    //==============================================
    //3variable page
    //for theme
    @FXML
    private AnchorPane Page3variable;
    //for theme
    @FXML
    private Rectangle top_3;
    //for theme
    @FXML
    private Text title_3;
    @FXML
    private Text SP_3;
    @FXML
    private Text AX_3;
    @FXML
    private Text minterms_3;
    @FXML
    private Text dontcare_3;
    @FXML
    private Text result_3;
    @FXML
    private Text Contact_3;
    @FXML
    private Text devoloped_3;
    //for click and contact
    @FXML
    private ImageView twitter_3;
    @FXML
    private ImageView linkedin_3;
    //for theme
    @FXML
    private ImageView Corner_3;
    //for result theme
    @FXML
    private Rectangle resultBar_3;
    //RadioButton options
    @FXML
    private RadioButton ABC_3;
    @FXML
    private RadioButton XYZ_3;
    @FXML
    private RadioButton SOP_3;
    @FXML
    private RadioButton POS_3;
    //minterms text  Theme
    @FXML
    private Text TMzero_3;
    @FXML
    private Text TMone_3;
    @FXML
    private Text TMtwo_3;
    @FXML
    private Text TMthree_3;
    @FXML
    private Text TMfour_3;
    @FXML
    private Text TMfive_3;
    @FXML
    private Text TMsix_3;
    @FXML
    private Text TMseven_3;

    //DON'T CARE terms text   Theme
    @FXML
    private Text TDzero_3;
    @FXML
    private Text TDone_3;
    @FXML
    private Text TDtwo_3;
    @FXML
    private Text TDthree_3;
    @FXML
    private Text TDfour_3;
    @FXML
    private Text TDfive_3;
    @FXML
    private Text TDsix_3;
    @FXML
    private Text TDseven_3;

    //main terms radio buttons for show
    @FXML
    private RadioButton RMzero_3;
    @FXML
    private RadioButton RMone_3;
    @FXML
    private RadioButton RMtwo_3;
    @FXML
    private RadioButton RMthree_3;
    @FXML
    private RadioButton RMfour_3;
    @FXML
    private RadioButton RMfive_3;
    @FXML
    private RadioButton RMsix_3;
    @FXML
    private RadioButton RMseven_3;

    //DONT CARE  terms radio button for show
    @FXML
    private RadioButton RDzero_3;
    @FXML
    private RadioButton RDone_3;
    @FXML
    private RadioButton RDtwo_3;
    @FXML
    private RadioButton RDthree_3;
    @FXML
    private RadioButton RDfour_3;
    @FXML
    private RadioButton RDfive_3;
    @FXML
    private RadioButton RDsix_3;
    @FXML
    private RadioButton RDseven_3;

    //rectangles for clicks and theme minterms
    @FXML
    private Rectangle RRMzero_3;
    @FXML
    private Rectangle RRMone_3;
    @FXML
    private Rectangle RRMtwo_3;
    @FXML
    private Rectangle RRMthree_3;
    @FXML
    private Rectangle RRMfour_3;
    @FXML
    private Rectangle RRMfive_3;
    @FXML
    private Rectangle RRMsix_3;
    @FXML
    private Rectangle RRMseven_3;

    //rectangles for click and theme dontcare
    @FXML
    private Rectangle RRDzero_3;
    @FXML
    private Rectangle RRDone_3;
    @FXML
    private Rectangle RRDtwo_3;
    @FXML
    private Rectangle RRDthree_3;
    @FXML
    private Rectangle RRDfour_3;
    @FXML
    private Rectangle RRDfive_3;
    @FXML
    private Rectangle RRDsix_3;
    @FXML
    private Rectangle RRDseven_3;

    //result AND THEME
    @FXML
    private Text Tresult_3;
    // k-map
    //text latters for change and theme
    @FXML
    private Text K1Latters_3;
    @FXML
    private Text K23Latters_3;
    @FXML
    private Text K2Latter_3;
    @FXML
    private Text K3Latter_3;
    //numbers for theme and change
    @FXML
    private Text K0_3;
    @FXML
    private Text K1_3;
    @FXML
    private Text K2_3;
    @FXML
    private Text K3_3;
    @FXML
    private Text K4_3;
    @FXML
    private Text K5_3;
    @FXML
    private Text K6_3;
    @FXML
    private Text K7_3;

    //rectangles for click and theme
    @FXML
    private Rectangle KR0_3;
    @FXML
    private Rectangle KR1_3;
    @FXML
    private Rectangle KR2_3;
    @FXML
    private Rectangle KR3_3;
    @FXML
    private Rectangle KR4_3;
    @FXML
    private Rectangle KR5_3;
    @FXML
    private Rectangle KR6_3;
    @FXML
    private Rectangle KR7_3;

    //line for theme
    @FXML
    private Line KL_3;

    //==========================
    //2 variable page
    //for theme
    @FXML
    private AnchorPane Page2variable;
    //for theme
    @FXML
    private Rectangle top_2;
    //for theme
    @FXML
    private Text title_2;
    @FXML
    private Text SP_2;
    @FXML
    private Text AX_2;
    @FXML
    private Text minterms_2;
    @FXML
    private Text dontcare_2;
    @FXML
    private Text result_2;
    @FXML
    private Text Contact_2;
    @FXML
    private Text devoloped_2;
    //for click and contact
    @FXML
    private ImageView twitter_2;
    @FXML
    private ImageView linkedin_2;
    //for theme
    @FXML
    private ImageView Corner_2;
    //for result theme
    @FXML
    private Rectangle resultBar_2;
    //RadioButton options
    @FXML
    private RadioButton AB_2;
    @FXML
    private RadioButton XY_2;
    @FXML
    private RadioButton SOP_2;
    @FXML
    private RadioButton POS_2;
    //minterms text  Theme
    @FXML
    private Text TMzero_2;
    @FXML
    private Text TMone_2;
    @FXML
    private Text TMtwo_2;
    @FXML
    private Text TMthree_2;

    //DON'T CARE terms text   Theme
    @FXML
    private Text TDzero_2;
    @FXML
    private Text TDone_2;
    @FXML
    private Text TDtwo_2;
    @FXML
    private Text TDthree_2;
    //main terms radio buttons for show
    @FXML
    private RadioButton RMzero_2;
    @FXML
    private RadioButton RMone_2;
    @FXML
    private RadioButton RMtwo_2;
    @FXML
    private RadioButton RMthree_2;
    //DONT CARE  terms radio button for show
    @FXML
    private RadioButton RDzero_2;
    @FXML
    private RadioButton RDone_2;
    @FXML
    private RadioButton RDtwo_2;
    @FXML
    private RadioButton RDthree_2;
    //rectangles for clicks and theme minterms
    @FXML
    private Rectangle RRMzero_2;
    @FXML
    private Rectangle RRMone_2;
    @FXML
    private Rectangle RRMtwo_2;
    @FXML
    private Rectangle RRMthree_2;
    //rectangles for click and theme dontcare
    @FXML
    private Rectangle RRDzero_2;
    @FXML
    private Rectangle RRDone_2;
    @FXML
    private Rectangle RRDtwo_2;
    @FXML
    private Rectangle RRDthree_2;
    //result AND THEME
    @FXML
    private Text Tresult_2;
    // k-map
    //text latters for change and theme
    @FXML
    private Text K1Latters_2;
    @FXML
    private Text K2Latters_2;
    //numbers for theme and change
    @FXML
    private Text K0_2;
    @FXML
    private Text K1_2;
    @FXML
    private Text K2_2;
    @FXML
    private Text K3_2;
    //rectangles for click and theme
    @FXML
    private Rectangle KR0_2;
    @FXML
    private Rectangle KR1_2;
    @FXML
    private Rectangle KR2_2;
    @FXML
    private Rectangle KR3_2;
    //line
    @FXML
    private Line KL_2;

    //main bar
    //Close
    @FXML
    private void close() {
        Stage stage = (Stage) close_bar.getScene().getWindow();
        stage.close();
    }

    //open and close taps
    @FXML
    private void Var2Tap() {
        if (Page2variable.isVisible()) {
            Page2variable.setVisible(false);
            clear_2();
        } else {
            Page2variable.setVisible(true);
        }
        Page4variable.setVisible(false);
        Page3variable.setVisible(false);
        HelpPage.setVisible(false);
        clear_3();
        clear_4();
    }

    @FXML
    private void Var3Tap() {
        if (Page3variable.isVisible()) {
            Page3variable.setVisible(false);
            clear_3();
        } else {
            Page3variable.setVisible(true);
        }
        Page4variable.setVisible(false);
        Page2variable.setVisible(false);
        HelpPage.setVisible(false);
        clear_2();
        clear_4();
    }

    @FXML
    private void Var4Tap() {
        if (Page4variable.isVisible()) {
            Page4variable.setVisible(false);
            clear_4();
        } else {
            Page4variable.setVisible(true);
        }
        Page2variable.setVisible(false);
        Page3variable.setVisible(false);
        HelpPage.setVisible(false);
        clear_2();
        clear_3();
    }

    @FXML
    private void VarHelpTap() {
        if (HelpPage.isVisible()) {
            HelpPage.setVisible(false);
        } else {
            HelpPage.setVisible(true);
        }
        Page4variable.setVisible(false);
        Page3variable.setVisible(false);
        Page2variable.setVisible(false);
    }
    //theme
    boolean state = true;

    //DarkTheme
    @FXML
    private void DarkTheme() {
        state = true;
        HelpTheme(state);
        MainTheme(state);
        Var2Theme(state);
        Var3Theme(state);
        Var4Theme(state);
    }

    //LightTheme
    @FXML
    private void LightTheme() {
        state = false;
        HelpTheme(state);
        MainTheme(state);
        Var2Theme(state);
        Var3Theme(state);
        Var4Theme(state);
    }

    //all pages
    @FXML
    public void transferToTwitter() {
        try {
            Desktop desk = Desktop.getDesktop();
            URI twitter = new URI("https://twitter.com/P_Mohammed2001");
            desk.browse(twitter);
        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }
    @FXML
    public void transferToYoutube() {
        try {
            Desktop desk = Desktop.getDesktop();
            URI Youtube = new URI("https://www.youtube.com/channel/UCoqXQjxZhRHJ4eEwc5CqDmw");
            desk.browse(Youtube);
        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }

    @FXML
    public void transferToLinkedIn() {
        try {
            Desktop desk = Desktop.getDesktop();
            URI LinkedIn = new URI("https://www.linkedin.com/in/mohammedal-hussaini/");
            desk.browse(LinkedIn);
        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }

    @FXML
    public void transferToVid() {
        try {
            Desktop desk = Desktop.getDesktop();
            URI vid = new URI("https://www.youtube.com/watch?v=kVx3MZX4t5c");
            desk.browse(vid);
        } catch (IOException | URISyntaxException e) {
            System.out.println(e);
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Page4variable.setVisible(false);
        Page3variable.setVisible(false);
        Page2variable.setVisible(false);
        HelpPage.setVisible(false);
        mainBar.setVisible(true);
        result_2.setText("0");
        result_3.setText("0");
        Tresult_4.setText("0");
    }

    //Theme
    private void HelpTheme(boolean state) {
        if (state) {
            HelpPage.setStyle("-fx-background-color: #192734");
            top_help.setFill(Color.web("#15202b"));
            title_help.setFill(Color.web("#ffffff"));
            subtitle_help.setFill(Color.web("#ffffff"));
            text_help.setFill(Color.web("#ffffff"));
            Contact_help.setFill(Color.web("#ffffff"));
            devoloped_help.setFill(Color.web("#ffffff"));
            TComment_help.setFill(Color.web("#ffffff"));
        } else {
            HelpPage.setStyle("-fx-background-color: #ffffff");
            top_help.setFill(Color.web("#d9d9d9"));
            title_help.setFill(Color.web("#000000"));
            subtitle_help.setFill(Color.web("#000000"));
            text_help.setFill(Color.web("#000000"));
            Contact_help.setFill(Color.web("#000000"));
            devoloped_help.setFill(Color.web("#000000"));
            TComment_help.setFill(Color.web("#000000"));
        }

    }

    private void MainTheme(boolean state) {
        if (state) {
            mainBar.setStyle("-fx-background-color: #15202b");
            Var2_bar.setTextFill(Color.web("#ffffff"));
            Var3_bar.setTextFill(Color.web("#ffffff"));
            Var4_bar.setTextFill(Color.web("#ffffff"));
            help_bar.setTextFill(Color.web("#ffffff"));
            close_bar.setTextFill(Color.web("#ffffff"));
            Var2_bar.setStyle("-fx-background-color: #192734");
            Var3_bar.setStyle("-fx-background-color: #192734");
            Var4_bar.setStyle("-fx-background-color: #192734");
            help_bar.setStyle("-fx-background-color: #192734");
            close_bar.setStyle("-fx-background-color: #192734");
            Var2_bar.setAlignment(Pos.CENTER);
            Var3_bar.setAlignment(Pos.CENTER);
            Var4_bar.setAlignment(Pos.CENTER);
            help_bar.setAlignment(Pos.CENTER);
            close_bar.setAlignment(Pos.CENTER);
            LightTheme.setTextFill(Color.web("#ffffff"));
            DarkTheme.setTextFill(Color.web("#ffffff"));
        } else {
            mainBar.setStyle("-fx-background-color: #d9d9d9");
            Var2_bar.setTextFill(Color.web("#000000"));
            Var3_bar.setTextFill(Color.web("#000000"));
            Var4_bar.setTextFill(Color.web("#000000"));
            help_bar.setTextFill(Color.web("#000000"));
            close_bar.setTextFill(Color.web("#000000"));
            Var2_bar.setStyle("-fx-background-color: #ffffff");
            Var3_bar.setStyle("-fx-background-color: #ffffff");
            Var4_bar.setStyle("-fx-background-color: #ffffff");
            help_bar.setStyle("-fx-background-color: #ffffff");
            close_bar.setStyle("-fx-background-color: #ffffff");
            Var2_bar.setAlignment(Pos.CENTER);
            Var3_bar.setAlignment(Pos.CENTER);
            Var4_bar.setAlignment(Pos.CENTER);
            help_bar.setAlignment(Pos.CENTER);
            close_bar.setAlignment(Pos.CENTER);
            LightTheme.setTextFill(Color.web("#000000"));
            DarkTheme.setTextFill(Color.web("#000000"));
        }
    }

    private void Var2Theme(boolean state) {
        if (state) {
            Page2variable.setStyle("-fx-background-color: #192734");
            top_2.setFill(Color.web("#15202b"));
            title_2.setFill(Color.web("#ffffff"));
            SP_2.setFill(Color.web("#ffffff"));
            AX_2.setFill(Color.web("#ffffff"));
            minterms_2.setFill(Color.web("#ffffff"));
            dontcare_2.setFill(Color.web("#ffffff"));
            result_2.setFill(Color.web("#ffffff"));
            Contact_2.setFill(Color.web("#ffffff"));
            devoloped_2.setFill(Color.web("#ffffff"));
            resultBar_2.setStroke(Color.web("#ffffff"));
            resultBar_2.setFill(Color.web("#15202b"));
            TMzero_2.setFill(Color.web("#ffffff"));
            TMone_2.setFill(Color.web("#ffffff"));
            TMtwo_2.setFill(Color.web("#ffffff"));
            TMthree_2.setFill(Color.web("#ffffff"));
            TDzero_2.setFill(Color.web("#ffffff"));
            TDone_2.setFill(Color.web("#ffffff"));
            TDtwo_2.setFill(Color.web("#ffffff"));
            TDthree_2.setFill(Color.web("#ffffff"));
            RRMzero_2.setStroke(Color.web("#ffffff"));
            RRMone_2.setStroke(Color.web("#ffffff"));
            RRMtwo_2.setStroke(Color.web("#ffffff"));
            RRMthree_2.setStroke(Color.web("#ffffff"));
            RRDzero_2.setStroke(Color.web("#ffffff"));
            RRDone_2.setStroke(Color.web("#ffffff"));
            RRDtwo_2.setStroke(Color.web("#ffffff"));
            RRDthree_2.setStroke(Color.web("#ffffff"));
            Tresult_2.setFill(Color.web("#ffffff"));
            K1Latters_2.setFill(Color.web("#ffffff"));
            K2Latters_2.setFill(Color.web("#ffffff"));
            K0_2.setFill(Color.web("#ffffff"));
            K1_2.setFill(Color.web("#ffffff"));
            K2_2.setFill(Color.web("#ffffff"));
            K3_2.setFill(Color.web("#ffffff"));
            KR0_2.setStroke(Color.web("#ffffff"));
            KR1_2.setStroke(Color.web("#ffffff"));
            KR2_2.setStroke(Color.web("#ffffff"));
            KR3_2.setStroke(Color.web("#ffffff"));
            KL_2.setStroke(Color.web("#ffffff"));
            AB_2.setTextFill(Color.web("#ffffff"));
            XY_2.setTextFill(Color.web("#ffffff"));
            SOP_2.setTextFill(Color.web("#ffffff"));
            POS_2.setTextFill(Color.web("#ffffff"));
        } else {
            Page2variable.setStyle("-fx-background-color: #ffffff");
            top_2.setFill(Color.web("#d9d9d9"));
            title_2.setFill(Color.web("#000000"));
            SP_2.setFill(Color.web("#000000"));
            AX_2.setFill(Color.web("#000000"));
            minterms_2.setFill(Color.web("#000000"));
            dontcare_2.setFill(Color.web("#000000"));
            result_2.setFill(Color.web("#000000"));
            Contact_2.setFill(Color.web("#000000"));
            devoloped_2.setFill(Color.web("#000000"));
            resultBar_2.setStroke(Color.web("#000000"));
            resultBar_2.setFill(Color.web("#d9d9d9"));
            TMzero_2.setFill(Color.web("#000000"));
            TMone_2.setFill(Color.web("#000000"));
            TMtwo_2.setFill(Color.web("#000000"));
            TMthree_2.setFill(Color.web("#000000"));
            TDzero_2.setFill(Color.web("#000000"));
            TDone_2.setFill(Color.web("#000000"));
            TDtwo_2.setFill(Color.web("#000000"));
            TDthree_2.setFill(Color.web("#000000"));
            RRMzero_2.setStroke(Color.web("#000000"));
            RRMone_2.setStroke(Color.web("#000000"));
            RRMtwo_2.setStroke(Color.web("#000000"));
            RRMthree_2.setStroke(Color.web("#000000"));
            RRDzero_2.setStroke(Color.web("#000000"));
            RRDone_2.setStroke(Color.web("#000000"));
            RRDtwo_2.setStroke(Color.web("#000000"));
            RRDthree_2.setStroke(Color.web("#000000"));
            Tresult_2.setFill(Color.web("#000000"));
            K1Latters_2.setFill(Color.web("#000000"));
            K2Latters_2.setFill(Color.web("#000000"));
            K0_2.setFill(Color.web("#000000"));
            K1_2.setFill(Color.web("#000000"));
            K2_2.setFill(Color.web("#000000"));
            K3_2.setFill(Color.web("#000000"));
            KR0_2.setStroke(Color.web("#000000"));
            KR1_2.setStroke(Color.web("#000000"));
            KR2_2.setStroke(Color.web("#000000"));
            KR3_2.setStroke(Color.web("#000000"));
            KL_2.setStroke(Color.web("#000000"));
            AB_2.setTextFill(Color.web("#000000"));
            XY_2.setTextFill(Color.web("#000000"));
            SOP_2.setTextFill(Color.web("#000000"));
            POS_2.setTextFill(Color.web("#000000"));
        }
    }

    private void Var3Theme(boolean state) {
        if (state) {
            Page3variable.setStyle("-fx-background-color: #192734");
            top_3.setFill(Color.web("#15202b"));
            title_3.setFill(Color.web("#ffffff"));
            SP_3.setFill(Color.web("#ffffff"));
            AX_3.setFill(Color.web("#ffffff"));
            minterms_3.setFill(Color.web("#ffffff"));
            dontcare_3.setFill(Color.web("#ffffff"));
            result_3.setFill(Color.web("#ffffff"));
            Contact_3.setFill(Color.web("#ffffff"));
            devoloped_3.setFill(Color.web("#ffffff"));
            ABC_3.setTextFill(Color.web("#ffffff"));
            XYZ_3.setTextFill(Color.web("#ffffff"));
            SOP_3.setTextFill(Color.web("#ffffff"));
            POS_3.setTextFill(Color.web("#ffffff"));
            TMzero_3.setFill(Color.web("#ffffff"));
            TMone_3.setFill(Color.web("#ffffff"));
            TMtwo_3.setFill(Color.web("#ffffff"));
            TMthree_3.setFill(Color.web("#ffffff"));
            TMfour_3.setFill(Color.web("#ffffff"));
            TMfive_3.setFill(Color.web("#ffffff"));
            TMsix_3.setFill(Color.web("#ffffff"));
            TMseven_3.setFill(Color.web("#ffffff"));
            TDzero_3.setFill(Color.web("#ffffff"));
            TDone_3.setFill(Color.web("#ffffff"));
            TDtwo_3.setFill(Color.web("#ffffff"));
            TDthree_3.setFill(Color.web("#ffffff"));
            TDfour_3.setFill(Color.web("#ffffff"));
            TDfive_3.setFill(Color.web("#ffffff"));
            TDsix_3.setFill(Color.web("#ffffff"));
            TDseven_3.setFill(Color.web("#ffffff"));
            Tresult_3.setFill(Color.web("#ffffff"));
            K1Latters_3.setFill(Color.web("#ffffff"));
            K23Latters_3.setFill(Color.web("#ffffff"));
            K2Latter_3.setFill(Color.web("#ffffff"));
            K3Latter_3.setFill(Color.web("#ffffff"));
            K0_3.setFill(Color.web("#ffffff"));
            K1_3.setFill(Color.web("#ffffff"));
            K2_3.setFill(Color.web("#ffffff"));
            K3_3.setFill(Color.web("#ffffff"));
            K4_3.setFill(Color.web("#ffffff"));
            K5_3.setFill(Color.web("#ffffff"));
            K6_3.setFill(Color.web("#ffffff"));
            K7_3.setFill(Color.web("#ffffff"));
            RRMzero_3.setStroke(Color.web("#ffffff"));
            RRMone_3.setStroke(Color.web("#ffffff"));
            RRMtwo_3.setStroke(Color.web("#ffffff"));
            RRMthree_3.setStroke(Color.web("#ffffff"));
            RRMfour_3.setStroke(Color.web("#ffffff"));
            RRMfive_3.setStroke(Color.web("#ffffff"));
            RRMsix_3.setStroke(Color.web("#ffffff"));
            RRMseven_3.setStroke(Color.web("#ffffff"));
            RRDzero_3.setStroke(Color.web("#ffffff"));
            RRDone_3.setStroke(Color.web("#ffffff"));
            RRDtwo_3.setStroke(Color.web("#ffffff"));
            RRDthree_3.setStroke(Color.web("#ffffff"));
            RRDfour_3.setStroke(Color.web("#ffffff"));
            RRDfive_3.setStroke(Color.web("#ffffff"));
            RRDsix_3.setStroke(Color.web("#ffffff"));
            RRDseven_3.setStroke(Color.web("#ffffff"));
            KR0_3.setStroke(Color.web("#ffffff"));
            KR1_3.setStroke(Color.web("#ffffff"));
            KR2_3.setStroke(Color.web("#ffffff"));
            KR3_3.setStroke(Color.web("#ffffff"));
            KR4_3.setStroke(Color.web("#ffffff"));
            KR5_3.setStroke(Color.web("#ffffff"));
            KR6_3.setStroke(Color.web("#ffffff"));
            KR7_3.setStroke(Color.web("#ffffff"));
            KL_3.setStroke(Color.web("#ffffff"));
            resultBar_3.setStroke(Color.web("#ffffff"));
            resultBar_3.setFill(Color.web("#15202b"));
        } else {
            Page3variable.setStyle("-fx-background-color: #ffffff");
            top_3.setFill(Color.web("#d9d9d9"));
            title_3.setFill(Color.web("#000000"));
            SP_3.setFill(Color.web("#000000"));
            AX_3.setFill(Color.web("#000000"));
            minterms_3.setFill(Color.web("#000000"));
            dontcare_3.setFill(Color.web("#000000"));
            result_3.setFill(Color.web("#000000"));
            Contact_3.setFill(Color.web("#000000"));
            devoloped_3.setFill(Color.web("#000000"));
            ABC_3.setTextFill(Color.web("#000000"));
            XYZ_3.setTextFill(Color.web("#000000"));
            SOP_3.setTextFill(Color.web("#000000"));
            POS_3.setTextFill(Color.web("#000000"));
            TMzero_3.setFill(Color.web("#000000"));
            TMone_3.setFill(Color.web("#000000"));
            TMtwo_3.setFill(Color.web("#000000"));
            TMthree_3.setFill(Color.web("#000000"));
            TMfour_3.setFill(Color.web("#000000"));
            TMfive_3.setFill(Color.web("#000000"));
            TMsix_3.setFill(Color.web("#000000"));
            TMseven_3.setFill(Color.web("#000000"));
            TDzero_3.setFill(Color.web("#000000"));
            TDone_3.setFill(Color.web("#000000"));
            TDtwo_3.setFill(Color.web("#000000"));
            TDthree_3.setFill(Color.web("#000000"));
            TDfour_3.setFill(Color.web("#000000"));
            TDfive_3.setFill(Color.web("#000000"));
            TDsix_3.setFill(Color.web("#000000"));
            TDseven_3.setFill(Color.web("#000000"));
            Tresult_3.setFill(Color.web("#000000"));
            K1Latters_3.setFill(Color.web("#000000"));
            K23Latters_3.setFill(Color.web("#000000"));
            K2Latter_3.setFill(Color.web("#000000"));
            K3Latter_3.setFill(Color.web("#000000"));
            K0_3.setFill(Color.web("#000000"));
            K1_3.setFill(Color.web("#000000"));
            K2_3.setFill(Color.web("#000000"));
            K3_3.setFill(Color.web("#000000"));
            K4_3.setFill(Color.web("#000000"));
            K5_3.setFill(Color.web("#000000"));
            K6_3.setFill(Color.web("#000000"));
            K7_3.setFill(Color.web("#000000"));
            RRMzero_3.setStroke(Color.web("#000000"));
            RRMone_3.setStroke(Color.web("#000000"));
            RRMtwo_3.setStroke(Color.web("#000000"));
            RRMthree_3.setStroke(Color.web("#000000"));
            RRMfour_3.setStroke(Color.web("#000000"));
            RRMfive_3.setStroke(Color.web("#000000"));
            RRMsix_3.setStroke(Color.web("#000000"));
            RRMseven_3.setStroke(Color.web("#000000"));
            RRDzero_3.setStroke(Color.web("#000000"));
            RRDone_3.setStroke(Color.web("#000000"));
            RRDtwo_3.setStroke(Color.web("#000000"));
            RRDthree_3.setStroke(Color.web("#000000"));
            RRDfour_3.setStroke(Color.web("#000000"));
            RRDfive_3.setStroke(Color.web("#000000"));
            RRDsix_3.setStroke(Color.web("#000000"));
            RRDseven_3.setStroke(Color.web("#000000"));
            KR0_3.setStroke(Color.web("#000000"));
            KR1_3.setStroke(Color.web("#000000"));
            KR2_3.setStroke(Color.web("#000000"));
            KR3_3.setStroke(Color.web("#000000"));
            KR4_3.setStroke(Color.web("#000000"));
            KR5_3.setStroke(Color.web("#000000"));
            KR6_3.setStroke(Color.web("#000000"));
            KR7_3.setStroke(Color.web("#000000"));
            KL_3.setStroke(Color.web("#000000"));
            resultBar_3.setStroke(Color.web("#000000"));
            resultBar_3.setFill(Color.web("#d9d9d9"));
        }
    }

    private void Var4Theme(boolean state) {
        if (state) {
            Page4variable.setStyle("-fx-background-color: #192734");
            top_4.setFill(Color.web("#15202b"));
            title_4.setFill(Color.web("#ffffff"));
            SP_4.setFill(Color.web("#ffffff"));
            AX_4.setFill(Color.web("#ffffff"));
            minterms_4.setFill(Color.web("#ffffff"));
            dontcare_4.setFill(Color.web("#ffffff"));
            result_4.setFill(Color.web("#ffffff"));
            Contact_4.setFill(Color.web("#ffffff"));
            devoloped_4.setFill(Color.web("#ffffff"));
            TMzero_4.setFill(Color.web("#ffffff"));
            TMone_4.setFill(Color.web("#ffffff"));
            TMtwo_4.setFill(Color.web("#ffffff"));
            TMthree_4.setFill(Color.web("#ffffff"));
            TMfour_4.setFill(Color.web("#ffffff"));
            TMfive_4.setFill(Color.web("#ffffff"));
            TMsix_4.setFill(Color.web("#ffffff"));
            TMseven_4.setFill(Color.web("#ffffff"));
            TMeight_4.setFill(Color.web("#ffffff"));
            TMnine_4.setFill(Color.web("#ffffff"));
            TMten_4.setFill(Color.web("#ffffff"));
            TMeleven_4.setFill(Color.web("#ffffff"));
            TMtwelve_4.setFill(Color.web("#ffffff"));
            TMthirteen_4.setFill(Color.web("#ffffff"));
            TMfourteen_4.setFill(Color.web("#ffffff"));
            TMfifteen_4.setFill(Color.web("#ffffff"));
            TDzero_4.setFill(Color.web("#ffffff"));
            TDone_4.setFill(Color.web("#ffffff"));
            TDtwo_4.setFill(Color.web("#ffffff"));
            TDthree_4.setFill(Color.web("#ffffff"));
            TDfour_4.setFill(Color.web("#ffffff"));
            TDfive_4.setFill(Color.web("#ffffff"));
            TDsix_4.setFill(Color.web("#ffffff"));
            TDseven_4.setFill(Color.web("#ffffff"));
            TDeight_4.setFill(Color.web("#ffffff"));
            TDnine_4.setFill(Color.web("#ffffff"));
            TDten_4.setFill(Color.web("#ffffff"));
            TDeleven_4.setFill(Color.web("#ffffff"));
            TDtwelve_4.setFill(Color.web("#ffffff"));
            TDthirteen_4.setFill(Color.web("#ffffff"));
            TDfourteen_4.setFill(Color.web("#ffffff"));
            TDfifteen_4.setFill(Color.web("#ffffff"));
            ABCD_4.setTextFill(Color.web("#ffffff"));
            WXYZ_4.setTextFill(Color.web("#ffffff"));
            SOP_4.setTextFill(Color.web("#ffffff"));
            POS_4.setTextFill(Color.web("#ffffff"));
            Tresult_4.setFill(Color.web("#ffffff"));
            RRMzero_4.setStroke(Color.web("#ffffff"));
            RRMone_4.setStroke(Color.web("#ffffff"));
            RRMtwo_4.setStroke(Color.web("#ffffff"));
            RRMthree_4.setStroke(Color.web("#ffffff"));
            RRMfour_4.setStroke(Color.web("#ffffff"));
            RRMfive_4.setStroke(Color.web("#ffffff"));
            RRMsix_4.setStroke(Color.web("#ffffff"));
            RRMseven_4.setStroke(Color.web("#ffffff"));
            RRMeight_4.setStroke(Color.web("#ffffff"));
            RRMnine_4.setStroke(Color.web("#ffffff"));
            RRMten_4.setStroke(Color.web("#ffffff"));
            RRMeleven_4.setStroke(Color.web("#ffffff"));
            RRMtwelve_4.setStroke(Color.web("#ffffff"));
            RRMthirteen_4.setStroke(Color.web("#ffffff"));
            RRMfourteen_4.setStroke(Color.web("#ffffff"));
            RRMfifteen_4.setStroke(Color.web("#ffffff"));
            RRDzero_4.setStroke(Color.web("#ffffff"));
            RRDone_4.setStroke(Color.web("#ffffff"));
            RRDtwo_4.setStroke(Color.web("#ffffff"));
            RRDthree_4.setStroke(Color.web("#ffffff"));
            RRDfour_4.setStroke(Color.web("#ffffff"));
            RRDfive_4.setStroke(Color.web("#ffffff"));
            RRDsix_4.setStroke(Color.web("#ffffff"));
            RRDseven_4.setStroke(Color.web("#ffffff"));
            RRDeight_4.setStroke(Color.web("#ffffff"));
            RRDnine_4.setStroke(Color.web("#ffffff"));
            RRDten_4.setStroke(Color.web("#ffffff"));
            RRDeleven_4.setStroke(Color.web("#ffffff"));
            RRDtwelve_4.setStroke(Color.web("#ffffff"));
            RRDthirteen_4.setStroke(Color.web("#ffffff"));
            RRDfourteen_4.setStroke(Color.web("#ffffff"));
            RRDfifteen_4.setStroke(Color.web("#ffffff"));
            K12Latters_4.setFill(Color.web("#ffffff"));
            K34Latters_4.setFill(Color.web("#ffffff"));
            K1Latter_4.setFill(Color.web("#ffffff"));
            K2Latter_4.setFill(Color.web("#ffffff"));
            K3Latter_4.setFill(Color.web("#ffffff"));
            K4Latter_4.setFill(Color.web("#ffffff"));
            K0_4.setFill(Color.web("#ffffff"));
            K1_4.setFill(Color.web("#ffffff"));
            K2_4.setFill(Color.web("#ffffff"));
            K3_4.setFill(Color.web("#ffffff"));
            K4_4.setFill(Color.web("#ffffff"));
            K5_4.setFill(Color.web("#ffffff"));
            K6_4.setFill(Color.web("#ffffff"));
            K7_4.setFill(Color.web("#ffffff"));
            K8_4.setFill(Color.web("#ffffff"));
            K9_4.setFill(Color.web("#ffffff"));
            K10_4.setFill(Color.web("#ffffff"));
            K11_4.setFill(Color.web("#ffffff"));
            K12_4.setFill(Color.web("#ffffff"));
            K13_4.setFill(Color.web("#ffffff"));
            K14_4.setFill(Color.web("#ffffff"));
            K15_4.setFill(Color.web("#ffffff"));
            KR0_4.setStroke(Color.web("#ffffff"));
            KR1_4.setStroke(Color.web("#ffffff"));
            KR2_4.setStroke(Color.web("#ffffff"));
            KR3_4.setStroke(Color.web("#ffffff"));
            KR4_4.setStroke(Color.web("#ffffff"));
            KR5_4.setStroke(Color.web("#ffffff"));
            KR6_4.setStroke(Color.web("#ffffff"));
            KR7_4.setStroke(Color.web("#ffffff"));
            KR8_4.setStroke(Color.web("#ffffff"));
            KR9_4.setStroke(Color.web("#ffffff"));
            KR10_4.setStroke(Color.web("#ffffff"));
            KR11_4.setStroke(Color.web("#ffffff"));
            KR12_4.setStroke(Color.web("#ffffff"));
            KR13_4.setStroke(Color.web("#ffffff"));
            KR14_4.setStroke(Color.web("#ffffff"));
            KR15_4.setStroke(Color.web("#ffffff"));
            KL_4.setStroke(Color.web("#ffffff"));
            resultBar_4.setStroke(Color.web("#ffffff"));
            resultBar_4.setFill(Color.web("#15202b"));
        } else {
            Page4variable.setStyle("-fx-background-color: #ffffff");
            top_4.setFill(Color.web("#d9d9d9"));
            title_4.setFill(Color.web("#000000"));
            SP_4.setFill(Color.web("#000000"));
            AX_4.setFill(Color.web("#000000"));
            minterms_4.setFill(Color.web("#000000"));
            dontcare_4.setFill(Color.web("#000000"));
            result_4.setFill(Color.web("#000000"));
            Contact_4.setFill(Color.web("#000000"));
            devoloped_4.setFill(Color.web("#000000"));
            TMzero_4.setFill(Color.web("#000000"));
            TMone_4.setFill(Color.web("#000000"));
            TMtwo_4.setFill(Color.web("#000000"));
            TMthree_4.setFill(Color.web("#000000"));
            TMfour_4.setFill(Color.web("#000000"));
            TMfive_4.setFill(Color.web("#000000"));
            TMsix_4.setFill(Color.web("#000000"));
            TMseven_4.setFill(Color.web("#000000"));
            TMeight_4.setFill(Color.web("#000000"));
            TMnine_4.setFill(Color.web("#000000"));
            TMten_4.setFill(Color.web("#000000"));
            TMeleven_4.setFill(Color.web("#000000"));
            TMtwelve_4.setFill(Color.web("#000000"));
            TMthirteen_4.setFill(Color.web("#000000"));
            TMfourteen_4.setFill(Color.web("#000000"));
            TMfifteen_4.setFill(Color.web("#000000"));
            TDzero_4.setFill(Color.web("#000000"));
            TDone_4.setFill(Color.web("#000000"));
            TDtwo_4.setFill(Color.web("#000000"));
            TDthree_4.setFill(Color.web("#000000"));
            TDfour_4.setFill(Color.web("#000000"));
            TDfive_4.setFill(Color.web("#000000"));
            TDsix_4.setFill(Color.web("#000000"));
            TDseven_4.setFill(Color.web("#000000"));
            TDeight_4.setFill(Color.web("#000000"));
            TDnine_4.setFill(Color.web("#000000"));
            TDten_4.setFill(Color.web("#000000"));
            TDeleven_4.setFill(Color.web("#000000"));
            TDtwelve_4.setFill(Color.web("#000000"));
            TDthirteen_4.setFill(Color.web("#000000"));
            TDfourteen_4.setFill(Color.web("#000000"));
            TDfifteen_4.setFill(Color.web("#000000"));
            ABCD_4.setTextFill(Color.web("#000000"));
            WXYZ_4.setTextFill(Color.web("#000000"));
            SOP_4.setTextFill(Color.web("#000000"));
            POS_4.setTextFill(Color.web("#000000"));
            Tresult_4.setFill(Color.web("#000000"));
            RRMzero_4.setStroke(Color.web("#000000"));
            RRMone_4.setStroke(Color.web("#000000"));
            RRMtwo_4.setStroke(Color.web("#000000"));
            RRMthree_4.setStroke(Color.web("#000000"));
            RRMfour_4.setStroke(Color.web("#000000"));
            RRMfive_4.setStroke(Color.web("#000000"));
            RRMsix_4.setStroke(Color.web("#000000"));
            RRMseven_4.setStroke(Color.web("#000000"));
            RRMeight_4.setStroke(Color.web("#000000"));
            RRMnine_4.setStroke(Color.web("#000000"));
            RRMten_4.setStroke(Color.web("#000000"));
            RRMeleven_4.setStroke(Color.web("#000000"));
            RRMtwelve_4.setStroke(Color.web("#000000"));
            RRMthirteen_4.setStroke(Color.web("#000000"));
            RRMfourteen_4.setStroke(Color.web("#000000"));
            RRMfifteen_4.setStroke(Color.web("#000000"));
            RRDzero_4.setStroke(Color.web("#000000"));
            RRDone_4.setStroke(Color.web("#000000"));
            RRDtwo_4.setStroke(Color.web("#000000"));
            RRDthree_4.setStroke(Color.web("#000000"));
            RRDfour_4.setStroke(Color.web("#000000"));
            RRDfive_4.setStroke(Color.web("#000000"));
            RRDsix_4.setStroke(Color.web("#000000"));
            RRDseven_4.setStroke(Color.web("#000000"));
            RRDeight_4.setStroke(Color.web("#000000"));
            RRDnine_4.setStroke(Color.web("#000000"));
            RRDten_4.setStroke(Color.web("#000000"));
            RRDeleven_4.setStroke(Color.web("#000000"));
            RRDtwelve_4.setStroke(Color.web("#000000"));
            RRDthirteen_4.setStroke(Color.web("#000000"));
            RRDfourteen_4.setStroke(Color.web("#000000"));
            RRDfifteen_4.setStroke(Color.web("#000000"));
            K12Latters_4.setFill(Color.web("#000000"));
            K34Latters_4.setFill(Color.web("#000000"));
            K1Latter_4.setFill(Color.web("#000000"));
            K2Latter_4.setFill(Color.web("#000000"));
            K3Latter_4.setFill(Color.web("#000000"));
            K4Latter_4.setFill(Color.web("#000000"));
            K0_4.setFill(Color.web("#000000"));
            K1_4.setFill(Color.web("#000000"));
            K2_4.setFill(Color.web("#000000"));
            K3_4.setFill(Color.web("#000000"));
            K4_4.setFill(Color.web("#000000"));
            K5_4.setFill(Color.web("#000000"));
            K6_4.setFill(Color.web("#000000"));
            K7_4.setFill(Color.web("#000000"));
            K8_4.setFill(Color.web("#000000"));
            K9_4.setFill(Color.web("#000000"));
            K10_4.setFill(Color.web("#000000"));
            K11_4.setFill(Color.web("#000000"));
            K12_4.setFill(Color.web("#000000"));
            K13_4.setFill(Color.web("#000000"));
            K14_4.setFill(Color.web("#000000"));
            K15_4.setFill(Color.web("#000000"));
            KR0_4.setStroke(Color.web("#000000"));
            KR1_4.setStroke(Color.web("#000000"));
            KR2_4.setStroke(Color.web("#000000"));
            KR3_4.setStroke(Color.web("#000000"));
            KR4_4.setStroke(Color.web("#000000"));
            KR5_4.setStroke(Color.web("#000000"));
            KR6_4.setStroke(Color.web("#000000"));
            KR7_4.setStroke(Color.web("#000000"));
            KR8_4.setStroke(Color.web("#000000"));
            KR9_4.setStroke(Color.web("#000000"));
            KR10_4.setStroke(Color.web("#000000"));
            KR11_4.setStroke(Color.web("#000000"));
            KR12_4.setStroke(Color.web("#000000"));
            KR13_4.setStroke(Color.web("#000000"));
            KR14_4.setStroke(Color.web("#000000"));
            KR15_4.setStroke(Color.web("#000000"));
            KL_4.setStroke(Color.web("#000000"));
            resultBar_4.setStroke(Color.web("#000000"));
            resultBar_4.setFill(Color.web("#d9d9d9"));
        }
    }

    //ABCD/ WXYZ
    @FXML
    private void latters_2(ActionEvent L) {
        if (L.getTarget() == AB_2) {
            K1Latters_2.setText("A");
            K2Latters_2.setText("B");
            result_2.setText(result_2.getText().replaceAll("X", "A"));
            result_2.setText(result_2.getText().replaceAll("Y", "B"));
        } else if (L.getTarget() == XY_2) {
            K1Latters_2.setText("X");
            K2Latters_2.setText("Y");
            result_2.setText(result_2.getText().replaceAll("A", "X"));
            result_2.setText(result_2.getText().replaceAll("B", "Y"));
        }
    }

    @FXML
    private void latters_3(ActionEvent L) {
        if (L.getTarget() == ABC_3) {
            K1Latters_3.setText("A");
            K23Latters_3.setText("BC");
            K2Latter_3.setText("B");
            K3Latter_3.setText("C");
            result_3.setText(result_3.getText().replaceAll("X", "A"));
            result_3.setText(result_3.getText().replaceAll("Y", "B"));
            result_3.setText(result_3.getText().replaceAll("Z", "C"));
        } else if (L.getTarget() == XYZ_3) {
            K1Latters_3.setText("X");
            K23Latters_3.setText("YZ");
            K2Latter_3.setText("Y");
            K3Latter_3.setText("Z");
            result_3.setText(result_3.getText().replaceAll("A", "X"));
            result_3.setText(result_3.getText().replaceAll("B", "Y"));
            result_3.setText(result_3.getText().replaceAll("C", "Z"));
        }
    }

    @FXML
    private void latters_4(ActionEvent L) {
        if (L.getTarget() == ABCD_4) {
            K12Latters_4.setText("AB");
            K34Latters_4.setText("CD");
            K1Latter_4.setText("A");
            K2Latter_4.setText("B");
            K3Latter_4.setText("C");
            K4Latter_4.setText("D");
            Tresult_4.setText(Tresult_4.getText().replaceAll("W", "A"));
            Tresult_4.setText(Tresult_4.getText().replaceAll("Z", "B"));
            Tresult_4.setText(Tresult_4.getText().replaceAll("Y", "C"));
            Tresult_4.setText(Tresult_4.getText().replaceAll("Z", "D"));
        } else if (L.getTarget() == WXYZ_4) {
            K12Latters_4.setText("WX");
            K34Latters_4.setText("YZ");
            K1Latter_4.setText("W");
            K2Latter_4.setText("x");
            K3Latter_4.setText("Y");
            K4Latter_4.setText("Z");
            Tresult_4.setText(Tresult_4.getText().replaceAll("A", "W"));
            Tresult_4.setText(Tresult_4.getText().replaceAll("B", "X"));
            Tresult_4.setText(Tresult_4.getText().replaceAll("C", "Y"));
            Tresult_4.setText(Tresult_4.getText().replaceAll("D", "Z"));
        }
    }

    @FXML
    private void setSP_2(ActionEvent L) {
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = AB_2.isSelected() ? 1 : 0;
        sopORpos = SOP_2.isSelected() ? 1 : 0;
      
        result_2.setText(solver2.prepare2(sopORpos, abcdORwxyz, 2));
    }

    @FXML
    private void setSP_3(ActionEvent L) {
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = ABC_3.isSelected() ? 1 : 0;
        sopORpos = SOP_3.isSelected() ? 1 : 0;

        result_3.setText(solver3.prepare3(sopORpos, abcdORwxyz, 3));
    }

    @FXML
    private void setSP_4(ActionEvent L) {
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = ABCD_4.isSelected() ? 1 : 0;
        sopORpos = SOP_4.isSelected() ? 1 : 0;

        Tresult_4.setText(solver4.prepare4(sopORpos, abcdORwxyz, 4));
    }
    //dontcare mainterms buttons
    Solver solver2 = new Solver();

    @FXML
    private void Clicks_2(MouseEvent me) {
        if (me.getTarget().equals(RRMzero_2)) {
            if (K0_2.getText().equals("0") || K0_2.getText().equals("x")) {
                RDzero_2.setSelected(false);
                RMzero_2.setSelected(true);
                K0_2.setText("1");
                solver2.add2(0, "m");
                solver2.findAndRemove("00d");
            } else if (K0_2.getText().equals("1")) {
                RMzero_2.setSelected(false);
                K0_2.setText("0");
                solver2.findAndRemove("00m");
                solver2.findAndRemove("00d");
            }
        } else if (me.getTarget().equals(RRMone_2)) {
            if (K1_2.getText().equals("0") || K1_2.getText().equals("x")) {
                RDone_2.setSelected(false);
                RMone_2.setSelected(true);
                K1_2.setText("1");
                solver2.add2(1, "m");
                solver2.findAndRemove("01d");
            } else if (K1_2.getText().equals("1")) {
                RMone_2.setSelected(false);
                K1_2.setText("0");
                solver2.findAndRemove("01m");
                solver2.findAndRemove("01d");
            }
        } else if (me.getTarget().equals(RRMtwo_2)) {
            if (K2_2.getText().equals("0") || K2_2.getText().equals("x")) {
                RDtwo_2.setSelected(false);
                RMtwo_2.setSelected(true);
                K2_2.setText("1");
                solver2.add2(2, "m");
                solver2.findAndRemove("10d");
            } else if (K2_2.getText().equals("1")) {
                RMtwo_2.setSelected(false);
                K2_2.setText("0");
                solver2.findAndRemove("10m");
                solver2.findAndRemove("10d");
            }
        } else if (me.getTarget().equals(RRMthree_2)) {
            if (K3_2.getText().equals("0") || K3_2.getText().equals("x")) {
                RDthree_2.setSelected(false);
                RMthree_2.setSelected(true);
                K3_2.setText("1");
                solver2.add2(3, "m");
                solver2.findAndRemove("11d");
            } else if (K3_2.getText().equals("1")) {
                RMthree_2.setSelected(false);
                K3_2.setText("0");
                solver2.findAndRemove("11m");
                solver2.findAndRemove("11d");
            }
        } else if (me.getTarget().equals(RRDzero_2)) {
            if (K0_2.getText().equals("0") || K0_2.getText().equals("1")) {
                RMzero_2.setSelected(false);
                RDzero_2.setSelected(true);
                K0_2.setText("x");
                solver2.add2(0, "d");
                solver2.findAndRemove("00m");
            } else if (K0_2.getText().equals("x")) {
                RDzero_2.setSelected(false);
                K0_2.setText("0");
                solver2.findAndRemove("00m");
                solver2.findAndRemove("00d");
            }
        } else if (me.getTarget().equals(RRDone_2)) {
            if (K1_2.getText().equals("0") || K1_2.getText().equals("1")) {
                RMone_2.setSelected(false);
                RDone_2.setSelected(true);
                K1_2.setText("x");
                solver2.add2(1, "d");
                solver2.findAndRemove("01m");
            } else if (K1_2.getText().equals("x")) {
                RDone_2.setSelected(false);
                K1_2.setText("0");
                solver2.findAndRemove("01m");
                solver2.findAndRemove("01d");
            }
        } else if (me.getTarget().equals(RRDtwo_2)) {
            if (K2_2.getText().equals("0") || K2_2.getText().equals("1")) {
                RMtwo_2.setSelected(false);
                RDtwo_2.setSelected(true);
                K2_2.setText("x");
                solver2.add2(2, "d");
                solver2.findAndRemove("10m");
            } else if (K2_2.getText().equals("x")) {
                RDtwo_2.setSelected(false);
                K2_2.setText("0");
                solver2.findAndRemove("10m");
                solver2.findAndRemove("10d");
            }
        } else if (me.getTarget().equals(RRDthree_2)) {
            if (K3_2.getText().equals("0") || K3_2.getText().equals("1")) {
                RMthree_2.setSelected(false);
                RDthree_2.setSelected(true);
                K3_2.setText("x");
                solver2.add2(3, "d");
                solver2.findAndRemove("11m");
            } else if (K3_2.getText().equals("x")) {
                RDthree_2.setSelected(false);
                K3_2.setText("0");
                solver2.findAndRemove("11m");
                solver2.findAndRemove("11d");
            }
        }
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = AB_2.isSelected() ? 1 : 0;
        sopORpos = SOP_2.isSelected() ? 1 : 0;

        result_2.setText(solver2.prepare2(sopORpos, abcdORwxyz, 2));
    }
    Solver solver3 = new Solver();

    @FXML
    private void Clicks_3(MouseEvent me) {
        if (me.getTarget().equals(RRMzero_3)) {
            if (K0_3.getText().equals("0") || K0_3.getText().equals("x")) {
                RDzero_3.setSelected(false);
                RMzero_3.setSelected(true);
                K0_3.setText("1");
                solver3.add3(0, "m");
                solver3.findAndRemove("000d");
            } else if (K0_3.getText().equals("1")) {
                RMzero_3.setSelected(false);
                K0_3.setText("0");
                solver3.findAndRemove("000d");
                solver3.findAndRemove("000m");
            }
        } else if (me.getTarget().equals(RRMone_3)) {
            if (K1_3.getText().equals("0") || K1_3.getText().equals("x")) {
                RDone_3.setSelected(false);
                RMone_3.setSelected(true);
                K1_3.setText("1");
                solver3.add3(1, "m");
                solver3.findAndRemove("001d");
            } else if (K1_3.getText().equals("1")) {
                RMone_3.setSelected(false);
                K1_3.setText("0");
                solver3.findAndRemove("001d");
                solver3.findAndRemove("001m");
            }
        } else if (me.getTarget().equals(RRMtwo_3)) {
            if (K2_3.getText().equals("0") || K2_3.getText().equals("x")) {
                RDtwo_3.setSelected(false);
                RMtwo_3.setSelected(true);
                K2_3.setText("1");
                solver3.add3(2, "m");
                solver3.findAndRemove("010d");
            } else if (K2_3.getText().equals("1")) {
                RMtwo_3.setSelected(false);
                K2_3.setText("0");
                solver3.findAndRemove("010d");
                solver3.findAndRemove("010m");
            }
        } else if (me.getTarget().equals(RRMthree_3)) {
            if (K3_3.getText().equals("0") || K3_3.getText().equals("x")) {
                RDthree_3.setSelected(false);
                RMthree_3.setSelected(true);
                K3_3.setText("1");
                solver3.add3(3, "m");
                solver3.findAndRemove("011d");
            } else if (K3_3.getText().equals("1")) {
                RMthree_3.setSelected(false);
                K3_3.setText("0");
                solver3.findAndRemove("011d");
                solver3.findAndRemove("011m");
            }
        } else if (me.getTarget().equals(RRMfour_3)) {
            if (K4_3.getText().equals("0") || K4_3.getText().equals("x")) {
                RDfour_3.setSelected(false);
                RMfour_3.setSelected(true);
                K4_3.setText("1");
                solver3.add3(4, "m");
                solver3.findAndRemove("100d");
            } else if (K4_3.getText().equals("1")) {
                RMfour_3.setSelected(false);
                K4_3.setText("0");
                solver3.findAndRemove("100d");
                solver3.findAndRemove("100m");
            }
        } else if (me.getTarget().equals(RRMfive_3)) {
            if (K5_3.getText().equals("0") || K5_3.getText().equals("x")) {
                RDfive_3.setSelected(false);
                RMfive_3.setSelected(true);
                K5_3.setText("1");
                solver3.add3(5, "m");
                solver3.findAndRemove("101d");
            } else if (K5_3.getText().equals("1")) {
                RMfive_3.setSelected(false);
                K5_3.setText("0");
                solver3.findAndRemove("101d");
                solver3.findAndRemove("101m");
            }
        } else if (me.getTarget().equals(RRMsix_3)) {
            if (K6_3.getText().equals("0") || K6_3.getText().equals("x")) {
                RDsix_3.setSelected(false);
                RMsix_3.setSelected(true);
                K6_3.setText("1");
                solver3.add3(6, "m");
                solver3.findAndRemove("110d");
            } else if (K6_3.getText().equals("1")) {
                RMsix_3.setSelected(false);
                K6_3.setText("0");
                solver3.findAndRemove("110d");
                solver3.findAndRemove("110m");
            }
        } else if (me.getTarget().equals(RRMseven_3)) {
            if (K7_3.getText().equals("0") || K7_3.getText().equals("x")) {
                RDseven_3.setSelected(false);
                RMseven_3.setSelected(true);
                K7_3.setText("1");
                solver3.add3(7, "m");
                solver3.findAndRemove("111d");
            } else if (K7_3.getText().equals("1")) {
                RMseven_3.setSelected(false);
                K7_3.setText("0");
                solver3.findAndRemove("111d");
                solver3.findAndRemove("111m");
            }
            //=====================
        } else if (me.getTarget().equals(RRDzero_3)) {
            if (K0_3.getText().equals("0") || K0_3.getText().equals("1")) {
                RMzero_3.setSelected(false);
                RDzero_3.setSelected(true);
                K0_3.setText("x");
                solver3.add3(0, "d");
                solver3.findAndRemove("000m");
            } else if (K0_3.getText().equals("x")) {
                RDzero_3.setSelected(false);
                K0_3.setText("0");
                solver3.findAndRemove("000d");
                solver3.findAndRemove("000m");
            }
        } else if (me.getTarget().equals(RRDone_3)) {
            if (K1_3.getText().equals("0") || K1_3.getText().equals("1")) {
                RMone_3.setSelected(false);
                RDone_3.setSelected(true);
                K1_3.setText("x");
                solver3.add3(1, "d");
                solver3.findAndRemove("001m");
            } else if (K1_3.getText().equals("x")) {
                RDone_3.setSelected(false);
                K1_3.setText("0");
                solver3.findAndRemove("001d");
                solver3.findAndRemove("001m");
            }
        } else if (me.getTarget().equals(RRDtwo_3)) {
            if (K2_3.getText().equals("0") || K2_3.getText().equals("1")) {
                RMtwo_3.setSelected(false);
                RDtwo_3.setSelected(true);
                K2_3.setText("x");
                solver3.add3(2, "d");
                solver3.findAndRemove("010m");
            } else if (K2_3.getText().equals("x")) {
                RDtwo_3.setSelected(false);
                K2_3.setText("0");
                solver3.findAndRemove("010d");
                solver3.findAndRemove("010m");
            }
        } else if (me.getTarget().equals(RRDthree_3)) {
            if (K3_3.getText().equals("0") || K3_3.getText().equals("1")) {
                RMthree_3.setSelected(false);
                RDthree_3.setSelected(true);
                K3_3.setText("x");
                solver3.add3(3, "d");
                solver3.findAndRemove("011m");
            } else if (K3_3.getText().equals("x")) {
                RDthree_3.setSelected(false);
                K3_3.setText("0");
                solver3.findAndRemove("011d");
                solver3.findAndRemove("011m");
            }
        } else if (me.getTarget().equals(RRDfour_3)) {
            if (K4_3.getText().equals("0") || K4_3.getText().equals("1")) {
                RMfour_3.setSelected(false);
                RDfour_3.setSelected(true);
                K4_3.setText("x");
                solver3.add3(4, "d");
                solver3.findAndRemove("100m");
            } else if (K4_3.getText().equals("x")) {
                RDfour_3.setSelected(false);
                K4_3.setText("0");
                solver3.findAndRemove("100d");
                solver3.findAndRemove("100m");
            }
        } else if (me.getTarget().equals(RRDfive_3)) {
            if (K5_3.getText().equals("0") || K5_3.getText().equals("1")) {
                RMfive_3.setSelected(false);
                RDfive_3.setSelected(true);
                K5_3.setText("x");
                solver3.add3(5, "d");
                solver3.findAndRemove("101m");
            } else if (K5_3.getText().equals("x")) {
                RDfive_3.setSelected(false);
                K5_3.setText("0");
                solver3.findAndRemove("101d");
                solver3.findAndRemove("101m");
            }
        } else if (me.getTarget().equals(RRDsix_3)) {
            if (K6_3.getText().equals("0") || K6_3.getText().equals("1")) {
                RMsix_3.setSelected(false);
                RDsix_3.setSelected(true);
                K6_3.setText("x");
                solver3.add3(6, "d");
                solver3.findAndRemove("110m");
            } else if (K6_3.getText().equals("x")) {
                RDsix_3.setSelected(false);
                K6_3.setText("0");
                solver3.findAndRemove("110d");
                solver3.findAndRemove("110m");
            }
        } else if (me.getTarget().equals(RRDseven_3)) {
            if (K7_3.getText().equals("0") || K7_3.getText().equals("1")) {
                RMseven_3.setSelected(false);
                RDseven_3.setSelected(true);
                K7_3.setText("x");
                solver3.add3(7, "d");
                solver3.findAndRemove("111m");
            } else if (K7_3.getText().equals("x")) {
                RDseven_3.setSelected(false);
                K7_3.setText("0");
                solver3.findAndRemove("111d");
                solver3.findAndRemove("111m");
            }
        }
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = ABC_3.isSelected() ? 1 : 0;
        sopORpos = SOP_3.isSelected() ? 1 : 0;

        result_3.setText(solver3.prepare3(sopORpos, abcdORwxyz, 3));
    }
    Solver solver4 = new Solver();

    @FXML
    private void Clicks_4(MouseEvent me) {
        if (me.getTarget().equals(RRMzero_4)) {
            if (K0_4.getText().equals("0") || K0_4.getText().equals("x")) {
                RDzero_4.setSelected(false);
                RMzero_4.setSelected(true);
                K0_4.setText("1");
                solver4.add4(0, "m");
                solver4.findAndRemove("0000d");
            } else if (K0_4.getText().equals("1")) {
                RMzero_4.setSelected(false);
                K0_4.setText("0");
                solver4.findAndRemove("0000d");
                solver4.findAndRemove("0000m");
            }
        } else if (me.getTarget().equals(RRMone_4)) {
            if (K1_4.getText().equals("0") || K1_4.getText().equals("x")) {
                RDone_4.setSelected(false);
                RMone_4.setSelected(true);
                K1_4.setText("1");
                solver4.add4(1, "m");
                solver4.findAndRemove("0001d");
            } else if (K1_4.getText().equals("1")) {
                RMone_4.setSelected(false);
                K1_4.setText("0");
                solver4.findAndRemove("0001d");
                solver4.findAndRemove("0001m");
            }
        } else if (me.getTarget().equals(RRMtwo_4)) {
            if (K2_4.getText().equals("0") || K2_4.getText().equals("x")) {
                RDtwo_4.setSelected(false);
                RMtwo_4.setSelected(true);
                K2_4.setText("1");
                solver4.add4(2, "m");
                solver4.findAndRemove("0010d");
            } else if (K2_4.getText().equals("1")) {
                RMtwo_4.setSelected(false);
                K2_4.setText("0");
                solver4.findAndRemove("0010d");
                solver4.findAndRemove("0010m");
            }
        } else if (me.getTarget().equals(RRMthree_4)) {
            if (K3_4.getText().equals("0") || K3_4.getText().equals("x")) {
                RDthree_4.setSelected(false);
                RMthree_4.setSelected(true);
                K3_4.setText("1");
                solver4.add4(3, "m");
                solver4.findAndRemove("0011d");
            } else if (K3_4.getText().equals("1")) {
                RMthree_4.setSelected(false);
                K3_4.setText("0");
                solver4.findAndRemove("0011d");
                solver4.findAndRemove("0011m");
            }
        } else if (me.getTarget().equals(RRMfour_4)) {
            if (K4_4.getText().equals("0") || K4_4.getText().equals("x")) {
                RDfour_4.setSelected(false);
                RMfour_4.setSelected(true);
                K4_4.setText("1");
                solver4.add4(4, "m");
                solver4.findAndRemove("0100d");
            } else if (K4_4.getText().equals("1")) {
                RMfour_4.setSelected(false);
                K4_4.setText("0");
                solver4.findAndRemove("0100d");
                solver4.findAndRemove("0100m");
            }
        } else if (me.getTarget().equals(RRMfive_4)) {
            if (K5_4.getText().equals("0") || K5_4.getText().equals("x")) {
                RDfive_4.setSelected(false);
                RMfive_4.setSelected(true);
                K5_4.setText("1");
                solver4.add4(5, "m");
                solver4.findAndRemove("0101d");
            } else if (K5_4.getText().equals("1")) {
                RMfive_4.setSelected(false);
                K5_4.setText("0");
                solver4.findAndRemove("0101d");
                solver4.findAndRemove("0101m");
            }
        } else if (me.getTarget().equals(RRMsix_4)) {
            if (K6_4.getText().equals("0") || K6_4.getText().equals("x")) {
                RDsix_4.setSelected(false);
                RMsix_4.setSelected(true);
                K6_4.setText("1");
                solver4.add4(6, "m");
                solver4.findAndRemove("0110d");
            } else if (K6_4.getText().equals("1")) {
                RMsix_4.setSelected(false);
                K6_4.setText("0");
                solver4.findAndRemove("0110d");
                solver4.findAndRemove("0110m");
            }
        } else if (me.getTarget().equals(RRMseven_4)) {
            if (K7_4.getText().equals("0") || K7_4.getText().equals("x")) {
                RDseven_4.setSelected(false);
                RMseven_4.setSelected(true);
                K7_4.setText("1");
                solver4.add4(7, "m");
                solver4.findAndRemove("0111d");
            } else if (K7_4.getText().equals("1")) {
                RMseven_4.setSelected(false);
                K7_4.setText("0");
                solver4.findAndRemove("0111d");
                solver4.findAndRemove("0111m");
            }
        } else if (me.getTarget().equals(RRMeight_4)) {
            if (K8_4.getText().equals("0") || K8_4.getText().equals("x")) {
                RDeight_4.setSelected(false);
                RMeight_4.setSelected(true);
                K8_4.setText("1");
                solver4.add4(8, "m");
                solver4.findAndRemove("1000d");
            } else if (K8_4.getText().equals("1")) {
                RMeight_4.setSelected(false);
                K8_4.setText("0");
                solver4.findAndRemove("1000d");
                solver4.findAndRemove("1000m");
            }
        } else if (me.getTarget().equals(RRMnine_4)) {
            if (K9_4.getText().equals("0") || K9_4.getText().equals("x")) {
                RDnine_4.setSelected(false);
                RMnine_4.setSelected(true);
                K9_4.setText("1");
                solver4.add4(9, "m");
                solver4.findAndRemove("1001d");
            } else if (K9_4.getText().equals("1")) {
                RMnine_4.setSelected(false);
                K9_4.setText("0");
                solver4.findAndRemove("1001d");
                solver4.findAndRemove("1001m");
            }
        } else if (me.getTarget().equals(RRMten_4)) {
            if (K10_4.getText().equals("0") || K10_4.getText().equals("x")) {
                RDten_4.setSelected(false);
                RMten_4.setSelected(true);
                K10_4.setText("1");
                solver4.add4(10, "m");
                solver4.findAndRemove("1010d");
            } else if (K10_4.getText().equals("1")) {
                RMten_4.setSelected(false);
                K10_4.setText("0");
                solver4.findAndRemove("1010d");
                solver4.findAndRemove("1010m");
            }
        } else if (me.getTarget().equals(RRMeleven_4)) {
            if (K11_4.getText().equals("0") || K11_4.getText().equals("x")) {
                RDeleven_4.setSelected(false);
                RMeleven_4.setSelected(true);
                K11_4.setText("1");
                solver4.add4(11, "m");
                solver4.findAndRemove("1011d");
            } else if (K11_4.getText().equals("1")) {
                RMeleven_4.setSelected(false);
                K11_4.setText("0");
                solver4.findAndRemove("1011d");
                solver4.findAndRemove("1011m");
            }
        } else if (me.getTarget().equals(RRMtwelve_4)) {
            if (K12_4.getText().equals("0") || K12_4.getText().equals("x")) {
                RDtwelve_4.setSelected(false);
                RMtwelve_4.setSelected(true);
                K12_4.setText("1");
                solver4.add4(12, "m");
                solver4.findAndRemove("1100d");
            } else if (K12_4.getText().equals("1")) {
                RMtwelve_4.setSelected(false);
                K12_4.setText("0");
                solver4.findAndRemove("1100d");
                solver4.findAndRemove("1100m");
            }
        } else if (me.getTarget().equals(RRMthirteen_4)) {
            if (K13_4.getText().equals("0") || K13_4.getText().equals("x")) {
                RDthirteen_4.setSelected(false);
                RMthirteen_4.setSelected(true);
                K13_4.setText("1");
                solver4.add4(13, "m");
                solver4.findAndRemove("1101d");
            } else if (K13_4.getText().equals("1")) {
                RMthirteen_4.setSelected(false);
                K13_4.setText("0");
                solver4.findAndRemove("1101d");
                solver4.findAndRemove("1101m");
            }
        } else if (me.getTarget().equals(RRMfourteen_4)) {
            if (K14_4.getText().equals("0") || K14_4.getText().equals("x")) {
                RDfourteen_4.setSelected(false);
                RMfourteen_4.setSelected(true);
                K14_4.setText("1");
                solver4.add4(14, "m");
                solver4.findAndRemove("1110d");
            } else if (K14_4.getText().equals("1")) {
                RMfourteen_4.setSelected(false);
                K14_4.setText("0");
                solver4.findAndRemove("1110d");
                solver4.findAndRemove("1110m");
            }
        } else if (me.getTarget().equals(RRMfifteen_4)) {
            if (K15_4.getText().equals("0") || K15_4.getText().equals("x")) {
                RDfifteen_4.setSelected(false);
                RMfifteen_4.setSelected(true);
                K15_4.setText("1");
                solver4.add4(15, "m");
                solver4.findAndRemove("1111d");
            } else if (K15_4.getText().equals("1")) {
                RMfifteen_4.setSelected(false);
                K15_4.setText("0");
                solver4.findAndRemove("1111d");
                solver4.findAndRemove("1111m");
            }
            //=====================
        } else if (me.getTarget().equals(RRDzero_4)) {
            if (K0_4.getText().equals("0") || K0_4.getText().equals("1")) {
                RMzero_4.setSelected(false);
                RDzero_4.setSelected(true);
                K0_4.setText("x");
                solver4.add4(0, "d");
                solver4.findAndRemove("0000m");
            } else if (K0_4.getText().equals("x")) {
                RDzero_4.setSelected(false);
                K0_4.setText("0");
                solver4.findAndRemove("0000d");
                solver4.findAndRemove("0000m");
            }
        } else if (me.getTarget().equals(RRDone_4)) {
            if (K1_4.getText().equals("0") || K1_4.getText().equals("1")) {
                RMone_4.setSelected(false);
                RDone_4.setSelected(true);
                K1_4.setText("x");
                solver4.add4(1, "d");
                solver4.findAndRemove("0001m");
            } else if (K1_4.getText().equals("x")) {
                RDone_4.setSelected(false);
                K1_4.setText("0");
                solver4.findAndRemove("0001d");
                solver4.findAndRemove("0001m");
            }
        } else if (me.getTarget().equals(RRDtwo_4)) {
            if (K2_4.getText().equals("0") || K2_4.getText().equals("1")) {
                RMtwo_4.setSelected(false);
                RDtwo_4.setSelected(true);
                K2_4.setText("x");
                solver4.add4(2, "d");
                solver4.findAndRemove("0010m");
            } else if (K2_4.getText().equals("x")) {
                RDtwo_4.setSelected(false);
                K2_4.setText("0");
                solver4.findAndRemove("0010d");
                solver4.findAndRemove("0010m");
            }
        } else if (me.getTarget().equals(RRDthree_4)) {
            if (K3_4.getText().equals("0") || K3_4.getText().equals("1")) {
                RMthree_4.setSelected(false);
                RDthree_4.setSelected(true);
                K3_4.setText("x");
                solver4.add4(3, "d");
                solver4.findAndRemove("0011m");
            } else if (K3_4.getText().equals("x")) {
                RDthree_4.setSelected(false);
                K3_4.setText("0");
                solver4.findAndRemove("0011d");
                solver4.findAndRemove("0011m");
            }
        } else if (me.getTarget().equals(RRDfour_4)) {
            if (K4_4.getText().equals("0") || K4_4.getText().equals("1")) {
                RMfour_4.setSelected(false);
                RDfour_4.setSelected(true);
                K4_4.setText("x");
                solver4.add4(4, "d");
                solver4.findAndRemove("0100m");
            } else if (K4_4.getText().equals("x")) {
                RDfour_4.setSelected(false);
                K4_4.setText("0");
                solver4.findAndRemove("0100d");
                solver4.findAndRemove("0100m");
            }
        } else if (me.getTarget().equals(RRDfive_4)) {
            if (K5_4.getText().equals("0") || K5_4.getText().equals("1")) {
                RMfive_4.setSelected(false);
                RDfive_4.setSelected(true);
                K5_4.setText("x");
                solver4.add4(5, "d");
                solver4.findAndRemove("0101m");
            } else if (K5_4.getText().equals("x")) {
                RDfive_4.setSelected(false);
                K5_4.setText("0");
                solver4.findAndRemove("0101d");
                solver4.findAndRemove("0101m");
            }
        } else if (me.getTarget().equals(RRDsix_4)) {
            if (K6_4.getText().equals("0") || K6_4.getText().equals("1")) {
                RMsix_4.setSelected(false);
                RDsix_4.setSelected(true);
                K6_4.setText("x");
                solver4.add4(6, "d");
                solver4.findAndRemove("0110m");
            } else if (K6_4.getText().equals("x")) {
                RDsix_4.setSelected(false);
                K6_4.setText("0");
                solver4.findAndRemove("0110d");
                solver4.findAndRemove("0110m");
            }
        } else if (me.getTarget().equals(RRDseven_4)) {
            if (K7_4.getText().equals("0") || K7_4.getText().equals("1")) {
                RMseven_4.setSelected(false);
                RDseven_4.setSelected(true);
                K7_4.setText("x");
                solver4.add4(7, "d");
                solver4.findAndRemove("0111m");
            } else if (K7_4.getText().equals("x")) {
                RDseven_4.setSelected(false);
                K7_4.setText("0");
                solver4.findAndRemove("0111d");
                solver4.findAndRemove("0111m");
            }
        } else if (me.getTarget().equals(RRDeight_4)) {
            if (K8_4.getText().equals("0") || K8_4.getText().equals("1")) {
                RMeight_4.setSelected(false);
                RDeight_4.setSelected(true);
                K8_4.setText("x");
                solver4.add4(8, "d");
                solver4.findAndRemove("1000m");
            } else if (K8_4.getText().equals("x")) {
                RDeight_4.setSelected(false);
                K8_4.setText("0");
                solver4.findAndRemove("1000d");
                solver4.findAndRemove("1000m");
            }
        } else if (me.getTarget().equals(RRDnine_4)) {
            if (K9_4.getText().equals("0") || K9_4.getText().equals("1")) {
                RMnine_4.setSelected(false);
                RDnine_4.setSelected(true);
                K9_4.setText("x");
                solver4.add4(9, "d");
                solver4.findAndRemove("1001m");
            } else if (K9_4.getText().equals("x")) {
                RDnine_4.setSelected(false);
                K9_4.setText("0");
                solver4.findAndRemove("1001d");
                solver4.findAndRemove("1001m");
            }
        } else if (me.getTarget().equals(RRDten_4)) {
            if (K10_4.getText().equals("0") || K10_4.getText().equals("1")) {
                RMten_4.setSelected(false);
                RDten_4.setSelected(true);
                K10_4.setText("x");
                solver4.add4(10, "d");
                solver4.findAndRemove("1010m");
            } else if (K10_4.getText().equals("x")) {
                RDten_4.setSelected(false);
                K10_4.setText("0");
                solver4.findAndRemove("1010d");
                solver4.findAndRemove("1010m");
            }
        } else if (me.getTarget().equals(RRDeleven_4)) {
            if (K11_4.getText().equals("0") || K11_4.getText().equals("1")) {
                RMeleven_4.setSelected(false);
                RDeleven_4.setSelected(true);
                K11_4.setText("x");
                solver4.add4(11, "d");
                solver4.findAndRemove("1011m");
            } else if (K11_4.getText().equals("x")) {
                RDeleven_4.setSelected(false);
                K11_4.setText("0");
                solver4.findAndRemove("1011d");
                solver4.findAndRemove("1011m");
            }
        } else if (me.getTarget().equals(RRDtwelve_4)) {
            if (K12_4.getText().equals("0") || K12_4.getText().equals("1")) {
                RMtwelve_4.setSelected(false);
                RDtwelve_4.setSelected(true);
                K12_4.setText("x");
                solver4.add4(12, "d");
                solver4.findAndRemove("1100m");
            } else if (K12_4.getText().equals("x")) {
                RDtwelve_4.setSelected(false);
                K12_4.setText("0");
                solver4.findAndRemove("1100d");
                solver4.findAndRemove("1100m");
            }
        } else if (me.getTarget().equals(RRDthirteen_4)) {
            if (K13_4.getText().equals("0") || K13_4.getText().equals("1")) {
                RMthirteen_4.setSelected(false);
                RDthirteen_4.setSelected(true);
                K13_4.setText("x");
                solver4.add4(13, "d");
                solver4.findAndRemove("1101m");
            } else if (K13_4.getText().equals("x")) {
                RDthirteen_4.setSelected(false);
                K13_4.setText("0");
                solver4.findAndRemove("1101d");
                solver4.findAndRemove("1101m");
            }
        } else if (me.getTarget().equals(RRDfourteen_4)) {
            if (K14_4.getText().equals("0") || K14_4.getText().equals("1")) {
                RMfourteen_4.setSelected(false);
                RDfourteen_4.setSelected(true);
                K14_4.setText("x");
                solver4.add4(14, "d");
                solver4.findAndRemove("1110m");
            } else if (K14_4.getText().equals("x")) {
                RDfourteen_4.setSelected(false);
                K14_4.setText("0");
                solver4.findAndRemove("1110d");
                solver4.findAndRemove("1110m");
            }
        } else if (me.getTarget().equals(RRDfifteen_4)) {
            if (K15_4.getText().equals("0") || K15_4.getText().equals("1")) {
                RMfifteen_4.setSelected(false);
                RDfifteen_4.setSelected(true);
                K15_4.setText("x");
                solver4.add4(15, "d");
                solver4.findAndRemove("1111m");
            } else if (K15_4.getText().equals("x")) {
                RDfifteen_4.setSelected(false);
                K15_4.setText("0");
                solver4.findAndRemove("1111d");
                solver4.findAndRemove("1111m");
            }
        }
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = ABCD_4.isSelected() ? 1 : 0;
        sopORpos = SOP_4.isSelected() ? 1 : 0;

        Tresult_4.setText(solver4.prepare4(sopORpos, abcdORwxyz, 4));
    }

    @FXML
    private void KClicks_2(MouseEvent me) {
        if (me.getTarget().equals(KR0_2)) {
            switch (K0_2.getText()) {
                case "0":
                    Event.fireEvent(RRMzero_2, me);
                    break;
                case "1":
                    Event.fireEvent(RRDzero_2, me);
                    break;
                case "x":
                    K0_2.setText("0");
                    RDzero_2.setSelected(false);
                    RMzero_2.setSelected(false);
                    solver2.findAndRemove("00m");
                    solver2.findAndRemove("00d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR1_2)) {
            switch (K1_2.getText()) {
                case "0":
                    Event.fireEvent(RRMone_2, me);
                    break;
                case "1":
                    Event.fireEvent(RRDone_2, me);
                    break;
                case "x":
                    K1_2.setText("0");
                    RDone_2.setSelected(false);
                    RMone_2.setSelected(false);
                    solver2.findAndRemove("01m");
                    solver2.findAndRemove("01d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR2_2)) {
            switch (K2_2.getText()) {
                case "0":
                    Event.fireEvent(RRMtwo_2, me);
                    break;
                case "1":
                    Event.fireEvent(RRDtwo_2, me);
                    break;
                case "x":
                    K2_2.setText("0");
                    RDtwo_2.setSelected(false);
                    RMtwo_2.setSelected(false);
                    solver2.findAndRemove("10m");
                    solver2.findAndRemove("10d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR3_2)) {
            switch (K3_2.getText()) {
                case "0":
                    Event.fireEvent(RRMthree_2, me);
                    break;
                case "1":
                    Event.fireEvent(RRDthree_2, me);
                    break;
                case "x":
                    K3_2.setText("0");
                    RDthree_2.setSelected(false);
                    RMthree_2.setSelected(false);
                    solver2.findAndRemove("11m");
                    solver2.findAndRemove("11d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        }
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = AB_2.isSelected() ? 1 : 0;
        sopORpos = SOP_2.isSelected() ? 1 : 0;
        result_2.setText(solver2.prepare2(sopORpos, abcdORwxyz, 2));
    }

    @FXML
    private void KClicks_3(MouseEvent me) {
        if (me.getTarget().equals(KR0_3)) {
            switch (K0_3.getText()) {
                case "0":
                    Event.fireEvent(RRMzero_3, me);
                    break;
                case "1":
                    Event.fireEvent(RRDzero_3, me);
                    break;
                case "x":
                    K0_3.setText("0");
                    RDzero_3.setSelected(false);
                    RMzero_3.setSelected(false);
                    solver3.findAndRemove("000m");
                    solver3.findAndRemove("000d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR1_3)) {
            switch (K1_3.getText()) {
                case "0":
                    Event.fireEvent(RRMone_3, me);
                    break;
                case "1":
                    Event.fireEvent(RRDone_3, me);
                    break;
                case "x":
                    K1_3.setText("0");
                    RDone_3.setSelected(false);
                    RMone_3.setSelected(false);
                    solver3.findAndRemove("001m");
                    solver3.findAndRemove("001d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR2_3)) {
            switch (K2_3.getText()) {
                case "0":
                    Event.fireEvent(RRMtwo_3, me);
                    break;
                case "1":
                    Event.fireEvent(RRDtwo_3, me);
                    break;
                case "x":
                    K2_3.setText("0");
                    RDtwo_3.setSelected(false);
                    RMtwo_3.setSelected(false);
                    solver3.findAndRemove("010m");
                    solver3.findAndRemove("010d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR3_3)) {
            switch (K3_3.getText()) {
                case "0":
                    Event.fireEvent(RRMthree_3, me);
                    break;
                case "1":
                    Event.fireEvent(RRDthree_3, me);
                    break;
                case "x":
                    K3_3.setText("0");
                    RDthree_3.setSelected(false);
                    RMthree_3.setSelected(false);
                    solver3.findAndRemove("011m");
                    solver3.findAndRemove("011d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR4_3)) {
            switch (K4_3.getText()) {
                case "0":
                    Event.fireEvent(RRMfour_3, me);
                    break;
                case "1":
                    Event.fireEvent(RRDfour_3, me);
                    break;
                case "x":
                    K4_3.setText("0");
                    RDfour_3.setSelected(false);
                    RMfour_3.setSelected(false);
                    solver3.findAndRemove("100m");
                    solver3.findAndRemove("100d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR5_3)) {
            switch (K5_3.getText()) {
                case "0":
                    Event.fireEvent(RRMfive_3, me);
                    break;
                case "1":
                    Event.fireEvent(RRDfive_3, me);
                    break;
                case "x":
                    K5_3.setText("0");
                    RDfive_3.setSelected(false);
                    RMfive_3.setSelected(false);
                    solver3.findAndRemove("101m");
                    solver3.findAndRemove("101d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR6_3)) {
            switch (K6_3.getText()) {
                case "0":
                    Event.fireEvent(RRMsix_3, me);
                    break;
                case "1":
                    Event.fireEvent(RRDsix_3, me);
                    break;
                case "x":
                    K6_3.setText("0");
                    RDsix_3.setSelected(false);
                    RMsix_3.setSelected(false);
                    solver3.findAndRemove("110m");
                    solver3.findAndRemove("110d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR7_3)) {
            switch (K7_3.getText()) {
                case "0":
                    Event.fireEvent(RRMseven_3, me);
                    break;
                case "1":
                    Event.fireEvent(RRDseven_3, me);
                    break;
                case "x":
                    K7_3.setText("0");
                    RDseven_3.setSelected(false);
                    RMseven_3.setSelected(false);
                    solver3.findAndRemove("111m");
                    solver3.findAndRemove("111d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        }
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = ABC_3.isSelected() ? 1 : 0;
        sopORpos = SOP_3.isSelected() ? 1 : 0;

        result_3.setText(solver3.prepare3(sopORpos, abcdORwxyz, 3));
    }

    @FXML
    private void KClicks_4(MouseEvent me) {
        if (me.getTarget().equals(KR0_4)) {
            switch (K0_4.getText()) {
                case "0":
                    Event.fireEvent(RRMzero_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDzero_4, me);
                    break;
                case "x":
                    K0_4.setText("0");
                    RDzero_4.setSelected(false);
                    RMzero_4.setSelected(false);
                    solver4.findAndRemove("0000m");
                    solver4.findAndRemove("0000d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR1_4)) {
            switch (K1_4.getText()) {
                case "0":
                    Event.fireEvent(RRMone_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDone_4, me);
                    break;
                case "x":
                    K1_4.setText("0");
                    RDone_4.setSelected(false);
                    RMone_4.setSelected(false);
                    solver4.findAndRemove("0001m");
                    solver4.findAndRemove("0001d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR2_4)) {
            switch (K2_4.getText()) {
                case "0":
                    Event.fireEvent(RRMtwo_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDtwo_4, me);
                    break;
                case "x":
                    K2_4.setText("0");
                    RDtwo_4.setSelected(false);
                    RMtwo_4.setSelected(false);
                    solver4.findAndRemove("0010m");
                    solver4.findAndRemove("0010d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR3_4)) {
            switch (K3_4.getText()) {
                case "0":
                    Event.fireEvent(RRMthree_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDthree_4, me);
                    break;
                case "x":
                    K3_4.setText("0");
                    RDthree_4.setSelected(false);
                    RMthree_4.setSelected(false);
                    solver4.findAndRemove("0011m");
                    solver4.findAndRemove("0011d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR4_4)) {
            switch (K4_4.getText()) {
                case "0":
                    Event.fireEvent(RRMfour_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDfour_4, me);
                    break;
                case "x":
                    K4_4.setText("0");
                    RDfour_4.setSelected(false);
                    RMfour_4.setSelected(false);
                    solver4.findAndRemove("0100m");
                    solver4.findAndRemove("0100d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR5_4)) {
            switch (K5_4.getText()) {
                case "0":
                    Event.fireEvent(RRMfive_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDfive_4, me);
                    break;
                case "x":
                    K5_4.setText("0");
                    RDfive_4.setSelected(false);
                    RMfive_4.setSelected(false);
                    solver4.findAndRemove("0101m");
                    solver4.findAndRemove("0101d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR6_4)) {
            switch (K6_4.getText()) {
                case "0":
                    Event.fireEvent(RRMsix_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDsix_4, me);
                    break;
                case "x":
                    K6_4.setText("0");
                    RDsix_4.setSelected(false);
                    RMsix_4.setSelected(false);
                    solver4.findAndRemove("0110m");
                    solver4.findAndRemove("0110d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR7_4)) {
            switch (K7_4.getText()) {
                case "0":
                    Event.fireEvent(RRMseven_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDseven_4, me);
                    break;
                case "x":
                    K7_4.setText("0");
                    RDseven_4.setSelected(false);
                    RMseven_4.setSelected(false);
                    solver4.findAndRemove("0111m");
                    solver4.findAndRemove("0111d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR8_4)) {
            switch (K8_4.getText()) {
                case "0":
                    Event.fireEvent(RRMeight_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDeight_4, me);
                    break;
                case "x":
                    K8_4.setText("0");
                    RDeight_4.setSelected(false);
                    RMeight_4.setSelected(false);
                    solver4.findAndRemove("1000m");
                    solver4.findAndRemove("1000d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR9_4)) {
            switch (K9_4.getText()) {
                case "0":
                    Event.fireEvent(RRMnine_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDnine_4, me);
                    break;
                case "x":
                    K9_4.setText("0");
                    RDnine_4.setSelected(false);
                    RMnine_4.setSelected(false);
                    solver4.findAndRemove("1001m");
                    solver4.findAndRemove("1001d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR10_4)) {
            switch (K10_4.getText()) {
                case "0":
                    Event.fireEvent(RRMten_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDten_4, me);
                    break;
                case "x":
                    K10_4.setText("0");
                    RDten_4.setSelected(false);
                    RMten_4.setSelected(false);
                    solver4.findAndRemove("1010m");
                    solver4.findAndRemove("1010d");
                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR11_4)) {
            switch (K11_4.getText()) {
                case "0":
                    Event.fireEvent(RRMeleven_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDeleven_4, me);
                    break;
                case "x":
                    K11_4.setText("0");
                    RDeleven_4.setSelected(false);
                    RMeleven_4.setSelected(false);
                    solver4.findAndRemove("1011m");
                    solver4.findAndRemove("1011d");
                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR12_4)) {
            switch (K12_4.getText()) {
                case "0":
                    Event.fireEvent(RRMtwelve_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDtwelve_4, me);
                    break;
                case "x":
                    K12_4.setText("0");
                    RDtwelve_4.setSelected(false);
                    RMtwelve_4.setSelected(false);
                    solver4.findAndRemove("1100m");
                    solver4.findAndRemove("1100d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR13_4)) {
            switch (K13_4.getText()) {
                case "0":
                    Event.fireEvent(RRMthirteen_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDthirteen_4, me);
                    break;
                case "x":
                    K13_4.setText("0");
                    RDthirteen_4.setSelected(false);
                    RMthirteen_4.setSelected(false);
                    solver4.findAndRemove("1101m");
                    solver4.findAndRemove("1101d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR14_4)) {
            switch (K14_4.getText()) {
                case "0":
                    Event.fireEvent(RRMfourteen_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDfourteen_4, me);
                    break;
                case "x":
                    K14_4.setText("0");
                    RDfourteen_4.setSelected(false);
                    RMfourteen_4.setSelected(false);
                    solver4.findAndRemove("1110m");
                    solver4.findAndRemove("1110d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        } else if (me.getTarget().equals(KR15_4)) {
            switch (K15_4.getText()) {
                case "0":
                    Event.fireEvent(RRMfifteen_4, me);
                    break;
                case "1":
                    Event.fireEvent(RRDfifteen_4, me);
                    break;
                case "x":
                    K15_4.setText("0");
                    RDfifteen_4.setSelected(false);
                    RMfifteen_4.setSelected(false);
                    solver4.findAndRemove("1111m");
                    solver4.findAndRemove("1111d");

                    break;
                default:
                    System.out.println("Error : invalid text");
            }
        }
        int sopORpos = 0, abcdORwxyz = 0;
        abcdORwxyz = ABCD_4.isSelected() ? 1 : 0;
        sopORpos = SOP_4.isSelected() ? 1 : 0;

        Tresult_4.setText(solver4.prepare4(sopORpos, abcdORwxyz, 4));
    }

    private void clear_2() {
        solver2 = new Solver();
        K0_2.setText("0");
        RDzero_2.setSelected(false);
        RMzero_2.setSelected(false);

        K1_2.setText("0");
        RDone_2.setSelected(false);
        RMone_2.setSelected(false);

        K2_2.setText("0");
        RDtwo_2.setSelected(false);
        RMtwo_2.setSelected(false);

        K3_2.setText("0");
        RDthree_2.setSelected(false);
        RMthree_2.setSelected(false);
        result_2.setText("0");
        XY_2.setSelected(false);
        AB_2.setSelected(true);
        POS_2.setSelected(false);
        SOP_2.setSelected(true);
    }

    private void clear_3() {
        solver3 = new Solver();
        K0_3.setText("0");
        RDzero_3.setSelected(false);
        RMzero_3.setSelected(false);

        K1_3.setText("0");
        RDone_3.setSelected(false);
        RMone_3.setSelected(false);

        K2_3.setText("0");
        RDtwo_3.setSelected(false);
        RMtwo_3.setSelected(false);

        K3_3.setText("0");
        RDthree_3.setSelected(false);
        RMthree_3.setSelected(false);

        K4_3.setText("0");
        RDfour_3.setSelected(false);
        RMfour_3.setSelected(false);

        K5_3.setText("0");
        RDfive_3.setSelected(false);
        RMfive_3.setSelected(false);

        K6_3.setText("0");
        RDsix_3.setSelected(false);
        RMsix_3.setSelected(false);

        K7_3.setText("0");
        RDseven_3.setSelected(false);
        RMseven_3.setSelected(false);
        result_3.setText("0");
        XYZ_3.setSelected(false);
        ABC_3.setSelected(true);
        POS_3.setSelected(false);
        SOP_3.setSelected(true);
    }

    private void clear_4() {
        solver4 = new Solver();
        K0_4.setText("0");
        RDzero_4.setSelected(false);
        RMzero_4.setSelected(false);

        K1_4.setText("0");
        RDone_4.setSelected(false);
        RMone_4.setSelected(false);

        K2_4.setText("0");
        RDtwo_4.setSelected(false);
        RMtwo_4.setSelected(false);

        K3_4.setText("0");
        RDthree_4.setSelected(false);
        RMthree_4.setSelected(false);

        K4_4.setText("0");
        RDfour_4.setSelected(false);
        RMfour_4.setSelected(false);

        K5_4.setText("0");
        RDfive_4.setSelected(false);
        RMfive_4.setSelected(false);

        K6_4.setText("0");
        RDsix_4.setSelected(false);
        RMsix_4.setSelected(false);

        K7_4.setText("0");
        RDseven_4.setSelected(false);
        RMseven_4.setSelected(false);

        K8_4.setText("0");
        RDeight_4.setSelected(false);
        RMeight_4.setSelected(false);

        K9_4.setText("0");
        RDnine_4.setSelected(false);
        RMnine_4.setSelected(false);

        K10_4.setText("0");
        RDten_4.setSelected(false);
        RMten_4.setSelected(false);

        K11_4.setText("0");
        RDeleven_4.setSelected(false);
        RMeleven_4.setSelected(false);

        K12_4.setText("0");
        RDtwelve_4.setSelected(false);
        RMtwelve_4.setSelected(false);

        K13_4.setText("0");
        RDthirteen_4.setSelected(false);
        RMthirteen_4.setSelected(false);

        K14_4.setText("0");
        RDfourteen_4.setSelected(false);
        RMfourteen_4.setSelected(false);

        K15_4.setText("0");
        RDfifteen_4.setSelected(false);
        RMfifteen_4.setSelected(false);
        Tresult_4.setText("0");
        WXYZ_4.setSelected(false);
        ABCD_4.setSelected(true);
        POS_4.setSelected(false);
        SOP_4.setSelected(true);
    }
    
    @FXML
    private void clear(MouseEvent e){
        if(e.getTarget().equals(cl_2)){
            clear_2();
        }else if(e.getTarget().equals(cl_3)){
            clear_3();
        }else if(e.getTarget().equals(cl_4)){
            clear_4();
        }
    }
}
    //=================
