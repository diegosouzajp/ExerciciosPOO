package exercicio2;

public class ValidadorEmail extends Validador {

    public ValidadorEmail(Campo campo, Formulario formulario) {
        super(campo, formulario);
    }

    @Override
    public void validarCampo(Usuario usuario) {
        String email = getCampo().getConteudo();
        byte qtdeArrobas = 0;
        byte qtdeLetras = 0;
        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@')
                qtdeArrobas++;
            else if(Character.isLetter(email.charAt(i)))
                qtdeLetras++;
        }
        if(qtdeArrobas != 1 || qtdeLetras == 0 || email.startsWith("@") || email.endsWith("@"))
            throw new ValidacaoException("ERRO: E-mail invalido");  
        usuario.setEmail(email);
    }  
    
}
