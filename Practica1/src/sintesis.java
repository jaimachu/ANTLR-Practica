import java.util.ArrayList;
import java.util.HashSet;

public class sintesis {

    private HashSet<String> listaIdent;
    private int tabulaciones;

    public sintesis (){
        listaIdent = new HashSet<>();
        tabulaciones = 0;
    }

    public void newIdent(String ide){
        listaIdent.add(ide);
    }

    public void existeIdent (String ide){
        if (listaIdent.contains(ide)){
            System.out.println("El identificador "+ide+" ya ha sido declarado anteriormente");
        }
    }

}
