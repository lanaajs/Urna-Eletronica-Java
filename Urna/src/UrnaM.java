import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class UrnaM extends javax.swing.JFrame 
{
    //metodos gerais
    Metodos m = new Metodos();
    MetodosM mm = new MetodosM();
    
    //metodos dos canditatos
    Vereador ver = new Vereador();
    Prefeito pr = new Prefeito();
    
    //variaveis
    int novo = 1;
    int ca = 0;
    
    public UrnaM() 
    {
        initComponents();
        
        //inicio das labels
        linha2.setVisible(false);
        aperte.setVisible(false);
        branco.setVisible(false);
        laranja.setVisible(false);
        verde.setVisible(false);
        votoL.setVisible(false);
        imgInicial.setVisible(true);
        textoInicial.setVisible(true);
        seuVoto.setVisible(false);
        candi.setVisible(false);
        numero.setVisible(false);
        nome.setVisible(false);
        partido.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        votoB.setVisible(false);
        progresso.setVisible(false);
        fim.setVisible(false);
        libras.setVisible(false);
        NErrado.setVisible(false);
        voltar.setVisible(false);
        
        //barra do menu
        JMenuBar barra = new JMenuBar(); //criando barra de menu
        setJMenuBar(barra);
        
        JMenu menu = new JMenu("Ajuda"); //opção na barra de menu
        barra.add(menu);
     
        JMenuItem arquivo = new JMenuItem("Como Usar"); //sub opção no menu
        try 
        {
            arquivo.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent evt) 
                {
                    File file = new File("src\\pdf\\ajuda.pdf"); //abrir arquivo em pdf 

                    if (file.exists()) 
                    {
                        if (Desktop.isDesktopSupported()) 
                        {
                            try 
                            {
                                Desktop.getDesktop().open(file);
                            } 
                            catch (IOException ex) 
                            {
                                Logger.getLogger(Urna.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            });

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        menu.add(arquivo);
        
        
        JMenu candi = new JMenu("Partidos"); //opção na barra de menu
        barra.add(candi);
        
        JMenuItem arquivo2 = new JMenuItem("Sítio do Pica-Pau Amarelo"); //subopção no menu
        try 
        {
            arquivo2.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent evt) 
                {
                    File file = new File("src\\pdf\\Partido Sítio do Pica-Pau Amarelo .pdf"); //abrir arquivo em pdf 

                    if (file.exists()) 
                    {
                        if (Desktop.isDesktopSupported()) 
                        {
                            try 
                            {
                                Desktop.getDesktop().open(file);
                            } 
                            catch (IOException ex) 
                            {
                                Logger.getLogger(Urna.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            });

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        candi.add(arquivo2);
        
        
        JMenuItem arquivo3 = new JMenuItem("Mundo de Gumball "); //subopção no menu
        try 
        {
            arquivo3.addActionListener(new ActionListener() 
            {
                @Override
                public void actionPerformed(ActionEvent evt) 
                {
                    File file = new File("src\\pdf\\Partido Mundo de Gumball .pdf"); //abrir arquivo em pdf 

                    if (file.exists()) 
                    {
                        if (Desktop.isDesktopSupported()) 
                        {
                            try 
                            {
                                Desktop.getDesktop().open(file);
                            } 
                            catch (IOException ex) 
                            {
                                Logger.getLogger(Urna.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            });

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        candi.add(arquivo3);
       
        //frame
        setTitle("Simulador - Urna Municipal"); //titulo do frame
        setSize(965,680); //tamanho largura e altura
        setDefaultCloseOperation(EXIT_ON_CLOSE); //fecha o cod
        setResizable(false); //não permite mudança no tamanho 
        setLocationRelativeTo(null); //abre no centro da tela
        getContentPane().setBackground(Color.lightGray); //muda cor do frame
        
        //simbolo do frame
        ImageIcon icone = new ImageIcon("src\\img\\simbolo.jpg");
        setIconImage(icone.getImage());   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        textoInicial = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        NErrado = new javax.swing.JLabel();
        votoNulo = new javax.swing.JLabel();
        fim = new javax.swing.JLabel();
        imgInicial = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        c3 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        progresso = new javax.swing.JProgressBar();
        partido2 = new javax.swing.JLabel();
        imgC = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        votoB = new javax.swing.JLabel();
        libras = new javax.swing.JLabel();
        imgS = new javax.swing.JLabel();
        imgC2 = new javax.swing.JLabel();
        branco = new javax.swing.JLabel();
        aperte = new javax.swing.JLabel();
        laranja = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        verde = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        linha2 = new javax.swing.JLabel();
        seuVoto = new javax.swing.JLabel();
        candi = new javax.swing.JLabel();
        partido = new javax.swing.JLabel();
        votoL = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imgC3 = new javax.swing.JLabel();
        linha = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel19.setText("jLabel19");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(229, 227, 183));
        getContentPane().setLayout(null);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/justiça eleitoral.jpg"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(617, 170, 273, 80);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n7.jpg"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(650, 370, 70, 50);

        jButton0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n0.jpg"))); // NOI18N
        jButton0.setBorder(null);
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton0);
        jButton0.setBounds(730, 420, 70, 50);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n8.jpg"))); // NOI18N
        jButton8.setBorder(null);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(730, 370, 60, 50);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n4.jpg"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(650, 320, 70, 60);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n5.jpg"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(730, 320, 60, 60);

        jButton2.setForeground(new java.awt.Color(78, 87, 87));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n2.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(730, 272, 60, 50);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n9.jpg"))); // NOI18N
        jButton9.setBorder(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(800, 370, 60, 50);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/corrige.jpg"))); // NOI18N
        jButton11.setBorder(null);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(720, 480, 80, 50);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n6.jpg"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(800, 320, 60, 60);

        jButton1.setForeground(new java.awt.Color(78, 87, 87));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n1.jpg"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 272, 70, 50);

        jButton3.setForeground(new java.awt.Color(78, 87, 87));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/n3.jpg"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(800, 270, 60, 50);

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/branco.jpg"))); // NOI18N
        jButton10.setBorder(null);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(640, 480, 80, 50);

        textoInicial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        textoInicial.setForeground(new java.awt.Color(51, 51, 51));
        textoInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoInicial.setText("Para continuar clique em CONFIRMAR");
        getContentPane().add(textoInicial);
        textoInicial.setBounds(140, 440, 390, 80);

        c2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(c2);
        c2.setBounds(200, 320, 30, 40);

        numero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numero.setText("Número:");
        getContentPane().add(numero);
        numero.setBounds(80, 320, 60, 40);

        c1.setBackground(new java.awt.Color(255, 255, 255));
        c1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(c1);
        c1.setBounds(160, 320, 30, 40);

        NErrado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(NErrado);
        NErrado.setBounds(80, 360, 330, 30);

        votoNulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        getContentPane().add(votoNulo);
        votoNulo.setBounds(280, 390, 290, 40);

        fim.setFont(new java.awt.Font("Segoe UI Semibold", 1, 80)); // NOI18N
        fim.setForeground(new java.awt.Color(102, 102, 102));
        fim.setText("FIM");
        getContentPane().add(fim);
        fim.setBounds(260, 280, 150, 120);

        imgInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simbolo2.png"))); // NOI18N
        getContentPane().add(imgInicial);
        imgInicial.setBounds(220, 240, 270, 220);

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirma.jpg"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(800, 480, 80, 50);

        c3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(c3);
        c3.setBounds(240, 320, 30, 40);

        c5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(c5);
        c5.setBounds(320, 320, 30, 40);

        progresso.setBackground(new java.awt.Color(181, 181, 181));
        progresso.setForeground(new java.awt.Color(0, 204, 0));
        getContentPane().add(progresso);
        progresso.setBounds(150, 390, 350, 30);

        partido2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(partido2);
        partido2.setBounds(140, 400, 280, 20);
        getContentPane().add(imgC);
        imgC.setBounds(480, 230, 90, 120);

        c4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(c4);
        c4.setBounds(280, 320, 30, 40);

        votoB.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        votoB.setForeground(new java.awt.Color(102, 102, 102));
        votoB.setText("VOTO EM BRANCO");
        getContentPane().add(votoB);
        votoB.setBounds(160, 290, 340, 160);
        getContentPane().add(libras);
        libras.setBounds(330, 280, 249, 250);
        getContentPane().add(imgS);
        imgS.setBounds(460, 360, 50, 60);
        getContentPane().add(imgC2);
        imgC2.setBounds(520, 360, 50, 60);

        branco.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        branco.setForeground(new java.awt.Color(102, 102, 102));
        branco.setText("Clique no BRANCO para VOTO EM BRANCO");
        getContentPane().add(branco);
        branco.setBounds(90, 460, 240, 16);

        aperte.setFont(new java.awt.Font("Segoe UI Symbol", 1, 12)); // NOI18N
        aperte.setForeground(new java.awt.Color(153, 153, 153));
        aperte.setText("APERTE A TECLA");
        getContentPane().add(aperte);
        aperte.setBounds(70, 440, 110, 16);

        laranja.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        laranja.setForeground(new java.awt.Color(102, 102, 102));
        laranja.setText("Clique no LARANJA para CORRIGIR");
        getContentPane().add(laranja);
        laranja.setBounds(90, 480, 210, 16);

        voltar.setBackground(new java.awt.Color(0, 204, 0));
        voltar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        voltar.setText("CLIQUE AQUI");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(260, 460, 130, 30);

        verde.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        verde.setForeground(new java.awt.Color(102, 102, 102));
        verde.setText("Clique no VERDE para CONFIRMAR");
        getContentPane().add(verde);
        verde.setBounds(90, 500, 200, 20);

        nome2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        getContentPane().add(nome2);
        nome2.setBounds(140, 370, 270, 20);

        linha2.setForeground(new java.awt.Color(102, 102, 102));
        linha2.setText("___________________________________________________________________________________________");
        getContentPane().add(linha2);
        linha2.setBounds(70, 420, 510, 20);

        seuVoto.setFont(new java.awt.Font("Segoe UI Semibold", 0, 13)); // NOI18N
        seuVoto.setForeground(new java.awt.Color(102, 102, 102));
        seuVoto.setText("SEU VOTO PARA");
        getContentPane().add(seuVoto);
        seuVoto.setBounds(80, 230, 110, 30);

        candi.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        candi.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(candi);
        candi.setBounds(130, 280, 260, 30);

        partido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        partido.setText("Partido:");
        getContentPane().add(partido);
        partido.setBounds(80, 400, 50, 20);

        votoL.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        votoL.setForeground(new java.awt.Color(102, 102, 102));
        votoL.setText("( VOTO DE LEGENDA )");
        getContentPane().add(votoL);
        votoL.setBounds(440, 490, 140, 30);

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.setText("Nome:");
        getContentPane().add(nome);
        nome.setBounds(80, 370, 50, 20);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 220, 530, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Design sem nome (12).png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(890, 570));
        jLabel1.setMinimumSize(new java.awt.Dimension(890, 570));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 950, 650);
        getContentPane().add(imgC3);
        imgC3.setBounds(520, 360, 50, 60);

        linha.setForeground(new java.awt.Color(102, 102, 102));
        linha.setText("______________________________________________________________________________________");
        getContentPane().add(linha);
        linha.setBounds(70, 420, 500, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        m.digita("4", c1, c2, c3, c4, c5); //digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        m.digita("7", c1, c2, c3, c4, c5);//digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        m.digita("0", c1, c2, c3, c4, c5); //digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        m.digita("8", c1, c2, c3, c4, c5); //digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        m.digita("3", c1, c2, c3, c4, c5); //digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        m.corrige(c1, c2, c3, c4, c5, imgC, imgC2, libras, seuVoto, imgS,nome, nome2, partido, partido2, votoL,linha2, aperte,branco,laranja,verde, NErrado, votoNulo, numero); 
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        votoB.setVisible(false); //remover VOTO EM BRANCO
        candi.setVisible(true);
        m.corrige(c1, c2, c3, c4, c5, imgC, imgC2, libras, seuVoto, imgS,nome, nome2, partido, partido2, votoL,linha2, aperte,branco,laranja,verde, NErrado, votoNulo, numero);
        m.reproduzirSom();   
        
        novo(); //atualizando a tela
        novo++; //incrementando o novo
       
        ca++; //incrementando o cargo
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        m.digita("9", c1, c2, c3, c4, c5); //digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        m.digita("1", c1, c2, c3, c4, c5); //digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        m.digita("2", c1, c2, c3, c4, c5); //digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        m.digita("5", c1, c2, c3, c4, c5); //digita
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        m.digita("6", c1, c2, c3, c4, c5); //digita 
        cargos(); //invocando os canditados
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //tira todas a sinformações na tela e só deixa VOTO EM BRANCO
        m.branco(imgInicial, textoInicial, numero, c1, c2, c3, c4, c5, votoB, branco, nome, partido,partido2,nome2,imgC,imgC2,imgS, seuVoto, candi, laranja, votoL,libras,NErrado,votoNulo); 
    }//GEN-LAST:event_jButton10ActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new LoginM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    //todos os canditados aqui
    public void cargos()
    {
        switch(ca)
        {
            case 1: //vereador
                ver.ver(c1, c2, c3, c4, c5, imgC, libras, seuVoto, nome, nome2, partido, partido2, votoL, linha2, aperte, branco, laranja, verde, NErrado, votoNulo, numero);
            break;
                
            case 2:
                pr.p(c1, c2, imgC, imgC2, nome, nome2, partido, partido2, votoL, linha2, seuVoto, aperte, branco, laranja, verde, NErrado, votoNulo, numero, libras);
            break;
        }
    }
    
    //"atualiza" a tela
    public void novo()
    {
        switch(novo)
        {
            case 1: //vereador
                imgInicial.setVisible(false);     
                textoInicial.setVisible(false);   
                
                linha2.setVisible(false);
                aperte.setVisible(false);
                branco.setVisible(false);
                laranja.setVisible(false);
                verde.setVisible(false);
                
                ver.libras(libras);
                libras.setVisible(true);
                
                candi.setVisible(true);
                candi.setText("Vereador");
                libras.setVisible(true);
                
                seuVoto.setVisible(false);
                numero.setVisible(false);
                nome.setVisible(false);
                partido.setVisible(false);
                
                c1.setVisible(true);
                c2.setVisible(true);
                c3.setVisible(true);
                c4.setVisible(true);
                c5.setVisible(true);
                
                progresso.setVisible(false);
                fim.setVisible(false);
            break;
            
            case 2: //prefeito
             seuVoto.setVisible(false);
                linha2.setVisible(false);
                aperte.setVisible(false);
                branco.setVisible(false);
                laranja.setVisible(false);
                verde.setVisible(false);
                
                candi.setText("Prefeito");
                
                pr.libras(libras);
                libras.setVisible(true);
                
                numero.setVisible(false);
                nome.setVisible(true);
                nome2.setVisible(false);
                partido.setVisible(true);
                partido2.setVisible(false);
                
                imgC.setVisible(false);
                imgC2.setVisible(false);
                imgS.setVisible(false);
                
                nome.setVisible(false);
                partido.setVisible(false);
                
                NErrado.setVisible(false);
                votoNulo.setVisible(false);
                
                c1.setVisible(true);
                c2.setVisible(true);
                c3.setVisible(false);
                c4.setVisible(false);
                c5.setVisible(false);
                
                progresso.setVisible(false);
                fim.setVisible(false);
            break;
            
            case 3: //fim
                libras.setVisible(false);
                
                linha2.setVisible(false);
                aperte.setVisible(false);
                branco.setVisible(false);
                laranja.setVisible(false);
                verde.setVisible(false);
                
                candi.setVisible(false);
                seuVoto.setVisible(false);
                numero.setVisible(false);
                nome.setVisible(false);
                nome2.setVisible(false);
                partido.setVisible(false);
                partido2.setVisible(false);

                candi.setVisible(false);
                imgC.setVisible(false);
                imgC2.setVisible(false);
                imgS.setVisible(false);
                
                NErrado.setVisible(false);
                
                c1.setVisible(false);
                c2.setVisible(false);
                c3.setVisible(false);
                c4.setVisible(false);
                c5.setVisible(false);
                
                progresso.setVisible(false);
                fim.setVisible(true);
                voltar.setVisible(true);
                //novo = 1; //retornar ordem
            break;
            
            case 4: //fim com barra
                libras.setVisible(false);
                
                linha2.setVisible(false);
                aperte.setVisible(false);
                branco.setVisible(false);
                laranja.setVisible(false);
                verde.setVisible(false);
                
                candi.setVisible(false);
                seuVoto.setVisible(false);
                numero.setVisible(false);
                nome.setVisible(false);
                nome2.setVisible(false);
                partido.setVisible(false);
                partido2.setVisible(false);

                candi.setVisible(false);
                imgC.setVisible(false);
                imgC2.setVisible(false);
                imgS.setVisible(false);
                
                NErrado.setVisible(false);
                
                c1.setVisible(false);
                c2.setVisible(false);
                c3.setVisible(false);
                c4.setVisible(false);
                c5.setVisible(false);
                
                progresso.setVisible(true);
                fim.setVisible(true);
                voltar.setVisible(false);
                mm.f(fim, progresso);
            break;
        }
    }
    
    public static void main(String args[]) 
    {        
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Urna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NErrado;
    private javax.swing.JLabel aperte;
    private javax.swing.JLabel branco;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel candi;
    private javax.swing.JLabel fim;
    private javax.swing.JLabel imgC;
    private javax.swing.JLabel imgC2;
    private javax.swing.JLabel imgC3;
    private javax.swing.JLabel imgInicial;
    private javax.swing.JLabel imgS;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel laranja;
    private javax.swing.JLabel libras;
    private javax.swing.JLabel linha;
    private javax.swing.JLabel linha2;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome2;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel partido;
    private javax.swing.JLabel partido2;
    private javax.swing.JProgressBar progresso;
    private javax.swing.JLabel seuVoto;
    private javax.swing.JLabel textoInicial;
    private javax.swing.JLabel verde;
    private javax.swing.JButton voltar;
    private javax.swing.JLabel votoB;
    private javax.swing.JLabel votoL;
    private javax.swing.JLabel votoNulo;
    // End of variables declaration//GEN-END:variables

}
