package eu.europeana.apikey;

import eu.europeana.apikey.config.KeycloakProperties;

/**
 * Created by luthien on 26/01/2021.
 */
public class TestResources {

    private static final String CREDENTIAL_REPRESENTATION = "{\n"
                                                            + "    \"type\": \"secret\",\n"
                                                            + "    \"value\": \"134d4ec9-a26e-4dcb-93b7-13e22606eb9d\"\n"
                                                            + "}";


    private static final String DISABLED_CLIENT_REPRESENTATIONS = "[\n"
                                                                  + "    {\n"
                                                                  + "        \"id\": \"fff0fb90-739d-448e-b511-3738af0a2355\",\n"
                                                                  + "        \"clientId\": \"test-add-rest\",\n"
                                                                  + "        \"surrogateAuthRequired\": false,\n"
                                                                  + "        \"enabled\": false,\n"
                                                                  + "        \"clientAuthenticatorType\": \"client-secret\",\n"
                                                                  + "        \"redirectUris\": [],\n"
                                                                  + "        \"webOrigins\": [],\n"
                                                                  + "        \"notBefore\": 0,\n"
                                                                  + "        \"bearerOnly\": false,\n"
                                                                  + "        \"consentRequired\": false,\n"
                                                                  + "        \"standardFlowEnabled\": true,\n"
                                                                  + "        \"implicitFlowEnabled\": false,\n"
                                                                  + "        \"directAccessGrantsEnabled\": false,\n"
                                                                  + "        \"serviceAccountsEnabled\": false,\n"
                                                                  + "        \"publicClient\": false,\n"
                                                                  + "        \"frontchannelLogout\": false,\n"
                                                                  + "        \"protocol\": \"openid-connect\",\n"
                                                                  + "        \"attributes\": {},\n"
                                                                  + "        \"authenticationFlowBindingOverrides\": {},\n"
                                                                  + "        \"fullScopeAllowed\": true,\n"
                                                                  + "        \"nodeReRegistrationTimeout\": -1,\n"
                                                                  + "        \"defaultClientScopes\": [\n"
                                                                  + "            \"web-origins\",\n"
                                                                  + "            \"role_list\",\n"
                                                                  + "            \"profile\",\n"
                                                                  + "            \"roles\",\n"
                                                                  + "            \"email\"\n"
                                                                  + "        ],\n"
                                                                  + "        \"optionalClientScopes\": [\n"
                                                                  + "            \"address\",\n"
                                                                  + "            \"phone\",\n"
                                                                  + "            \"offline_access\"\n"
                                                                  + "        ],\n"
                                                                  + "        \"access\": {\n"
                                                                  + "            \"view\": true,\n"
                                                                  + "            \"configure\": true,\n"
                                                                  + "            \"manage\": true\n"
                                                                  + "        }\n"
                                                                  + "    }\n"
                                                                  + "]";

    private static final String CLIENT_REPRESENTATIONS = "[\n"
                                                         + "    {\n"
                                                         + "        \"id\": \"fff0fb90-739d-448e-b511-3738af0a2355\",\n"
                                                         + "        \"clientId\": \"test-add-rest\",\n"
                                                         + "        \"surrogateAuthRequired\": false,\n"
                                                         + "        \"enabled\": true,\n"
                                                         + "        \"clientAuthenticatorType\": \"client-secret\",\n"
                                                         + "        \"redirectUris\": [],\n"
                                                         + "        \"webOrigins\": [],\n"
                                                         + "        \"notBefore\": 0,\n"
                                                         + "        \"bearerOnly\": false,\n"
                                                         + "        \"consentRequired\": false,\n"
                                                         + "        \"standardFlowEnabled\": true,\n"
                                                         + "        \"implicitFlowEnabled\": false,\n"
                                                         + "        \"directAccessGrantsEnabled\": false,\n"
                                                         + "        \"serviceAccountsEnabled\": false,\n"
                                                         + "        \"publicClient\": false,\n"
                                                         + "        \"frontchannelLogout\": false,\n"
                                                         + "        \"protocol\": \"openid-connect\",\n"
                                                         + "        \"attributes\": {},\n"
                                                         + "        \"authenticationFlowBindingOverrides\": {},\n"
                                                         + "        \"fullScopeAllowed\": true,\n"
                                                         + "        \"nodeReRegistrationTimeout\": -1,\n"
                                                         + "        \"defaultClientScopes\": [\n"
                                                         + "            \"web-origins\",\n"
                                                         + "            \"role_list\",\n"
                                                         + "            \"profile\",\n"
                                                         + "            \"roles\",\n"
                                                         + "            \"email\"\n"
                                                         + "        ],\n"
                                                         + "        \"optionalClientScopes\": [\n"
                                                         + "            \"address\",\n"
                                                         + "            \"phone\",\n"
                                                         + "            \"offline_access\"\n"
                                                         + "        ],\n"
                                                         + "        \"access\": {\n"
                                                         + "            \"view\": true,\n"
                                                         + "            \"configure\": true,\n"
                                                         + "            \"manage\": true\n"
                                                         + "        }\n"
                                                         + "    }\n"
                                                         + "]";



    private static final String TOKEN
                                                             = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJ3Y1N6TDZ0a3RCNFhHcUtjbEZncnVaaHQtX3d5MkZUV0FlWUtaYWNSOTNnIn0.eyJqdGkiOiJmMzZlNWUwZS04Zjk1LTQzNmMtODNiOC1jOTRmNDcyZWRlNTQiLCJleHAiOjE1NTcyNjY1NjksIm5iZiI6MCwiaWF0IjoxNTU3MjMwNTY5LCJpc3MiOiJodHRwczovL2tleWNsb2FrLXNlcnZlci10ZXN0LmVhbmFkZXYub3JnL2F1dGgvcmVhbG1zL2V1cm9wZWFuYSIsImF1ZCI6InJlYWxtLW1hbmFnZW1lbnQiLCJzdWIiOiJkZTg5MGI1OS03NTFjLTRmNjMtYWUxYS1mODc5ODlkNDU1ZDUiLCJ0eXAiOiJCZWFyZXIiLCJhenAiOiJhcGkta2V5LXNlcnZpY2UiLCJhdXRoX3RpbWUiOjAsInNlc3Npb25fc3RhdGUiOiIzMGI2ZDkxNy0wMWIzLTRmMTItYmYyMi1lZjkxOWQ0ZjdiZDQiLCJhY3IiOiIxIiwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIkFQSSJdfSwicmVzb3VyY2VfYWNjZXNzIjp7ImFwaS1rZXktc2VydmljZSI6eyJyb2xlcyI6WyJ1bWFfcHJvdGVjdGlvbiJdfSwicmVhbG0tbWFuYWdlbWVudCI6eyJyb2xlcyI6WyJ2aWV3LXJlYWxtIiwidmlldy1pZGVudGl0eS1wcm92aWRlcnMiLCJtYW5hZ2UtaWRlbnRpdHktcHJvdmlkZXJzIiwiaW1wZXJzb25hdGlvbiIsInJlYWxtLWFkbWluIiwiY3JlYXRlLWNsaWVudCIsIm1hbmFnZS11c2VycyIsInF1ZXJ5LXJlYWxtcyIsInZpZXctYXV0aG9yaXphdGlvbiIsInF1ZXJ5LWNsaWVudHMiLCJxdWVyeS11c2VycyIsIm1hbmFnZS1ldmVudHMiLCJtYW5hZ2UtcmVhbG0iLCJ2aWV3LWV2ZW50cyIsInZpZXctdXNlcnMiLCJ2aWV3LWNsaWVudHMiLCJtYW5hZ2UtYXV0aG9yaXphdGlvbiIsIm1hbmFnZS1jbGllbnRzIiwicXVlcnktZ3JvdXBzIl19fSwic2NvcGUiOiJvcGVuaWQgZW1haWwgcHJvZmlsZSIsImNsaWVudElkIjoiYXBpLWtleS1zZXJ2aWNlIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjbGllbnRIb3N0IjoiMTUwLjI1NC4xNjkuMTAwIiwicHJlZmVycmVkX3VzZXJuYW1lIjoic2VydmljZS1hY2NvdW50LWFwaS1rZXktc2VydmljZSIsImNsaWVudEFkZHJlc3MiOiIxNTAuMjU0LjE2OS4xMDAiLCJlbWFpbCI6InNlcnZpY2UtYWNjb3VudC1hcGkta2V5LXNlcnZpY2VAcGxhY2Vob2xkZXIub3JnIn0.UoENMoInw81KRWkRW7divlPpGjKTgluZaU2cyZOqw7TU92cg7b2ELFBtv-Myc1rmap2Ha-VaKRc5cVsR_wwIiqYPELkwSTqC8yMNjEJdfg0MQyDnCtxP_72ehgP9YRhMrR1JB1TeXMChhwn1BDpdRQYdZjxRQCSArGy_lQHlDjU5hLJbdV3ZWjq8-l-uIWuJiviMHG2I3J34ioyKEEi6Xo7OhclXjcQ-OmPYRBTnGZBu908IFH9b23NxOOssPZxzYr3n6Qf9HPoaJ_VEja1OOeHDCCJcBtw4ww8TnkcRaA1llugBSS5iO9Fku_CZqEEeMkG3OdUpyn7Cuzahuac5KA";
    private static final String REALM_PUBLIC_KEY
                                                             = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgq2lkW7yOWM1mEIyE3zvJxHoRX6S9U8GJp3leNent2E7CXffk45clrpA2ElzH7OAWEoKEth+ORlHAeyAls4eqTyjimXv4HRVTxxL9PCrQDqsd9oVKXnQPbLYxaMRN9xLF2THBYVNJv7Bz1DT3CL+DAq9f5W9N0X+Nsik2+IE8IUDLWyfY2COQrpfS3gTTzHyt7BFDUbzvOuLs6jRuA2rFyYv1i8dN6vdX7WiamrLyTBLOLNGWwCCuV4qLdhbKMUl7S3jOkPg7WHy+lfkWmWAdeSP9wPTDnSJXpCIb+dbYUW6mhlbLNfQLksjxDAqLCE8MgMD6n/CJgVvf26GhlRxWQIDAQAB";
    private static final String APP_NAME                     = "App name";
    private static final String WEBSITE                      = "www.website.com";
    private static final String SECTOR                       = "Sector";
    private static final String COMPANY                      = "Company";
    private static final String CLIENT_ID                    = "client";
    private static final String CLIENT_SECRET                = "secret";
    private static final String NEW_CLIENT_SECRET            = "134d4ec9-a26e-4dcb-93b7-13e22606eb9d";
    private static final String EMPTY_CLIENT_REPRESENTATIONS = "[]";
    private static final String FIRST_NAME                   = "Name";
    private static final String LAST_NAME                    = "Surname";
    private static final String EMAIL                        = "name.surname@mail.com";

    private static final String MANAGER_CLIENT_ID     = "manager";
    private static final String MANAGER_CLIENT_SECRET = "secret";
    private static final String ROLE_CREATE_CLIENT    = "realm-create-client";
    private static final String RESOURCE_ACCESS       = "access";

    private static final String ACCESS_TOKEN_STRING           = "token1";
    private static final String ACCESS_TOKEN_STRING_REFRESHED = "token2";

    private static final String EXISTING_API_KEY     = "apikey1";
    private static final String UNREGISTERED_API_KEY = "apikey2";

    private static final String UNSUCCESSFUL_RESPONSE
            = "{\"success\": false,\"error-codes\": [\"invalid-input-response\"]}";

    private static final String SUCCESSFUL_RESPONSE = "{\"success\": true,\"error-codes\": []}";

    private static final String CAPTCHA_TOKEN      = "token";
    private static final String DEPRECATED_API_KEY = "apikey3";


    public static KeycloakProperties getKeycloakProperties(){
        return new KeycloakProperties("https://keycloak-cf-test.eanadev.org/auth",
                                      "europeana",
                                      true,
                                      TestResources.getRealmPublicKey());
    }

    public static String getCredentialRepresentation() {
        return CREDENTIAL_REPRESENTATION;
    }

    public static String getDisabledClientRepresentations() {
        return DISABLED_CLIENT_REPRESENTATIONS;
    }

    public static String getClientRepresentations() {
        return CLIENT_REPRESENTATIONS;
    }

    public static String getToken() {
        return TOKEN;
    }

    public static String getRealmPublicKey() {
        return REALM_PUBLIC_KEY;
    }

    public static String getAppName() {
        return APP_NAME;
    }

    public static String getWebsite() {
        return WEBSITE;
    }

    public static String getSector() {
        return SECTOR;
    }

    public static String getCompany() {
        return COMPANY;
    }

    public static String getClientId() {
        return CLIENT_ID;
    }

    public static String getClientSecret() {
        return CLIENT_SECRET;
    }

    public static String getNewClientSecret() {
        return NEW_CLIENT_SECRET;
    }

    public static String getAccessTokenString() {
        return ACCESS_TOKEN_STRING;
    }

    public static String getAccessTokenStringRefreshed() {
        return ACCESS_TOKEN_STRING_REFRESHED;
    }

    public static String getExistingApiKey() {
        return EXISTING_API_KEY;
    }

    public static String getUnregisteredApiKey() {
        return UNREGISTERED_API_KEY;
    }

    public static String getUnsuccessfulResponse() {
        return UNSUCCESSFUL_RESPONSE;
    }

    public static String getSuccessfulResponse() {
        return SUCCESSFUL_RESPONSE;
    }

    public static String getCaptchaToken() {
        return CAPTCHA_TOKEN;
    }

    public static String getDeprecatedApiKey() {
        return DEPRECATED_API_KEY;
    }

    public static String getEmptyClientRepresentations() {
        return EMPTY_CLIENT_REPRESENTATIONS;
    }

    public static String getFirstName() {
        return FIRST_NAME;
    }

    public static String getLastName() {
        return LAST_NAME;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public static String getManagerClientId() {
        return MANAGER_CLIENT_ID;
    }

    public static String getManagerClientSecret() {
        return MANAGER_CLIENT_SECRET;
    }

    public static String getRoleCreateClient() {
        return ROLE_CREATE_CLIENT;
    }

    public static String getResourceAccess() {
        return RESOURCE_ACCESS;
    }
}
