import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CcuarentaycuatroPrincipal extends JFrame implements ActionListener{
 
 private JMenuBar mb;
 private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
 private JMenuItem miCalculo, miRojo, miNegro, miMorado, miNuevo, miSalir, miElCreador;
 private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelPaterno,
 labelMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelFooter;
 private JTextField textfieldNombre, textfieldPaterno, textfieldMaterno; 
 private JComboBox Departamento, Antiguedad; 
 private JTextArea textarea1;
 private JScrollPane scrollpane1;
 String nombreAdministrador = ""; 

 public CcuarentaycuatroPrincipal(){
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Pantalla principal");
  getContentPane().setBackground(new Color(255,0,0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
  CcuarentaydosBienvenida ventanaBienvenida = new CcuarentaydosBienvenida();
  nombreAdministrador = ventanaBienvenida.texto; 
  
  mb = new JMenuBar();
  mb.setBackground(new Color(255,0,0));
  setJMenuBar(mb);

  menuOpciones = new JMenu("Opciones");
  menuOpciones.setBackground(new Color(255,0,0)); 
  menuOpciones.setFont(new Font("Andale Mono",1,14));
  menuOpciones.setForeground(new Color(255,255,255));
  mb.add(menuOpciones);

  menuCalcular = new JMenu("Calcular");  
  menuCalcular.setBackground(new Color(255,0,0));
  menuCalcular.setFont(new Font("Andale Mono",1,14));
  menuCalcular.setForeground(new Color(255,255,255));
  mb.add(menuCalcular);

  menuAcercaDe = new JMenu("Acerca de");  
  menuAcercaDe.setBackground(new Color(255,0,0));
  menuAcercaDe.setFont(new Font("Andale Mono",1,14));
  menuAcercaDe.setForeground(new Color(255,255,255));
  mb.add(menuAcercaDe);

  menuColorFondo = new JMenu("Color de fondo"); 
  menuColorFondo.setFont(new Font("Andale Mono",1,14));
  menuColorFondo.setForeground(new Color(255,0,0));
  menuOpciones.add(menuColorFondo);

  miCalculo = new JMenuItem("Vacaciones"); 
  miCalculo.setFont(new Font("Andale Mono",1,14));
  miCalculo.setForeground(new Color(255,0,0));  
  menuCalcular.add(miCalculo);
  miCalculo.addActionListener(this);

  miRojo = new JMenuItem("Rojo"); 
  miRojo.setFont(new Font("Andale Mono",1,14));
  miRojo.setForeground(new Color(255,0,0));  
  menuColorFondo.add(miRojo);
  miRojo.addActionListener(this);

  miNegro = new JMenuItem("Negro"); 
  miNegro.setFont(new Font("Andale Mono",1,14));
  miNegro.setForeground(new Color(255,0,0));  
  menuColorFondo.add(miNegro);
  miNegro.addActionListener(this);

  miMorado = new JMenuItem("Morado"); 
  miMorado.setFont(new Font("Andale Mono",1,14));
  miMorado.setForeground(new Color(255,0,0));  
  menuColorFondo.add(miMorado);
  miMorado.addActionListener(this);

  miNuevo = new JMenuItem("Nuevo"); 
  miNuevo.setFont(new Font("Andale Mono",1,14));
  miNuevo.setForeground(new Color(255,0,0));  
  menuOpciones.add(miNuevo);
  miNuevo.addActionListener(this);

  miSalir = new JMenuItem("Salir"); 
  miSalir.setFont(new Font("Andale Mono",1,14));
  miSalir.setForeground(new Color(255,0,0));  
  menuOpciones.add(miSalir);
  miSalir.addActionListener(this);

  miElCreador = new JMenuItem("El creador"); 
  miElCreador.setFont(new Font("Andale Mono",1,14));
  miElCreador.setForeground(new Color(255,0,0));  
  menuAcercaDe.add(miElCreador);
  miElCreador.addActionListener(this);

  ImageIcon imagen = new ImageIcon("images/logo-coca.png");
  labelLogo = new JLabel(imagen);  
  labelLogo.setBounds(5,5,250,100);
  add(labelLogo);

  labelBienvenido = new JLabel("Bienvenido " + nombreAdministrador);
  labelBienvenido.setBounds(280,30,300,50);
  labelBienvenido.setFont(new Font("Andale Mono",1,32));
  labelBienvenido.setForeground(new Color(255,255,255));
  add(labelBienvenido);

  labelTitle = new JLabel("Datos del trabajador para el cálculo de vacaciones");
  labelTitle.setBounds(45,140,900,25);
  labelTitle.setFont(new Font("Andale Mono",0,24));
  labelTitle.setForeground(new Color(255,255,255));
  add(labelTitle);

  labelNombre = new JLabel("Nombre completo:");
  labelNombre.setBounds(25,188,180,25);
  labelNombre.setFont(new Font("Andale Mono",1,12));
  labelNombre.setForeground(new Color(255,255,255));
  add(labelNombre);

  textfieldNombre = new JTextField();
  textfieldNombre.setBounds(25,213,150,25);
  textfieldNombre.setBackground(new java.awt.Color(224,224,224));
  textfieldNombre.setFont(new java.awt.Font("Andale Mono",1,14));
  textfieldNombre.setForeground(new java.awt.Color(255,0,0));
  add(textfieldNombre);

  labelPaterno = new JLabel("Apellido Paterno:");
  labelPaterno.setBounds(25,248,180,25);
  labelPaterno.setFont(new Font("Andale Mono",1,12));
  labelPaterno.setForeground(new Color(255,255,255));
  add(labelPaterno);

  textfieldPaterno = new JTextField();
  textfieldPaterno.setBounds(25,273,150,25);
  textfieldPaterno.setBackground(new java.awt.Color(224,224,224));
  textfieldPaterno.setFont(new java.awt.Font("Andale Mono",1,14));
  textfieldPaterno.setForeground(new java.awt.Color(255,0,0));
  add(textfieldPaterno);

  labelMaterno = new JLabel("Apellido Materno:");
  labelMaterno.setBounds(25,308,180,25);
  labelMaterno.setFont(new Font("Andale Mono",1,12));
  labelMaterno.setForeground(new Color(255,255,255));
  add(labelMaterno);

  textfieldMaterno = new JTextField();
  textfieldMaterno.setBounds(25,334,150,25);
  textfieldMaterno.setBackground(new java.awt.Color(224,224,224));
  textfieldMaterno.setFont(new java.awt.Font("Andale Mono",1,14));
  textfieldMaterno.setForeground(new java.awt.Color(255,0,0));
  add(textfieldMaterno);

  labelDepartamento = new JLabel("Selecciona el Departamento:");
  labelDepartamento.setBounds(220,188,180,25);
  labelDepartamento.setFont(new Font("Andale Mono",1,12));
  labelDepartamento.setForeground(new Color(255,255,255));
  add(labelDepartamento);  

  Departamento = new JComboBox();
  Departamento.setBounds(220,213,220,25);
  Departamento.setBackground(new java.awt.Color(224,224,224));
  Departamento.setFont(new java.awt.Font("Andale Mono",1,14));
  Departamento.setForeground(new java.awt.Color(255,0,0));
  add(Departamento);
  Departamento.addItem("");
  Departamento.addItem("Atención al cliente");
  Departamento.addItem("Departamento de Logística");
  Departamento.addItem("Departamento de Gerencia");

  labelAntiguedad = new JLabel("Selecciona la Antigüedad:");
  labelAntiguedad.setBounds(220,248,180,25);
  labelAntiguedad.setFont(new Font("Andale Mono",1,12));
  labelAntiguedad.setForeground(new Color(255,255,255));
  add(labelAntiguedad);  

  Antiguedad = new JComboBox();
  Antiguedad.setBounds(220,273,220,25);
  Antiguedad.setBackground(new java.awt.Color(224,224,224));
  Antiguedad.setFont(new java.awt.Font("Andale Mono",1,14));
  Antiguedad.setForeground(new java.awt.Color(255,0,0));
  add(Antiguedad);
  Antiguedad.addItem("");
  Antiguedad.addItem("1 año de servicio");
  Antiguedad.addItem("2 a 6 años de servicio");
  Antiguedad.addItem("7 años o más de servicio");

  labelResultado = new JLabel("Resultado del Cálculo:");
  labelResultado.setBounds(220,307,180,25);
  labelResultado.setFont(new Font("Andale Mono",1,12));
  labelResultado.setForeground(new Color(255,255,255));
  add(labelResultado);

  textarea1 = new JTextArea();
  textarea1.setEditable(false);  
  textarea1.setBackground(new Color(224,224,224));
  textarea1.setFont(new Font("Andale Mono",1,11));
  textarea1.setForeground(new Color(255,0,0));
  textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
  scrollpane1 = new JScrollPane(textarea1);
  scrollpane1.setBounds(220,333,385,90);
  add(scrollpane1);

  labelFooter = new JLabel("©2019 The Coca-Cola Company | Todos los derechos reservados");
  labelFooter.setBounds(135,445,500,30);
  labelFooter.setFont(new java.awt.Font("Andale Mono",1,12));
  labelFooter.setForeground(new java.awt.Color(255,255,255));
  add(labelFooter);
 } 

 public void actionPerformed(ActionEvent e){
  if(e.getSource() == miCalculo){
   String nc = textfieldNombre.getText();
   String ap = textfieldPaterno.getText();
   String am = textfieldMaterno.getText();
   String depto = Departamento.getSelectedItem().toString();
   String antig = Antiguedad.getSelectedItem().toString();

    if(nc.equals("") || ap.equals("") || am.equals("") || depto.equals("") || Antiguedad.equals("")){
     JOptionPane.showMessageDialog(null,"Debes de llenar todos los campos.");
    }   

        else {
         if(depto.equals("Atención al cliente")){
               if(antig.equals("1 año de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 6 días de vacaciones.");
               }
               if(antig.equals("2 a 6 años de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 14 días de vacaciones.");
               }
               if(antig.equals("7 años o más de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 20 días de vacaciones.");
               }
         }
           if(depto.equals("Departamento de Logística")){
               if(antig.equals("1 año de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 7 días de vacaciones.");
               }
               if(antig.equals("2 a 6 años de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 15 días de vacaciones.");
               }
               if(antig.equals("7 años o más de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 22 días de vacaciones.");
               }
           }
           if(depto.equals("Departamento de Gerencia")){
               if(antig.equals("1 año de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 10 días de vacaciones.");
               }
               if(antig.equals("2 a 6 años de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 20 días de vacaciones.");
               }
               if(antig.equals("7 años o más de servicio")){
                 textarea1.setText("\n   El trabajador " + nc + " " + ap + " " + am + 
                                                            "\n   quien labora en " + depto + " con " + antig + 
                                                            "\n   recibe 30 días de vacaciones.");
               }  
          
           }       
        }
    }
  
  
  if(e.getSource() == miRojo){
   getContentPane().setBackground(new Color(255,0,0));
  }
  if(e.getSource() == miNegro){
   getContentPane().setBackground(new Color(0,0,0));
  }
  if(e.getSource() == miMorado){
   getContentPane().setBackground(new Color(51,0,51));
  }
  if(e.getSource() == miNuevo){
   textfieldNombre.setText("");
   textfieldPaterno.setText("");
   textfieldMaterno.setText("");
   Departamento.setSelectedIndex(0);
   Antiguedad.setSelectedIndex(0);
   textarea1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
  }
  if(e.getSource() == miSalir){
   CcuarentaydosBienvenida bienvenida1 = new CcuarentaydosBienvenida();
   bienvenida1.setBounds(0,0,350,450);
   bienvenida1.setVisible(true);
   bienvenida1.setResizable(false);
   bienvenida1.setLocationRelativeTo(null);
   this.setVisible(false);
  }
  
  if(e.getSource() == miElCreador){
   JOptionPane.showMessageDialog(null,"Desarrollado por el Autor");
  }
 } 

 public static void main(String args[]){
  CcuarentaycuatroPrincipal ventanaPrincipal = new CcuarentaycuatroPrincipal();
  ventanaPrincipal.setBounds(0,0,640,535);
  ventanaPrincipal.setVisible(true);
  ventanaPrincipal.setResizable(false);
  ventanaPrincipal.setLocationRelativeTo(null);
 }
}