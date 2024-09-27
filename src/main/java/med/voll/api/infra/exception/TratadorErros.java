package med.voll.api.infra.exception;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.FieldResult;
import med.voll.api.domain.ValidacaoException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorErros {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity tratarErro404() {
        return ResponseEntity.notFound().build();
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity tratarErro400(MethodArgumentNotValidException ex){
        var erros = ex.getFieldErrors();
        return ResponseEntity.badRequest().body(erros.stream().map(DadosErrosValidacao::new).toList());
    }

    @ExceptionHandler(ValidacaoException.class)
    public ResponseEntity tratarErroDeNegocio(ValidacaoException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
    private record DadosErrosValidacao(String campo, String mensagem){
        public DadosErrosValidacao(FieldError erro) {
            this(erro.getField(), erro.getDefaultMessage());
        }
    }
}
