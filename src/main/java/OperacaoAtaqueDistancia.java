public class OperacaoAtaqueDistancia implements Operacao{
    public float calcular(float dano, float defesa) {
        return (dano * 3) - defesa ;
    }
}
