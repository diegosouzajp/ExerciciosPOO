package exercicio2;

public class ValidadorSenhaNumerica extends Validador {

    public ValidadorSenhaNumerica(Campo campo, Formulario formulario) {
        super(campo, formulario);
    }

    @Override
    public void validarCampo(Usuario usuario) {
        String senha = getCampo().getConteudo();
        char digitoAnterior = senha.charAt(0);
        for(char c: senha.toCharArray()) {
            if(!Character.isDigit(c)) 
                throw new ValidacaoException("ERRO: A senha dever ser formada apenas por números");
        }
        if(senha.length() < 8 || senha.length() > 100)
            throw new ValidacaoException("ERRO: A senha deve ter no mínimo 8 e no máximo 100 caracteres");
        boolean numerosDiferentes = false;
        for(int i = 1; i < senha.length(); i++) {
            if(senha.charAt(i) != digitoAnterior) {
                numerosDiferentes = true;
                break;
            }
        }
        if(!numerosDiferentes)
            throw new ValidacaoException("ERRO: Os números não podem ser todos iguais");
        usuario.setSenhaNumerica(senha);
    }

}