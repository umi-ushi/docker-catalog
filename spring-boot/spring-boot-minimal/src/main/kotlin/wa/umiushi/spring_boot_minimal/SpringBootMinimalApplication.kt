package wa.umiushi.spring_boot_minimal

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootMinimalApplication

fun main(args: Array<String>) {
	runApplication<SpringBootMinimalApplication>(*args)
}
