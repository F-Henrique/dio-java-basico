
public class MinhaClasse {
    
    public static void main(String[] args) {
        
        String primeiroNome ="henrique";
        String segundoNome = "santos";
        // System.out.print(primeiroNome & " " & segundoNome);

        String nomeCompleto =NomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);
        
        
    }

public static String NomeCompleto(String primeiroNome, String segundoNome){
    // return primeiroNome.concat(" ").concat(segundoNome);
    return primeiroNome + " "+segundoNome;
}



}
