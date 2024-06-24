package jornadadeaprendizagem.renault.models.dtos.action

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import jornadadeaprendizagem.renault.models.entities.Action
import java.util.*

@ApiModel(
        value = "ResponseActionDTO",
        description = "Response Data Transfer Object for Action"
)
data class ResponseActionDTO (
        @ApiModelProperty(value = "Action id")
        @JsonProperty("id")
        val id : UUID,

        @ApiModelProperty(value = "Action estrategy")
        @JsonProperty("estrategy")
        val estrategy : String,

        @ApiModelProperty(value = "Action desc_action")
        @JsonProperty("desc_action")
        val descaction : String,

        @ApiModelProperty(value = "Action ini_plain_action")
        @JsonProperty("ini_plain_action")
        val iniplainaction : Date,

        @ApiModelProperty(value = "Action date_alert")
        @JsonProperty("date_alet")
        val datealert : Date,

        @ApiModelProperty(value = "Action time_resolution")
        @JsonProperty("time_resolution")
        val timeresolution : Float,

        @ApiModelProperty(value = "Action commentary")
        @JsonProperty("commentary")
        val commentary : String,

        @ApiModelProperty(value = "Action capitalization")
        @JsonProperty("capitalization")
        val capitalization : String,
) {

        constructor(action: Action) : this(
                id = action.id,
                estrategy = action.estrategy,
                descaction = action.descaction,
                iniplainaction = action.iniplainaction,
                datealert = action.datealert,
                timeresolution = action.timeresolution,
                commentary = action.commentary,
                capitalization = action.capitalization
        )
}