package jornadadeaprendizagem.renault.models.entities

import jakarta.persistence.*
import jornadadeaprendizagem.renault.models.dtos.residualrisk.RequestResidualRiskDTO
import jornadadeaprendizagem.renault.models.dtos.residualrisk.ResponseResidualRiskDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "residual_risks")
open class ResidualRisk (
    @Id
    @Column(name = "id")
    val id : UUID,

    @Column(name = "probability")
    val probability : String,

    @Column(name = "impact")
    val impact : String,

    @Column(name = "classification")
    val classification : String,

    @Column(name = "action")
    val action : String,

    @Column(name = "risk")
    val risk : String,

    @Column(name = "resolution_date")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    val resolutionDate : Date?,

    @Column(name = "status")
    val status : Boolean)
{

    constructor(responseResidualRiskDTO : ResponseResidualRiskDTO) : this(
        id = UUID.randomUUID(),
        probability = responseResidualRiskDTO.probability,
        impact = responseResidualRiskDTO.impact,
        classification = responseResidualRiskDTO.classification,
        action = responseResidualRiskDTO.action,
        risk = responseResidualRiskDTO.risk,
        resolutionDate = responseResidualRiskDTO.resolutionDate,
        status = responseResidualRiskDTO.status
    )

    constructor(requestResidualRisk: RequestResidualRiskDTO) : this(
        id = UUID.randomUUID(),
        probability = requestResidualRisk.probability,
        impact = requestResidualRisk.impact,
        classification = requestResidualRisk.classification,
        action = requestResidualRisk.action,
        risk = requestResidualRisk.risk,
        resolutionDate = requestResidualRisk.resolutionDate,
        status = requestResidualRisk.status
    )
}