public class Aventureiro {
    private float danoRealizado;
    private float danoRecebido;

    public float getDanoRealizado() {
        return danoRealizado;
    }

    public float getDanoRecebido() {
        return danoRecebido;
    }

    public void danoFinalAtaqueFisico(float dano, float defesa){
        Batalha batalha = new Batalha(dano, defesa);
        this.danoRealizado = batalha.calcular(new OperacaoAtaqueFisico());
    }

    public void danoFinalAtaqueDistancia(float dano, float defesa){
        Batalha batalha = new Batalha(dano, defesa);
        this.danoRealizado = batalha.calcular(new OperacaoAtaqueDistancia());
    }

    public void danoFinalAtaqueMagico(float dano, float defesa){
        Batalha batalha = new Batalha(dano, defesa);
        this.danoRealizado = batalha.calcular(new OperacaoAtaqueMagico());
    }

    public void danoRecebidoDefendendo(float dano, float defesa){
        Batalha batalha = new Batalha(dano, defesa);
        this.danoRecebido = batalha.calcular(new OperacaoDefender());
    }
}
