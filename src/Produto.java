public class Produto { //Definição da classe
    private int codigo;
    private String nome;
    public Produto(){
    }

    public Produto (int cod, String n){ //construtor, que possui o mesmo nome da classe
        codigo=cod;
        nome=n;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int cod){
        codigo=cod;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome=n;
    }
}
