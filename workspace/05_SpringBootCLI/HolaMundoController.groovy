@Grab(group='org.springframework.boot', module='spring-boot-starter-thymeleaf', version='1.5.7.RELEASE')

@Controller
class HolaMundoController {

	@RequestMapping(path="/hello")
	def holaMundo() {
		return "index";
	}
}