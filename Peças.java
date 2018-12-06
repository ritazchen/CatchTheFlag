package AA;
import javax.swing.*;

public class Peças extends JLabel
{
    private boolean aliado, visível;
    private int rank; //Valor de cada peça
    public Icon imagem;
    
    Peças()
    {
    }
    
    Peças(boolean aliado, int rank, boolean visível)
    {
        this.aliado = aliado;
        this.rank = rank;
        this.visível = visível;
        this.setImagem(); //Seta imagens de cada peça
    }
    
    public boolean getAliado() {
        return aliado; //Retorna o valor da booleana se é aliado ou não. Se for, retorna true.
    }
    
    public boolean getVisível() {
        return visível; //Funcionalidade na fase do debug, para poder mostrar as peças do inimigo.
    }
    
    public void setImagem()
    {
        if(this.aliado == true)
        {
            if(this.rank == 1) //ESPIÃO ALIADO
            {
                imagem = new ImageIcon(getClass().getResource("/AA/Peça1Verm.png")); //Recebe o endereço da imagem a ser substituída.
                this.setIcon(imagem); //Altera o ícone da peça no tabuleiro
            }
            
            else  if(this.rank == 2) //SOLDADO ALIADO
            {
                imagem = new ImageIcon(getClass().getResource("/AA/Peça2Verm.png"));
		this.setIcon(imagem);
            }
            
            else  if(this.rank == 3) //CABO ARMEIRO ALIADO
            {
                imagem = new ImageIcon(getClass().getResource("/AA/Peça3Verm.png"));
		this.setIcon(imagem);
            }
            else  if(this.rank == 4) //BOMBA ALIADO
            {
                imagem = new ImageIcon(getClass().getResource("/AA/BombaVer.png"));
		this.setIcon(imagem);
            }
            
            else  if(this.rank == 5) //BANDEIRA ALIADO
            {
                imagem = new ImageIcon(getClass().getResource("/AA/BandVer.png"));
		this.setIcon(imagem);
            }
            
            else  if(this.rank == 10) //MARECHAL ALIADO
            {
                imagem = new ImageIcon(getClass().getResource("/AA/Peça10Verm.png"));
		this.setIcon(imagem);
            }  
        }
        
        else
        {
            if (visível == true) {
                if(this.rank == 0) //VAZIO (Tabuleiro)
                {
                    imagem = new ImageIcon(getClass().getResource("/AA/FundoTabu.png"));
                    this.setIcon(imagem);
                }
                else if(this.rank == 1) //ESPIÃO INIMIGO
                {
                    imagem = new ImageIcon(getClass().getResource("/AA/Peça1Azul.png"));
                    this.setIcon(imagem);
                }

                else  if(this.rank == 2) //SOLDADO INIMIGO
                {
                    imagem = new ImageIcon(getClass().getResource("/AA/Peça2Azul.png"));
                    this.setIcon(imagem);
                }

                else  if(this.rank == 3) //CABO INIMIGO
                {
                    imagem = new ImageIcon(getClass().getResource("/AA/Peça3Azul.png"));
                    this.setIcon(imagem);
                }
                else  if(this.rank == 4) //BOMBA INIMIGO
                {
                    imagem = new ImageIcon(getClass().getResource("/AA/BombaAzul.png"));
                    this.setIcon(imagem);
                }

                else  if(this.rank == 5) //BANDEIRA INIMIGO
                {
                    imagem = new ImageIcon(getClass().getResource("/AA/BandAzul.png"));
                    this.setIcon(imagem);
                }

                else  if(this.rank == 6) //LAGO
                {
                    imagem = new ImageIcon(getClass().getResource("/AA/lago.png"));
                    this.setIcon(imagem);
                }

                else  if(this.rank == 10) //MARECHAL INIMIGO
                {
                    imagem = new ImageIcon(getClass().getResource("/AA/Peça10Azul.png"));
                    this.setIcon(imagem);
                }
            }
            else {
                imagem = new ImageIcon(getClass().getResource("/AA/PeçaOculta.png")); //Quando está na fase normal, não mostra as peças inimigas.
                this.setIcon(imagem);
            }
  
        }
        
    }
    
}
