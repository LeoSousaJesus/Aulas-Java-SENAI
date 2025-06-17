package classesJava;

public class MainClasses {
    
    public static void main(String[] args){
        
        Pessoa p1 = new Pessoa("Paulo", 25, "Masculino");
        System.out.println(p1);
        
        Aluno a1 = new Aluno(12345, "TI", "Paulo", 12, "Masculino");
        System.out.println(a1);
        
        Funcionario f1 = new Funcionario("Caixa", "Operador", "João", 35, "Masculino");
        System.out.println(f1);
        
        Professor pro1 = new Professor("Biologia", 4500.67, "Tereza", 36, "Feminino");
        System.out.println(pro1);
    }
    
}
