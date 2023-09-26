package com.reis1x;

public class Multa{
    private int precoMulta;

    public void multas(int velocidade, int tempoH) {
        int multa = 0;
        if(tempoH<5){
            if(velocidade>=80 && velocidade<=120){
                multa = 250;
            }
            if(velocidade>120){
                multa = 500;
            }
        } else if(tempoH>=5 && tempoH <=10){
            if(velocidade>=80 && velocidade<=120){
                multa = 350;
            }
            if(velocidade>120){
                multa = 700;
            }
        } else if(tempoH>10){
            if(velocidade>=80 && velocidade<=120){
                multa = 700;
            }
            if(velocidade>120){
                multa = 1400;
            }
        }
        
        precoMulta = multa;
    }
    public int getPrecoMulta() {
        return precoMulta;
    }
}
    
