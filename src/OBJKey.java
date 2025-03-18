import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJKey extends SuperObject {
    GamePanel gp;
    public OBJKey(GamePanel gp) {
        this.gp = gp;
        name = "Key";
        try {
            image = ImageIO.read(getClass().getClassLoader().getResourceAsStream("Objects/key.png"));
            image = utilityTool.scaleImage(image, gp.tileSize, gp.tileSize);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
