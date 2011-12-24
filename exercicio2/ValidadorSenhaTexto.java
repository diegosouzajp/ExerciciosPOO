package exercicio2;

public class ValidadorSenhaTexto extends Validador {

    public ValidadorSenhaTexto(Campo campo, Formulario formulario) {
        super(campo, formulario);
    }
    
    @Override
    public void validarCampo(Usuario usuario) {
        String senha = getCampo().getConteudo();
        char digitoAnterior = senha.charAt(0);
        int qtdeLetras = 0;
        int qtdeNumeros = 0;
        if(senha.length() < 8 || senha.length() > 100)
            throw new ValidacaoException("ERRO: A senha deve ter no mínimo 8 e no máximo 100 caracteres");
        for(char c: senha.toCharArray()) {
            if(Character.isDigit(c))
                qtdeNumeros++;
            else if(Character.isLetter(c))
                qtdeLetras++;
        }
        if(qtdeLetras == 0 || qtdeNumeros == 0)
            throw new ValidacaoException("ERRO: A senha deve conter letras e números");
        if(qtdeNumeros < 3)
            throw new ValidacaoException("ERRO: A senha deve conter pelo menos 3 números");
        usuario.setSenhaTexto(senha);
    }
    
}
