package exercicio2;

public class ValidadorIdade extends Validador {

    public ValidadorIdade(Campo campo, Formulario formulario) {
        super(campo, formulario);
    }

    @Override
    public void validarCampo(Usuario usuario) {
        Campo campo = getCampo();
        int idade;
        try {
            idade = Integer.valueOf(campo.getConteudo());
        } catch(NumberFormatException exception) {
            throw new ValidacaoException("ERRO: Idade deve conter apenas números");
        }
        if(idade < 0 || idade > 150)
            throw new ValidacaoException("ERRO: A idade deve ser entre 0 e 150 anos");        
        usuario.setIdade(campo.getConteudo());
    }
    
}