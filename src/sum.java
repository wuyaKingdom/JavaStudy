import java.awt.*;

import java.awt.event.*;

import java.util.Date;

import java.util.Calendar;

import javax.swing.*;


public class sum {
    public static void main(String[] args) {

        class ClockCanvas extends Canvas implements Runnable {



            public ClockCanvas() {

                this.setSize(250, 250);

                enableEvents(AWTEvent.MOUSE_MOTION_EVENT_MASK);

                new Thread(this).start();

            }

            public void paint(Graphics g) {

                Calendar ca = Calendar.getInstance();

                ca.setTime(new Date());

                String StrTime = ca.get(Calendar.HOUR_OF_DAY) + "时" + ca.get(Calendar.MINUTE) + "分" + ca.get(Calendar.SECOND) + "秒";

                g.fill3DRect(0, 0, 100, 28, false);

                g.setColor(Color.white);

                g.drawString(StrTime, 10, 20);

            }

            public void run() {

                while (true) {

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {

                        e.printStackTrace();

                    }

                    repaint();

                }

            }

        }

        class Clock extends JFrame {

            /**
             * Method main
             *
             * @param args
             */

            public Clock() {

                ClockCanvas cc = new ClockCanvas();

                this.getContentPane().add(cc);

                this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            }

        }
    }
}