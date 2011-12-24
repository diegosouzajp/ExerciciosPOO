package exercicio2;

import java.util.List;

public class Facade {
    
   private Formulario formulario;
   private Persistencia persistencia;
   private Usuario usuario;
   private Validador validador;

   public Facade() {
       formulario = new Cadastro();
       persistencia = Persistencia.inicializar();
       usuario = new Usuario();
   }   
   
   public void preencherNome(String nome) {
       validador = new ValidadorNome(new CampoNome(nome), formulario);
       validador.validarCampo(usuario);
       formulario = validador;       
   }
   
   public void preencherEmail(String email) {
       validador = new ValidadorEmail(new CampoEmail(email), formulario);
       validador.validarCampo(usuario);
       formulario = validador;  
   }
   
   public void preencherIdade(String idade) {
       validador = new ValidadorIdade(new CampoIdade(idade), formulario);
       validador.validarCampo(usuario);
       formulario = validador;  
   }
   
   public void preencherLogin(String login) {
       validador = new ValidadorLogin(new CampoLogin(login), formulario);
       validador.validarCampo(usuario);
       formulario = validador;  
   }
   
   public void preencherSenhaNumerica(String senha) {
       validador = new ValidadorSenhaNumerica(new CampoSenhaNumerica(senha), formulario);
       validador.validarCampo(usuario);
       formulario = validador;  
   }
   
   public void preencherSenhaTexto(String senha) {
       validador = new ValidadorSenhaTexto(new CampoSenhaNumerica(senha), formulario);
       validador.validarCampo(usuario);
       formulario = validador;  
   }
   
   public void novoUsuario() {
       usuario = new Usuario();
       formulario = new Cadastro();
   }
   
   public void salvarUsuario() {
       formulario.validarFormulario(usuario);
       persistencia.salvarUsuario(usuario);
   }
   
   public List<Usuario> getUsuarios() {
       return persistencia.getUsuarios();
   }
    
}