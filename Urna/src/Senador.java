import javax.swing.JLabel;

public class Senador extends javax.swing.JFrame
{
     private int[] contadorVotos;
     
    public void s(JLabel c1, JLabel c2, JLabel c3, JLabel imgC, JLabel imgC2, JLabel imgS, JLabel nome2, JLabel partido, JLabel partido2, JLabel votoL, JLabel nome, JLabel linha2, JLabel seuVoto, JLabel aperte, JLabel branco, JLabel laranja, JLabel verde, JLabel NErrado, JLabel votoNulo, JLabel numero, JLabel libras)
    {
        libras.setVisible(false);
        numero.setVisible(true);
        String v = c1.getText() + c2.getText() + c3.getText();
        int n = 3;
        int lenth = v.length();
        
        String[] votos = {
            "",
            "001",
            "112"
        };

        String[] resultados = {
            "Libra",
            "Cauan",
            "Cabeca de ovo"
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
            case "001": //caua, igor e raissa
                nome.setVisible(true);
                  nome2.setVisible(true);
                partido.setVisible(true);
                partido2.setVisible(true);
                 imgC.setVisible(true); 
            imgC2.setVisible(true);
            imgS.setVisible(true);
                votoL.setVisible(false);
                
                c1(imgC, imgC2, imgS, nome2,partido2);
                
                 
                
                NErrado.setVisible(false);
                votoNulo.setVisible(false);
                
                seuVoto.setVisible(true);
                linha2.setVisible(true);
                aperte.setVisible(true);
                branco.setVisible(true);
                laranja.setVisible(true);
                verde.setVisible(true);
            break;
            
            case "112": //cabeça de ovo, principe e gato de botas
                nome.setVisible(true);
                  nome2.setVisible(true);
                partido.setVisible(true);
                partido2.setVisible(true);
                 imgC.setVisible(true); 
            imgC2.setVisible(true);
            imgS.setVisible(true);
                votoL.setVisible(false);
                c2(imgC, imgC2, imgS, nome2,partido2);
                
                 
                
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
            imgS.setVisible(false);
            nome2.setVisible(false);
            partido2.setVisible(false);
             
                  if(n == lenth)
        {   seuVoto.setVisible(true);
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
    
    void c1(JLabel imgC, JLabel imgC2, JLabel imgS, JLabel nome2,JLabel partido2)
    {
        imgC.setIcon(new javax.swing.ImageIcon("src\\img\\caua.png"));
        imgC2.setIcon(new javax.swing.ImageIcon("src\\img\\iguinho.png"));
        imgS.setIcon(new javax.swing.ImageIcon("src\\img\\raissa.png"));
        nome2.setText("Cauan Santos");
        partido2.setText("Cruz Vermelha");
    }
    
    void c2(JLabel imgC, JLabel imgC2, JLabel imgS, JLabel nome2,JLabel partido2)
    {
        imgC.setIcon(new javax.swing.ImageIcon("src\\img\\ovooo.png"));
        imgC2.setIcon(new javax.swing.ImageIcon("src\\img\\principe.png"));
        imgS.setIcon(new javax.swing.ImageIcon("src\\img\\gato.png"));
        nome2.setText("Cabeça de Ovo");
        partido2.setText("Tão tão Distante");
    }
     void votoNulo(JLabel NErrado, JLabel votoNulo)
    {
        NErrado.setText("NÚMERO ERRADO");
        votoNulo.setText("VOTO NULO");
    }
     public void libras (JLabel libras)
    {  
        libras.setIcon(new javax.swing.ImageIcon("src\\img\\libras\\senador.gif"));
    }
}
