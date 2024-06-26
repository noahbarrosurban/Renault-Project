package jornadadeaprendizagem.renault.models.entities

import jakarta.persistence.*
import jornadadeaprendizagem.renault.models.dtos.action.RequestActionDTO
import jornadadeaprendizagem.renault.models.dtos.action.ResponseActionDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "actions")
open class Action (
    @Id
    @Column(name = "id")
    val id : UUID,

    @Column(name = "strategy")
    val strategy : String,

    @Column(name = "description")
    val description : String,

    @Column(name = "alertdate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val alertDate : Date?,

    @Column(name = "startdate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    val startDate : Date?,

    @Column(name = "enddate")
    val endDate : Date?,

    @Column(name = "hour")
    val hour : Date?,

    @Column(name = "comment")
    val comment : String,

    @Column(name = "captalization")
    val captalization : String){

    constructor(responseActionDTO : ResponseActionDTO) : this(
        id = UUID.randomUUID(),
        strategy = responseActionDTO.strategy,
        description = responseActionDTO.description,
        alertDate = responseActionDTO.alertDate,
        startDate = responseActionDTO.startDate,
        endDate = responseActionDTO.endDate,
        hour = responseActionDTO.hour,
        comment = responseActionDTO.comment,
        captalization = responseActionDTO.captalization
    )

    constructor(requestActionDTO: RequestActionDTO) : this(
        id = UUID.randomUUID(),
        strategy = requestActionDTO.strategy,
        description = requestActionDTO.description,
        alertDate = requestActionDTO.alertDate,
        startDate = requestActionDTO.startDate,
        endDate = requestActionDTO.endDate,
        hour = requestActionDTO.hour,
        comment = requestActionDTO.comment,
        captalization = requestActionDTO.captalization
    )
}