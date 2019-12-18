package eu.europeana.apikey.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Central location where all (or most) configuration settings are loaded.
 */

// TODO I think we don't need this, it's easier to just inject the properties directly where needed

@Configuration
@Component
public class ApikeyConfiguration {

    @Value("${keycloak.auth-server-url}")
    private String authServerUrl;

    @Value("${keycloak.realm}")
    private String realm;

    @Value("${keycloak.use-resource-role-mappings}")
    private boolean useResourceRoleMappings;

    @Value("${keycloak.realm-public-key}")
    private String realmPublicKey;

    public String getAuthServerUrl() {
        return this.authServerUrl;
    }

    public String getRealm() {
        return this.realm;
    }

    public boolean isUseResourceRoleMappings() {
        return this.useResourceRoleMappings;
    }

    public String getRealmPublicKey() {
        return realmPublicKey;
    }

}
