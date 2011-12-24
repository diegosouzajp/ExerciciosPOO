package exercicio2;

public class ValidadorNome extends Validador {

    public ValidadorNome(Campo campo, Formulario formulario) {
        super(campo, formulario);
    }

    @Override
    public void validarCampo(Usuario usuario) {
        String nome = getCampo().getConteudo();
        byte qtdeLetras = 0;//Para evitar um nome só com espaços em branco
        for(char c: nome.toCharArray()) {
            if(!Character.isLetter(c) && !Character.isWhitespace(c))
                throw new ValidacaoException("ERRO: O Nome é um campo texto");
            if(Character.isLetter(c))
                qtdeLetras++;
        }
        if(qtdeLetras == 0 || nome.length() < 5 || nome.length() > 300)
            throw new ValidacaoException(("ERRO: Nome deve ter no mínimo 8 e no máximo 300 caracteres"));
        usuario.setNome(nome);
    }
    
}