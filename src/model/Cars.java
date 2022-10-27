package model;

public class Cars {
   protected int id;
   protected String placa;
   protected String data;
   protected String horaEntrada;
   protected String horaSaida;
   protected String tempoTotal;
   protected String valorPago;

    public Cars(int id, String placa, String data, String horaEntrada, String horaSaida, String tempoTotal, String valorPago) {
        this.id = id;
        this.placa = placa;
        this.data = data;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.tempoTotal = tempoTotal;
        this.valorPago = valorPago;
    }

    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getData() {
        return data;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getHoraSaida() {
        return horaSaida;
    }

    public String getTempoTotal() {
        return tempoTotal;
    }

    public String getValorPago() {
        return valorPago;
    }

    @Override
    public String toString() {
        return "Cars{" + "id=" + id + ", placa=" + placa + ", data=" + data + ", horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + ", tempoTotal=" + tempoTotal + ", valorPago=" + valorPago + '}';
    }
   
   
   
}
