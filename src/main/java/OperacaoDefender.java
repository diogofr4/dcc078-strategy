public class OperacaoDefender implements Operacao{
    public float calcular(float dano, float defesa) {
        float valor = dano - (defesa * 2);
        if(valor < 0)
            return 0;

        return valor;
    }
}
