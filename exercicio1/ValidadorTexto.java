package exercicio1;

public class ValidadorTexto implements Validador {

    @Override
    public void validar(Campo campo, Usuario usuario) {
        String texto = campo.getConteudo();
        byte qtdeLetras = 0;
        for(char c: texto.toCharArray()) {
            if(!Character.isLetter(c) && !Character.isWhitespace(c))
                throw new ValidacaoException("ERRO: O Nome é um campo texto");
            if(Character.isLetter(c))
                qtdeLetras++;
        }
        if(qtdeLetras == 0)
            throw new ValidacaoException("ERRO: O Nome é um campo texto");
        if(!(texto.length() <= 30))
            throw new ValidacaoException(("ERRO: Nome deve ter no máximo 30 caracteres"));
        usuario.setNome(texto);        
    }    
   
}
