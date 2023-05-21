import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.Collections;
import java.util.List;

public class CompilatorErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e)
    {
        List<String> stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        String newMsg = msg.replace("extraneous input", "entrada extraña")
                .replace("mismatched input", "entrada no válida")
                .replace("missing", "falta el carácter")
                .replace("expecting", "esperaba")
                .replace("at", "en")
                .replace("no viable alternenive en input", "ninguna alternativa viable en la entrada");
        String[] array = (""+line).split(":");
        String linea = array[0];

        System.err.println("Reglas usadas: "+stack);
        System.err.println("Línea "+linea+" columna: "+charPositionInLine+" en "+
                offendingSymbol+": "+newMsg);
    }
}
