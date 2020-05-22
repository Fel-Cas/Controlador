/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorabuena;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author andres
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    @FXML
    private Button suma;
    @FXML
    private Button resta;
    @FXML
    private Button multiplicacion;
    @FXML
    private Button division;
    @FXML
    private Button raiz;
    @FXML
    private Button potencia;
    @FXML
    private TextField resultado;
    @FXML
    private Button tangente;
    @FXML
    private Button seno;
    @FXML
    private Button coseno;
    @FXML
    static Calculadora cal=new Calculadora();
    int numeros=0,numeros1=0;
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    public void Suma(ActionEvent event){
        numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.sumar()));
    }
    public void Restar(ActionEvent event){
        numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.restar()));
        
    }
    public void Multiplicar(ActionEvent event){
        numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.multiplicar())); 
    }
    public void Dividir(ActionEvent event){
         numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.dividir()));
    }
    public void Potencia(ActionEvent event){
         numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.potencia()));
    }
    public void Raiz(ActionEvent event){
         numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.raiz()));
    }
    public void Seno(ActionEvent event){
        numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.seno()));
    }
    public void Coseno(ActionEvent event){
         numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.coseno()));
    }
    public void Tangente(ActionEvent event){
         numeros=Integer.parseInt(num1.getText());
        numeros1=Integer.parseInt(num2.getText());
        cal.setNum1(numeros);
        cal.setNum2(numeros1);
        resultado.setText(Double.toString(cal.tangente()));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
