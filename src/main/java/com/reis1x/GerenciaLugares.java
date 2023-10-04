package com.reis1x;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GerenciaLugares {
    private int[][] barca = new int[60][20];
    private int passCounter = 0;
    private Matcher matcher;
    private Pattern pattern;
    public int verificaLugar(String assento){
        pattern = Pattern.compile("F\\d{2}A\\d{2}");
        matcher = pattern.matcher(assento);
        int fileira = Integer.parseInt(assento.substring(1,3));        
        
        //checa se o assento é válido
        if(!matcher.matches()){
            ocupa(assento);
            return 0;
        } 
        
        //checa se o usuário está escolhendo um lugar das fileiras de distruibuição, que só podem ser escolhidas se for um dos primeieros 100 clientes
        if (passCounter <= 200 && (fileira <= 20 || fileira >=40 && fileira <= 60 )){
            boolean assentoLivre = ocupa(assento);
            //checa se o assento escolhido está ocupado
            if(assentoLivre){return 3;}
            if(!assentoLivre){return 1;}  

        //checa se o usuário está escolhendo um assento fora dos assentos de distribuição de peso e se é um dos primeiros 200
        } else if (passCounter <= 200 && (fileira > 20 && fileira < 40)){
            return 2;
        }
        //Se as fileiras de distribuição foram completadas, o assento é válido e ele não está ocupado, então ocupa.
        ocupa(assento);
        return 3;
        
    }

    public boolean ocupa(String assento){
        pattern = Pattern.compile("F\\d{2}A\\d{2}");
        matcher = pattern.matcher(assento);
        int fileira = Integer.parseInt(assento.substring(1,3));
        int lugar = Integer.parseInt(assento.substring(assento.length() - 2));

        
        if(!matcher.matches()){
            throw new IllegalArgumentException();
        }

        if (barca[fileira][lugar] < 1){
            barca[fileira][lugar] = 1;
            passCounter++;
            return true;
        } else {
            return false;
        }
    }
}
