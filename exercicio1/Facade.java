package exercicio1;

import java.util.List;

public class Facade {
    
   private Formulario formulario = new Formulario();
   private Persistencia persistencia = Persistencia.inicializar();
   
   public void preencherNome(String nome) {
       preencher(new CampoTexto(), nome);
   }
   
   public void preencherEmail(String email) {
       preencher(new CampoEmail(), email);
   }
   
   public void preencherIdade(String idade) {
       preencher(new CampoNumerico(), idade);
   }
   
   public void preencherData(String data) {
       preencher(new CampoData(), data);
   }
   
   private void preencher(Campo campo, String conteudo) {
       formulario.setCampo(campo);
       campo.setConteudo(conteudo);
       campo.validar(formulario.getUsuario());
   }
   
   public void novoUsuario() {
       formulario.novoUsuario();
   }
   
   public void salvarUsuario() {
       persistencia.salvarUsuario(formulario.getUsuario());
   }
   
   public List getUsuarios() {
       return persistencia.getUsuarios();
   }
    
}
