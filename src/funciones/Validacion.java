package funciones;

import java.util.ArrayList;
import dispositivos.*;

/**
 * @author julian
 */
public class Validacion {
    
    //duplicidad
    //sensores
    public static boolean verDupliIdSensor(ArrayList<Sensor> sensors,String id){
        
        for(int i=0;i<sensors.size();i++){                        
            if(sensors.get(i).getId().equalsIgnoreCase(id))
                return true;        
        }
        return false;
    }    
    
    //actuadores
    public static boolean verDupliIdAct(ArrayList<Actuador> acts,String id){
        
        for(int i=0;i<acts.size();i++){                        
            if(acts.get(i).getaId().equalsIgnoreCase(id))
                return true;        
        }
        return false;
    }
    
    //existencia
    //sensores
    public static int existeS(ArrayList<Sensor> sensores, Sensor s){        
        for(int i=0;i<sensores.size();i++){
            Sensor s2 = sensores.get(i);
            if(s.getId().equals(s2.getId())){                
                return i;
            }        
        }
        return -1;    
    }
    
    //actuadores
    public static int existeA(ArrayList<Actuador> acts, Actuador a){        
        for(int i=0;i<acts.size();i++){
            Actuador a2 = acts.get(i);
            if(a.getaId().equals(a2.getaId())){                
                return i;
            }        
        }
        return -1;    
    }
}
