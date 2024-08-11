package jornadadeaprendizagem.renault.models.dtos.residualrisk

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
    value = "RequestResidualRiskDTO",
    description = "Request Data Transfer Object for Residual Risk"
)
data class RequestResidualRiskDTO(
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
)