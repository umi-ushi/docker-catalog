package wa.umiushi.spring_boot_minimal

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("/demo")
    fun demo(): String {
        return "Hello Demo"
    }
}