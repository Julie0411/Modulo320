package Banca;

public class Cliente {
    private String nome;
    private String cognome;
    private String via;
    private String cap;
    private String citta;
    private String email;

    public Cliente(String nome, String cognome, String via, String cap, String citta, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.via = via;
        this.cap = cap;
        this.citta = citta;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getVia() {
        return via;
    }

    public String getCap() {
        return cap;
    }

    public String getCitta() {
        return citta;
    }

    public String getEmail() {
        return email;
    }

}
