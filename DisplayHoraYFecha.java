
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @oschariv (Oscar Charro Rivera) 
 * @1.0 (14/11/2016)
 */
public class DisplayHoraYFecha
{   
    //CALENDARIO
    private Calendario fecha;

    
    //RELOJ
    private ClockDisplay reloj;
  
    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
        fecha = new Calendario();
        
        reloj = new ClockDisplay();
    }

    /**
     * Metodo avanzarMomento
     */
    public void avanzarMomento()
    {
        reloj.timeTick();
    }
    
    /**
     * Metodo avanzarMomento
     */
    public void setMomento(int hour, int minute, int day, int month, int year)
    {
        reloj.setTime(hour, minute);
        fecha.establecerFecha(day, month, year);
    }
        
     public String getMomento()
    {
        String momento;
        return momento = reloj.getTime()+ " " + fecha.mostrarFecha();
    }
}
