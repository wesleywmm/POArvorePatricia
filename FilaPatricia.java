public class FilaPatricia {
    
    private NoFila inicio;
    private NoFila fim;

    public FilaPatricia() {
        fim = inicio = null;
    }

    public NoFila getInicio() {
        return inicio;
    }

    public void setInicio(NoFila inicio) {
        this.inicio = inicio;
    }

    public NoFila getFim() {
        return fim;
    }

    public void setFim(NoFila fim) {
        this.fim = fim;
    }

    public boolean isEmpty()
    {
       return (inicio == null) ? true : false;
    }

    public void enqueue(No arv, int nivel)
    {
        if(inicio == null)
        {
            inicio = new NoFila(arv, nivel);
            fim = inicio;
        }
        else
        {
            fim.setProximo(new NoFila(arv, nivel));
            fim = fim.getProximo();
        }
    }

    public NoFila dequeue()
    {
        NoFila fila = inicio;

        if(inicio == fim)   
            inicio = null;
        else
            inicio = inicio.getProximo();

        return fila;
    }

}
