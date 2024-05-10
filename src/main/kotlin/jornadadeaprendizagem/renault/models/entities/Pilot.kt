package jornadadeaprendizagem.renault.models.entities

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.EntityListeners
import jakarta.persistence.Id
import jakarta.persistence.Table
import jornadadeaprendizagem.renault.models.dtos.PilotDTO
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

    constructor(pilotDTO: PilotDTO) : this(
            id = UUID.randomUUID(),
            name = pilotDTO.name)
}