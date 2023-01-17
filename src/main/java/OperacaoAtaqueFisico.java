public class OperacaoAtaqueFisico implements Operacao{
    public float calcular(float dano, float defesa) {
        return (dano / 2) - defesa ;
    }
}
