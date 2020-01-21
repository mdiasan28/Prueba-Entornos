package videojuego_navidad.arkanoid;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Actor {
		protected int x,y; // Coordenadas en las que se encuentra el actor
		protected int width, height; // Ancho y alto que ocupa, imprescindible para detectar colisiones
		public Color color;
		
		/**
		 * Constructor por defecto, inicializa la propiedad "image" a null, indicando que no hay imagen
		 */
		public Actor() {
		}
		
		/**
		 * Constructor ampl�amente utilizado, indicando el nombre de la imagen a utilizar
		 * @param spriteName
		 */
		public Actor (int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		/**
		 * M�todo para representar este actor en pantalla
		 * @param g
		 */
		public abstract void paint(Graphics g);
		
		/**
		 * M�todo abstracto que debe implementar cada subtipo de Actor. L�gicamente no ser� lo mismo la actuaci�n 
		 * que llevar� a cabo un Player que un Monster.
		 */
		public void act() {
		}

		// Setters y Getters

		public int getX() { return x; }
		public void setX(int x) { this.x = x; }

		public int getY() {	return y; }
		public void setY(int y) { this.y = y; }

		public int getWidth() { return width; }
		public void setWidth(int width) { this.width = width; }

		public int getHeight() { return height; }
		public void setHeight(int height) { this.height = height; }

		/**
		 * @return the color
		 */
		public Color getColor() {
			return color;
		}

		/**
		 * @param color the color to set
		 */
		public void setColor(Color color) {
			this.color = color;
		}
	}
