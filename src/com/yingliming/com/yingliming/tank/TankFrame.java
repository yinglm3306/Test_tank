package com.yingliming.com.yingliming.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Auther: yingliming
 * @Date: 2022/8/13 0013 - 08 - 13 - 21:04
 * @Description: com.yingliming.com.yingliming.tank
 * @Version: 1.0
 **/
public class TankFrame extends Frame {

    int x=200,y=200;
    public TankFrame(){
        setSize(800,600);
        setResizable(false);
        setTitle("tank war");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.addKeyListener(new MyKeyAdapter());


    }

    @Override
    public void paint(Graphics g) {
        g.fillRect(x,y,50,50);
        /*x+=10;
        y+=10;*/
    }

    private class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("key press");
            int key = e.getKeyCode();
            switch (key)
            {
                case KeyEvent.VK_LEFT: x-=10;
                    break;
                case KeyEvent.VK_RIGHT: x+=10;
                    break;
                case KeyEvent.VK_UP: y-=10;
                    break;
                case KeyEvent.VK_DOWN: y+=10;
                    break;
                default:
                    break;
            }



        }

        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("key released");

        }
    }
}
