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

    Tank myTank = new Tank(200,200,Dir.DOWN);

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

        myTank.paint(g);


    }

    private class MyKeyAdapter extends KeyAdapter {
        boolean bl=false;
        boolean br=false;
        boolean bu=false;
        boolean bd=false;
        @Override
        public void keyPressed(KeyEvent e) {
            //System.out.println("key press");
            int key = e.getKeyCode();
            switch (key)
            {
                case KeyEvent.VK_LEFT: bl=true;
                    break;
                case KeyEvent.VK_RIGHT: br=true;
                    break;
                case KeyEvent.VK_UP: bu=true;
                    break;
                case KeyEvent.VK_DOWN: bd=true;
                    break;
                default:
                    break;
            }

            setMainTankDir();



        }



        @Override
        public void keyReleased(KeyEvent e) {
            //System.out.println("key released");
            int key = e.getKeyCode();
            switch (key)
            {
                case KeyEvent.VK_LEFT: bl=false;
                    break;
                case KeyEvent.VK_RIGHT: br=false;
                    break;
                case KeyEvent.VK_UP: bu=false;
                    break;
                case KeyEvent.VK_DOWN: bd=false;
                    break;
                default:
                    break;
            }
            setMainTankDir();

        }

        private void setMainTankDir() {
            if(!bl && !br && !bu && !bd) myTank.setMoving(false);
            else
            {myTank.setMoving(true);

            if(bl) myTank.setDir(Dir.LEFT);
            if(br) myTank.setDir(Dir.RIGHT);
            if(bu) myTank.setDir(Dir.UP);
            if(bd) myTank.setDir(Dir.DOWN);}
        }
    }
}
