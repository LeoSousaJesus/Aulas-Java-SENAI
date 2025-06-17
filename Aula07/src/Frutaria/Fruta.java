package Frutaria;

public class Fruta {
    private int id;
    private String nomeFruta;
    private int qtdFruta;
    private String maturacaoFruta;
    private String localColhido;

    public Fruta(int id, String nomeFruta, int qtdFruta, String maturacaoFruta, String localColhido) {
        this.id = id;
        this.nomeFruta = nomeFruta;
        this.qtdFruta = qtdFruta;
        this.maturacaoFruta = maturacaoFruta;
        this.localColhido = localColhido;
    }

    public int getId() {
        return id;
    }

    public String getNomeFruta() {
        return nomeFruta;
    }

    public int getQtdFruta() {
        return qtdFruta;
    }

    public String getMaturacaoFruta() {
        return maturacaoFruta;
    }

    public String getLocalColhido() {
        return localColhido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNomeFruta(String nomeFruta) {
        this.nomeFruta = nomeFruta;
    }

    public void setQtdFruta(int qtdFruta) {
        this.qtdFruta = qtdFruta;
    }

    public void setMaturacaoFruta(String maturacaoFruta) {
        this.maturacaoFruta = maturacaoFruta;
    }

    public void setLocalColhido(String localColhido) {
        this.localColhido = localColhido;
    }

    @Override
    public String toString() {
        return "Fruta{" + "id=" + id + ", nomeFruta=" + nomeFruta + ", qtdFruta=" + qtdFruta + ", maturacaoFruta=" + maturacaoFruta + ", localColhido=" + localColhido + '}';
    }
    
}
