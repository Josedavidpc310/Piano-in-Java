package Piano_KL;
//Importar estos dos paquetes para leer y dar funciones a las teclas presionadas.
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
//Importar este paquete para poder usar audio en el proyecto.
//Solo se acepta audio en formato wav,aif ó au.
import java.applet.AudioClip;

//@Created By Josedavidpc310

//fijense que en la siguiente linea se añade: implements KeyListener
public class Piano extends javax.swing.JFrame implements KeyListener
{
    //Declaracion de variables.
    
    //Variable para la nota musical.
    AudioClip Bit;
    //Variable para capturar la tecla presionada.
    int key=0;
    //Variable auxiliar para permitir notas largas.
    int keys=0;
    
     //Determinar como iniciara el programa.
     public Piano()
     {
        initComponents();
        addKeyListener(this);
        L1.setText      (" _______________________________________\n");
        L2.setText      ("|  | | | |  |  | | | | | |  |  | | | |  |\n");
        L3.setText      ("|  | | | |  |  | | | | | |  |  | | | |  |\n");
        L4.setText      ("|  | | | |  |  | | | | | |  |  | | | |  |\n");
        L5.setText      ("|  |_| |_|  |  |_| |_| |_|  |  |_| |_|  |\n");
        L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
        L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
        L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
        L9.setText      ("\n");
        L10.setText     ("       Created By Josedavidpc310        ");
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(460, 330));
        setMinimumSize(new java.awt.Dimension(460, 330));
        setResizable(false);

        L1.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L1.setMaximumSize(new java.awt.Dimension(460, 24));
        L1.setMinimumSize(new java.awt.Dimension(460, 24));
        L1.setPreferredSize(new java.awt.Dimension(460, 24));

        L2.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L2.setMaximumSize(new java.awt.Dimension(460, 24));
        L2.setMinimumSize(new java.awt.Dimension(460, 24));
        L2.setPreferredSize(new java.awt.Dimension(460, 24));

        L3.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L3.setMaximumSize(new java.awt.Dimension(460, 24));
        L3.setMinimumSize(new java.awt.Dimension(460, 24));
        L3.setPreferredSize(new java.awt.Dimension(460, 24));

        L4.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L4.setMaximumSize(new java.awt.Dimension(460, 24));
        L4.setMinimumSize(new java.awt.Dimension(460, 24));
        L4.setPreferredSize(new java.awt.Dimension(460, 24));

        L5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L5.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L5.setMaximumSize(new java.awt.Dimension(460, 24));
        L5.setMinimumSize(new java.awt.Dimension(460, 24));
        L5.setPreferredSize(new java.awt.Dimension(460, 24));

        L6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L6.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L6.setMaximumSize(new java.awt.Dimension(460, 24));
        L6.setMinimumSize(new java.awt.Dimension(460, 24));
        L6.setPreferredSize(new java.awt.Dimension(460, 24));

        L7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L7.setMaximumSize(new java.awt.Dimension(460, 24));
        L7.setMinimumSize(new java.awt.Dimension(460, 24));
        L7.setPreferredSize(new java.awt.Dimension(460, 24));

        L8.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L8.setMaximumSize(new java.awt.Dimension(460, 24));
        L8.setMinimumSize(new java.awt.Dimension(460, 24));
        L8.setPreferredSize(new java.awt.Dimension(460, 24));

        L9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L9.setMaximumSize(new java.awt.Dimension(460, 24));
        L9.setMinimumSize(new java.awt.Dimension(460, 24));
        L9.setPreferredSize(new java.awt.Dimension(460, 24));

        L10.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        L10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        L10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        L10.setMaximumSize(new java.awt.Dimension(460, 24));
        L10.setMinimumSize(new java.awt.Dimension(460, 24));
        L10.setPreferredSize(new java.awt.Dimension(460, 24));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L10, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(L1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run()
            {
                new Piano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    // End of variables declaration//GEN-END:variables

    //Eventos del KeyListener    
    @Override
    public void keyTyped(KeyEvent e)
    {
    //KeyTyped ejecutara sus lineas tras haber presionado y soltado una tecla.
    }

    @Override
    public void keyPressed(KeyEvent e) 
    {
    //KeyPressed ejecuta sus lineas de codigo al presionar una tecla.
        key = e.getKeyCode();
        if (key!=keys)
        {
            switch(key)
            {
            case KeyEvent.VK_Q:
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|█| | | |  |  | | | | | |  |  | | | |  |\n");
            L3.setText      ("|█| | | |  |  | | | | | |  |  | | | |  |\n");
            L4.setText      ("|█| | | |  |  | | | | | |  |  | | | |  |\n");
            L5.setText      ("|█|_| |_|  |  |_| |_| |_|  |  |_| |_|  |\n");
            L6.setText      ("|██|   |   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|██|   |   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|██|___|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Do.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_W):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | |█| |  |  | | | | | |  |  | | | |  |\n");
            L3.setText      ("|  | |█| |  |  | | | | | |  |  | | | |  |\n");
            L4.setText      ("|  | |█| |  |  | | | | | |  |  | | | |  |\n");
            L5.setText      ("|  |_|█|_|  |  |_| |_| |_|  |  |_| |_|  |\n");
            L6.setText      ("|   |██|   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |██|   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|██|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Re.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_E):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |█|  | | | | | |  |  | | | |  |\n");
            L3.setText      ("|  | | | |█|  | | | | | |  |  | | | |  |\n");
            L4.setText      ("|  | | | |█|  | | | | | |  |  | | | |  |\n");
            L5.setText      ("|  |_| |_|█|  |_| |_| |_|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |██|   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |██|   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|██|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Mi.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_R):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |█| | | | | |  |  | | | |  |\n");
            L3.setText      ("|  | | | |  |█| | | | | |  |  | | | |  |\n");
            L4.setText      ("|  | | | |  |█| | | | | |  |  | | | |  |\n");
            L5.setText      ("|  |_| |_|  |█|_| |_| |_|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |   |██|   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |██|   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|██|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Fa.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_T):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | |█| | | |  |  | | | |  |\n");
            L3.setText      ("|  | | | |  |  | |█| | | |  |  | | | |  |\n");
            L4.setText      ("|  | | | |  |  | |█| | | |  |  | | | |  |\n");
            L5.setText      ("|  |_| |_|  |  |_|█|_| |_|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |   |   |██|   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |██|   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|██|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Sol.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_Y):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | | |█| |  |  | | | |  |\n");
            L3.setText      ("|  | | | |  |  | | | |█| |  |  | | | |  |\n");
            L4.setText      ("|  | | | |  |  | | | |█| |  |  | | | |  |\n");
            L5.setText      ("|  |_| |_|  |  |_| |_|█|_|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |██|   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |██|   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|██|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/La.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_U):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | | | | |█|  | | | |  |\n");
            L3.setText      ("|  | | | |  |  | | | | | |█|  | | | |  |\n");
            L4.setText      ("|  | | | |  |  | | | | | |█|  | | | |  |\n");
            L5.setText      ("|  |_| |_|  |  |_| |_| |_|█|  |_| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |██|   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |██|   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|██|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Si.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_I):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | | | | |  |█| | | |  |\n");
            L3.setText      ("|  | | | |  |  | | | | | |  |█| | | |  |\n");
            L4.setText      ("|  | | | |  |  | | | | | |  |█| | | |  |\n");
            L5.setText      ("|  |_| |_|  |  |_| |_| |_|  |█|_| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |██|   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |██|   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|██|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Do.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_O):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | | | | |  |  | |█| |  |\n");
            L3.setText      ("|  | | | |  |  | | | | | |  |  | |█| |  |\n");
            L4.setText      ("|  | | | |  |  | | | | | |  |  | |█| |  |\n");
            L5.setText      ("|  |_| |_|  |  |_| |_| |_|  |  |_|█|_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |██|   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |██|   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|██|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Re.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_P):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | | | | |  |  | | | |█|\n");
            L3.setText      ("|  | | | |  |  | | | | | |  |  | | | |█|\n");
            L4.setText      ("|  | | | |  |  | | | | | |  |  | | | |█|\n");
            L5.setText      ("|  |_| |_|  |  |_| |_| |_|  |  |_| |_|█|\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |   |██|\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |   |██|\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|___|██|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Mi.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_2):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  |█| | |  |  | | | | | |  |  | | | |  |\n");
            L3.setText      ("|  |█| | |  |  | | | | | |  |  | | | |  |\n");
            L4.setText      ("|  |█| | |  |  | | | | | |  |  | | | |  |\n");
            L5.setText      ("|  |█| |_|  |  |_| |_| |_|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Do#.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_3):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | |█|  |  | | | | | |  |  | | | |  |\n");
            L3.setText      ("|  | | |█|  |  | | | | | |  |  | | | |  |\n");
            L4.setText      ("|  | | |█|  |  | | | | | |  |  | | | |  |\n");
            L5.setText      ("|  |_| |█|  |  |_| |_| |_|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Mi#.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_4):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  |█| | | | |  |  | | | |  |\n");
            L3.setText      ("|  | | | |  |  |█| | | | |  |  | | | |  |\n");
            L4.setText      ("|  | | | |  |  |█| | | | |  |  | | | |  |\n");
            L5.setText      ("|  |_| |_|  |  |█| |_| |_|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Fa#.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_5):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | |█| | |  |  | | | |  |\n");
            L3.setText      ("|  | | | |  |  | | |█| | |  |  | | | |  |\n");
            L4.setText      ("|  | | | |  |  | | |█| | |  |  | | | |  |\n");
            L5.setText      ("|  |_| |_|  |  |_| |█| |_|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Sol#.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_6):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | | | |█|  |  | | | |  |\n");
            L3.setText      ("|  | | | |  |  | | | | |█|  |  | | | |  |\n");
            L4.setText      ("|  | | | |  |  | | | | |█|  |  | | | |  |\n");
            L5.setText      ("|  |_| |_|  |  |_| |_| |█|  |  |_| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Si#.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_9):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | | | | |  |  |█| | |  |\n");
            L3.setText      ("|  | | | |  |  | | | | | |  |  |█| | |  |\n");
            L4.setText      ("|  | | | |  |  | | | | | |  |  |█| | |  |\n");
            L5.setText      ("|  |_| |_|  |  |_| |_| |_|  |  |█| |_|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Do#.wav"));
            Bit.play();
            keys=key;
            ;break;
            case(KeyEvent.VK_0):
            L1.setText      (" _______________________________________\n");
            L2.setText      ("|  | | | |  |  | | | | | |  |  | | |█|  |\n");
            L3.setText      ("|  | | | |  |  | | | | | |  |  | | |█|  |\n");
            L4.setText      ("|  | | | |  |  | | | | | |  |  | | |█|  |\n");
            L5.setText      ("|  |_| |_|  |  |_| |_| |_|  |  |_| |█|  |\n");
            L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
            L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
            L9.setText      ("\n");
            L10.setText     ("       Created By Josedavidpc310        ");      
            Bit = java.applet.Applet.newAudioClip(getClass().getResource("/Sound/Mi#.wav"));
            Bit.play();
            keys=key;
            ;break;
            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e)
    {
    L1.setText      (" _______________________________________\n");
    L2.setText      ("|  | | | |  |  | | | | | |  |  | | | |  |\n");
    L3.setText      ("|  | | | |  |  | | | | | |  |  | | | |  |\n");
    L4.setText      ("|  | | | |  |  | | | | | |  |  | | | |  |\n");
    L5.setText      ("|  |_| |_|  |  |_| |_| |_|  |  |_| |_|  |\n");
    L6.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
    L7.setText      ("|   |   |   |   |   |   |   |   |   |   |\n");
    L8.setText      ("|___|___|___|___|___|___|___|___|___|___|\n");
    L9.setText      ("\n");
    L10.setText     ("       Created By Josedavidpc310        ");       
    //Detendre el audio
    //Pero primero me asegurare de que se reproduzca adecuadamente(Mentira, me quedo grande...quizas luego).
    //Bit.stop();//Esto detendria el audio pero no suena bien hacerlo de golpe.

    //Ahora que la tecla a sido soltada actualizare la variable auxiliar.
    //permitiendonos volver a presionar la misma nota en el piano.
    keys=246928;
    }
}