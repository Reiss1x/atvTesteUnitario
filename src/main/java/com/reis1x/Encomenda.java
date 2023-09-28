package com.reis1x;

public class Encomenda {
    public int[] qtdadeBarras(int qtd1kg, int qtd5kg, int peso){
        
        int[] qtdBarras = new int[2];
        int kgs5 = peso/5;

        if((qtd1kg + qtd5kg*5) < peso)
            return null;

        if(kgs5 >= qtd5kg){
            qtdBarras[1] = qtd5kg;
            qtdBarras[0] = peso - (5*qtd5kg);
        }
        else{
            qtdBarras[1] = kgs5;
            qtdBarras[0] = peso%5;
        }
        return qtdBarras;
    }
}
