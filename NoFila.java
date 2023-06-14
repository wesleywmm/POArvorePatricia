public class NoFila {
    
    private No arv;
    private int nivel;
    private NoFila proximo;

    public NoFila() {    
        arv = null;
        nivel = 0;
        proximo = null;
    }

    public NoFila(No arv, int nivel) {
        this();
        this.arv = arv;
        this.nivel = nivel;
    }

    public No getArv() {
        return arv;
    }

    public void setArv(No arv) {
        this.arv = arv;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public NoFila getProximo() {
        return proximo;
    }

    public void setProximo(NoFila proximo) {
        this.proximo = proximo;
    }

    
}
