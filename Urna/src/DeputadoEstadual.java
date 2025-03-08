import javax.swing.JLabel;

public class DeputadoEstadual extends javax.swing.JFrame
{
    private int[] contadorVotos;
    
    public void de(JLabel c1, JLabel c2, JLabel c3, JLabel c4, JLabel c5, JLabel imgC, JLabel libras, JLabel seuVoto, JLabel nome, JLabel nome2,JLabel partido, JLabel partido2, JLabel votoL, JLabel linha2,JLabel aperte, JLabel branco, JLabel laranja, JLabel verde, JLabel NErrado, JLabel votoNulo, JLabel numero)
    {
        libras.setVisible(false);
        numero.setVisible(true);
        String v = c1.getText() + c2.getText() + c3.getText() + c4.getText() + c5.getText();
        int n = 5;
        int lenth = v.length();
        
        String[] votos = {
            "",
            "99",
            "88",
            "00123",
            "11234"
        };

        String[] resultados = {
            "Libras",
            "Legenda",
            "Legenda",
            "Allan",
            "Rumpelstiltskin"
        };

        int voto = 0;
        for (int i = 0; i < votos.length; i++) {
            if (v.equals(votos[i])) {
                voto = 1;
                break;
            }
        }

        if (contadorVotos == null) {
            
            contadorVotos = new int[votos.length];
        }

        // Incrementar o contador de votos para a opção correspondente
        if (voto != 0) {
            contadorVotos[voto]++;
            System.out.println("Candidato: " + resultados[voto] + " - Quantidade de votos: " + contadorVotos[voto]);
           
        }
        
        switch(v)
        {
            case "00": //voto de legenda
                seuVoto.setVisible(true);
                votoL.setVisible(true);
                imgC.setVisible(false);
                libras.setVisible(false);
                nome.setVisible(false);
                partido.setVisible(true);
                partido2.setVisible(true);
                partido2.setText("Cruz Vermelha");
                linha2.setVisible(true);
                aperte.setVisible(true);
                branco.setVisible(true);
                laranja.setVisible(true);
                verde.setVisible(true);
                
                NErrado.setVisible(false);
                votoNulo.setVisible(false);
            break;
            
            case "11": //voto de legenda
                seuVoto.setVisible(true);
                votoL.setVisible(true);
                imgC.setVisible(false);
                libras.setVisible(false);
                nome.setVisible(false);
                nome2.setVisible(false);
                partido.setVisible(true);
                partido2.setVisible(true);
                partido2.setText("Tão tão Distante");
                linha2.setVisible(true);
                aperte.setVisible(true);
                branco.setVisible(true);
                laranja.setVisible(true);
                verde.setVisible(true);
                
                NErrado.setVisible(false);
                votoNulo.setVisible(false);
            break;
            
            case "00123": //allan
                imgC.setVisible(true);
                nome.setVisible(true);
                nome2.setVisible(true);
                partido.setVisible(true);
                partido2.setVisible(true);
                votoL.setVisible(false);
                c1(imgC, nome2, partido2);
                
                NErrado.setVisible(false);
                votoNulo.setVisible(false);
                
            break;
            
            case "11234": // Rumpelstiltskin
                imgC.setVisible(true);
                nome.setVisible(true);
                nome2.setVisible(true);
                partido.setVisible(true);
                partido2.setVisible(true);
                votoL.setVisible(false);
                c2(imgC, nome2, partido2);
                
                NErrado.setVisible(false);
                votoNulo.setVisible(false);
            break;
            
            default:
            imgC.setVisible(false);  
            nome2.setVisible(false);
            partido.setVisible(false);
            partido2.setVisible(false);
            
            if(n == lenth)
            {
                seuVoto.setVisible(true);
                votoNulo(NErrado, votoNulo);
                NErrado.setVisible(true);
                votoNulo.setVisible(true);
                linha2.setVisible(true);
                aperte.setVisible(true);
                branco.setVisible(true);
                laranja.setVisible(true);
                verde.setVisible(true);
            }          
            break;
            
        }
    }
    
    void c1(JLabel imgC, JLabel nome2, JLabel partido2) //canditato 1
    {
        imgC.setIcon(new javax.swing.ImageIcon("src\\img\\allan.png"));
        nome2.setText("Allan Fernandes");
        partido2.setText("Cruz Vermelha");
    }
    
    void c2(JLabel imgC, JLabel nome2, JLabel partido2) //canditato 2
    {
        imgC.setIcon(new javax.swing.ImageIcon("src\\img\\rump.png"));
        nome2.setText("Rumpelstiltskin");
        partido2.setText("Tão tão Distante");
    }
    
    public void libras (JLabel libras) 
    {  
        libras.setIcon(new javax.swing.ImageIcon("src\\img\\libras\\depFederal.gif"));
    }
    
    void votoNulo(JLabel NErrado, JLabel votoNulo)
    {
        NErrado.setText("NÚMERO ERRADO");
        votoNulo.setText("VOTO NULO");
    }
  
    public void libra (JLabel libras)
    {  
        libras.setIcon(new javax.swing.ImageIcon("src\\img\\libras\\depEstadual.gif"));
    }
}

