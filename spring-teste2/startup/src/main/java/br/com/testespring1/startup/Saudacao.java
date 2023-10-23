package br.com.testespring1.startup;

public class Saudacao {

    private final long id;
    private final String content;

    public Saudacao(long id, String content){
        this.id =id;
        this.content = content;
    }
    
    public long getid(){ 
        return id;}

    public String getcontent(){ 
        return content;}

}
