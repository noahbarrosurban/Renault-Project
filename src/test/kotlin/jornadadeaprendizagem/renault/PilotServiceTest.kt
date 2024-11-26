import jornadadeaprendizagem.renault.models.dtos.pilot.RequestPilotDTO
import jornadadeaprendizagem.renault.models.entities.Pilot
import jornadadeaprendizagem.renault.modules.repositories.PilotRepository
import jornadadeaprendizagem.renault.modules.services.PilotService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.Mockito.*
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import java.util.UUID

@ExtendWith(MockitoExtension::class)
class PilotServiceTest {

    @Mock
    private lateinit var pilotRepository: PilotRepository

    @InjectMocks
    private lateinit var pilotService: PilotService

    @Test
    fun `should create and return the pilot`() {
        // Arrange
        val requestPilotDTO = RequestPilotDTO("Exemplo")
        val pilot = Pilot(UUID.randomUUID(), requestPilotDTO.name)

        `when`(pilotRepository.save(any(Pilot::class.java))).thenReturn(pilot)

        // Act
        val result = pilotService.create(requestPilotDTO)

        // Assert
        assertEquals(pilot, result)
        verify(pilotRepository, times(1)).save(any(Pilot::class.java))
    }
}

