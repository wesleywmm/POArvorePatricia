public class Aplicacao {
    
    public static void main(String[] args) {
        
        PatriciaTree arvPatricia = new PatriciaTree(new No());
        arvPatricia.inserirPatriciaTree("bee");
        arvPatricia.inserirPatriciaTree("bear");
        arvPatricia.inserirPatriciaTree("bird");
        arvPatricia.inserirPatriciaTree("bell");
        arvPatricia.inserirPatriciaTree("car");
        arvPatricia.inserirPatriciaTree("card");
        arvPatricia.inserirPatriciaTree("notebook");
        arvPatricia.inserirPatriciaTree("notepad");
        arvPatricia.inserirPatriciaTree("family");
        arvPatricia.inserirPatriciaTree("mooney");
        arvPatricia.inserirPatriciaTree("beautiful");
        arvPatricia.inserirPatriciaTree("elephant ");
        arvPatricia.inserirPatriciaTree("element");
        arvPatricia.inserirPatriciaTree("electric");
        arvPatricia.inserirPatriciaTree("elevator");

        System.out.println("\n----------------------Palavras----------------------\n");
        arvPatricia.exibirPalavras();
        System.out.println("\n-----------------Palavras Nivel-------------------\n");
        arvPatricia.exibirEmNivel();

    }

}
