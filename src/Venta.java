import java.util.Date;

public class Venta {

    private int cantidadDeCuotas;
    private double descuento;
    private Date fechaDeEntrega;

    public Venta(int cantidadDeCuotas, double descuento, Date fechaDeEntrega) {
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.descuento = descuento;
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }
}
