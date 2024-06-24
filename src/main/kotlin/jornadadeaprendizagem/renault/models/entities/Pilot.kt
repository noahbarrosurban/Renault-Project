package jornadadeaprendizagem.renault.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.Id
import jakarta.persistence.Table
import jornadadeaprendizagem.renault.models.dtos.pilot.RequestPilotDTO
import jornadadeaprendizagem.renault.models.dtos.pilot.ResponsePilotDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "pilots")
open class Pilot (
        @Id
        @Column(name = "id")
        val id : UUID,

        @Column(name = "name")
        val name : String){

    constructor(responsePilotDTO: ResponsePilotDTO) : this(
            id = UUID.randomUUID(),
            name = responsePilotDTO.name
    )

    constructor(requestPilotDTO: RequestPilotDTO) : this(
            id = UUID.randomUUID(),
            name = requestPilotDTO.name
    )
}