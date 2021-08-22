package br.com.magacomunication.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "communication")
public class Communication implements Serializable {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "identifier")
    private String identifier;

    @Column(name = "dt_send", nullable = false)
    private LocalDateTime dtSend;

    @Column(name = "message", nullable = false, length = 1000)
    private String message;

    @Column(name = "type")
    @Convert(converter = TypeCommunicationConverter.class)
    private TypeCommunicationEnum type;

    @Column(name = "status")
    @Convert(converter = StatusCommunicationConverter.class)
    private StatusCommunicationEnum status;
}
