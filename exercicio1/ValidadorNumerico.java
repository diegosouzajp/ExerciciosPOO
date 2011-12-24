package exercicio1;

public class ValidadorNumerico implements Validador {

    @Override
    public void validar(Campo campo, Usuario usuario) {
        int numero;
        try {
            numero = Integer.valueOf(campo.getConteudo());
        } catch(NumberFormatException exception) {
            throw new ValidacaoException("ERRO: Idade deve conter apenas números");
        }
        if(numero < 0)
            throw new ValidacaoException("ERRO: Valor inválido");
        else if(numero > 150)
            throw new ValidacaoException("ERRO: O valor máximo de Idade é: 150");
        usuario.setIdade(campo.getConteudo());
    }    
    
}
