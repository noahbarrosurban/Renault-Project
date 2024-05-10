package jornadadeaprendizagem.renault

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class RenaultApplication

fun main(args: Array<String>) {
	runApplication<RenaultApplication>(*args)
}
