package plus.knowing.sso.mall.configuration.prop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix = "sso")
public class SsoConfigProperties {

    private String authUrl;
}
