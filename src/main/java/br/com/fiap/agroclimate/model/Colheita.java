package br.com.fiap.agroclimate.model;

import br.com.fiap.agroclimate.dto.colheitaDto.AtualizarColheitaDto;
import br.com.fiap.agroclimate.dto.colheitaDto.CadastrarColheitaDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Calendar;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name="COLHEITA")
@EntityListeners(AuditingEntityListener.class)
public class Colheita {

    @Id
    @GeneratedValue

    @Column(name="ID_COLHEITA")
    private Long id;

    @Column(name="DATA_COLHEITA"  ,nullable = false)
    private Calendar dataColheita;

    @Column(name="QNT_COLHEITA")
    private Integer quantidade;

    public Colheita(CadastrarColheitaDto colheitaDto) {
        dataColheita = colheitaDto.dataColheita();
        quantidade = colheitaDto.quantidade();
    }
    public void atualizarColheita(AtualizarColheitaDto dto) {
        if (dto.dataColheita() != null)
            dataColheita = dto.dataColheita();
        if (dto.quantidade() != null)
            quantidade = dto.quantidade();
    }

}
