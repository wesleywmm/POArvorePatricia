public class No {
    
    private String palavra;
    private boolean flag;
    private No vLig[];

    public No()
    {
        palavra = "";
        flag = false;
        vLig = new No[26]; 
    }
    
    public No(String palavra)
    {
        this();
        this.palavra = palavra;
        this.flag = true;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public No getvLig(int pos) {
        return vLig[pos];
    }

    public void setvLig(int pos, No vLig) {
        this.vLig[pos] = vLig;
    }

}
