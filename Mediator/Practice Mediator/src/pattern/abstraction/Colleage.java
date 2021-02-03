package pattern.abstraction;


public interface Colleage {
        
    public void enviarMensaje(Colleage[] receptores,String message);
    public Mediator getMediator();
    public String getNombreVehiculo();
    public void setMessage(String message);
    public String retornoRespuesta();
}
