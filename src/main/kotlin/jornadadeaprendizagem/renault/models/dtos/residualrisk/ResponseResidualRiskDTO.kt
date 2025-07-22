package jornadadeaprendizagem.renault.models.dtos.residualrisk

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import jornadadeaprendizagem.renault.models.entities.ResidualRisk
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
    value = "ResponseResidualRiskDTO",
    description = "Response Data Transfer Object for Residual Risk"
)
data class ResponseResidualRiskDTO(
    @JsonProperty("id")
    val id: UUID,

    @JsonProperty("probability")
    val probability: String,

    @JsonProperty("impact")
    val impact: String,

    @JsonProperty("classification")
    val classification: String,

    @JsonProperty("action")
    val action: String,

    @JsonProperty("risk")
    val risk: String,

    @JsonProperty("resolutionDate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    val resolutionDate: Date?,

    @JsonProperty("status")
    val status: Boolean
){
    constructor(residualRisk: ResidualRisk) : this(
        residualRisk.id,
        residualRisk.probability,
        residualRisk.impact,
        residualRisk.classification,
        residualRisk.action,
        residualRisk.risk,
        residualRisk.resolutionDate,
        residualRisk.status
    )
}