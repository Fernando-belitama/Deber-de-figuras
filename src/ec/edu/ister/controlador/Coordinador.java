/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.vista.FrmCirculo;
import ec.edu.ister.vista.FrmTriangulo;
import ec.edu.ister.vista.Login;
import ec.edu.ister.vista.jpanelCirculo.Grafico;
import ec.edu.ister.vista.jpanelCirculo.*;

/**
 *
 * @author FERNANDO
 */
public class Coordinador {
    
    
    Login login=new Login(this);
    FrmCirculo circulo=new FrmCirculo(this);
   
    FrmTriangulo triangulo=new FrmTriangulo(this);
    
    Inicio inicio=new Inicio(this);
    Grafico grafico=new Grafico(this);
    Area area=new Area(this);
    Perimetro perimetro=new Perimetro(this);
    
   //**************************************************************** 
    public void showLogin(){
        login.setVisible(true);
    }
    public void hideLogin(){
        login.setVisible(false);
    }
    
   

    public void showCirculo(){
        circulo.setVisible(true);
    }
    
    public void showTriangulo(){
        triangulo.setVisible(true);
    }
    
    

    public void hideCirculo(){
        circulo.setVisible(false);
    }
    
    public void hideTriangulo(){
        triangulo.setVisible(false);
    }
//JPANEL CIRCULO****************************************************************************************************

 public void showInicio(){
     
     inicio.setSize(1100, 1500);
     circulo.escritorio.removeAll();
     circulo.escritorio.add(inicio);
     inicio.setVisible(true);
     circulo.escritorio.repaint();
     
 }
 
 public void hideInicio(){
     inicio.setVisible(false);
 }

 public void showGrafico(){
     
     grafico.setSize(1100, 1500);
     circulo.escritorio.removeAll();
     circulo.escritorio.add(grafico);
     grafico.setVisible(true);
     circulo.escritorio.repaint();
     
 }
 
 public void hideGrafico(){
     grafico.setVisible(false);
 } 

 public void showArea(){
     
     area.setSize(1100, 1500);
     circulo.escritorio.removeAll();
     circulo.escritorio.add(area);
     area.setVisible(true);
     circulo.escritorio.repaint();
     
 }
 
 public void hideArea(){
    area.setVisible(false);
 }
 
public void showPerimetro(){
     
     perimetro.setSize(1100, 1500);
     circulo.escritorio.removeAll();
     circulo.escritorio.add(perimetro);
     perimetro.setVisible(true);
     circulo.escritorio.repaint();
     
 }
 
 public void hidePerimetro(){
     perimetro.setVisible(false);
 } 

    
}
