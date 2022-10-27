package model;

import java.text.DecimalFormat;

public class CalculoManual {
    private double hora_entrada,minuto_entrada,hora_saida,minuto_saida;

    public CalculoManual(double hora_entrada, double minuto_entrada, double hora_saida, double minuto_saida) {
        this.hora_entrada = hora_entrada;
        this.minuto_entrada = minuto_entrada;
        this.hora_saida = hora_saida;
        this.minuto_saida = minuto_saida;
    }
    public CalculoManual() {

    }

    public double getHoraE() {
        return hora_entrada;
    }

    public double getMinE() {
        return minuto_entrada;
    }

    public double getHoraS() {
        return hora_saida;
    }

    public double getMinS() {
        return minuto_saida;
    }

    public double calculo(){
        double resu, tempoEntrada, tempoSaida;
        
        tempoEntrada = getHoraE() + (getMinE()*0.01);
        tempoSaida =  getHoraS() + (getMinS()*0.01);
        resu = tempoSaida - tempoEntrada;
        return resu*2;
        
    }
    
    public double converterEmDuasCasa(double resu){
            DecimalFormat fmt = new DecimalFormat("0.00");      
    String string = fmt.format(resu);
    String[] part = string.split("[,]");
    String string2 = part[0]+"."+part[1];
        double preco = Double.parseDouble(string2);
    return preco;
    }

}
