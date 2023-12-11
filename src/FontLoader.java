import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class FontLoader {

    public static void main(String[] args) {
        // Load and register each font
        registerFont("src/resources/fonts", "Gilroy-Black.ttf");
        registerFont("src/resources/fonts", "Gilroy-BlackItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-Bold.ttf");
        registerFont("src/resources/fonts", "Gilroy-BoldItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-ExtraBold.ttf");
        registerFont("src/resources/fonts", "Gilroy-ExtraBoldItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-Heavy.ttf");
        registerFont("src/resources/fonts", "Gilroy-HeavyItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-Light.ttf");
        registerFont("src/resources/fonts", "Gilroy-LightItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-Medium.ttf");
        registerFont("src/resources/fonts", "Gilroy-MediumItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-Regular.ttf");
        registerFont("src/resources/fonts", "Gilroy-RegularItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-SemiBold.ttf");
        registerFont("src/resources/fonts", "Gilroy-SemiBoldItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-Thin.ttf");
        registerFont("src/resources/fonts", "Gilroy-ThinItalic.ttf");
        registerFont("src/resources/fonts", "Gilroy-UltraLight.ttf");
        registerFont("src/resources/fonts", "Gilroy-UltraLightItalic.ttf");
    }

    private static void registerFont(String directory, String fontFileName) {
        try {
            // Construct the path to the font file
            String fontFilePath = directory + File.separator + fontFileName;

            // Load the custom font file
            File fontFile = new File(fontFilePath);
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile);

            // Register the font with the system
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
    }
}