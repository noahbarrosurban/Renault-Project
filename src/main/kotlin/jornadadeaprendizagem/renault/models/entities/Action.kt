package jornadadeaprendizagem.renault.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.Id
import jakarta.persistence.Table
import jornadadeaprendizagem.renault.models.dtos.action.ResponseActionDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "actions")
open class Action(
    @Id
    @Column(name = "id_action")
    val id: UUID,

    @Column(name = "estrategy")
    val estrategy: String,

    @Column(name = "descaction")
    val descaction: String,

    @Column(name = "iniplainaction")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val iniplainaction: Date = Date(),

    @Column(name = "datealert")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val datealert: Date = Date(),

    @Column(name = "timeresolution")
    val timeresolution: Float = 0F,

    @Column(name = "commentary")
    val commentary: String,

    @Column(name = "capitalization")
    val capitalization: String

) {
    constructor(responseActionDTO: ResponseActionDTO) : this(
        id = UUID.randomUUID(),
        estrategy = responseActionDTO.estrategy,
        descaction = responseActionDTO.descaction,
        iniplainaction = responseActionDTO.iniplainaction,
        datealert =  responseActionDTO.datealert,
        timeresolution =  responseActionDTO.timeresolution,
        commentary =  responseActionDTO.commentary,
        capitalization =  responseActionDTO.capitalization
    )
}