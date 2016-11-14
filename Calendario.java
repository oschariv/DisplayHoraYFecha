
/**
 * Crear una calendario que no permite fijar una fecha en numero enteros,
 * poder avanzar esa fecha en un dia,
 * y obtener la fecha como String (Cadena de Caracteres).
 * 
 * @oschariv (Oscar Charro Rivera) 
 * @0.0.2 (07/11/2016)
 */
public class Calendario
{
    // Declara dia
    private DisplayDosDigitos dia;
    // Declara mes
    private DisplayDosDigitos mes;
    // Declara anno
    private DisplayDosDigitos anno;
    /**
     * Constructor del calendario, se inicializan las varibles a 1.
     */
    public Calendario()
    {
        //inicializamos dia al limite 31
        dia = new DisplayDosDigitos(31);
        //inicializamos mes al limite 13
        mes = new DisplayDosDigitos(13);
        //inicializadmos anno al limite 100
        anno = new DisplayDosDigitos(100);
    }

    /**
     * Metodo para establecer una fecha sin comprobar nada,
     * todos los parametros deben de ser de dos digitos como maximo.
     */
    public void establecerFecha(int x, int y, int z)
    {
        // igualamos los valores introducidos
        dia.setValor(x);
        
        mes.setValor(y);
        
        anno.setValor(z);
    }
    
    /**
     * metodo para avanzar un dia a la fecha,
     * debe cambiar de mes y anno cuando corresponda
     * 
     * Los meses son de 30 dias!
     */
    
    public void avanzarFecha()
    {
        dia.incrementaValor();
        if (dia.getValor() == 1){
            mes.incrementaValor();                        
            if (mes.getValor() == 1){
                anno.incrementaValor();
            }
            
        }
    }
    
    /**
     * Crear metodo para mostra la fecha como texto
     */
    public String mostrarFecha() {
        return dia.getValorDelDisplay() + "/" + mes.getValorDelDisplay() 
               + "/" + anno.getValorDelDisplay();
    }
}
