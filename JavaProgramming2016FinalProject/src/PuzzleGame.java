import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PuzzleGame extends JFrame implements ActionListener {
    JButton but1, but2, but3, but4, but5, but6, but7, but8, but9, sample, starB;
    Icon star;

    Icon ic0 = new ImageIcon("img/starB0.gif");
    Icon ic10 = new ImageIcon("img/starB10.gif");
    Icon ic20 = new ImageIcon("img/starB20.gif");
    Icon samicon1 = new ImageIcon("img/main.gif");
    Icon samicon2 = new ImageIcon("img/main2.gif");
    Icon samicon3 = new ImageIcon("img/main3.gif");
    Icon ic1 = new ImageIcon("img/1.gif");
    Icon ic2 = new ImageIcon("img/5.gif");
    Icon ic3 = new ImageIcon("img/2.gif");
    Icon ic4 = new ImageIcon("img/7.gif");
    Icon ic5 = new ImageIcon("img/4.gif");
    Icon ic6 = new ImageIcon("img/6.gif");
    Icon ic7 = new ImageIcon("img/8.gif");
    Icon ic8 = new ImageIcon("img/9.gif");
    Icon ic9 = new ImageIcon("img/3.gif");

    Icon ic11 = new ImageIcon("img/12.gif");
    Icon ic12 = new ImageIcon("img/13.gif");
    Icon ic13 = new ImageIcon("img/16.gif");
    Icon ic14 = new ImageIcon("img/11.gif");
    Icon ic15 = new ImageIcon("img/14.gif");
    Icon ic16 = new ImageIcon("img/19.gif");
    Icon ic17 = new ImageIcon("img/17.gif");
    Icon ic18 = new ImageIcon("img/15.gif");
    Icon ic19 = new ImageIcon("img/18.gif");

    Icon ic21 = new ImageIcon("img/24.gif");
    Icon ic22 = new ImageIcon("img/25.gif");
    Icon ic23 = new ImageIcon("img/21.gif");
    Icon ic24 = new ImageIcon("img/27.gif");
    Icon ic25 = new ImageIcon("img/23.gif");
    Icon ic26 = new ImageIcon("img/29.gif");
    Icon ic27 = new ImageIcon("img/28.gif");
    Icon ic28 = new ImageIcon("img/22.gif");
    Icon ic29 = new ImageIcon("img/26.gif");

    PuzzleGame() {
        super("퍼즐 맞추기 게임");

        but1 = new JButton(ic1);
        but1.setBounds(10, 80, 100, 100);
        but2 = new JButton(ic2);
        but2.setBounds(110, 80, 100, 100);
        but3 = new JButton(ic3);
        but3.setBounds(210, 80, 100, 100);
        but4 = new JButton(ic4);
        but4.setBounds(10, 180, 100, 100);
        but5 = new JButton(ic5);
        but5.setBounds(110, 180, 100, 100);
        but6 = new JButton(ic6);
        but6.setBounds(210, 180, 100, 100);
        but7 = new JButton(ic7);
        but7.setBounds(10, 280, 100, 100);
        but8 = new JButton(ic8);
        but8.setBounds(110, 280, 100, 100);
        but9 = new JButton(ic9);
        but9.setBounds(210, 280, 100, 100);
        sample = new JButton(samicon1);
        sample.setBounds(380, 100, 200, 200);

        // 설명
        JLabel lab1 = new JLabel("오른쪽의 아이콘을 움직여서 퍼즐을 맞춰보세요! ▶");
        lab1.setBounds(5, 15, 500, 20);
        JLabel lab2 = new JLabel("▲ 퍼즐 선택");
        lab2.setBounds(380, 320, 200, 20);
        lab2.setForeground(Color.RED);

        starB = new JButton(ic0);
        starB.setBounds(330, 5, 50, 50);
        star = but9.getIcon();

        add(but1);
        add(but2);
        add(but3);
        add(but4);
        add(but5);
        add(but6);
        add(but7);
        add(but8);
        add(but9);
        add(sample);
        add(lab1);
        add(lab2);
        add(starB);
        but1.addActionListener(this);
        but2.addActionListener(this);
        but3.addActionListener(this);
        but4.addActionListener(this);
        but5.addActionListener(this);
        but6.addActionListener(this);
        but7.addActionListener(this);
        but8.addActionListener(this);
        but9.addActionListener(this);
        sample.addActionListener(this);

        setLayout(null);
        setSize(600, 450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == but1) {
            Icon s1 = but1.getIcon();
            if (but2.getIcon() == star) {
                but2.setIcon(s1);
                but1.setIcon(star);
            } else if (but4.getIcon() == star) {
                but4.setIcon(s1);
                but1.setIcon(star);
            }
        }

        if (e.getSource() == but2) {
            Icon s1 = but2.getIcon();
            if (but1.getIcon() == star) {
                but1.setIcon(s1);
                but2.setIcon(star);
            } else if (but5.getIcon() == star) {
                but5.setIcon(s1);
                but2.setIcon(star);
            } else if (but3.getIcon() == star) {
                but3.setIcon(s1);
                but2.setIcon(star);
            }
        }

        if (e.getSource() == but3) {
            Icon s1 = but3.getIcon();
            if (but2.getIcon() == star) {
                but2.setIcon(s1);
                but3.setIcon(star);
            } else if (but6.getIcon() == star) {
                but6.setIcon(s1);
                but3.setIcon(star);
            }
        }

        if (e.getSource() == but4) {
            Icon s1 = but4.getIcon();
            if (but1.getIcon() == star) {
                but1.setIcon(s1);
                but4.setIcon(star);
            } else if (but5.getIcon() == star) {
                but5.setIcon(s1);
                but4.setIcon(star);
            } else if (but7.getIcon() == star) {
                but7.setIcon(s1);
                but4.setIcon(star);
            }
        }

        if (e.getSource() == but5) {
            Icon s1 = but5.getIcon();
            if (but2.getIcon() == star) {
                but2.setIcon(s1);
                but5.setIcon(star);
            } else if (but4.getIcon() == star) {
                but4.setIcon(s1);
                but5.setIcon(star);
            } else if (but6.getIcon() == star) {
                but6.setIcon(s1);
                but5.setIcon(star);
            } else if (but8.getIcon() == star) {
                but8.setIcon(s1);
                but5.setIcon(star);
            }
        }

        if (e.getSource() == but6) {
            Icon s1 = but6.getIcon();
            if (but3.getIcon() == star) {
                but3.setIcon(s1);
                but6.setIcon(star);
            } else if (but5.getIcon() == star) {
                but5.setIcon(s1);
                but6.setIcon(star);
            } else if (but9.getIcon() == star) {
                but9.setIcon(s1);
                but6.setIcon(star);
            }
        }

        if (e.getSource() == but7) {
            Icon s1 = but7.getIcon();
            if (but4.getIcon() == star) {
                but4.setIcon(s1);
                but7.setIcon(star);
            } else if (but8.getIcon() == star) {
                but8.setIcon(s1);
                but7.setIcon(star);
            }
        }

        if (e.getSource() == but8) {
            Icon s1 = but8.getIcon();
            if (but7.getIcon() == star) {
                but7.setIcon(s1);
                but8.setIcon(star);
            } else if (but5.getIcon() == star) {
                but5.setIcon(s1);
                but8.setIcon(star);
            } else if (but9.getIcon() == star) {
                but9.setIcon(s1);
                but8.setIcon(star);
            }

        }

        if (e.getSource() == but9) {
            Icon s1 = but9.getIcon();
            if (but8.getIcon() == star) {
                but8.setIcon(s1);
                but9.setIcon(star);
            } else if (but6.getIcon() == star) {
                but6.setIcon(s1);
                but9.setIcon(star);
            }
        }

        if (e.getSource() == sample) {
            Icon s1 = sample.getIcon();
            if (s1 == samicon3) {
                sample.setIcon(samicon1);
                but1.setIcon(ic1);
                but2.setIcon(ic2);
                but3.setIcon(ic3);
                but4.setIcon(ic4);
                but5.setIcon(ic5);
                but6.setIcon(ic6);
                but7.setIcon(ic7);
                but8.setIcon(ic8);
                but9.setIcon(ic9);
                star = but9.getIcon();
                starB.setIcon(ic0);
            }
            else if (s1 == samicon1) {
                sample.setIcon(samicon2);
                but1.setIcon(ic11);
                but2.setIcon(ic12);
                but3.setIcon(ic13);
                but4.setIcon(ic14);
                but5.setIcon(ic15);
                but6.setIcon(ic16);
                but7.setIcon(ic17);
                but8.setIcon(ic18);
                but9.setIcon(ic19);
                star = but6.getIcon();
                starB.setIcon(ic10);
            }
            else {
                sample.setIcon(samicon3);
                but1.setIcon(ic21);
                but2.setIcon(ic22);
                but3.setIcon(ic23);
                but4.setIcon(ic24);
                but5.setIcon(ic25);
                but6.setIcon(ic26);
                but7.setIcon(ic27);
                but8.setIcon(ic28);
                but9.setIcon(ic29);
                star = but6.getIcon();
                starB.setIcon(ic20);
            }
        }
    }
}