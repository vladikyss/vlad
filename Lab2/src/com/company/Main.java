import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Лабораторна №2");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        Termometr temperature = new Termometr();

        JButton temp = new JButton("Моя температура");
        JButton tempdwn = new JButton("понизити");
        JButton tempup = new JButton("підвищити");
        JButton temps = new JButton("Розбити термометр");


        window.getContentPane().add(temp,BorderLayout.NORTH);
        window.getContentPane().add(tempdwn,BorderLayout.WEST);
        window.getContentPane().add(tempup,BorderLayout.EAST);
        window.getContentPane().add(temps,BorderLayout.CENTER);
        window.setSize(400,100);

        temp.addActionListener(new ActionListener()
                                {
                                    public void actionPerformed(ActionEvent e)
                                    {
                                        temperature.printtemer();
                                    }
                                }
        );
        tempdwn.addActionListener(new ActionListener()
                                    {
                                        public void actionPerformed(ActionEvent e)
                                        {
                                            temperature.tempdwn();
                                        }
                                    }
        );

        temps.addActionListener(new ActionListener()
                                          {
                                              public void actionPerformed(ActionEvent e)
                                              {
                                                  temperature.killtemp();
                                              }
                                          }
        );
        tempup.addActionListener(new ActionListener()
                                  {
                                      public void actionPerformed(ActionEvent e)
                                      {
                                          temperature.tempup();
                                      }
                                  }
        );

    }
}

class Termometr {     //landlinephone= termometr
    boolean dead = false;
    boolean alive = true;
    double number = 36.6;

    String nebezpeka = "Небезпека";
    String bezpeka = "Безпека";


    void tempdwn()
    {       number--;
        if((number>34.6)&(number<42)) {
            System.out.println(bezpeka);
            System.out.println(number);
            dead = false;
            alive = true;
        }
        else{
            System.out.println(nebezpeka);
            System.out.println(number);
            dead = true;
            alive = false;

        }

        printVar();
    }
    void tempup()
    {       number++;
        if((number>34.6)&(number<42)) {
            System.out.println(bezpeka);
            System.out.println(number);
            alive = true;
            dead = false;
        }
        else {
            System.out.println(nebezpeka);
            System.out.println(number);
            alive = false;
            dead = true;
        }
        printVar();
    }
    void killtemp()
    {
        System.out.println(nebezpeka);
        dead = true;
        alive = true;
        printVar();
    }
    void printtemer()
    {
        System.out.println("Моя температура:"+number);
    }
    void printVar()
    {
        System.out.println("Можливість померти:"+dead+" Можливість вижити:"+alive);
    }



}