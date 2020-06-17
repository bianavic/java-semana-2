package challenge;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    List<Carro> listaCarrosEstacionados = new ArrayList<>(10);

    public void estacionar(Carro carro) throws EstacionamentoException {
        if (!verificarRequisitos(carro)) {
            throw new EstacionamentoException("Nao foram cumpridos requisitos para estacionar");
        } else {
            if (carrosEstacionados() < 10) listaCarrosEstacionados.add(carro);
            else {
                for (Carro car : listaCarrosEstacionados) {
                    if (car.getMotorista().getIdade() < 55) {
                        listaCarrosEstacionados.remove(car);
                        listaCarrosEstacionados.add(car);
                        break;
                    } else if (verificarTodosSeniors()) throw new EstacionamentoException("Estacionamento lotado!");
                }
            }
        }
    }

    public int carrosEstacionados() {
        return listaCarrosEstacionados.size();
    }

    public boolean carroEstacionado(Carro carro) {
        return listaCarrosEstacionados.contains(carro);
    }

    private Boolean verificarTodosSeniors() {
        return listaCarrosEstacionados.stream()
                .noneMatch(c -> c.getMotorista().getIdade() < 55);
    }

    private Boolean verificarRequisitos(Carro carro) {
        return carro.getMotorista() != null
                && carro.getMotorista().getIdade() >= 18
                && carro.getMotorista().getPontos() < 20;
    }
}