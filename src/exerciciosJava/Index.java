package exerciciosJava;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.ScrollPaneConstants;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class Index extends JFrame {

	Exercicios exerc = new Exercicios();
	Dados dados = new Dados();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Index() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Index.class.getResource("/images/ico.png")));
		setResizable(false);
		setTitle("Exercicios Java");
		setFont(new Font("Consolas", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		JPanel contentIndex = new JPanel();
		contentIndex.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentIndex);

		
		JPanel paneExercicio = new JPanel();
		paneExercicio.setBorder(new TitledBorder(null, "Selecione o Exercicio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		paneExercicio.setLayout(new GridLayout(0, 2, 10, 10));
		
		//Itens
		JScrollPane paneScroll = new JScrollPane();
		paneScroll.setViewportBorder(null);
		paneExercicio.add(paneScroll);
		JPanel paneScroll_Item = new JPanel();
		JPanel paneResult = new JPanel();
		paneResult.setBorder(new TitledBorder(null, "Resultado", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel paneExercicioText = new JPanel();
		JTextPane exercicioText = new JTextPane();
		JButton btnAbrir = new JButton();
		btnAbrir.setVisible(false);
		JScrollPane scrollPane = new JScrollPane();
		JTextPane resultResult = new JTextPane();
		
		
		paneScroll.setToolTipText("Selecione o exercicio que para soluciona-lo");
		paneScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		paneScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
				
		paneScroll.setViewportView(paneScroll_Item);
		paneScroll_Item.setLayout(new GridLayout(exerc.exerciciosNum.length, 1, 5, 5));
					
		
		//Exercicios
		for(int i = 0; i < exerc.exerciciosNum.length; i++) {
			int item = i;
			
			JButton btnExercicio = new JButton(exerc.exerciciosNum[i]);
			
			btnExercicio.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					exerc.setOp(item);
					Exercicios.option = item;			
					exercicioText.setText(exerc.exerciciosText[item]);
					btnAbrir.setText("Abrir "+exerc.exerciciosNum[item]);
					btnAbrir.setVisible(true);
					
				}
			});
			paneScroll_Item.add(btnExercicio);
		}
		
		btnAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switch(exerc.getOp()) {
				case 0:
					//exercicio01
					
					JTextField xField0 = new JTextField(5);
					
					xField0.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(xField0.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                xField0.setText("");
				            }
				        }
				    });
					
				    JPanel myPanel0 = new JPanel();
				    myPanel0.add(new JLabel("Salario:"));
				    myPanel0.add(xField0);

				    int result0 = JOptionPane.showConfirmDialog(null, myPanel0,  "Entre com o salario para ser calculado", JOptionPane.OK_CANCEL_OPTION);
				    if (result0 == JOptionPane.OK_OPTION) {
				    	resultResult.setText("O salario com reajuste de 25% é: R$ "+exerc.exercicio01( Double.parseDouble(xField0.getText() ) ) );
				    }
					

					break;
				case 1:
					//exercicio02
					
					JTextField xField1 = new JTextField(5);
				    JTextField yField1 = new JTextField(5);
				    
					xField1.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(xField1.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                xField1.setText("");
				            }
				        }
				    });
					yField1.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(yField1.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                yField1.setText("");
				            }
				        }
				    });

				    JPanel myPanel1 = new JPanel();
				    myPanel1.add(new JLabel("Altura:"));
				    myPanel1.add(xField1);
				    myPanel1.add(new JLabel("Base:"));
				    myPanel1.add(yField1);

				    int result1 = JOptionPane.showConfirmDialog(null, myPanel1, "Entre com os valores do triagulo: ", JOptionPane.OK_CANCEL_OPTION);
				    if (result1 == JOptionPane.OK_OPTION) {
				    	resultResult.setText("A area do triagulo é: "+
				    							exerc.exercicio02( Double.parseDouble(xField1.getText() ), 
				    									Double.parseDouble(yField1.getText() ) ) );
				    }
					
					break;
				case 2:
					//exercicio03
					
					JTextField aField2 = new JTextField(5);
				    JTextField bField2 = new JTextField(5);
				    JTextField cField2 = new JTextField(5);
				    JTextField dField2 = new JTextField(5);
				    JTextField eField2 = new JTextField(5);
				    
					aField2.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(aField2.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                aField2.setText("");
				            }
				        }
				    });
					bField2.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(bField2.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                bField2.setText("");
				            }
				        }
				    });
					cField2.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(cField2.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                cField2.setText("");
				            }
				        }
				    });
					dField2.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(dField2.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                dField2.setText("");
				            }
				        }
				    });
					eField2.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(eField2.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                eField2.setText("");
				            }
				        }
				    });

				    JPanel myPanel2 = new JPanel();
				    myPanel2.add(aField2);
				    myPanel2.add(bField2);
				    myPanel2.add(cField2);
				    myPanel2.add(dField2);
				    myPanel2.add(eField2);
				    
				    int result2 = JOptionPane.showConfirmDialog(null, myPanel2, "Entre com 5 números inteiros: ", JOptionPane.OK_CANCEL_OPTION);
				    if (result2 == JOptionPane.OK_OPTION) {
				    	
				    	int[] valor = { Integer.parseInt(aField2.getText()),
			    				Integer.parseInt(bField2.getText()),
			    				Integer.parseInt(cField2.getText()),
			    				Integer.parseInt(dField2.getText()),
			    				Integer.parseInt(eField2.getText())
			    			  };
				    	
				    	resultResult.setText("A soma dos numeros impares é: "+
				    							exerc.exercicio03( valor ));
				    }
					
					break;
				case 3:
					//exercicio04
					
					JTextField aField3 = new JTextField(5);
				    JTextField bField3 = new JTextField(5);
				    JTextField cField3 = new JTextField(5);
				    JTextField dField3 = new JTextField(5);
				    JTextField eField3 = new JTextField(5);
				    
					aField3.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(aField3.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                aField3.setText("");
				            }
				        }
				    });
					bField3.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(bField3.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                bField3.setText("");
				            }
				        }
				    });
					cField3.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(cField3.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                cField3.setText("");
				            }
				        }
				    });
					dField3.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(dField3.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                dField3.setText("");
				            }
				        }
				    });
					eField3.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(eField3.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                eField3.setText("");
				            }
				        }
				    });

				    JPanel myPanel3 = new JPanel();
				    myPanel3.add(aField3);
				    myPanel3.add(bField3);
				    myPanel3.add(cField3);
				    myPanel3.add(dField3);
				    myPanel3.add(eField3);

				    int result3 = JOptionPane.showConfirmDialog(null, myPanel3, "Entre com 5 números inteiros: ", JOptionPane.OK_CANCEL_OPTION);
				    if (result3 == JOptionPane.OK_OPTION) {
				    	
				    	int[] valor = { Integer.parseInt(aField3.getText()),
			    				Integer.parseInt(bField3.getText()),
			    				Integer.parseInt(cField3.getText()),
			    				Integer.parseInt(dField3.getText()),
			    				Integer.parseInt(eField3.getText())
			    			  };
				    	
				    	resultResult.setText("A soma dos numeros pares é: "+
				    							exerc.exercicio04( valor ));
				    }
				    
					break;
				case 4:
					//exercicio05
					
					JTextField xField4 = new JTextField(5);
					
					xField4.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(xField4.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                xField4.setText("");
				            }
				        }
				    });
					
				    JPanel myPanel4 = new JPanel();
				    myPanel4.add(new JLabel("Entre com o numero:"));
				    myPanel4.add(xField4);

				    int result4 = JOptionPane.showConfirmDialog(null, myPanel4,  "Defina o maior numero da tabuada", JOptionPane.OK_CANCEL_OPTION);
				    if (result4 == JOptionPane.OK_OPTION) {
				    	resultResult.setText(""+exerc.exercicio05( Integer.parseInt(xField4.getText() ) ) );
				    }
				    
					break;
				case 5:
					//exercicio06
					
					JTextField xField5 = new JTextField(5);
					
					xField5.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(xField5.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                xField5.setText("");
				            }
				        }
				    });
					
				    JPanel myPanel5 = new JPanel();
				    myPanel5.add(new JLabel("Entre com o numero:"));
				    myPanel5.add(xField5);

				    int result5 = JOptionPane.showConfirmDialog(null, myPanel5,  "Defina um valor para ser fatorado: ", JOptionPane.OK_CANCEL_OPTION);
				    if (result5 == JOptionPane.OK_OPTION) {
				    	resultResult.setText("O fatorial de "+xField5.getText()+" é : "+exerc.exercicio06( Integer.parseInt(xField5.getText() ) ) );
				    }
				    
					break;
				case 6:
					//exercicio07
					
					JTextField xField6 = new JTextField(5);
					JTextField yField6 = new JTextField(5);
					
					xField6.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(xField6.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                xField6.setText("");
				            }
				        }
				    });
					
					yField6.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(yField6.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                yField6.setText("");
				            }
				        }
				    });
					
				    JPanel myPanel6 = new JPanel();
				    myPanel6.add(new JLabel("Nota 01:"));
				    myPanel6.add(xField6);
				    myPanel6.add(new JLabel("Nota 02:"));
				    myPanel6.add(yField6);

				    int result6 = JOptionPane.showConfirmDialog(null, myPanel6,  "Saiba se esta aprovado ou não: ", JOptionPane.OK_CANCEL_OPTION);
				    if (result6 == JOptionPane.OK_OPTION) {
				    	resultResult.setText(""+exerc.exercicio07( Integer.parseInt(xField6.getText() ), Integer.parseInt(yField6.getText() ) ) );
				    }
				    
					break;
				case 7:
					//exercicio10
					
					JTextField xField7 = new JTextField(5);

					xField7.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(xField7.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                xField7.setText("");
				            }
				        }
				    });
					
				    JPanel myPanel7 = new JPanel();
				    myPanel7.add(new JLabel("Entre com o numero:"));
				    myPanel7.add(xField7);

				    int result7 = JOptionPane.showConfirmDialog(null, myPanel7,  "É um numero primo? ", JOptionPane.OK_CANCEL_OPTION);
				    if (result7 == JOptionPane.OK_OPTION) {
				    	if(exerc.exercicio10( Integer.parseInt(xField7.getText() ) ) ){
				    		resultResult.setText("O numero "+xField7.getText()+" é numero primo!");
				    	} else {
				    		resultResult.setText("O numero "+xField7.getText()+" NÃO é numero primo!");
				    	}
				    	
				    }
					
					break;
				case 8:
					//exercicio11

					JTextField xField8 = new JTextField(5);

					xField8.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(xField8.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                xField8.setText("");
				            }
				        }
				    });
					
				    JPanel myPanel8 = new JPanel();
				    myPanel8.add(new JLabel("Entre com o numero:"));
				    myPanel8.add(xField8);

				    int result8 = JOptionPane.showConfirmDialog(null, myPanel8,  "Todos os Numeros primos ", JOptionPane.OK_CANCEL_OPTION);
				    if (result8 == JOptionPane.OK_OPTION) {
				    	resultResult.setText(""+exerc.exercicio11( Integer.parseInt(xField8.getText() ) ) );
				    	
				    }
					
					break;
				case 9:
					//exercicio12
					JOptionPane.showMessageDialog(rootPane, "ERRO");
					break;
				case 10:
					//exercicio13

					JTextField xField10 = new JTextField(5);

					xField10.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(xField10.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                xField10.setText("");
				            }
				        }
				    });
					
				    JPanel myPanel10 = new JPanel();
				    myPanel10.add(new JLabel("Entre com o numero:"));
				    myPanel10.add(xField10);

				    int result10 = JOptionPane.showConfirmDialog(null, myPanel10,  "Media dos numeros: ", JOptionPane.OK_CANCEL_OPTION);
				    if (result10 == JOptionPane.OK_OPTION) {
				    	resultResult.setText(""+exerc.exercicio13( Integer.parseInt(xField10.getText() ) ) );
				    	
				    }
					
					break;
				case 11:
					//exercicio14
					
					JTextField aField11 = new JTextField(5);
				    JTextField bField11 = new JTextField(5);
				    JTextField cField11 = new JTextField(5);
				    JTextField dField11 = new JTextField(5);
				    JTextField eField11 = new JTextField(5);
				    
					aField11.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(aField11.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                aField11.setText("");
				            }
				        }
				    });
					bField11.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(bField11.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                bField11.setText("");
				            }
				        }
				    });
					cField11.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				                @SuppressWarnings("unused")
								long number = Long.parseLong(cField11.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                cField11.setText("");
				            }
				        }
				    });
					dField11.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(dField11.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                dField11.setText("");
				            }
				        }
				    });
					eField11.addKeyListener(new java.awt.event.KeyAdapter() {
				        public void keyReleased(java.awt.event.KeyEvent evt) {
				            try {
				            	@SuppressWarnings("unused")
				                long number = Long.parseLong(eField11.getText());
				            } catch (Exception e) {
				                JOptionPane.showMessageDialog(rootPane, Dados.soNum);
				                eField11.setText("");
				            }
				        }
				    });

				    JPanel myPanel11 = new JPanel();
				    myPanel11.add(aField11);
				    myPanel11.add(bField11);
				    myPanel11.add(cField11);
				    myPanel11.add(dField11);
				    myPanel11.add(eField11);
				    
				    int result11 = JOptionPane.showConfirmDialog(null, myPanel11, "Entre com 5 números inteiros: ", JOptionPane.OK_CANCEL_OPTION);
				    if (result11 == JOptionPane.OK_OPTION) {
				    	
				    	int[] valor = { Integer.parseInt(aField11.getText()),
			    				Integer.parseInt(bField11.getText()),
			    				Integer.parseInt(cField11.getText()),
			    				Integer.parseInt(dField11.getText()),
			    				Integer.parseInt(eField11.getText())
			    			  };
				    	
				    	resultResult.setText("A soma dos numeros impares é: "+
				    							exerc.exercicio14( valor ));
				    }
					
					break;
				default:
					//Default
					JOptionPane.showMessageDialog(rootPane, "ERRO");
					break;
			}
			}
		});
		
		
		paneResult.setLayout(new GridLayout(0, 1, 10, 10));
		
		paneResult.add(scrollPane);
		scrollPane.setViewportView(resultResult);
		resultResult.setEditable(false);
		resultResult.setBackground(UIManager.getColor("Button.background"));
		resultResult.setFont(new Font("Consolas", Font.PLAIN, 12));
		resultResult.setText("Aguardando...");
		GroupLayout gl_contentIndex = new GroupLayout(contentIndex);
		gl_contentIndex.setHorizontalGroup(
			gl_contentIndex.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentIndex.createSequentialGroup()
					.addGroup(gl_contentIndex.createParallelGroup(Alignment.LEADING)
						.addComponent(paneResult, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
						.addComponent(paneExercicio, GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE))
					.addGap(0))
		);
		gl_contentIndex.setVerticalGroup(
			gl_contentIndex.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentIndex.createSequentialGroup()
					.addComponent(paneExercicio, GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(paneResult, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(1))
		);
		

		paneExercicio.add(paneExercicioText);
		paneExercicioText.setLayout(new BorderLayout(10, 10));
		paneExercicioText.add(exercicioText);
		exercicioText.setBackground(UIManager.getColor("Button.background"));
		exercicioText.setFont(new Font("Consolas", Font.PLAIN, 14));
		exercicioText.setText(exerc.exercicioVasio);
		
		//Inicio
		//exercicioEditText.setEditable(false);
		exercicioText.setEditable(false);
		
		paneExercicioText.add(btnAbrir, BorderLayout.SOUTH);
		contentIndex.setLayout(gl_contentIndex);
	}
}
