package config;


import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties("limits-service")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Configuration {

    private int maximum;
    private int minimum;




}
