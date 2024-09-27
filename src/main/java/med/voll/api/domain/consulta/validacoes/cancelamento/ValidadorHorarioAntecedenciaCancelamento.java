package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.ConsultaRepository;
import med.voll.api.domain.consulta.DadosCancelamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedenciaCancelamento  implements ValidadorCancelamentoConsulta{
    @Autowired
    private ConsultaRepository repository;
    @Override
    public void validarHorario(DadosCancelamentoConsulta dados) {
        var horarioAtual = LocalDateTime.now();
        var consulta = repository.getReferenceById(dados.idConsulta());
        var diferencaEmHoras = Duration.between(horarioAtual, consulta.getData()).toHours();

        if (diferencaEmHoras < 24) {
            throw new ValidacaoException("A conculta só pode ser cancelada com 24 horas de antecedência");
        }
    }
}
