package RistoranteI2a;

public class Cliente {
    private String nome;
    private String cognome;
    private String email;

    public Cliente(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getEmail() {
        return this.email;
    }

    public String toString() {
        return "Nome: " + this.nome + ", cognome: " + this.cognome + " (" + this.email + ")";
    }

}
