public class Batalha {
    private float dano;
    private float defesa;

    public Batalha(float dano, float defesa) {
        this.dano = dano;
        this.defesa = defesa;
    }

    public float calcular(Operacao operacao){
        return operacao.calcular(dano, defesa);
    }
}
