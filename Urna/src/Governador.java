import javax.swing.JLabel;

public class Governador extends javax.swing.JFrame
{
     private int[] contadorVotos;
     
    public void g(JLabel c1, JLabel c2, JLabel imgC, JLabel imgC2, JLabel nome, JLabel nome2, JLabel partido, JLabel partido2, JLabel votoL, JLabel linha2, JLabel seuVoto, JLabel aperte, JLabel branco, JLabel laranja, JLabel verde, JLabel NErrado, JLabel votoNulo, JLabel numero, JLabel libras)
    {
        libras.setVisible(false);
        numero.setVisible(true);
        String v = c1.getText() + c2.getText();
        int n = 2;
        int lenth = v.length();
        
         String[] votos = {
            "",
            "01",
            "13"
        };

        String[] resultados = {
            "Libra",
            "Rafael",
            "Homen Biscoito"
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
            case "01": //rafael e pedro
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
            
            case "13": //homem biscoito e fiona
                nome.setVisible(true);
                nome2.setVisible(true);
                partido.setVisible(true);
                partido2.setVisible(true);
                imgC.setVisible(true);   
                imgC2.setVisible(true);
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
        }
        
    }
    
    void c1(JLabel imgC, JLabel imgC2, JLabel nome2,JLabel partido2)
    {
        imgC.setIcon(new javax.swing.ImageIcon("src\\img\\rafael.jpg"));
        imgC2.setIcon(new javax.swing.ImageIcon("src\\img\\pedro.png"));
        nome2.setText("Rafael");
        partido2.setText("Cruz Vermelha");
    }
    
    void c2(JLabel imgC, JLabel imgC2, JLabel nome2,JLabel partido2)
    {
        imgC.setIcon(new javax.swing.ImageIcon("src\\img\\bisocito.png"));
        imgC2.setIcon(new javax.swing.ImageIcon("src\\img\\fiona.png"));
        nome2.setText("Homem - Biscoito");
        partido2.setText("Tão tão Distante");
    }
    
    void votoNulo(JLabel NErrado, JLabel votoNulo)
    {
        NErrado.setText("NÚMERO ERRADO");
        votoNulo.setText("VOTO NULO");
    }
    
    public void libras (JLabel libras)
    {  
        libras.setIcon(new javax.swing.ImageIcon("src\\img\\libras\\governador.gif"));
    }
    
}
