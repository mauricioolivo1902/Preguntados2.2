import java.util.ArrayList;

public class record {
    private ArrayList<jugadores> top = new ArrayList<jugadores>();
    private ArrayList<jugadores> orden = new ArrayList<jugadores>();

    public void agregar(jugadores jug){
        orden.add(jug);
        for(int i=0;i<top.size();i++){
            orden.add(top.get(i));
        }
        top.clear();
    }

    public void ordenar(){
        int j=0;
        jugadores mayor;
            do{
                mayor= orden.get(0);
                for(int i=0;i<orden.size();i++){
                    if(mayor.equals(orden.get(i))){}
                    else{
                        if(mayor.getPuntuacion()<orden.get(i).getPuntuacion()){
                            mayor=orden.get(i);
                            break;
                        }
                    }
                }
                orden.remove(mayor);
                top.add(mayor);
            }while(j<orden.size());
        }

    public String imprimirNom(){
        String cadena="";
        for(int i=0;i<top.size();i++){
            cadena+=top.get(i).getNombre()+"\n";
        }
        return cadena;
    }
    public String imprimirPun(){
        String cadena="";
        for(int i=0;i<top.size();i++){
            cadena+=top.get(i).getPuntuacion()+"\n";
        }
        return cadena;
    }
}
