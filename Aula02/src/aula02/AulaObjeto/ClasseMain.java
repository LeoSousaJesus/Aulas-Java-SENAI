package aula02.AulaObjeto;

public class ClasseMain {
    public static void main(String[] args){
    
        Caneta manoelGomes = new Caneta();
        manoelGomes.modelo = "Bic";
        manoelGomes.carga = 8;
        manoelGomes.cor = "Azul";
        manoelGomes.ponta = 1.5f;
        manoelGomes.marca = "Musica";
        
        System.out.println(manoelGomes.modelo);
        System.out.println(manoelGomes.carga);
        System.out.println(manoelGomes.cor);
        System.out.println(manoelGomes.ponta);
        System.out.println(manoelGomes.marca+"\n\n");
        
        Caneta compacto = new Caneta();
        compacto.modelo = "Compator";
        compacto.carga = 10;
        compacto.cor = "Preta";
        compacto.ponta = 1.2f;
        compacto.marca = "Escola";
        
        System.out.println(compacto.modelo);
        System.out.println(compacto.carga);
        System.out.println(compacto.cor);
        System.out.println(compacto.ponta);
        System.out.println(compacto.marca+"\n\n");
        
        Caneta pentel = new Caneta();
        pentel.modelo = "Grafite";
        pentel.carga = 22;
        pentel.cor = "Vinho";
        pentel.ponta = 0.5f;
        pentel.marca = "Lapiseira";
        
        System.out.println(pentel.modelo);
        System.out.println(pentel.carga);
        System.out.println(pentel.cor);
        System.out.println(pentel.ponta);
        System.out.println(pentel.marca+"\n\n");
        
        
        CanetaPrivida canetaPrivida = new CanetaPrivida("Condor", "Pincel", 1.2f ,"Vermelho", 20);
        System.out.println(canetaPrivida.toString());
    }
    
}
