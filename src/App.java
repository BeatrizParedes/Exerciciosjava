public class App {
    public static void main(String[] args) throws Exception {
        Produto p = new Produto(cod:15,n:"Computador MSX Expert"); //constroi o objeto
      
        System.out.println("dados do produto:");
        System.out.println("código: "+p.getCodigo());
        System.out.println("nome"+p.getNome());
    }
}
