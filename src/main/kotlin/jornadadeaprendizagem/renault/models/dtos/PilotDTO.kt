package jornadadeaprendizagem.renault.models.dtos

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import jakarta.validation.constraints.Email
import jornadadeaprendizagem.renault.models.entities.Pilot
import java.util.*

@ApiModel(
        value = "PilotDTO",
        description = "Data Transfer Object for Pilot"
)
data class PilotDTO (
        @ApiModelProperty(value = "Pilot id")
        @JsonProperty("id")
        val id : UUID,

        @ApiModelProperty(value = "Pilot name")
        @JsonProperty("name")
        val name : String
) {

    constructor(pilot: Pilot) : this(
            id = pilot.id,
            name = pilot.name
    )

}