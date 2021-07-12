import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import javax.swing.*;

public class Lanchonete extends JPanel{
	
	private JComboBox cbHambur, cbBatatas, cbBebidas;
	private JLabel lbVTotal;
	private JLabel lbHambur, lbBatatas, lbBebidas;
	private JLabel lb1, lb2, lb3;
	private ImageIcon img1, img2, img3;
	private JButton btCalc, btVoltar;
	
	private String computer = "Lucas Marcondes"; 
	
	public Lanchonete(){
		inicializarComponentes();
		definirEventos();
	}
	
	private void inicializarComponentes(){
		setLayout(null);
		
		/*JLabels: Valor Total da Compra, dos Títulos(Labels), 
		dos JComboBoxs e dos Buttons.*/
		lbVTotal = new JLabel("Valor");
		lbHambur = new JLabel("Hamburgueres");
		lbBatatas = new JLabel("Batatas");
		lbBebidas = new JLabel("Bebidas");
		btCalc = new JButton("Finalizar Pedido");
		btVoltar = new JButton("Refazer Pedido");
		
		//Itens JComboBox: Hamburgueres, Batatas e Bebidas.
		String[] cbHamburItens = {"Selecione", "BIG MAC               R$17,90","BIG TASTY           R$27,90",
				"McCHICKEN        R$19,90"};		
		//==============================================================================================================
		String[] cbBatatasItens = {"Selecione","PEQUENA               R$5,90","MÉDIA                      R$7,90",
				"GRANDE                 R$9,80"}; 
		//==============================================================================================================
		String[] cbBebidasItens = {"Selecione","Água Mineral                                    R$4,90",
				"Coca-Cola 700ml                          R$12,90","Del Valle Laranja 500ml              R$12,90",
				"Del Valle Uva 500ml                     R$12,90", "Fanta Guaraná 700ml                  R$12,90",
				"Fanta Laranja 700ml                    R$12,90"}; 	
		cbHambur = new JComboBox(cbHamburItens);
		cbBatatas = new JComboBox(cbBatatasItens);	
		cbBebidas = new JComboBox(cbBebidasItens);
		
		
		//Setando Imagens
		img1 = new ImageIcon("C:\\Users\\"+computer+"\\eclipse-workspace\\4 SIT\\src\\Img\\bigmac.png");
		img2 = new ImageIcon("C:\\Users\\"+computer+"\\eclipse-workspace\\4 SIT\\src\\Img\\batata_pequena.png");
		img3 = new ImageIcon("C:\\Users\\"+computer+"\\eclipse-workspace\\4 SIT\\src\\Img\\agua.png");
		lb1 = new JLabel(img1);
		lb2 = new JLabel(img2);
		lb3 = new JLabel(img3);	
		
		
		/*Aparência: Valor Total da Compra, dos Títulos(Labels), 
		dos JComboBoxs e dos Buttons.*/
		lbVTotal.setFont(new Font("Arial", Font.BOLD, 19));
		lbHambur.setFont(new Font("Arial", Font.BOLD, 15));
		lbBatatas.setFont(new Font("Arial", Font.BOLD, 15));
		lbBebidas.setFont(new Font("Arial", Font.BOLD, 15));
		cbHambur.setFont(new Font("Arial", Font.BOLD, 12));
		cbBatatas.setFont(new Font("Arial", Font.BOLD, 12));
		cbBebidas.setFont(new Font("Arial", Font.BOLD, 12));
		btCalc.setFont(new Font("Arial", Font.BOLD, 14));
		btCalc.setBackground(new Color(121, 4, 4));
		btCalc.setForeground(Color.white);
		btVoltar.setFont(new Font("Arial", Font.BOLD, 14));
		btVoltar.setBackground(new Color(121, 4, 4));
		btVoltar.setForeground(Color.white);
		
		/*Posições: Valor Total da Compra, dos Títulos(Labels), 
		dos JComboBoxs, das IMGs e dos Buttons.*/
		lbVTotal.setBounds(40,260,250,25);
		lbHambur.setBounds(75, 15, 120, 50);
		lbBatatas.setBounds(328, 15, 100, 50);
		lbBebidas.setBounds(590, 15, 100, 50);
		cbHambur.setBounds(40, 50, 170, 25);
		cbBatatas.setBounds(270, 50, 170, 25);
		cbBebidas.setBounds(500, 50, 250, 25);
		lb1.setBounds(35, 60, 180, 180);
		lb2.setBounds(265, 60, 180, 180);
		lb3.setBounds(530, 60, 180, 180);
		btCalc.setBounds(40, 250, 145, 35);
		btVoltar.setBounds(600, 250, 145, 35);
		
		//Visibilidade: Valor Total da Compra e das IMGs.
		lbVTotal.setVisible(false);
		lb1.setVisible(false);
		lb2.setVisible(false);
		lb3.setVisible(false);
		btVoltar.setVisible(false);
		
		add(lbVTotal);
		add(cbHambur);add(lbHambur);
		add(cbBatatas);add(lbBatatas);
		add(cbBebidas);add(lbBebidas);
		add(lb1);add(lb2);add(lb3);
		add(btCalc);add(btVoltar);
	}
		
	private void definirEventos(){		
		String caminho = "C:\\Users\\"+computer+"\\eclipse-workspace\\4 SIT\\src\\Img\\";
		
		cbHambur.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				
	
				//Hamburguer
				lb1.setVisible(true);
				if(cbHambur.getSelectedIndex()== 1){
					img1 = new ImageIcon(caminho+"bigmac.png");
					lb1.setToolTipText("bigmac.png");				
				}else if(cbHambur.getSelectedIndex()== 2){
					img1 = new ImageIcon(caminho+"mctasty.png");
					lb1.setToolTipText("mctasty.png");				
				}else if(cbHambur.getSelectedIndex()== 3){
					img1 = new ImageIcon(caminho+"mcchicken.png");
					lb1.setToolTipText("mcchicken.png");					
				}else {
					lb1.setVisible(false);
				}
				lb1.setIcon(img1);
					
			}
		});
		
		cbBatatas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				//Batatas
				lb2.setVisible(true);
				if(cbBatatas.getSelectedIndex()== 1){
					img2 = new ImageIcon(caminho+"batata_pequena.png");
					lb2.setToolTipText("batata-pequena.png");
				}else if(cbBatatas.getSelectedIndex()== 2){
					img2 = new ImageIcon(caminho+"batata_media.png");
					lb2.setToolTipText("batata-media.png");
				}else if(cbBatatas.getSelectedIndex()== 3){
					img2 = new ImageIcon(caminho+"batata_grande.png");
					lb2.setToolTipText("batata-grande.png");
				}else {
					lb2.setVisible(false);
				}	
				lb2.setIcon(img2);
			}
		});
		
		cbBebidas.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){	
				//Bebidas
				lb3.setVisible(true);
				if(cbBebidas.getSelectedIndex()== 1){
					img3 = new ImageIcon(caminho+"agua.png");
					lb3.setToolTipText("água.png");
				}else if(cbBebidas.getSelectedIndex()== 2){
					img3 = new ImageIcon(caminho+"coca-cola.png");
					lb3.setToolTipText("coca-cola.png");
				}else if(cbBebidas.getSelectedIndex()== 3){
					img3 = new ImageIcon(caminho+"delvalle-laranja.png");
					lb3.setToolTipText("delvalle-laranja.png");
				}else if(cbBebidas.getSelectedIndex()== 4){
					img3 = new ImageIcon(caminho+"delvalle-uva.png");
					lb3.setToolTipText("delvalle-uva.png");
				}else if(cbBebidas.getSelectedIndex()== 5){
					img3 = new ImageIcon(caminho+"fanta-guarana.png");
					lb3.setToolTipText("fanta-guarana.png");
				}else if(cbBebidas.getSelectedIndex()== 6){
					img3 = new ImageIcon(caminho+"fanta-laranja.png");
					lb3.setToolTipText("fanta-laranja.png");
				}else {
					lb3.setVisible(false);
				}
				lb3.setIcon(img3);
			}
		});
		
		btCalc.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(cbHambur.getSelectedIndex()== 0 && cbBatatas.getSelectedIndex()== 0
						&& cbBebidas.getSelectedIndex()== 0){
					JOptionPane.showMessageDialog(null,"Selecione um item da lista!!!");
					return;
				}
				
				double valorH = 0;
				double valorBa = 0;
				double valorBe = 0;
				double VTotal = 0;
				
				//Hamburguer
				if(cbHambur.getSelectedIndex()== 1){
					valorH = 17.90;
				}else if(cbHambur.getSelectedIndex()== 2){
					valorH = 27.90;
				}else if(cbHambur.getSelectedIndex()== 3){
					valorH = 19.90;
				}
				
				//Batatas
				if(cbBatatas.getSelectedIndex()== 1){
					valorBa = 5.90;
				}else if(cbBatatas.getSelectedIndex()== 2){
					valorBa = 7.90;					
				}else if(cbBatatas.getSelectedIndex()== 3){
					valorBa = 9.80;					
				}
				
				//Bebidas
				if(cbBebidas.getSelectedIndex()== 1){
					valorBe = 4.90;					
				}else if(cbBebidas.getSelectedIndex()== 2 || cbBebidas.getSelectedIndex()== 3 ||
						cbBebidas.getSelectedIndex()== 4 || cbBebidas.getSelectedIndex()== 5 ||
						cbBebidas.getSelectedIndex()== 6){
					valorBe = 12.90;					
				}
				
				VTotal = valorH+valorBa+valorBe;
				DecimalFormat df = new DecimalFormat("0.00");
				lbVTotal.setText("Valor da Compra: R$"+df.format(VTotal));
				lbVTotal.setFont(new Font("Arial", Font.BOLD, 18));
				
				JOptionPane.showMessageDialog(null, "Pedido Concluído Com Sucesso");
				
				cbHambur.setEnabled(false);
				cbBatatas.setEnabled(false);
				cbBebidas.setEnabled(false);
				btCalc.setVisible(false);	
				lbVTotal.setVisible(true);
				btVoltar.setVisible(true);
			}
		});
		
		btVoltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				lbVTotal.setVisible(false);
				cbHambur.setEnabled(true);
				cbBatatas.setEnabled(true);
				cbBebidas.setEnabled(true);
				btCalc.setVisible(true);
				btVoltar.setVisible(false);
			}
		});
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("Lanchonete");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new Lanchonete());
		frame.setBounds(100, 130, 810, 350);
		frame.setVisible(true);
	}
}
