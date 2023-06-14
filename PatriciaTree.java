public class PatriciaTree {
    
    No raiz;

    public PatriciaTree() 
    {
        raiz = null;
    }

    public PatriciaTree(No raiz) 
    {
        this.raiz = raiz;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public void inserirPatriciaTree(String palavra)
    {
        No aux,split;
        int posPalavra,i,j;
        String resto_palavra;

        if(raiz == null)
            raiz = new No();
        else
        {
            aux = raiz;
            
            posPalavra = palavra.charAt(0) - 'a';
            
            if(aux.getvLig(posPalavra) == null)
                aux.setvLig(posPalavra, new No(palavra));
            else
            {
                i=0;
                j=0;
                aux = aux.getvLig(posPalavra);

                while(i < palavra.length() && j < aux.getPalavra().length() && palavra.charAt(i) == aux.getPalavra().charAt(j) ) //andando pelos prefixos
                {
                    i++; 
                    j++;
                   
                    if(i < palavra.length() && aux.getvLig(palavra.charAt(i) - 'a') != null && j >= aux.getPalavra().length())
                    {
                        aux = aux.getvLig(palavra.charAt(i) - 'a');
                        j = 0;
                    }     
                }
                    if(i < palavra.length() && j < aux.getPalavra().length())   // split 
                    {
                        resto_palavra = aux.getPalavra().substring(j);
                        split = new No(resto_palavra);
                        split.setFlag(aux.getFlag());
                        aux.setFlag(false);

                        for(int k = 0; k < 26; k++)
                        {
                            split.setvLig(k, aux.getvLig(k)); 
                            aux.setvLig(k, null);                        
                        }
                        posPalavra = resto_palavra.charAt(0) - 'a'; 
                        aux.setvLig(posPalavra, split);
                        resto_palavra = palavra.substring(i);
                        posPalavra = resto_palavra.charAt(0) - 'a';
                        aux.setvLig(posPalavra, new No(resto_palavra));
                        resto_palavra = aux.getPalavra().substring(0, j);
                        aux.setPalavra(resto_palavra);
                    }  
                    else
                        if(i < palavra.length() && j >= aux.getPalavra().length())
                        {
                            resto_palavra = palavra.substring(i);
                            aux.setvLig(resto_palavra.charAt(0) - 'a', new No(resto_palavra));
                        }      
            }
        }
    }

 

}
