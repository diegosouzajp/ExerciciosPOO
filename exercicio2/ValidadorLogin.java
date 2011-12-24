package exercicio2;

public class ValidadorLogin extends Validador {

    public ValidadorLogin(Campo campo, Formulario formulario) {
        super(campo, formulario);
    }

    @Override
    public void validarCampo(Usuario usuario) {
        String login = getCampo().getConteudo();
        if(login.length() > 20)
            throw new ValidacaoException("ERRO: O login deve ter no máximo 20 caracteres");
        if(login.isEmpty())
            throw new ValidacaoException("ERRO: O login não pode ser vazio");
        byte qtdeNumeros = 0;
        for(char c: login.toCharArray()) {
            if(Character.isDigit(c))
                qtdeNumeros++;
        }
        if(qtdeNumeros == login.length())
            throw new ValidacaoException("ERRO: O login não pode ser formado apenas por números");
        if(Character.isDigit(login.charAt(0)))
            throw new ValidacaoException("ERRO: O login não pode iniciar com um número");
        usuario.setLogin(login);
    }    
    
}