package med.voll.api.domain.consulta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    Boolean existsByMedicoIdAndDataAndMotivoCancelamentoIsNull(Long id, LocalDateTime data);

    Boolean existsByPacienteIdAndDataBetweenAndMotivoCancelamentoIsNull(Long aLong, LocalDateTime primeiroHorario, LocalDateTime ultimoHorario);


}
