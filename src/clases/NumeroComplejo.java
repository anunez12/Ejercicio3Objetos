/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SP
 */
public class NumeroComplejo {
  private double numeroreal;private double numeroimaginario; 
  public NumeroComplejo(){ 
   numeroreal=0.0;numeroimaginario=0.0; 
  } 
  public NumeroComplejo(double numeroreal,double numeroimaginario){ 
   this.numeroreal=numeroreal;this.numeroimaginario=numeroimaginario;
  } 

    public double getNumeroreal() {
        return numeroreal;
    }

    public void setNumeroreal(double numeroreal) {
        this.numeroreal = numeroreal;
    }

    public double getNumeroimaginario() {
        return numeroimaginario;
    }

    public void setNumeroimaginario(double numeroimaginario) {
        this.numeroimaginario = numeroimaginario;
    }
    public NumeroComplejo Suma(NumeroComplejo c2){ 
       double numeroreal,numeroimaginario;NumeroComplejo res; 
       numeroreal=this.numeroreal + c2.numeroreal; 
       numeroimaginario=this.numeroimaginario + c2.numeroimaginario; 
       res=new NumeroComplejo(numeroreal, numeroimaginario); 
       return res;
    } 
    public NumeroComplejo resta(NumeroComplejo c2){ 
        double numeroreal,numeroimaginario;NumeroComplejo res; 
       numeroreal=this.numeroreal - c2.numeroreal; 
       numeroimaginario=this.numeroimaginario - c2.numeroimaginario; 
       res=new NumeroComplejo(numeroreal, numeroimaginario); 
       return res;
    } 
    public NumeroComplejo multiplicacion(NumeroComplejo c2){ 
       double numeroreal,numeroimaginario,r1,r2,r3,r4;NumeroComplejo res; 
       r1=this.numeroreal * c2.numeroreal; 
       r2=this.numeroreal * c2.numeroimaginario; 
       r3=this.numeroimaginario * c2.numeroreal; 
       r4=this.numeroimaginario * c2.numeroimaginario; 
       numeroreal=r1-r4; 
       numeroimaginario=r2+r3;
       res=new NumeroComplejo(numeroreal, numeroimaginario); 
       return res;
    } 
    public NumeroComplejo division(NumeroComplejo c2){ 
       double numeroreal,numeroimaginario,r1,r2,r3,r4,porcentaje;NumeroComplejo res;
        r1=this.numeroreal * c2.numeroreal; 
        r2=this.numeroreal * c2.numeroimaginario;
        r3=this.numeroimaginario * c2.numeroreal; 
        r4=this.numeroimaginario * c2.numeroimaginario; 
        porcentaje=(c2.numeroreal*c2.numeroreal) + (c2.numeroimaginario*c2.numeroimaginario); 
        numeroreal=(r1-r4)/porcentaje; 
        numeroimaginario=(r2+r3)/porcentaje;
        res=new NumeroComplejo(numeroreal, numeroimaginario);
        return res;
    }  
       
       
    
    
    
     
  
}
