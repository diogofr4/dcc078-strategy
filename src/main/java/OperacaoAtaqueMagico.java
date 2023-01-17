public class OperacaoAtaqueMagico implements Operacao{
    public float calcular(float dano, float defesa) {
        return (dano * 5) - defesa ;
    }
}
