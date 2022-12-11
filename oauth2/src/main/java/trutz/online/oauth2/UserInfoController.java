package trutz.online.oauth2;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

	@GetMapping("/")
	public String getUserName(@AuthenticationPrincipal OAuth2User user) {
		return user.toString();
	}
	
}
