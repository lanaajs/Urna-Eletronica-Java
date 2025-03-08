import javax.swing.JLabel;

public class Prefeito 
{
    public int[] contadorVotos;

    public void p(JLabel c1, JLabel c2, JLabel imgC, JLabel imgC2, JLabel nome, JLabel nome2, JLabel partido, JLabel partido2, JLabel votoL, JLabel linha2, JLabel seuVoto, JLabel aperte, JLabel branco, JLabel laranja, JLabel verde, JLabel NErrado, JLabel votoNulo, JLabel numero, JLabel libras)
    {
        libras.setVisible(false);
        numero.setVisible(true);
        String v = c1.getText() + c2.getText();
        int n = 2;
        int lenth = v.length();
        
        String[] votos = {
            "",
            "56",
            "95"
        };

        String[] resultados = {
            "Libra",
            "Visconde de Sabugosa",
            "Darwin"
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
            case "56": //visconde e saci
                nome.setVisible(true);
                nome2.setVisible(true);
                partido.setVisible(true);
                partido2.setVisible(true);
                imgC.setVisible(true);   
                imgC2.setVisible(true);
                votoL.setVisible(false);
                c1(imgC, imgC2, nome2, partido2);
                
                NErrado.setVisible(false);
                votoNulo.setVisible(false);
                
                seuVoto.setVisible(true);
                linha2.setVisible(true);
                aperte.setVisible(true);
                branco.setVisible(true);
                laranja.setVisible(true);
                verde.setVisible(true);
              
            break;
            
            case "95": //darwin e carrie
                nome.setVisible(true);
                nome2.setVisible(true);
                partido.setVisible(true);
                partido2.setVisible(true);
                imgC.setVisible(true);   
                imgC2.setVisible(true);
                votoL.setVisible(false);
                c1(imgC, imgC2, nome2, partido2);
                votoL.setVisible(false);
                c2(imgC, imgC2, nome2, partido2);
                
                NErrado.setVisible(false);
                votoNulo.setVisible(false);
                
                seuVoto.setVisible(true);
                linha2.setVisible(true);
                aperte.setVisible(true);
                branco.setVisible(true);
                laranja.setVisible(true);
                verde.setVisible(true);
            break;
            
            default: 
                imgC.setVisible(false); 
                imgC2.setVisible(false);
                nome2.setVisible(false);
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
    
    void c1(JLabel imgC, JLabel imgC2, JLabel nome2,JLabel partido2)
    {
        imgC.setIcon(new javax.swing.ImageIcon("src\\img\\visconde.png"));
        imgC2.setIcon(new javax.swing.ImageIcon("src\\img\\saci.png"));
        nome2.setText("Visconde de Sabugosa");
        partido2.setText("Sítio do Pica-Pau Amarelo");
    }
    
    void c2(JLabel imgC, JLabel imgC2, JLabel nome2,JLabel partido2)
    {
        imgC.setIcon(new javax.swing.ImageIcon("src\\img\\peixe.png"));
        imgC2.setIcon(new javax.swing.ImageIcon("src\\img\\fantasma.png"));
        nome2.setText("Darwin");
        partido2.setText("Mundo de Gumball");
    }
    
    void votoNulo(JLabel NErrado, JLabel votoNulo)
    {
        NErrado.setText("NÚMERO ERRADO");
        votoNulo.setText("VOTO NULO");
    }
    public void libras (JLabel libras)
    {  
        libras.setIcon(new javax.swing.ImageIcon("src\\img\\libras m\\prefeito.gif"));
    }
    
}
