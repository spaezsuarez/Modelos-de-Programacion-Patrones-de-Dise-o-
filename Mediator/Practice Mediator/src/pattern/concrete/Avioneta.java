package pattern.concrete;

import pattern.abstraction.Colleage;

public class Avioneta implements Colleage {
    
    private String nombreVehiculo,message;
     private TorreDeControl mediator = new TorreDeControl();
    
    
    public Avioneta(){
        this.nombreVehiculo = "Avioneta";
    }
    
    public String getNombreVehiculo(){
        return nombreVehiculo;
    }

    public TorreDeControl getMediator() {
        return mediator;
    }

    public String toString(String message){
        return "El vehiculo " + nombreVehiculo + " ha enviado el siguiente Mensaje: " + message;
    }
    
    public String retornoRespuesta(){
        return "El vehiculo "+ nombreVehiculo + " ha recibido el mensaje: " + message;
    }

    @Override
    public void enviarMensaje(Colleage[] receptores,String message) {
        mediator.notify(receptores,message);
    }

    @Override
    public void setMessage(String message) {
       this.message = message;
    }
    
    
}
