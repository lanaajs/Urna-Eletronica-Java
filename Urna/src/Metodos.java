import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class Metodos extends javax.swing.JFrame
{
    
    //digitar na tela
    public void digita(String c, JLabel c1, JLabel c2, JLabel c3, JLabel c4, JLabel c5)
    {
        if(c1.getText().equals(""))
        {
            c1.setText(c);
        }
            else if(c2.getText().equals(""))
        {
            c2.setText(c);
        }
        else if(c3.getText().equals(""))
        {
            c3.setText(c);
        }
        else if(c4.getText().equals(""))
        {
            c4.setText(c);
        }
        else if(c5.getText().equals(""))
        {
            c5.setText(c);
        }
    }
    
    //limapr todas as caixinhas
    public void corrige(JLabel c1, JLabel c2, JLabel c3, JLabel c4, JLabel c5, JLabel imgC, JLabel imgC2,  JLabel libras, JLabel seuVoto, JLabel imgS, JLabel nome, JLabel nome2, JLabel partido, JLabel partido2, JLabel votoL, JLabel linha2,JLabel aperte, JLabel branco, JLabel laranja, JLabel verde, JLabel NErrado, JLabel votoNulo, JLabel numero)
    {
        if(!"".equals(c1.getText())||(!"".equals(c2.getText()))||(!"".equals(c3.getText()))||(!"".equals(c4.getText()))||(!"".equals(c5.getText())))
        {
            c1.setText("");
            c2.setText("");
            c3.setText("");
            c4.setText("");
            c5.setText("");
            
            numero.setVisible(false);
            imgC.setVisible(false);
            imgC2.setVisible(false);
            libras.setVisible(true);
            imgS.setVisible(false);
            nome2.setVisible(false);
            partido2.setVisible(false);
            votoL.setVisible(false);
            seuVoto.setVisible(false);
            nome.setVisible(false);
            partido.setVisible(false);
            linha2.setVisible(false);
            aperte.setVisible(false);
            branco.setVisible(false);
            laranja.setVisible(false);
            verde.setVisible(false);
                
            NErrado.setVisible(false);
            votoNulo.setVisible(false);
        }
    }
    
    //voto em branco
    public void branco(JLabel imgInicial, JLabel textoInicial, JLabel numero, JLabel c1, JLabel c2, JLabel c3, JLabel c4, JLabel c5, JLabel votoB,JLabel branco, JLabel nome, JLabel partido, JLabel imgC, JLabel imgC2, JLabel imgS, JLabel partido2, JLabel nome2, JLabel seuVoto, JLabel candi, JLabel laranja, JLabel votoL, JLabel libras,JLabel NErrado, JLabel votoNulo)
    {
        imgInicial.setVisible(false);     
        textoInicial.setVisible(false);    
        
        seuVoto.setVisible(true);
        candi.setVisible(false);
        numero.setVisible(false);
        nome.setVisible(false);
        nome2.setVisible(false);
        partido.setVisible(false);
        partido2.setVisible(false);
        libras.setVisible(false);
        
        imgC.setVisible(false);
        imgC2.setVisible(false);
        imgS.setVisible(false);
                
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        
        votoL.setVisible(false);
        votoB.setVisible(true);
        branco.setVisible(false);
        laranja.setVisible(false);
        
        NErrado.setVisible(false);
        votoNulo.setVisible(false);
         
     }
    
    
    
    //página final - barra de progresso
    public void f(JLabel fim, JProgressBar progresso)
    {
        //carregando
        new Thread()
        {
            public void run()
            {
                for (int i = 0; i < 101; i++) 
                {
                    try
                    {
                        sleep(50); //velocidade
                        progresso.setValue(i);
                        
                        if(i == 100) //abrir resultados - frame 
                        {
                            new Total().setVisible(true);        
                        }
                        
                    }
                    catch (InterruptedException e)
                    {
                        
                    }
                }
            }
        }.start();
    }
    
    public void reproduzirSom() 
    {
        try 
        {
            // Carrega o arquivo de som
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src\\som\\som urna.wav"));

            // Cria um Clip para reproduzir o som
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);

            // Inicia a reprodução do som
            clip.start();
            
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) 
        {
            e.printStackTrace();
        }
    }
    
}
