package jornadadeaprendizagem.renault.models.dtos.pilot

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty

@ApiModel(
        value = "RequestPilotDTO",
        description = "Request Data Transfer Object for Pilot"
)
data class RequestPilotDTO (
        @ApiModelProperty(value = "Pilot name")
        @JsonProperty("name")
        val name : String)