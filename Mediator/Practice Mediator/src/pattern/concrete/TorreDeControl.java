package pattern.concrete;

import pattern.abstraction.Colleage;
import pattern.abstraction.Mediator;

public class TorreDeControl implements Mediator {

    private Jet jet;
    private Helicoptero helicoptero;
    private Avion avion;
    private Avioneta avioneta;
    private AvionComercial avionComercial;
    
    private String result = "";
    
    public String getResult(){
        return result;
    }


    @Override
    public void notify(Colleage[] colegas, String mensaje) {
        
        for (Colleage e : colegas) {
            switch (e.getNombreVehiculo()) {
                case "Avión":
                    avion = new Avion();
                    avion.setMessage(mensaje);
                    result += "\n"+avion.retornoRespuesta();
                    break;
                case "Avión comercial":
                    avionComercial = new AvionComercial();
                    avionComercial.setMessage(mensaje);
                    result += "\n"+avionComercial.retornoRespuesta();
                    break;
                case "Avioneta":
                    avioneta = new Avioneta();
                    avioneta.setMessage(mensaje);
                    result += "\n"+avioneta.retornoRespuesta();
                    break;
                case "Jet":
                    jet = new Jet();
                    jet.setMessage(mensaje);
                    result += "\n"+jet.retornoRespuesta();
                    break;
                case "Helicoptero":
                    helicoptero = new Helicoptero();
                    helicoptero.setMessage(mensaje);
                    result += "\n"+helicoptero.retornoRespuesta();
                    break;
            }
        }
    }


}
