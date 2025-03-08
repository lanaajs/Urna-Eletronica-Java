
import static java.lang.Thread.sleep;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class MetodosM 
{
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
                            new TotalM().setVisible(true);
                        }
                        
                    }
                    catch (InterruptedException e)
                    {
                        
                    }
                }
            }
        }.start();
    }
    
}
