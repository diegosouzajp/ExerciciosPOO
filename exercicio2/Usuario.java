package exercicio2;

public class Usuario {
    
    private String nome;
    private String email;
    private String data;
    private String idade;
    private String login;
    private String senhaNumerica;
    private String senhaTexto;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenhaNumerica() {
        return senhaNumerica;
    }

    public void setSenhaNumerica(String senhaNumerica) {
        this.senhaNumerica = senhaNumerica;
    }

    public String getSenhaTexto() {
        return senhaTexto;
    }

    public void setSenhaTexto(String senhaTexto) {
        this.senhaTexto = senhaTexto;
    }
    
}
