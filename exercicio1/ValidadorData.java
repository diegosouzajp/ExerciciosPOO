package exercicio1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidadorData implements Validador {

    @Override
    public void validar(Campo campo, Usuario usuario) {
        String dataTexto = campo.getConteudo();
        Date data = new Date();        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            formato.setLenient(false);
            data = formato.parse(dataTexto);
        } catch(ParseException exception) {
            throw new ValidacaoException("ERRO: Data inválida");
        }
        usuario.setData(dataTexto);
    }        
    
}
