package metal_solid.gfx;

import java.awt.image.BufferedImage;
/**
 * Clase que se utiliza para renderizar las imagenes , recorriendo un array de BufferedImage
 * @author Alejandro
 *
 */
public class Animations {

	private int speed, index;
	long lastTime,timer;
	private BufferedImage[] frames;
	
	/**
	 * @param velocidad
	 * @param indice
	 * @param frames
	 */
	public Animations(int speed,BufferedImage[] frames) {
		this.speed = speed;
		this.frames = frames;
		index = 0;
		timer = 0;
		lastTime = System.currentTimeMillis();
	}
	
	public void tick() {
		timer += System.currentTimeMillis() - lastTime;
		lastTime = System.currentTimeMillis();
		
		if(timer > speed) {
			index++;
			timer = 0;
			if(index >= frames.length) {
				index = 0;
			}
		}
	}
	/**
	 * 
	 * @return Nos devuelve la imagen, que obtendremos con el index
	 */
	public BufferedImage getCurrentFrame() {
		return frames[index];
	}
	
	
	
}
