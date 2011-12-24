package exercicio1;

public class ValidadorEmail implements Validador {

    @Override
    public void validar(Campo campo, Usuario usuario) {
        String email = campo.getConteudo();
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
