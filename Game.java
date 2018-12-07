package AA;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.net.*;

public class Game extends javax.swing.JFrame {
    //Variáveis para o som do jogo
    private URL url;
    private AudioClip audio;
    
    //Variáveis de auxilio
    private static int cont = 0;
    private boolean jogando, pause, clique, cliqueus, usuario, jogada, modoFácil, escolher, mudo;
    
    //Variáveis do tabuleiro e contadores de peças
    private int X, Y, Xus, qntband = 1, qntb = 2, qntP1 = 1, qntP2 = 3, qntP3 = 2, qntP10 = 1, qntbandIni = 1, qntbIni = 2, qntP1Ini = 1, qntP2Ini = 3, qntP3Ini = 2, qntP10Ini = 1;
    private int posiBand, peçasRestantesIni, posiBandAli, peçasRestantesAli;
    private final int posiLago; //posição constante do lago
    
    //GRID LAYOUT
    private JLabel[][] vetor = new JLabel[1][6]; //Vetor que aparece quando o usuário escolhe as posições das peças  
    private Peças[][] squares = new Peças[5][5]; //Tabuleiro
    private Peças[][] matrizAux = new Peças[5][5]; //Matriz auxiliar para quando reiniciar o jogo
    
    public Game() { 
        initComponents();
        CenteredFrame(this); //Coloca a janela do jogo no centro do monitor
        //Deixar labels e painel escondidos
        Som2.setVisible(false);
        Inst2.setVisible(false);
        Jogar2.setVisible(false);
        Cred2.setVisible(false);
        EscolhaJogo.setVisible(false);
        EscolhaDif.setVisible(false);
        
        //Inicializa as variáveis de controle
        mudo = false; //Não começa mutado
        jogando = false; //Não está dentro do jogo
        pause = false; //Não está no pause
        clique = false; //Não clicou na peça
        cliqueus = false; //Não está selecionando a peça para colocar no tabuleiro
        usuario = false; //Não está na vez do usuário
        escolher = false; //Não está no modo de escolha de peças
        cont = 0; //inicializa a quantidade de dicas usadas
        peçasRestantesIni = 10; //Contador de quantas peças ainda restam
        peçasRestantesAli = 10; //Contador de peças inimigas restantes
           
        //GRID LAYOUT PRINCIPAL DO TABULEIRO
        tabela.setLayout(new GridLayout(5, 5));
        for(int i=0; i < 5; i++)
        {
            for(int j=0; j < 5; j++)
            {
                squares[i][j] = new Vazio();
                tabela.add(squares[i][j]);
            }
        }
        posiLago = randInt(0,4);
        squares[2][posiLago] = new Lago(); //Posição fixa do lago
        atualizarTabuleiro();
        tabela.setVisible(false); //Não permitir sua visibilidade no menu principal
    }

    public void CenteredFrame(javax.swing.JFrame objFrame){
        //Centraliza a janela
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY); 
    } 
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MENU = new javax.swing.JPanel();
        Inst = new javax.swing.JLabel();
        Inst2 = new javax.swing.JLabel();
        Cred = new javax.swing.JLabel();
        Cred2 = new javax.swing.JLabel();
        Jogar = new javax.swing.JLabel();
        Jogar2 = new javax.swing.JLabel();
        Sair = new javax.swing.JLabel();
        Sair1 = new javax.swing.JLabel();
        Som = new javax.swing.JLabel();
        Som2 = new javax.swing.JLabel();
        EscolhaDif = new javax.swing.JPanel();
        Normal1 = new javax.swing.JLabel();
        Normal = new javax.swing.JLabel();
        Fácil1 = new javax.swing.JLabel();
        Fácil = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EscolhaJogo = new javax.swing.JPanel();
        Aleatório1 = new javax.swing.JLabel();
        Aleatório = new javax.swing.JLabel();
        Escolher1 = new javax.swing.JLabel();
        Escolher = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FundoMenu = new javax.swing.JLabel();
        JOGO = new javax.swing.JPanel();
        tabela = new javax.swing.JPanel();
        DICA = new javax.swing.JLabel();
        DICA_2 = new javax.swing.JLabel();
        DICA_3 = new javax.swing.JLabel();
        DICA_4 = new javax.swing.JLabel();
        Pause = new javax.swing.JLabel();
        Pause2 = new javax.swing.JLabel();
        MSG = new javax.swing.JLabel();
        MSG1 = new javax.swing.JLabel();
        VetorUsu = new javax.swing.JLabel();
        P10INI = new javax.swing.JLabel();
        PBANDINI = new javax.swing.JLabel();
        PBOMBINI = new javax.swing.JLabel();
        P1INI = new javax.swing.JLabel();
        P2INI = new javax.swing.JLabel();
        P3INI = new javax.swing.JLabel();
        Coluna1 = new javax.swing.JLabel();
        Coluna2 = new javax.swing.JLabel();
        Coluna3 = new javax.swing.JLabel();
        Coluna4 = new javax.swing.JLabel();
        Coluna5 = new javax.swing.JLabel();
        Linha1 = new javax.swing.JLabel();
        Linha2 = new javax.swing.JLabel();
        Linha3 = new javax.swing.JLabel();
        Linha4 = new javax.swing.JLabel();
        Linha5 = new javax.swing.JLabel();
        PBAND = new javax.swing.JLabel();
        P10 = new javax.swing.JLabel();
        PBOMB = new javax.swing.JLabel();
        P1 = new javax.swing.JLabel();
        P2 = new javax.swing.JLabel();
        P3 = new javax.swing.JLabel();
        cont1 = new javax.swing.JLabel();
        cont2 = new javax.swing.JLabel();
        cont3 = new javax.swing.JLabel();
        cont4 = new javax.swing.JLabel();
        cont5 = new javax.swing.JLabel();
        cont6 = new javax.swing.JLabel();
        cont8 = new javax.swing.JLabel();
        cont9 = new javax.swing.JLabel();
        cont10 = new javax.swing.JLabel();
        cont11 = new javax.swing.JLabel();
        cont12 = new javax.swing.JLabel();
        cont13 = new javax.swing.JLabel();
        Play1 = new javax.swing.JLabel();
        Play = new javax.swing.JLabel();
        Mold = new javax.swing.JLabel();
        VEZ = new javax.swing.JLabel();
        FundoJogo1 = new javax.swing.JLabel();
        FundoJogo = new javax.swing.JLabel();
        CREDITOS = new javax.swing.JPanel();
        Voltar1 = new javax.swing.JLabel();
        Voltar2 = new javax.swing.JLabel();
        FundoCred = new javax.swing.JLabel();
        PAUSE = new javax.swing.JPanel();
        Op1 = new javax.swing.JLabel();
        Op1_2 = new javax.swing.JLabel();
        Op2 = new javax.swing.JLabel();
        Op2_2 = new javax.swing.JLabel();
        Op3 = new javax.swing.JLabel();
        Op3_2 = new javax.swing.JLabel();
        Op4 = new javax.swing.JLabel();
        Op4_2 = new javax.swing.JLabel();
        Som_Pause = new javax.swing.JLabel();
        Som_Pause2 = new javax.swing.JLabel();
        FundoPause = new javax.swing.JLabel();
        INSTRU = new javax.swing.JPanel();
        Voltar_ins = new javax.swing.JLabel();
        Voltar2_ins = new javax.swing.JLabel();
        FundoInstru = new javax.swing.JLabel();
        FIM = new javax.swing.JPanel();
        NovoJogo = new javax.swing.JLabel();
        NovoJogo1 = new javax.swing.JLabel();
        ReiniciarJogo = new javax.swing.JLabel();
        ReiniciarJogo1 = new javax.swing.JLabel();
        Vitória = new javax.swing.JLabel();
        Derrota = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Catch the Flag!");
        setBackground(new java.awt.Color(0, 0, 0));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        MENU.setBackground(new java.awt.Color(0, 0, 0));
        MENU.setLayout(null);

        Inst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Instruções.png"))); // NOI18N
        Inst.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                InstMouseMoved(evt);
            }
        });
        MENU.add(Inst);
        Inst.setBounds(45, 455, 194, 123);

        Inst2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Instruções2.png"))); // NOI18N
        Inst2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Inst2MouseClicked(evt);
            }
        });
        MENU.add(Inst2);
        Inst2.setBounds(45, 455, 194, 129);

        Cred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Créditos_1.png"))); // NOI18N
        Cred.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CredMouseMoved(evt);
            }
        });
        MENU.add(Cred);
        Cred.setBounds(550, 455, 194, 123);

        Cred2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Créditos_2.png"))); // NOI18N
        Cred2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Cred2MouseClicked(evt);
            }
        });
        MENU.add(Cred2);
        Cred2.setBounds(550, 455, 194, 123);

        Jogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Jogar_1.png"))); // NOI18N
        Jogar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                JogarMouseMoved(evt);
            }
        });
        MENU.add(Jogar);
        Jogar.setBounds(300, 449, 194, 123);

        Jogar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Jogar2.png"))); // NOI18N
        Jogar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jogar2MouseClicked(evt);
            }
        });
        MENU.add(Jogar2);
        Jogar2.setBounds(300, 449, 194, 123);

        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/SAIRR0.png"))); // NOI18N
        Sair.setToolTipText("");
        Sair.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                SairMouseMoved(evt);
            }
        });
        MENU.add(Sair);
        Sair.setBounds(10, 8, 50, 50);

        Sair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/SAIRR1.png"))); // NOI18N
        Sair1.setToolTipText("");
        Sair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Sair1MouseClicked(evt);
            }
        });
        MENU.add(Sair1);
        Sair1.setBounds(10, 8, 50, 50);

        Som.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Som1.png"))); // NOI18N
        Som.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SomMouseClicked(evt);
            }
        });
        MENU.add(Som);
        Som.setBounds(750, 10, 40, 50);

        Som2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Som_2.png"))); // NOI18N
        Som2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Som2MouseClicked(evt);
            }
        });
        MENU.add(Som2);
        Som2.setBounds(750, 10, 40, 50);

        EscolhaDif.setBackground(new java.awt.Color(0, 204, 153));
        EscolhaDif.setPreferredSize(new java.awt.Dimension(370, 200));
        EscolhaDif.setLayout(null);

        Normal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Normal.png"))); // NOI18N
        Normal1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Normal1MouseMoved(evt);
            }
        });
        EscolhaDif.add(Normal1);
        Normal1.setBounds(60, 110, 250, 81);

        Normal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Normal1.png"))); // NOI18N
        Normal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NormalMouseClicked(evt);
            }
        });
        EscolhaDif.add(Normal);
        Normal.setBounds(60, 110, 250, 81);

        Fácil1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Fácil.png"))); // NOI18N
        Fácil1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Fácil1MouseMoved(evt);
            }
        });
        EscolhaDif.add(Fácil1);
        Fácil1.setBounds(58, 45, 250, 81);

        Fácil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Fácil1.png"))); // NOI18N
        Fácil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FácilMouseClicked(evt);
            }
        });
        EscolhaDif.add(Fácil);
        Fácil.setBounds(58, 45, 250, 81);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Dific.png"))); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        EscolhaDif.add(jLabel2);
        jLabel2.setBounds(0, 0, 370, 200);

        MENU.add(EscolhaDif);
        EscolhaDif.setBounds(220, 210, 370, 200);

        EscolhaJogo.setBackground(new java.awt.Color(0, 153, 51));
        EscolhaJogo.setPreferredSize(new java.awt.Dimension(250, 200));
        EscolhaJogo.setLayout(null);

        Aleatório1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/PAlea.png"))); // NOI18N
        Aleatório1.setText("Peças aleatórias");
        Aleatório1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Aleatório1MouseMoved(evt);
            }
        });
        EscolhaJogo.add(Aleatório1);
        Aleatório1.setBounds(40, 113, 280, 81);

        Aleatório.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/PAlea1.png"))); // NOI18N
        Aleatório.setText("Peças aleatórias");
        Aleatório.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AleatórioMouseClicked(evt);
            }
        });
        EscolhaJogo.add(Aleatório);
        Aleatório.setBounds(40, 113, 280, 81);

        Escolher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/EscPeç.png"))); // NOI18N
        Escolher1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Escolher1MouseMoved(evt);
            }
        });
        EscolhaJogo.add(Escolher1);
        Escolher1.setBounds(40, 50, 290, 81);

        Escolher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/EscPeç1.png"))); // NOI18N
        Escolher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EscolherMouseClicked(evt);
            }
        });
        EscolhaJogo.add(Escolher);
        Escolher.setBounds(40, 50, 290, 81);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Distrib.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        EscolhaJogo.add(jLabel3);
        jLabel3.setBounds(0, 0, 370, 200);

        MENU.add(EscolhaJogo);
        EscolhaJogo.setBounds(220, 210, 370, 200);

        FundoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/ctf sbotoes sombra1.png"))); // NOI18N
        FundoMenu.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FundoMenuMouseMoved(evt);
            }
        });
        MENU.add(FundoMenu);
        FundoMenu.setBounds(0, 0, 800, 600);

        JOGO.setPreferredSize(new java.awt.Dimension(800, 600));
        JOGO.setLayout(null);

        tabela.setBackground(new java.awt.Color(0, 0, 0));
        tabela.setPreferredSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout tabelaLayout = new javax.swing.GroupLayout(tabela);
        tabela.setLayout(tabelaLayout);
        tabelaLayout.setHorizontalGroup(
            tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        tabelaLayout.setVerticalGroup(
            tabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        JOGO.add(tabela);
        tabela.setBounds(250, 150, 300, 300);

        DICA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Dica.png"))); // NOI18N
        DICA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DICAMouseMoved(evt);
            }
        });
        JOGO.add(DICA);
        DICA.setBounds(50, 300, 83, 39);

        DICA_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/a.png"))); // NOI18N
        DICA_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DICA_2MouseClicked(evt);
            }
        });
        JOGO.add(DICA_2);
        DICA_2.setBounds(50, 300, 87, 43);

        DICA_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Dica3.png"))); // NOI18N
        DICA_3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DICA_3MouseMoved(evt);
            }
        });
        JOGO.add(DICA_3);
        DICA_3.setBounds(50, 300, 83, 39);

        DICA_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Dica4.png"))); // NOI18N
        DICA_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DICA_4MouseClicked(evt);
            }
        });
        JOGO.add(DICA_4);
        DICA_4.setBounds(50, 300, 86, 44);

        Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Pause.png"))); // NOI18N
        Pause.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PauseMouseMoved(evt);
            }
        });
        JOGO.add(Pause);
        Pause.setBounds(740, 0, 60, 60);

        Pause2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Pause2.png"))); // NOI18N
        Pause2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pause2MouseClicked(evt);
            }
        });
        JOGO.add(Pause2);
        Pause2.setBounds(740, 0, 60, 60);

        MSG.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MSG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/MSG.png"))); // NOI18N
        JOGO.add(MSG);
        MSG.setBounds(140, 30, 640, 80);

        MSG1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MSG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/MSG2.png"))); // NOI18N
        JOGO.add(MSG1);
        MSG1.setBounds(110, 30, 640, 80);
        JOGO.add(VetorUsu);
        VetorUsu.setBounds(100, 500, 600, 70);

        P10INI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaP10Azul.png"))); // NOI18N
        JOGO.add(P10INI);
        P10INI.setBounds(600, 30, 70, 80);

        PBANDINI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaBandAzul.png"))); // NOI18N
        JOGO.add(PBANDINI);
        PBANDINI.setBounds(100, 30, 70, 80);

        PBOMBINI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtBombaAzul.png"))); // NOI18N
        JOGO.add(PBOMBINI);
        PBOMBINI.setBounds(200, 30, 70, 80);

        P1INI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaP1Azul.png"))); // NOI18N
        JOGO.add(P1INI);
        P1INI.setBounds(300, 30, 70, 80);

        P2INI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaP2Azul.png"))); // NOI18N
        JOGO.add(P2INI);
        P2INI.setBounds(400, 30, 70, 80);

        P3INI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaP3Azul.png"))); // NOI18N
        JOGO.add(P3INI);
        P3INI.setBounds(500, 30, 70, 80);

        Coluna1.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Coluna1.setText("1");
        Coluna1.setToolTipText("");
        JOGO.add(Coluna1);
        Coluna1.setBounds(270, 120, 30, 30);

        Coluna2.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Coluna2.setText("2");
        Coluna2.setToolTipText("");
        JOGO.add(Coluna2);
        Coluna2.setBounds(330, 120, 20, 30);

        Coluna3.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Coluna3.setText("3");
        Coluna3.setToolTipText("");
        JOGO.add(Coluna3);
        Coluna3.setBounds(390, 120, 20, 30);

        Coluna4.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Coluna4.setText("4");
        Coluna4.setToolTipText("");
        JOGO.add(Coluna4);
        Coluna4.setBounds(450, 120, 20, 30);

        Coluna5.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Coluna5.setText("5");
        Coluna5.setToolTipText("");
        JOGO.add(Coluna5);
        Coluna5.setBounds(510, 120, 20, 30);

        Linha1.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Linha1.setText("A");
        Linha1.setToolTipText("");
        JOGO.add(Linha1);
        Linha1.setBounds(222, 169, 20, 40);

        Linha2.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Linha2.setText("B");
        Linha2.setToolTipText("");
        JOGO.add(Linha2);
        Linha2.setBounds(223, 220, 20, 40);

        Linha3.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Linha3.setText("C");
        Linha3.setToolTipText("");
        JOGO.add(Linha3);
        Linha3.setBounds(221, 280, 20, 40);

        Linha4.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Linha4.setText("D");
        Linha4.setToolTipText("");
        JOGO.add(Linha4);
        Linha4.setBounds(222, 338, 20, 40);

        Linha5.setFont(new java.awt.Font("Levenim MT", 1, 18)); // NOI18N
        Linha5.setText("E");
        Linha5.setToolTipText("");
        JOGO.add(Linha5);
        Linha5.setBounds(223, 398, 20, 40);

        PBAND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaBandVer.png"))); // NOI18N
        JOGO.add(PBAND);
        PBAND.setBounds(100, 500, 70, 80);

        P10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaP10Ver.png"))); // NOI18N
        JOGO.add(P10);
        P10.setBounds(600, 500, 70, 80);

        PBOMB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtBombaVer.png"))); // NOI18N
        JOGO.add(PBOMB);
        PBOMB.setBounds(200, 500, 70, 80);

        P1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaP1Ver.png"))); // NOI18N
        JOGO.add(P1);
        P1.setBounds(300, 500, 70, 80);

        P2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaP2Ver.png"))); // NOI18N
        JOGO.add(P2);
        P2.setBounds(400, 500, 70, 80);

        P3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/AtualizaP3Ver.png"))); // NOI18N
        JOGO.add(P3);
        P3.setBounds(500, 500, 70, 80);

        cont1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont1.setText("x"+qntP1);
        JOGO.add(cont1);
        cont1.setBounds(320, 480, 50, 30);

        cont2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont2.setText("x"+qntband);
        JOGO.add(cont2);
        cont2.setBounds(120, 480, 50, 30);

        cont3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont3.setText("x"+qntP3);
        JOGO.add(cont3);
        cont3.setBounds(520, 480, 50, 30);

        cont4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont4.setText("x"+qntb);
        JOGO.add(cont4);
        cont4.setBounds(220, 480, 50, 30);

        cont5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont5.setText("x"+qntP10);
        JOGO.add(cont5);
        cont5.setBounds(620, 480, 50, 30);

        cont6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont6.setText("x"+qntP2);
        JOGO.add(cont6);
        cont6.setBounds(420, 480, 50, 30);

        cont8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont8.setText("x"+qntband);
        JOGO.add(cont8);
        cont8.setBounds(120, 10, 50, 30);

        cont9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont9.setText("x"+qntb);
        JOGO.add(cont9);
        cont9.setBounds(220, 10, 50, 30);

        cont10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont10.setText("x"+qntP1);
        JOGO.add(cont10);
        cont10.setBounds(320, 10, 50, 30);

        cont11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont11.setText("x"+qntP2);
        JOGO.add(cont11);
        cont11.setBounds(420, 10, 50, 30);

        cont12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont12.setText("x"+qntP3);
        JOGO.add(cont12);
        cont12.setBounds(520, 10, 50, 30);

        cont13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cont13.setText("x"+qntP10);
        JOGO.add(cont13);
        cont13.setBounds(620, 10, 50, 30);

        Play1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Play1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Play.png"))); // NOI18N
        Play1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Play1MouseMoved(evt);
            }
        });
        JOGO.add(Play1);
        Play1.setBounds(315, 480, 190, 90);

        Play.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Play1.png"))); // NOI18N
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayMouseClicked(evt);
            }
        });
        JOGO.add(Play);
        Play.setBounds(315, 480, 190, 90);

        Mold.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Mold1.png"))); // NOI18N
        Mold.setText("jLabel2");
        JOGO.add(Mold);
        Mold.setBounds(199, 101, 400, 400);
        JOGO.add(VEZ);
        VEZ.setBounds(580, 298, 210, 60);

        FundoJogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/OQ4X3D0a.jpg"))); // NOI18N
        FundoJogo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FundoJogo1MouseMoved(evt);
            }
        });
        JOGO.add(FundoJogo1);
        FundoJogo1.setBounds(0, 0, 800, 600);

        FundoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/OQ4X3D0a.jpg"))); // NOI18N
        FundoJogo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FundoJogoMouseMoved(evt);
            }
        });
        JOGO.add(FundoJogo);
        FundoJogo.setBounds(0, 0, 800, 600);

        CREDITOS.setLayout(null);

        Voltar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Voltar.png"))); // NOI18N
        Voltar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Voltar1MouseMoved(evt);
            }
        });
        CREDITOS.add(Voltar1);
        Voltar1.setBounds(20, 510, 80, 80);

        Voltar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Voltar1.1.png"))); // NOI18N
        Voltar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Voltar2MouseClicked(evt);
            }
        });
        CREDITOS.add(Voltar2);
        Voltar2.setBounds(22, 509, 77, 80);

        FundoCred.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Creditos.png"))); // NOI18N
        FundoCred.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FundoCredMouseMoved(evt);
            }
        });
        CREDITOS.add(FundoCred);
        FundoCred.setBounds(0, 0, 800, 600);

        PAUSE.setBackground(new java.awt.Color(0, 153, 153));
        PAUSE.setLayout(null);

        Op1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Op1.png"))); // NOI18N
        Op1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Op1MouseMoved(evt);
            }
        });
        PAUSE.add(Op1);
        Op1.setBounds(178, 150, 430, 100);

        Op1_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Op1.1.png"))); // NOI18N
        Op1_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Op1_2MouseClicked(evt);
            }
        });
        PAUSE.add(Op1_2);
        Op1_2.setBounds(180, 150, 430, 100);

        Op2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Op2.png"))); // NOI18N
        Op2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Op2MouseMoved(evt);
            }
        });
        PAUSE.add(Op2);
        Op2.setBounds(178, 260, 430, 80);

        Op2_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Op2.1.png"))); // NOI18N
        Op2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Op2_2MouseClicked(evt);
            }
        });
        PAUSE.add(Op2_2);
        Op2_2.setBounds(180, 250, 430, 100);

        Op3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Op3.png"))); // NOI18N
        Op3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Op3MouseMoved(evt);
            }
        });
        PAUSE.add(Op3);
        Op3.setBounds(178, 355, 430, 90);

        Op3_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Op3.1.png"))); // NOI18N
        Op3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Op3_2MouseClicked(evt);
            }
        });
        PAUSE.add(Op3_2);
        Op3_2.setBounds(183, 353, 430, 100);

        Op4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Op4.png"))); // NOI18N
        Op4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Op4MouseMoved(evt);
            }
        });
        PAUSE.add(Op4);
        Op4.setBounds(178, 450, 430, 100);

        Op4_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Op4.1.png"))); // NOI18N
        Op4_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Op4_2MouseClicked(evt);
            }
        });
        PAUSE.add(Op4_2);
        Op4_2.setBounds(180, 450, 430, 100);

        Som_Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Som1.png"))); // NOI18N
        Som_Pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Som_PauseMouseClicked(evt);
            }
        });
        PAUSE.add(Som_Pause);
        Som_Pause.setBounds(720, 35, 40, 50);

        Som_Pause2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Som_2.png"))); // NOI18N
        Som_Pause2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Som_Pause2MouseClicked(evt);
            }
        });
        PAUSE.add(Som_Pause2);
        Som_Pause2.setBounds(720, 35, 40, 50);

        FundoPause.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        FundoPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/FundoPaus.png"))); // NOI18N
        FundoPause.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FundoPauseMouseMoved(evt);
            }
        });
        PAUSE.add(FundoPause);
        FundoPause.setBounds(0, 0, 800, 600);

        INSTRU.setLayout(null);

        Voltar_ins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/MenorVoltar.png"))); // NOI18N
        Voltar_ins.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Voltar_insMouseMoved(evt);
            }
        });
        INSTRU.add(Voltar_ins);
        Voltar_ins.setBounds(26, 539, 80, 60);

        Voltar2_ins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/MenorVoltar1.1.png"))); // NOI18N
        Voltar2_ins.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Voltar2_insMouseClicked(evt);
            }
        });
        INSTRU.add(Voltar2_ins);
        Voltar2_ins.setBounds(28, 533, 80, 70);

        FundoInstru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Instru.png"))); // NOI18N
        FundoInstru.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                FundoInstruMouseMoved(evt);
            }
        });
        INSTRU.add(FundoInstru);
        FundoInstru.setBounds(0, 0, 800, 600);

        FIM.setPreferredSize(new java.awt.Dimension(800, 600));
        FIM.setLayout(null);

        NovoJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/NovoJogo1.png"))); // NOI18N
        NovoJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NovoJogoMouseClicked(evt);
            }
        });
        FIM.add(NovoJogo);
        NovoJogo.setBounds(20, 260, 370, 80);

        NovoJogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/NovoJogo.png"))); // NOI18N
        NovoJogo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NovoJogo1MouseMoved(evt);
            }
        });
        FIM.add(NovoJogo1);
        NovoJogo1.setBounds(20, 260, 370, 80);

        ReiniciarJogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/ReiniciarJogo2.png"))); // NOI18N
        ReiniciarJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReiniciarJogoMouseClicked(evt);
            }
        });
        FIM.add(ReiniciarJogo);
        ReiniciarJogo.setBounds(409, 260, 360, 80);

        ReiniciarJogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/ReiniciarJogo.png"))); // NOI18N
        ReiniciarJogo1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ReiniciarJogo1MouseMoved(evt);
            }
        });
        FIM.add(ReiniciarJogo1);
        ReiniciarJogo1.setBounds(409, 260, 360, 80);

        Vitória.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Vitória.png"))); // NOI18N
        Vitória.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                VitóriaMouseMoved(evt);
            }
        });
        FIM.add(Vitória);
        Vitória.setBounds(0, 0, 800, 600);

        Derrota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Derrota.png"))); // NOI18N
        Derrota.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                DerrotaMouseMoved(evt);
            }
        });
        FIM.add(Derrota);
        Derrota.setBounds(0, 0, 800, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MENU, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CREDITOS, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PAUSE, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(INSTRU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(FIM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MENU, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JOGO, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(CREDITOS, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PAUSE, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(INSTRU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(FIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    public Peças[][] getSquares() {
        //Possibilita que na classe DICA2 seja possível saber se em tal coluna tem bomba
        return squares;
    }
    
    public int getCont() {
        //Retorna a quantidade de dicas já usadas
        return cont;
    }
    
    void setCont() {
        //Acrescenta a cada vez que o usuário solicita a dica
        if (cont >= 0 && cont < 2) {
            cont += 1;
        }
    }
    
    public JLabel getDica() {
        //Retorna o painel de dica perguntando a coluna
        return DICA;
    }
    
    public JLabel getDica2() {
        //Retorna o painel de dica indicando que não há mais dicas
        return DICA_2;
    }
    
    private void InstMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstMouseMoved
        //Efeito de botão
        Inst.setVisible(false);
        Inst2.setVisible(true);
    }//GEN-LAST:event_InstMouseMoved

    private void CredMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CredMouseMoved
        //Efeito de botão
        Cred.setVisible(false);
        Cred2.setVisible(true);
    }//GEN-LAST:event_CredMouseMoved

    private void Inst2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Inst2MouseClicked
        //Acessa o painel de instruções
        setContentPane(INSTRU);
        setJogando(false);
        Voltar_ins.setVisible(true);
        Voltar2_ins.setVisible(false);
        revalidate();
        repaint(); 
        setVisible(true);
        System.gc();
    }//GEN-LAST:event_Inst2MouseClicked

    private void FundoMenuMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundoMenuMouseMoved
        //Reseta todos os efeitos de botão
        Cred.setVisible(true);
        Cred2.setVisible(false);
        Inst.setVisible(true);
        Inst2.setVisible(false);
        Jogar.setVisible(true);
        Jogar2.setVisible(false);
        Sair1.setVisible(false);
        Sair.setVisible(true);
    }//GEN-LAST:event_FundoMenuMouseMoved

    private void Jogar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jogar2MouseClicked
        //Possibilita que o usuário escolha o modo de jogo
        EscolhaDif.setVisible(true);
        Fácil1.setVisible(true);
        Fácil.setVisible(false);
        Normal1.setVisible(true);
        Normal.setVisible(false);
    }//GEN-LAST:event_Jogar2MouseClicked

    private void JogarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JogarMouseMoved
        //Efeito de botão
        Jogar.setVisible(false);
        Jogar2.setVisible(true);
    }//GEN-LAST:event_JogarMouseMoved

    private void Cred2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Cred2MouseClicked
        //Acessa o painel de créditos
        setContentPane(CREDITOS);
        setJogando(false);
        Voltar2.setVisible(false);
        revalidate();
        repaint(); 
        setVisible(true);
        System.gc();
    }//GEN-LAST:event_Cred2MouseClicked

    private void SomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SomMouseClicked
        //Para o áudio
        audio.stop();
        mudo = true;
        Som.setVisible(!mudo);
        Som2.setVisible(mudo);
    }//GEN-LAST:event_SomMouseClicked

    private void Som2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Som2MouseClicked
        //Retoma o áudio
        play("/AA/SomFundo");
        mudo = false;
        Som.setVisible(!mudo);
        Som2.setVisible(mudo);
    }//GEN-LAST:event_Som2MouseClicked

    private void Pause2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pause2MouseClicked
        //Acessa a tela de pause
        Som_Pause.setVisible(!mudo);
        Som_Pause2.setVisible(mudo);
        Op1_2.setVisible(false);
        Op1.setVisible(true);
        Op2_2.setVisible(false);
        Op2.setVisible(true);
        Op3_2.setVisible(false);
        Op3.setVisible(true);
        Op4_2.setVisible(false);
        Op4.setVisible(true);
        setContentPane(PAUSE);
        revalidate();
        repaint();
        setVisible(true);
        System.gc();
        setJogando(false);
        setPause(true);
    }//GEN-LAST:event_Pause2MouseClicked

    private void setJogando(boolean jogando)
    {
        //Altera a variável quando o usuário está na tela de jogo ou não
        this.jogando = jogando;
    }
    
    private void setPause(boolean pause)
    {
        //Altera a variável quando o usuário está na tela de pause ou não
        this.pause = pause;
    }
    
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        //Possibilita acessar o painel de pause com o 'esc'
        if(evt.getKeyCode() == KeyEvent.VK_ESCAPE && jogando == true) //Acessa o pause
        {
            setContentPane(PAUSE);
            revalidate();
            repaint();
            setVisible(true);
            System.gc();
            setJogando(false);
            setPause(true);
        }
        
        else if(evt.getKeyCode() == KeyEvent.VK_ESCAPE && pause == true) //Retorna ao jogo
        {
            setContentPane(JOGO);
            revalidate();
            repaint();
            setVisible(true);
            System.gc();
            setJogando(true);
            setPause(false);
        }
    }//GEN-LAST:event_formKeyPressed

    private void FundoJogoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundoJogoMouseMoved
        //Reseta todos os efeitos de botão
        Pause.setVisible(true);
        Pause2.setVisible(false);
        if (cont != 2) {
            DICA.setVisible(true);
            DICA_2.setVisible(false);
            DICA_3.setVisible(false);
            DICA_4.setVisible(false);
        }
        else {
            DICA.setVisible(false);
            DICA_2.setVisible(false);
            DICA_3.setVisible(true);
            DICA_4.setVisible(false);
        }
    }//GEN-LAST:event_FundoJogoMouseMoved

    private void PauseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseMouseMoved
        //Efeito de botão
        Pause.setVisible(false);
        Pause2.setVisible(true);
    }//GEN-LAST:event_PauseMouseMoved

    private void DICA_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DICA_2MouseClicked
        //Solicita dica
        if (cont < 2) {
            this.setEnabled(false);
            new DICA2(this).setVisible(true);
        }
    }//GEN-LAST:event_DICA_2MouseClicked

    private void DICAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DICAMouseMoved
        //Efeito de botão
        DICA.setVisible(false);
        DICA_2.setVisible(true);
    }//GEN-LAST:event_DICAMouseMoved

    private void DICA_4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DICA_4MouseClicked
        //Apresenta a tela de que não é mais possível pedir dica
        if (cont == 2) {
            this.setEnabled(false);
            DICA2 janDica = new DICA2(this);
            janDica.setVisible(true);
            janDica.getErro();
        }
    }//GEN-LAST:event_DICA_4MouseClicked

    private void DICA_3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DICA_3MouseMoved
        //Efeito de botão
        DICA_3.setVisible(false);
        DICA_4.setVisible(true);
    }//GEN-LAST:event_DICA_3MouseMoved

    private void PlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseClicked
        //Acessa o jogo depois de escolher as posições das peças
        //Deixa tudo que é necessário pro jogo visível
        Play.setVisible(false);
        MSG1.setVisible(false);
        FundoJogo.setVisible(true);
        FundoJogo1.setVisible(false);
        PBAND.setVisible(true);
        PBANDINI.setVisible(true);
        PBOMB.setVisible(true);
        PBOMBINI.setVisible(true);
        P1.setVisible(true);
        P1INI.setVisible(true);
        P2.setVisible(true);
        P2INI.setVisible(true);
        P3.setVisible(true);
        P3INI.setVisible(true);
        P10.setVisible(true);
        P10INI.setVisible(true);
        
        //Contadores de peças
        cont1.setVisible(true);
        cont2.setVisible(true);
        cont3.setVisible(true);
        cont4.setVisible(true);
        cont5.setVisible(true);
        cont6.setVisible(true);
        cont8.setVisible(true);
        cont9.setVisible(true);
        cont10.setVisible(true);
        cont11.setVisible(true);
        cont12.setVisible(true);
        cont13.setVisible(true);
        
        usuario = true;
        jogada = true;
        escolher = false;
        
        //POSIÇÕES ALEATÓRIAS DAS PEÇAS INIMIGAS
        //Bandeira Inimiga 
        posiBand = randInt(0,4);
        squares[0][posiBand] = new Bandeira(false, modoFácil);
        
        //Bombas Inimigas
        if (posiBand < 3)
        {
            squares[0][posiBand+1] = new Bomba(false, modoFácil); //para a direita
        }
        else {
            squares[0][posiBand-1] = new Bomba(false, modoFácil); //para a direita
        }
        
        squares[1][posiBand] = new Bomba(false, modoFácil); //frente
        peçasRestantesIni -= 3;
        
        //Restante das peças
        while (peçasRestantesIni != 0) {
            int randI = randInt(0, 1);
            int randJ = randInt(0, 4);
            if (squares[randI][randJ] instanceof Vazio) 
            {
                //Espião inimigo
                if (qntP1Ini > 0) 
                {
                    squares[randI][randJ] = new Espiao(false, modoFácil);
                    qntP1Ini--;
                }
                //Soldado inimigo
                else if (qntP2Ini > 0)
                {
                    squares[randI][randJ] = new Soldado(false, modoFácil);
                    qntP2Ini--;
                }
                //Cabo inimigo
                else if (qntP3Ini > 0)
                {
                    squares[randI][randJ] = new CaboArmeiro(false, modoFácil);
                    qntP3Ini--;
                }
                //Marechal inimigo
                else if (qntP10Ini > 0)
                {
                    squares[randI][randJ] = new Marechal(false, modoFácil);
                    qntP10Ini--;
                }
                peçasRestantesIni--;
            } 
        }
        
        //Deixa todas as posições salvas na matriz auxiliar
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizAux[i][j] = squares[i][j];
            }
        }
        
        //PEÇAS DO ALIADO
        qntband = 1;
        qntb = 2;
        qntP1 = 1;
        qntP2 = 3; 
        qntP3 = 2;
        qntP10 = 1;
        
        //PEÇAS DO INIMIGO
        qntbandIni = 1;
        qntbIni = 2;
        qntP1Ini = 1; 
        qntP2Ini = 3;
        qntP3Ini = 2; 
        qntP10Ini = 1;
        VEZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/MSG0.1.png")));
        atualizarTabuleiro();

    }//GEN-LAST:event_PlayMouseClicked

    private void FundoJogo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundoJogo1MouseMoved
        //Evitar que o efeito de botão fique para sempre
        Pause.setVisible(true);
        Pause2.setVisible(false);
        if((qntband + qntb + qntP1 + qntP2 + qntP3 + qntP10) == 0)
        {
            Play.setVisible(false);
            Play1.setVisible(true);
        }
    }//GEN-LAST:event_FundoJogo1MouseMoved

    private void Voltar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voltar1MouseMoved
        //Efeito de botão
        Voltar1.setVisible(false);
        Voltar2.setVisible(true);
        EscolhaJogo.setVisible(false);
        EscolhaDif.setVisible(false);
    }//GEN-LAST:event_Voltar1MouseMoved

    private void FundoCredMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundoCredMouseMoved
        //Evitar que o efeito de botão fique para sempre
        Voltar1.setVisible(true);
        Voltar2.setVisible(false);
    }//GEN-LAST:event_FundoCredMouseMoved

    private void Voltar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voltar2MouseClicked
        //Retorna ao painel de menu
        setContentPane(MENU);
        setJogando(false);
        revalidate();
        repaint();
        setVisible(true);
        System.gc();
        //setJogando(true);
    }//GEN-LAST:event_Voltar2MouseClicked

    private void Op1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Op1MouseMoved
        //Efeito de botão
        Op1.setVisible(false);
        Op1_2.setVisible(true);
        Op2_2.setVisible(false);
        Op3_2.setVisible(false);
        Op4_2.setVisible(false);
    }//GEN-LAST:event_Op1MouseMoved

    private void Op1_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Op1_2MouseClicked
        //Volta ao jogo
        setContentPane(JOGO);
        revalidate();
        repaint();
        setVisible(true);
        System.gc();
        setJogando(true);
        setPause(false);
    }//GEN-LAST:event_Op1_2MouseClicked

    private void Op2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Op2MouseMoved
        //Efeito de botão
        Op2.setVisible(false);
        Op2_2.setVisible(true);
        Op1_2.setVisible(false);
        Op3_2.setVisible(false);
        Op4_2.setVisible(false);
    }//GEN-LAST:event_Op2MouseMoved

    private void Op2_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Op2_2MouseClicked
        //Apenas reinicia o jogo restabelecendo as mesmas posições iniciais e reinicia os contadores e dicas
        reiniciaJogo();
    }//GEN-LAST:event_Op2_2MouseClicked

    private void Op3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Op3MouseMoved
        //Efeito de botão
        Op3.setVisible(false);
        Op3_2.setVisible(true);
        Op1_2.setVisible(false);
        Op2_2.setVisible(false);
        Op4_2.setVisible(false);
    }//GEN-LAST:event_Op3MouseMoved

    private void Op3_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Op3_2MouseClicked
        //Voltar para o menu principal criando novo objeto Game, logo reseta todo o jogo
        dispose();
        Game janela1 = new Game();
        audio.stop();
        janela1.play("/AA/SomFundo");
        janela1.setVisible(true);
    }//GEN-LAST:event_Op3_2MouseClicked

    private void Op4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Op4MouseMoved
        //Efeito de botão
        Op4.setVisible(false);
        Op4_2.setVisible(true);
        Op1_2.setVisible(false);
        Op2_2.setVisible(false);
        Op3_2.setVisible(false);
    }//GEN-LAST:event_Op4MouseMoved

    private void Op4_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Op4_2MouseClicked
        //Sair do jogo
        System.exit(0);
    }//GEN-LAST:event_Op4_2MouseClicked

    private void FundoPauseMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundoPauseMouseMoved
        //Reseta todos os efeitos de botão
        Op1_2.setVisible(false);
        Op1.setVisible(true);
        Op2_2.setVisible(false);
        Op2.setVisible(true);
        Op3_2.setVisible(false);
        Op3.setVisible(true);
        Op4_2.setVisible(false);
        Op4.setVisible(true);
    }//GEN-LAST:event_FundoPauseMouseMoved

    private void AleatórioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AleatórioMouseClicked
        //Modo de jogo aleatório, coloca as peças aliadas aleatórias
        //Deixa tudo que é necessário pro jogo visível
        EscolhaJogo.setVisible(false);
        Play1.setVisible(false);
        setContentPane(JOGO);
        revalidate();
        repaint();
        setVisible(true);
        System.gc();
        setJogando(true);
        usuario = true;
        FundoJogo.setVisible(true);
        FundoJogo1.setVisible(false);
        MSG1.setVisible(false);
        MSG.setVisible(false);
        Mold.setVisible(true);
        VetorUsu.setVisible(false);
        tabela.setVisible(true);
        Play.setVisible(false);
        Pause2.setVisible(false);
        DICA.setVisible(true);
        DICA_2.setVisible(false);
        DICA_3.setVisible(false);
        DICA_4.setVisible(false);
        jogada = true;
        cont1.setVisible(true);
        cont2.setVisible(true);
        cont3.setVisible(true);
        cont4.setVisible(true);
        cont5.setVisible(true);
        cont6.setVisible(true);
        cont8.setVisible(true);
        cont9.setVisible(true);
        cont10.setVisible(true);
        cont11.setVisible(true);
        cont12.setVisible(true);
        cont13.setVisible(true);
        
        //PEÇAS ALEATÓRIAS ALIADAS
        //Posição da bandeira aliada
        posiBandAli = randInt(0,4);
        squares[4][posiBandAli] = new Bandeira(true, true);
        
        //Bombas aliadas
        if (posiBandAli < 3)
        {
            squares[4][posiBandAli+1] = new Bomba(true, true); //para a direita
        }
        else {
            squares[4][posiBandAli-1] = new Bomba(true, true); //para a esquerda
        }
        
        squares[3][posiBandAli] = new Bomba(true, true); //frente
        peçasRestantesAli -= 3;
        
        //Restante das peças
        while (peçasRestantesAli != 0) {
            int randI = randInt(3, 4);
            int randJ = randInt(0, 4);
            if (squares[randI][randJ] instanceof Vazio) 
            {
                //Espião aliado
                if (qntP1 > 0) 
                {
                    squares[randI][randJ] = new Espiao(true, true);
                    qntP1--;
                }
                //Soldado aliado
                else if (qntP2 > 0)
                {
                    squares[randI][randJ] = new Soldado(true, true);
                    qntP2--;
                }
                //Cabo aliado
                else if (qntP3 > 0)
                {
                    squares[randI][randJ] = new CaboArmeiro(true, true);
                    qntP3--;
                }
                //Marechal aliado
                else if (qntP10 > 0)
                {
                    squares[randI][randJ] = new Marechal(true, true);
                    qntP10--;
                }
                peçasRestantesAli--;
            } 
        }
        
        //PEÇAS ALEATÓRIAS DOS INIMIGOS
        //Bandeira Inimiga
        posiBand = randInt(0,4);
        squares[0][posiBand] = new Bandeira(false, modoFácil);

        
        //Bombas Inimigas
        if (posiBand < 3)
        {
            squares[0][posiBand+1] = new Bomba(false, modoFácil); //para a direita
        }
        else {
            squares[0][posiBand-1] = new Bomba(false, modoFácil); //para a direita
        }
        
        squares[1][posiBand] = new Bomba(false, modoFácil); //frente
        peçasRestantesIni -= 3;
        
        //Restante das peças
        while (peçasRestantesIni != 0) {
            int randI = randInt(0, 1);
            int randJ = randInt(0, 4);
            if (squares[randI][randJ] instanceof Vazio) 
            {
                //Espião inimigo
                if (qntP1Ini > 0) 
                {
                    squares[randI][randJ] = new Espiao(false, modoFácil);
                    qntP1Ini--;
                }
                //Soldado inimigo
                else if (qntP2Ini > 0)
                {
                    squares[randI][randJ] = new Soldado(false, modoFácil);
                    qntP2Ini--;
                }
                //Cabo inimigo
                else if (qntP3Ini > 0)
                {
                    squares[randI][randJ] = new CaboArmeiro(false, modoFácil);
                    qntP3Ini--;
                }
                //Marechal inimigo
                else if (qntP10Ini > 0)
                {
                    squares[randI][randJ] = new Marechal(false, modoFácil);
                    qntP10Ini--;
                }
                peçasRestantesIni--;
            } 
        }
        
        //Deixa todas as posições salvas na matriz auxiliar
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizAux[i][j] = squares[i][j];
            }
        }
        
        //PEÇAS DO ALIADO
        qntband = 1;
        qntb = 2;
        qntP1 = 1;
        qntP2 = 3; 
        qntP3 = 2;
        qntP10 = 1;
        
        //PEÇAS DO INIMIGO
        qntbandIni = 1;
        qntbIni = 2;
        qntP1Ini = 1; 
        qntP2Ini = 3;
        qntP3Ini = 2; 
        qntP10Ini = 1;
        VEZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/MSG0.1.png")));
        atualizarTabuleiro();
    }//GEN-LAST:event_AleatórioMouseClicked

    private void EscolherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EscolherMouseClicked
        //Modo que permite o usuário escolher as posições de cada peça (mas não mexe nas peças do inimigo)
        //Deixa tudo que é necessário pro jogo visível
        EscolhaJogo.setVisible(false); //Tira o painel de escolher a opção de jogo
        Play1.setVisible(false);
        MSG1.setVisible(false);
        PBAND.setVisible(false);
        PBANDINI.setVisible(false);
        PBOMB.setVisible(false);
        PBOMBINI.setVisible(false);
        P1.setVisible(false);
        P1INI.setVisible(false);
        P2.setVisible(false);
        P2INI.setVisible(false);
        P3.setVisible(false);
        P3INI.setVisible(false);
        P10.setVisible(false);
        P10INI.setVisible(false);   
        cont1.setVisible(true);
        cont2.setVisible(true);
        cont3.setVisible(true);
        cont4.setVisible(true);
        cont5.setVisible(true);
        cont6.setVisible(true);
        cont8.setVisible(false);
        cont9.setVisible(false);
        cont10.setVisible(false);
        cont11.setVisible(false);
        cont12.setVisible(false);
        cont13.setVisible(false);
        escolher = true;
        
        //PEÇAS DO ALIADO
        qntband = 1;
        qntb = 2;
        qntP1 = 1;
        qntP2 = 3; 
        qntP3 = 2;
        qntP10 = 1;
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizAux[i][j] = new Vazio();
            }
        }
        matrizAux[2][posiLago] = new Lago();
        
        //Vetor acessado pelo usuário quando se deseja inserir as peças
        VetorUsu.setLayout(new GridLayout(1, 6));
        for(int i = 0; i < 6; i++)
        {
            vetor[0][i] = new JLabel();
            VetorUsu.add(vetor[0][i]);
                vetor[0][i].addMouseListener(new java.awt.event.MouseAdapter()
                {
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        MouseClickedUsuario(evt);
                    }
                });
        }
        VetorUsu.setVisible(false);
        vetor[0][0].setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/BandVerVetor.png")));
        vetor[0][1].setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/BombaVerVetor.png")));
        vetor[0][2].setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Peça1Vetor.png")));
        vetor[0][3].setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Peça2Vetor.png")));
        vetor[0][4].setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Peça3Vetor.png")));
        vetor[0][5].setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/Peça10Vetor.png")));
        
        setContentPane(JOGO);
        revalidate();
        repaint();
        setVisible(true);
        System.gc();
        setJogando(true);
        FundoJogo.setVisible(false);
        FundoJogo1.setVisible(true);
        VetorUsu.setVisible(true);
        tabela.setVisible(true);
        Play.setVisible(false);
        Pause2.setVisible(false);
        DICA.setVisible(false);
        DICA_2.setVisible(false);
        DICA_3.setVisible(false);
        DICA_4.setVisible(false);
    }//GEN-LAST:event_EscolherMouseClicked

    private void NormalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NormalMouseClicked
        //Escolha do modo normal
        EscolhaDif.setVisible(false);
        EscolhaJogo.setVisible(true);
        Aleatório1.setVisible(true);
        Aleatório.setVisible(false);
        Escolher1.setVisible(true);
        Escolher.setVisible(false);
        modoFácil = false;
    }//GEN-LAST:event_NormalMouseClicked

    private void FácilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FácilMouseClicked
        //Escolha do modo fácil
        EscolhaDif.setVisible(false);
        EscolhaJogo.setVisible(true);
        Aleatório1.setVisible(true);
        Aleatório.setVisible(false);
        Escolher1.setVisible(true);
        Escolher.setVisible(false);
        modoFácil = true;
    }//GEN-LAST:event_FácilMouseClicked

    private void Normal1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Normal1MouseMoved
        //Efeito de botão
        Fácil1.setVisible(true);
        Fácil.setVisible(false);
        Normal1.setVisible(false);
        Normal.setVisible(true);
    }//GEN-LAST:event_Normal1MouseMoved

    private void Fácil1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fácil1MouseMoved
        //Efeito de botão
        Fácil1.setVisible(false);
        Fácil.setVisible(true);
        Normal1.setVisible(true);
        Normal.setVisible(false);
    }//GEN-LAST:event_Fácil1MouseMoved

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        //Reseta os efeitos de botão
        Fácil1.setVisible(true);
        Fácil.setVisible(false);
        Normal1.setVisible(true);
        Normal.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseMoved

    private void Aleatório1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Aleatório1MouseMoved
        //Efeito de botão
        Aleatório1.setVisible(false);
        Aleatório.setVisible(true);
        Escolher1.setVisible(false);
        Escolher.setVisible(false);
    }//GEN-LAST:event_Aleatório1MouseMoved

    private void Escolher1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Escolher1MouseMoved
        //Efeito de botão
        Aleatório1.setVisible(false);
        Aleatório.setVisible(false);
        Escolher1.setVisible(false);
        Escolher.setVisible(true);
    }//GEN-LAST:event_Escolher1MouseMoved

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        //Reseta os efeitos de botão
        Aleatório1.setVisible(true);
        Aleatório.setVisible(false);
        Escolher1.setVisible(true);
        Escolher.setVisible(false);
    }//GEN-LAST:event_jLabel3MouseMoved

    private void NovoJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovoJogoMouseClicked
        //Voltar para o menu principal criando um novo objeto da classe, logo reseta todo o jogo
        dispose();
        Game janela1 = new Game();
        audio.stop();
        janela1.play("/AA/SomFundo");
        janela1.setVisible(true);
    }//GEN-LAST:event_NovoJogoMouseClicked

    private void NovoJogo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovoJogo1MouseMoved
        //Efeito de botão
        NovoJogo1.setVisible(false);
        NovoJogo.setVisible(true);
        ReiniciarJogo1.setVisible(false);
        ReiniciarJogo.setVisible(false);
    }//GEN-LAST:event_NovoJogo1MouseMoved

    private void ReiniciarJogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReiniciarJogoMouseClicked
        //Reinicia o jogo
        reiniciaJogo();
    }//GEN-LAST:event_ReiniciarJogoMouseClicked

    private void ReiniciarJogo1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReiniciarJogo1MouseMoved
        //Efeito de botão
        NovoJogo1.setVisible(false);
        NovoJogo.setVisible(false);
        ReiniciarJogo1.setVisible(false);
        ReiniciarJogo.setVisible(true);
    }//GEN-LAST:event_ReiniciarJogo1MouseMoved

    private void VitóriaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VitóriaMouseMoved
        //Reseta os efeitos de botão
        NovoJogo1.setVisible(true);
        NovoJogo.setVisible(false);
        ReiniciarJogo1.setVisible(true);
        ReiniciarJogo.setVisible(false);
    }//GEN-LAST:event_VitóriaMouseMoved

    private void DerrotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DerrotaMouseMoved
        //Reseta os efeitos de botão
        NovoJogo1.setVisible(true);
        NovoJogo.setVisible(false);
        ReiniciarJogo1.setVisible(true);
        ReiniciarJogo.setVisible(false);
    }//GEN-LAST:event_DerrotaMouseMoved

    private void Play1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Play1MouseMoved
        //Efeito de botão
        Play.setVisible(true);
        Play1.setVisible(false);
    }//GEN-LAST:event_Play1MouseMoved

    private void Som_PauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Som_PauseMouseClicked
        //Para o áudio
        audio.stop();
        mudo = true;
        Som_Pause.setVisible(!mudo);
        Som_Pause2.setVisible(mudo);
    }//GEN-LAST:event_Som_PauseMouseClicked

    private void Som_Pause2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Som_Pause2MouseClicked
        //Retoma o áudio
        play("/AA/SomFundo");
        mudo = false;
        Som_Pause.setVisible(!mudo);
        Som_Pause2.setVisible(mudo);
    }//GEN-LAST:event_Som_Pause2MouseClicked

    private void Voltar_insMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voltar_insMouseMoved
        //Efeito do botão
        Voltar_ins.setVisible(false);
        Voltar2_ins.setVisible(true);
        EscolhaJogo.setVisible(false);
        EscolhaDif.setVisible(false);
    }//GEN-LAST:event_Voltar_insMouseMoved

    private void Voltar2_insMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Voltar2_insMouseClicked
        //Retorna ao menu principal
        setContentPane(MENU);
        setJogando(false);
        revalidate();
        repaint();
        setVisible(true);
        System.gc();
        //setJogando(true);
    }//GEN-LAST:event_Voltar2_insMouseClicked

    private void FundoInstruMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FundoInstruMouseMoved
        //Reseta o efeito de botão
        Voltar_ins.setVisible(true);
        Voltar2_ins.setVisible(false);
    }//GEN-LAST:event_FundoInstruMouseMoved

    private void SairMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseMoved
        //Efeito de botão
        Sair1.setVisible(true);
        Sair.setVisible(false);
    }//GEN-LAST:event_SairMouseMoved

    private void Sair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Sair1MouseClicked
        //Encerra o jogo
        System.exit(0);
    }//GEN-LAST:event_Sair1MouseClicked

    public void play (String nomeDoAudio)
    {
        //Controle de som
        url = getClass().getResource(nomeDoAudio+".wav");
        audio = Applet.newAudioClip(url);
        audio.loop(); //toca o som repetidamente
    }
    
    private void setqntband() {
        //Diminui o contador de bandeira aliada
        if (qntband == 1) {
            qntband -= 1;
        }
    }
    
    private void setqntb() {
        //Diminui o contador de bombas aliadas
        if (qntb > 0 && qntb <= 2) {
            qntb -= 1;
        }
    }
    
    private void setqntP1() {
        //Diminui o contador de peça P1 aliada
        if (qntP1 == 1) {
            qntP1 -= 1;
        }
    }
    
    private void setqntP2() { 
        //Diminui o contador de peça P2 aliada
        if (qntP2 > 0 && qntP2 <= 3) {
            qntP2 -= 1;
        }
    }
    
    private void setqntP3() {
        //Diminui o contador de peça P3 aliada
        if (qntP3 > 0 && qntP3 <= 2) {
            qntP3 -= 1;
        }
    }
    
    private void setqntP10() {
        //Diminui o contador de peça P10 aliada
        if (qntP10 == 1) {
            qntP10 -= 1;
        }
    }
    
    private void MouseClickedUsuario(java.awt.event.MouseEvent evt)
    {
        //Controle de cliques no modo de escolher peças
       Object source = evt.getSource();
       
       for(int i = 0; i<6; i++)
       {
            if(source == vetor[0][i])
            {
                if(cliqueus == false)
                {
                    setXUs(i);
                    setCliqueUs(true);
                }  
           }
       }
    }
    
    private void MouseClicked(java.awt.event.MouseEvent evt)
    {                                    
       Object source = evt.getSource();
       for(int i=0; i<5; i++)
       {
           for(int j=0; j<5; j++)
           {
               if(source == squares[i][j])
               {
                   if (usuario == true) 
                   {
                       //Movimento já dentro do jogo
                        if(clique == false && squares[i][j].getAliado() == true && !(squares[i][j] instanceof Bandeira) && !(squares[i][j] instanceof Bomba))
                        {
                            //Primeiro clique
                            setX(i);
                            setY(j);
                            setClique(true);
                            VEZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/MSG1.1.png")));

                        }

                        else if(clique == true)
                        {
                             //Segundo clique
                            if(processClick(i, j)) {
                                jogada = false;
                                setClique(false);
                            }
                            
                            //Verificar mobilidade                 
                            int opcoes = 0;
                            if(getX() < 4 && !(squares[getX()+1][getY()].getAliado() == true || squares[getX()+1][getY()] instanceof Lago))
                                opcoes++;
                            
                            if(getX() > 0 && !(squares[getX()-1][getY()].getAliado() == true || squares[getX()-1][getY()] instanceof Lago))
                                opcoes++;
                            
                            if(getY() < 4 && !(squares[getX()][getY()+1].getAliado() == true || squares[getX()][getY()+1] instanceof Lago))
                                opcoes++;
                            
                            if(getY() > 0 && !(squares[getX()][getY()-1].getAliado() == true || squares[getX()][getY()-1] instanceof Lago))
                                opcoes++;
                            if(opcoes == 0)
                            {
                                setClique(false);
                                //System.out.println("FALSE: NÃO É POSSÍVEL MOVER A PEÇA (ESCOLHER OUTRA)");
                            }
                            
                            if (jogada == false) {
                                if (verificaEncurralado(false)) {
                                    VEZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AA/MSG0.1.png")));
                                    movimentoComputador();
                                    jogada = true;
                                }
                            }
                        }
                   }
                
                   if(cliqueus == true) //Quando o usuário está na parte de escolher as posições das peças
                   {
                       setCliqueUs(false);
                       if (i >= 3 && squares[i][j] instanceof Vazio) { //Linhas possíveis a serem preenchidas
                            if (getXUs() == 0 && qntband > 0)
                            { 
                                squares[i][j] = new Bandeira(true, true);
                                setqntband();
                            }
                            else if (getXUs() == 1 && qntb > 0) 
                            {
                                squares[i][j] = new Bomba(true, true);
                                setqntb();
                            }
                            else if (getXUs() == 2 && qntP1 > 0) 
                            {
                                squares[i][j] = new Espiao(true, true);
                                setqntP1();
                            }
                            else if (getXUs() == 3 && qntP2 > 0) 
                            {
                                squares[i][j] = new Soldado(true, true);
                                setqntP2();
                            }
                            else if (getXUs() == 4 && qntP3 > 0) {
                                squares[i][j] = new CaboArmeiro(true, true);
                                setqntP3();
                            }
                            else if (getXUs() == 5 && qntP10 > 0) {
                                squares[i][j] = new Marechal(true, true);
                                setqntP10();
                            }
                            //Atualiza os contadores
                            cont1.setText("x" + qntP1);
                            cont2.setText("x" + qntband);
                            cont3.setText("x" + qntP3);
                            cont4.setText("x" + qntb);
                            cont5.setText("x" + qntP10);
                            cont6.setText("x" + qntP2);
                            if((qntband + qntb + qntP1 + qntP2 + qntP3 + qntP10) == 0) //Aparecerá o botão de jogar
                            {
                                VetorUsu.setVisible(false);
                                cont1.setVisible(false);
                                cont2.setVisible(false);
                                cont3.setVisible(false);
                                cont4.setVisible(false);
                                cont5.setVisible(false);
                                cont6.setVisible(false);
                                MSG1.setVisible(true);
                                MSG.setVisible(false);
                                Play1.setVisible(true);
                                Play.setVisible(false);   
                            }
                            atualizarTabuleiro();
                       }
                   }
               }
           }
       }
    }
    
    private boolean processClick(int X, int Y)
    {
        /*posiçao antiga: X: getX()
                          Y: getY()
          posicao nova: X: X
                        Y: Y*/

        int variacaoX = Math.abs(getX() - X);
        int variacaoY = Math.abs(getY() - Y);
                
        if(variacaoX > 0 && variacaoY > 0) { //NÃO PODE MOVER NA DIAGONAL
            return false;
        }
        
        else if(!(squares[getX()][getY()] instanceof Soldado) && (variacaoX > 1 || variacaoY > 1)) //NÃO É SOLDADO E QUER DAR MAIS DE 1 PASSO
        {
            return false;
        }
        
        else if(variacaoX == 0 && variacaoY == 0) //NÃO ANDOU
        { 
            return false;
        }
        
        else if(squares[X][Y] instanceof Lago) //NÃO PODE MOVER PARA O LAGO
        {
            return false;
        }
        
        else if(squares[getX()][getY()] instanceof Bomba || squares[getX()][getY()] instanceof Bandeira) //NÃO PODE MOVER PARA A BOMBA NEM PARA A BANDEIRA
        {
            return false;
        }
        
        else if(squares[X][Y].getAliado() == true) { //NÃO PODE MOVER PARA CIMA DO ALIADO
            return false;
        }
        
        else
        {   
            if (squares[getX()][getY()] instanceof Soldado && (variacaoX > 1 || variacaoY > 1) && (getX() < X)) //SOLDADO (DIREITA)
            {
                for (int k = getX()+1; k < X; k++) 
                {
                    if (!(squares[k][getY()] instanceof Vazio)) 
                    { 
                        return false;
                    }
                }
            }   
            
            else if (squares[getX()][getY()] instanceof Soldado && (variacaoX > 1 || variacaoY > 1) && (getX() > X))//SOLDADO(ESQUERDA)
            {
                for (int k = getX()-1; k > X; k--) 
                {
                    if (!(squares[k][getY()] instanceof Vazio)) 
                    { 
                        return false;
                    }

                }
            }

            else if (squares[getX()][getY()] instanceof Soldado && (variacaoX > 1 || variacaoY > 1) && (getY() < Y))//SOLDADO(BAIXO)
            {
                for (int k = getY()+1; k < Y; k++)
                {
                    if (!(squares[getX()][k] instanceof Vazio))
                    { 
                        return false;
                    }

                }
            }

            else if (squares[getX()][getY()] instanceof Soldado && (variacaoX > 1 || variacaoY > 1) && (getY() > Y))//SOLDADO(CIMA)
            {
                for (int k = getY()-1; k > Y; k--) 
                {
                    if (!(squares[getX()][k] instanceof Vazio))
                    { 
                        return false;
                    }
                }
            }
            
            //Qualquer peça pega a bandeira inimiga
            if (squares[X][Y] instanceof Bandeira) {
                if(squares[getX()][getY()] instanceof Espiao)
                {
                    squares[X][Y] = new Espiao(true, true);
                }

                else if(squares[getX()][getY()] instanceof Soldado)
                {
                    squares[X][Y] = new Soldado(true, true);
                }

                else if(squares[getX()][getY()] instanceof CaboArmeiro)
                {
                    squares[X][Y] = new CaboArmeiro(true, true);              
                }

                else if(squares[getX()][getY()] instanceof Marechal)
                {
                    squares[X][Y] = new Marechal(true, true);          
                }
                
               //Atualiza a posicao antiga para vazio
               squares[getX()][getY()] = new Vazio();
               qntbandIni--;
               verificaFim();
               atualizarTabuleiro();
               return true;
            }
            
            //Qualquer peça avança para a peça vazio
            else if (squares[X][Y] instanceof Vazio) { 
                if(squares[getX()][getY()] instanceof Espiao)
                {
                    squares[X][Y] = new Espiao(true, true);
                }

                else if(squares[getX()][getY()] instanceof Soldado)
                {
                    squares[X][Y] = new Soldado(true, true);
                }

                else if(squares[getX()][getY()] instanceof CaboArmeiro)
                {
                    squares[X][Y] = new CaboArmeiro(true, true);              
                }

                else if(squares[getX()][getY()] instanceof Marechal)
                {
                    squares[X][Y] = new Marechal(true, true);          
                }
                
                //Atualiza a posicao antiga para vazio
               squares[getX()][getY()] = new Vazio();
               verificaFim();
               atualizarTabuleiro();
               return true;
            }
            
            //Ações relacionadas ao espião aliado
            else if (squares[getX()][getY()] instanceof Espiao) {
                if(squares[X][Y] instanceof Bomba) {
                    squares[X][Y] = new Bomba(false, true); //Espião aliado morre
                    squares[getX()][getY()] = new Vazio();
                    qntP1--;
                }
                
                else if(squares[X][Y] instanceof Espiao) {
                    squares[X][Y] = new Vazio(); 
                    squares[getX()][getY()] = new Vazio(); //Ambos os espiões morrem
                    qntP1--;
                    qntP1Ini--;
                }
                
                else if(squares[X][Y] instanceof Soldado) {
                    squares[X][Y] = new Soldado(false, true); //Espião aliado morre
                    squares[getX()][getY()] = new Vazio();
                    qntP1--;
                }
                
                else if(squares[X][Y] instanceof CaboArmeiro) {
                    squares[X][Y] = new CaboArmeiro(false, true); //Espião aliado morre
                    squares[getX()][getY()] = new Vazio();
                    qntP1--;
                }
                
                else if(squares[X][Y] instanceof Marechal) {
                    squares[X][Y] = new Espiao(true, true); //Mata o marechal inimigo
                    squares[getX()][getY()] = new Vazio();
                    qntP10Ini--;
                }
                verificaFim();
                atualizarTabuleiro();
                return true;
            }
            
            //Ações relacionadas ao soldado aliado
            else if (squares[getX()][getY()] instanceof Soldado) {
                if(squares[X][Y] instanceof Bomba) {
                    squares[X][Y] = new Bomba(false, true); //Soldado aliado morre
                    squares[getX()][getY()] = new Vazio();
                    qntP2--;
                }
                
                else if(squares[X][Y] instanceof Espiao) {
                    squares[X][Y] = new Soldado(true, true); //Mata o espião inimigo
                    squares[getX()][getY()] = new Vazio();
                    qntP1Ini--;
                }
                
                else if(squares[X][Y] instanceof Soldado) {
                    squares[X][Y] = new Vazio(); //Ambos os soldados morrem
                    squares[getX()][getY()] = new Vazio();
                    qntP2--;
                    qntP2Ini--;
                }
                
                else if(squares[X][Y] instanceof CaboArmeiro) {
                    squares[X][Y] = new CaboArmeiro(false, true); //Soldado aliado morre
                    squares[getX()][getY()] = new Vazio();
                    qntP2--;
                }
                
                else if(squares[X][Y] instanceof Marechal) {
                    squares[X][Y] = new Marechal(false, true); //Soldado aliado morre
                    squares[getX()][getY()] = new Vazio();
                    qntP2--;
                }                
                verificaFim();
                atualizarTabuleiro();
                return true;
            }
            
            //Ações relacionadas ao cabo aliado
            else if (squares[getX()][getY()] instanceof CaboArmeiro) {
                if(squares[X][Y] instanceof Bomba) {
                    squares[X][Y] = new CaboArmeiro(true, true); //Desarma bomba inimiga
                    squares[getX()][getY()] = new Vazio();
                    qntbIni--;
                }
                
                else if(squares[X][Y] instanceof Espiao) {
                    squares[X][Y] = new CaboArmeiro(true, true); //Mata o espião inimigo
                    squares[getX()][getY()] = new Vazio();
                    qntP1Ini--;
                }
                
                else if(squares[X][Y] instanceof Soldado) {
                    squares[X][Y] = new CaboArmeiro(true, true); //Mata o soldado inimigo
                    squares[getX()][getY()] = new Vazio();
                    qntP2Ini--;
                }
                
                else if(squares[X][Y] instanceof CaboArmeiro) {
                    squares[X][Y] = new Vazio(); //Ambos os cabos morrem
                    squares[getX()][getY()] = new Vazio();
                    qntP3--;
                    qntP3Ini--;
                }
                
                else if(squares[X][Y] instanceof Marechal) {
                    squares[X][Y] = new Marechal(false, true); //Cabo aliado morre
                    squares[getX()][getY()] = new Vazio();
                    qntP3--;
                }
                verificaFim();
                atualizarTabuleiro();
                return true;
            }
            
            //Ações relacionadas ao marechal aliado
            else if (squares[getX()][getY()] instanceof Marechal) {
                if(squares[X][Y] instanceof Bomba) {
                    squares[X][Y] = new Bomba(false, true); //Marechal aliado morre
                    squares[getX()][getY()] = new Vazio();
                    qntP10--;
                }
                
                else if(squares[X][Y] instanceof Espiao) {
                    squares[X][Y] = new Marechal(true, true); //Mata o espião inimigo
                    squares[getX()][getY()] = new Vazio();
                    qntP1Ini--;
                }
                
                else if(squares[X][Y] instanceof Soldado) {
                    squares[X][Y] = new Marechal(true, true); //Mata o soldado inimigo
                    squares[getX()][getY()] = new Vazio();
                    qntP2Ini--;
                }
                
                else if(squares[X][Y] instanceof CaboArmeiro) {
                    squares[X][Y] = new Marechal(true, true); //Mata o cabo inimigo
                    squares[getX()][getY()] = new Vazio();
                    qntP3Ini--;
                }
                
                else if(squares[X][Y] instanceof Marechal) {
                    squares[X][Y] = new Vazio(); //Ambos os marechais morrem
                    squares[getX()][getY()] = new Vazio();
                    qntP10--;
                    qntP10Ini--;
                }
                verificaFim();
                atualizarTabuleiro();
                return true;
            }
            return true;
        }
    }
    
    
    private void movimentoComputador() { //APAGAR UMAS COISAS DAQUI
        //Sorteia e verifica a possibilidade de movimento do computador
        int randI, randJ, randDir, contt = 0;
        boolean mov = false;
        //0 -> azul e 1 -> vermelho
        while (!mov) {
            randI = randInt(0, 4);
            randJ = randInt(0, 4);
            if (squares[randI][randJ].getAliado() == false && !(squares[randI][randJ] instanceof Bandeira) && !(squares[randI][randJ] instanceof Bomba) && !(squares[randI][randJ] instanceof Lago) && !(squares[randI][randJ] instanceof Vazio)) {
                randDir = randInt(0, 3);
                //verificar mobilidade                          
                if(randI < 4 && (squares[randI+1][randJ].getAliado() == true)) {
                    movimentos(randI, randJ, 1, 0);
                    mov = true;
                }
                else if(randI > 0 && (squares[randI-1][randJ].getAliado() == true)) {
                    movimentos(randI, randJ, -1, 0);
                    mov = true;
                }
                else if(randJ < 4 && (squares[randI][randJ+1].getAliado() == true)) {
                    movimentos(randI, randJ, 0, 1);
                    mov = true;
                }    
                else if(randJ > 0 && (squares[randI][randJ-1].getAliado() == true)) {
                    movimentos(randI, randJ, 0, -1);
                    mov = true;
                }
                            
                else if (randDir == 0 && randI < 4) { //Baixo
                    if (squares[randI+1][randJ] instanceof Vazio || squares[randI+1][randJ].getAliado() == true) {
                        movimentos(randI, randJ, 1, 0);
                        mov = true;
                    }
                    else
                        mov = false;
                }
                else if (randDir == 1 && randI > 0) { //Cima
                    if (squares[randI-1][randJ] instanceof Vazio || squares[randI-1][randJ].getAliado() == true) {
                        movimentos(randI, randJ, -1, 0);
                        mov = true;
                    }
                    else
                        mov = false;
                }
                else if (randDir == 2 && randJ < 4) { //Direita
                    if (squares[randI][randJ+1] instanceof Vazio || squares[randI][randJ+1].getAliado() == true) {
                        movimentos(randI, randJ, 0, 1);
                        mov = true;
                    }
                    else
                        mov = false;
                }
                else if (randDir == 3 && randJ > 0) { //Esquerda
                    if (squares[randI][randJ-1] instanceof Vazio || squares[randI][randJ-1].getAliado() == true) {
                        movimentos(randI, randJ, 0, -1);
                        mov = true;
                    }
                    else
                        mov = false;
                }
            }    
            else
                mov = false;
                contt++;
            } 
    }
    
    
    public boolean movimentos(int X, int Y, int i, int j) {
        setX(X); //antiga
        X = X + i; //nova
        
        setY(Y); //antiga
        Y = Y + j; //nova
        
        //Qualquer peça captura a bandeira aliada
        if (squares[X][Y] instanceof Bandeira) { 
                if(squares[getX()][getY()] instanceof Espiao)
                {
                    squares[X][Y] = new Espiao(false, true);
                }

                else if(squares[getX()][getY()] instanceof Soldado)
                {
                    squares[X][Y] = new Soldado(false, true);
                }

                else if(squares[getX()][getY()] instanceof CaboArmeiro)
                {
                    squares[X][Y] = new CaboArmeiro(false, true);              
                }

                else if(squares[getX()][getY()] instanceof Marechal)
                {
                    squares[X][Y] = new Marechal(false, true);          
                }
                
               //Atualiza a posicao antiga para vazio
               squares[getX()][getY()] = new Vazio();
               qntband--;
               verificaFim();
               atualizarTabuleiro();
               return true;
            }
            
            //Qualquer peça avança para a peça vazio
            else if (squares[X][Y] instanceof Vazio) {
                if(squares[getX()][getY()] instanceof Espiao)
                {
                    squares[X][Y] = new Espiao(false, squares[getX()][getY()].getVisível());
                }

                else if(squares[getX()][getY()] instanceof Soldado)
                {
                    squares[X][Y] = new Soldado(false, squares[getX()][getY()].getVisível());
                }

                else if(squares[getX()][getY()] instanceof CaboArmeiro)
                {
                    squares[X][Y] = new CaboArmeiro(false, squares[getX()][getY()].getVisível());              
                }

                else if(squares[getX()][getY()] instanceof Marechal)
                {
                    squares[X][Y] = new Marechal(false, squares[getX()][getY()].getVisível());          
                }
                
               //Atualiza a posicao antiga para vazio
               squares[getX()][getY()] = new Vazio();
               verificaFim();
               atualizarTabuleiro();
               return true;
            }
            
            //Ações relacionadas ao espião inimigo
            else if (squares[getX()][getY()] instanceof Espiao) {
                if(squares[X][Y] instanceof Bomba) {
                    squares[X][Y] = new Bomba(true, true); //Morre para a bomba aliada
                    squares[getX()][getY()] = new Vazio();
                    qntP1Ini--;
                }
                
                else if(squares[X][Y] instanceof Espiao) {
                    squares[X][Y] = new Vazio(); 
                    squares[getX()][getY()] = new Vazio(); //Ambos os espiões morrem
                    qntP1--;
                    qntP1Ini--;
                }
                
                else if(squares[X][Y] instanceof Soldado) {
                    squares[X][Y] = new Soldado(true, true); //Morre para o soldado aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP1Ini--;
                }
                
                else if(squares[X][Y] instanceof CaboArmeiro) {
                    squares[X][Y] = new CaboArmeiro(true, true); //Morre para o cabo aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP1Ini--;
                }
                
                else if(squares[X][Y] instanceof Marechal) {
                    squares[X][Y] = new Espiao(false, true); //Mata o marechal aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP10--;
                }
                verificaFim();
                atualizarTabuleiro();
                return true;
            }
            
            //Ações relacionadas ao soldado inimigo
            else if (squares[getX()][getY()] instanceof Soldado) {
                if(squares[X][Y] instanceof Bomba) {
                    squares[X][Y] = new Bomba(true, true); //Morre para a bomba aliada
                    squares[getX()][getY()] = new Vazio();
                    qntP2Ini--;
                }
                
                else if(squares[X][Y] instanceof Espiao) {
                    squares[X][Y] = new Soldado(false, true); //Mata o espião aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP1--;
                }
                
                else if(squares[X][Y] instanceof Soldado) {
                    squares[X][Y] = new Vazio(); //Ambos os soldados morrem
                    squares[getX()][getY()] = new Vazio();
                    qntP2--;
                    qntP2Ini--;
                }
                
                else if(squares[X][Y] instanceof CaboArmeiro) {
                    squares[X][Y] = new CaboArmeiro(true, true); //Morre para o cabo aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP2Ini--;
                }
                
                else if(squares[X][Y] instanceof Marechal) {
                    squares[X][Y] = new Marechal(true, true); //Morre para o marechal aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP2Ini--;
                }
                verificaFim();
                atualizarTabuleiro();
                return true;
            }
            
            //Ações relacionadas ao cabo inimigo
            else if (squares[getX()][getY()] instanceof CaboArmeiro) {
                if(squares[X][Y] instanceof Bomba) {
                    squares[X][Y] = new CaboArmeiro(false, true); //Desarma a bomba aliada
                    squares[getX()][getY()] = new Vazio();
                    qntb--;
                }
                
                else if(squares[X][Y] instanceof Espiao) {
                    squares[X][Y] = new CaboArmeiro(false, true); //Mata o espião aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP1--;
                }
                
                else if(squares[X][Y] instanceof Soldado) {
                    squares[X][Y] = new CaboArmeiro(false, true); //Mata o soldado aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP2--;
                }
                
                else if(squares[X][Y] instanceof CaboArmeiro) {
                    squares[X][Y] = new Vazio(); //Ambos os cabos morrem
                    squares[getX()][getY()] = new Vazio();
                    qntP3--;
                    qntP3Ini--;
                }
                
                else if(squares[X][Y] instanceof Marechal) {
                    squares[X][Y] = new Marechal(true, true); //Morre para o marechal aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP3Ini--;
                }
                verificaFim();
                atualizarTabuleiro();
                return true;
            }
            
            //Ações relacionadas ao marechal inimigo
            else if (squares[getX()][getY()] instanceof Marechal) {
                if(squares[X][Y] instanceof Bomba) {
                    squares[X][Y] = new Bomba(true, true); //Morre para a bomba aliada
                    squares[getX()][getY()] = new Vazio();
                    qntP10Ini--;
                }
                
                else if(squares[X][Y] instanceof Espiao) {
                    squares[X][Y] = new Marechal(false, true); //Mata o espião aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP1--;
                }
                
                else if(squares[X][Y] instanceof Soldado) {
                    squares[X][Y] = new Marechal(false, true); //Mata o soldado aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP2--;
                }
                
                else if(squares[X][Y] instanceof CaboArmeiro) {
                    squares[X][Y] = new Marechal(false, true); //Mata o cabo aliado
                    squares[getX()][getY()] = new Vazio();
                    qntP3--;
                }
                
                else if(squares[X][Y] instanceof Marechal) {
                    squares[X][Y] = new Vazio(); //Ambos os marechais morrem
                    squares[getX()][getY()] = new Vazio();
                    qntP10--;
                    qntP10Ini--;
                }
                verificaFim();
                atualizarTabuleiro();
                return true;
            }
        return true;
    }
    
    
    public void verificaFim() {
        if (qntbandIni == 0 || !verificaEncurralado(false) || verificaBombaBand(false)) { //Usuário ganhou o jogo
            setContentPane(FIM);
            setJogando(false);
            NovoJogo1.setVisible(true);
            NovoJogo.setVisible(false);
            ReiniciarJogo1.setVisible(true);
            ReiniciarJogo.setVisible(false);
            Vitória.setVisible(true);
            Derrota.setVisible(false);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
        if (qntband == 0 || !verificaEncurralado(true) || verificaBombaBand(true)){ //Usuário perdeu o jogo
            setContentPane(FIM);
            setJogando(false);
            NovoJogo1.setVisible(true);
            NovoJogo.setVisible(false);
            ReiniciarJogo1.setVisible(true);
            ReiniciarJogo.setVisible(false);
            Vitória.setVisible(false);
            Derrota.setVisible(true);
            revalidate();
            repaint(); 
            setVisible(true);
            System.gc();
        }
    }
    
    
    public boolean verificaEncurralado(boolean aliado) {
        //Verificar mobilidade tanto da peça aliada quanto da inimiga
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (squares[i][j].getAliado() == aliado && !(squares[i][j] instanceof Vazio) && !(squares[i][j] instanceof Lago) && !(squares[i][j] instanceof Bomba) && !(squares[i][j] instanceof Bandeira)) {                
                    int opcoes = 0;
                    if(i < 4 && !(squares[i+1][j].getAliado() == aliado && !(squares[i+1][j] instanceof Vazio) || squares[i+1][j] instanceof Lago)) 
                        opcoes++;
                    
                    if(i > 0 && !(squares[i-1][j].getAliado() == aliado && !(squares[i-1][j] instanceof Vazio) || squares[i-1][j] instanceof Lago))
                        opcoes++;

                    if(j < 4 && !(squares[i][j+1].getAliado() == aliado && !(squares[i][j+1] instanceof Vazio) || squares[i][j+1] instanceof Lago))
                        opcoes++;

                    if(j > 0 && !(squares[i][j-1].getAliado() == aliado && !(squares[i][j-1] instanceof Vazio) || squares[i][j-1] instanceof Lago))
                        opcoes++;

                    if(opcoes > 0)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    
    public boolean verificaBombaBand(boolean aliado) {
        //Verifica se só restaram as peças imóveis
        if (aliado == true) {
            if ((qntP1 + qntP2 + qntP3 + qntP10) == 0) {
                return true;
            }
        }
        else {
            if ((qntP1Ini + qntP2Ini + qntP3Ini + qntP10Ini) == 0) {
                return true;
            }
        }
        return false;
    }
    
    
    public void reiniciaJogo() {
        //Reseta todas as variáveis
        //PEÇAS DO ALIADO
        qntband = 1;
        qntb = 2;
        qntP1 = 1;
        qntP2 = 3; 
        qntP3 = 2;
        qntP10 = 1;
        
        //PEÇAS DO INIMIGO
        qntbandIni = 1;
        qntbIni = 2;
        qntP1Ini = 1; 
        qntP2Ini = 3;
        qntP3Ini = 2; 
        qntP10Ini = 1;
        
        //Reinicia as dicas
        cont = 0;
        
        //Atribui a matriz do grid à matriz auxiliar
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                squares[i][j] = matrizAux[i][j];
            }
        }
        
        if (escolher == true) {
            cont1.setText("x" + qntP1);
            cont2.setText("x" + qntband);
            cont3.setText("x" + qntP3);
            cont4.setText("x" + qntb);
            cont5.setText("x" + qntP10);
            cont6.setText("x" + qntP2);
            VetorUsu.setVisible(true);
            cont1.setVisible(true);
            cont2.setVisible(true);
            cont3.setVisible(true);
            cont4.setVisible(true);
            cont5.setVisible(true);
            cont6.setVisible(true);            
            MSG1.setVisible(false);
            MSG.setVisible(true);
            Play1.setVisible(false);
            Play.setVisible(false);
        }
        
        clique = false;
        atualizarTabuleiro();
        setContentPane(JOGO);
        revalidate();
        repaint();
        setVisible(true);
        System.gc();
        setJogando(true);
    }
    
    
    public void setClique (boolean clique)
    {
        this.clique = clique;
    }
    
    public void setCliqueUs (boolean clique)
    {
        this.cliqueus = clique;
    }
    
    public int getX() 
    {
        return X;
    }
    
    public int getY() 
    {
        return Y;
    }
    
    public int getXUs() 
    {
        return Xus;
    }
    
    void setX(int X)
    {
        this.X = X;
    }
    
    void setY(int Y)
    {
        this.Y = Y;
    }
    
    void setXUs(int X)
    {
        this.Xus = X;
    }
    
    public static int randInt(int min, int max){
        //Gera números aleatórios
        java.util.Random rand = new java.util.Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
    
    public void atualizarTabuleiro()
    {
        //Atualiza o tabuleiro e variáveis de contadores
        tabela.removeAll();
        
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                tabela.add(squares[i][j]);
                squares[i][j].addMouseListener(new java.awt.event.MouseAdapter()
                {
                    public void mouseClicked(java.awt.event.MouseEvent evt)
                    {
                        MouseClicked(evt);
                    }
                });
            }
        }
        cont1.setText("x" + qntP1);
        cont2.setText("x" + qntband);
        cont3.setText("x" + qntP3);
        cont4.setText("x" + qntb);
        cont5.setText("x" + qntP10);
        cont6.setText("x" + qntP2);
        cont10.setText("x" + qntP1Ini);
        cont9.setText("x" + qntbIni);
        cont12.setText("x" + qntP3Ini);
        cont8.setText("x" + qntbandIni);
        cont13.setText("x" + qntP10Ini);
        cont11.setText("x" + qntP2Ini);
        revalidate();
        repaint();
    }
    

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Game janela = new Game();
                janela.setVisible(true);
                janela.play("/AA/SomFundo");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aleatório;
    private javax.swing.JLabel Aleatório1;
    private javax.swing.JPanel CREDITOS;
    private javax.swing.JLabel Coluna1;
    private javax.swing.JLabel Coluna2;
    private javax.swing.JLabel Coluna3;
    private javax.swing.JLabel Coluna4;
    private javax.swing.JLabel Coluna5;
    private javax.swing.JLabel Cred;
    private javax.swing.JLabel Cred2;
    private javax.swing.JLabel DICA;
    private javax.swing.JLabel DICA_2;
    private javax.swing.JLabel DICA_3;
    private javax.swing.JLabel DICA_4;
    private javax.swing.JLabel Derrota;
    private javax.swing.JPanel EscolhaDif;
    private javax.swing.JPanel EscolhaJogo;
    private javax.swing.JLabel Escolher;
    private javax.swing.JLabel Escolher1;
    private javax.swing.JPanel FIM;
    private javax.swing.JLabel FundoCred;
    private javax.swing.JLabel FundoInstru;
    private javax.swing.JLabel FundoJogo;
    private javax.swing.JLabel FundoJogo1;
    private javax.swing.JLabel FundoMenu;
    private javax.swing.JLabel FundoPause;
    private javax.swing.JLabel Fácil;
    private javax.swing.JLabel Fácil1;
    private javax.swing.JPanel INSTRU;
    private javax.swing.JLabel Inst;
    private javax.swing.JLabel Inst2;
    private javax.swing.JPanel JOGO;
    private javax.swing.JLabel Jogar;
    private javax.swing.JLabel Jogar2;
    private javax.swing.JLabel Linha1;
    private javax.swing.JLabel Linha2;
    private javax.swing.JLabel Linha3;
    private javax.swing.JLabel Linha4;
    private javax.swing.JLabel Linha5;
    private javax.swing.JPanel MENU;
    private javax.swing.JLabel MSG;
    private javax.swing.JLabel MSG1;
    private javax.swing.JLabel Mold;
    private javax.swing.JLabel Normal;
    private javax.swing.JLabel Normal1;
    private javax.swing.JLabel NovoJogo;
    private javax.swing.JLabel NovoJogo1;
    private javax.swing.JLabel Op1;
    private javax.swing.JLabel Op1_2;
    private javax.swing.JLabel Op2;
    private javax.swing.JLabel Op2_2;
    private javax.swing.JLabel Op3;
    private javax.swing.JLabel Op3_2;
    private javax.swing.JLabel Op4;
    private javax.swing.JLabel Op4_2;
    private javax.swing.JLabel P1;
    private javax.swing.JLabel P10;
    private javax.swing.JLabel P10INI;
    private javax.swing.JLabel P1INI;
    private javax.swing.JLabel P2;
    private javax.swing.JLabel P2INI;
    private javax.swing.JLabel P3;
    private javax.swing.JLabel P3INI;
    private javax.swing.JPanel PAUSE;
    private javax.swing.JLabel PBAND;
    private javax.swing.JLabel PBANDINI;
    private javax.swing.JLabel PBOMB;
    private javax.swing.JLabel PBOMBINI;
    private javax.swing.JLabel Pause;
    private javax.swing.JLabel Pause2;
    private javax.swing.JLabel Play;
    private javax.swing.JLabel Play1;
    private javax.swing.JLabel ReiniciarJogo;
    private javax.swing.JLabel ReiniciarJogo1;
    private javax.swing.JLabel Sair;
    private javax.swing.JLabel Sair1;
    private javax.swing.JLabel Som;
    private javax.swing.JLabel Som2;
    private javax.swing.JLabel Som_Pause;
    private javax.swing.JLabel Som_Pause2;
    private javax.swing.JLabel VEZ;
    private javax.swing.JLabel VetorUsu;
    private javax.swing.JLabel Vitória;
    private javax.swing.JLabel Voltar1;
    private javax.swing.JLabel Voltar2;
    private javax.swing.JLabel Voltar2_ins;
    private javax.swing.JLabel Voltar_ins;
    private javax.swing.JLabel cont1;
    private javax.swing.JLabel cont10;
    private javax.swing.JLabel cont11;
    private javax.swing.JLabel cont12;
    private javax.swing.JLabel cont13;
    private javax.swing.JLabel cont2;
    private javax.swing.JLabel cont3;
    private javax.swing.JLabel cont4;
    private javax.swing.JLabel cont5;
    private javax.swing.JLabel cont6;
    private javax.swing.JLabel cont8;
    private javax.swing.JLabel cont9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel tabela;
    // End of variables declaration//GEN-END:variables
}
