
package Movetest;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
        
public class Frame extends JFrame{
    private final Screen screen;
    
    float player_posx = 300;
    float player_posy = 300;
    private int player_size = 50;
    
    private boolean key_up = false;
    private boolean key_down = false;
    private boolean key_left = false;
    private boolean key_right = false;
    
    
    public Frame () {
     super("Erstes Spiel");
        this.player_size = 20;
    screen= new Screen();
    screen.setBounds(0, 0, 800, 600);
    add(screen);
    addKeyListener(new Keyhandler());
    }
    
    public boolean getUp(){
        return key_up;
    }
    
    public boolean getDown(){
        return key_down;
    }
    
    public boolean getLeft(){
        return key_left;
    }
    
    public boolean getRight(){
        return key_right;
    }
       
    
    
    
    public void repaintScreen(){
      screen.repaint();
    }

    
    
    
    private class Screen extends JLabel{
        
        @Override
        protected void paintComponent(Graphics g) {
              super.paintComponent(g);
              g.setColor(Color.RED);
              g.fillRect((int)player_posx, (int)player_posy, player_size, player_size);
        
        }        
    }
   private class Keyhandler implements KeyListener{        
       
       
       
       
        @Override
        public void keyTyped(KeyEvent ke) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
          if(e.getKeyCode() == KeyEvent.VK_DOWN)key_down = true; 
          if(e.getKeyCode() == KeyEvent.VK_UP)key_up = true;
          if(e.getKeyCode() == KeyEvent.VK_LEFT)key_left = true;
          if(e.getKeyCode() == KeyEvent.VK_RIGHT)key_right = true;
        }

        @Override
        public void keyReleased(KeyEvent e) {
          if(e.getKeyCode() == KeyEvent.VK_DOWN)key_down = false; 
          if(e.getKeyCode() == KeyEvent.VK_UP)key_up = false;
          if(e.getKeyCode() == KeyEvent.VK_LEFT)key_left = false;
          if(e.getKeyCode() == KeyEvent.VK_RIGHT)key_right = false; 
        }

   }
}
