package io.swagger.v3.oas.models.security;

import io.swagger.v3.oas.models.annotations.OpenAPI31;

import java.util.Objects;

/**
 * OAuthFlow
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.4/versions/3.0.4.md#oauth-flows-object"
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.1.1/versions/3.1.1.md#oauth-flows-object"
 */

public class OAuthFlow {
    private String authorizationUrl = null;
    private String tokenUrl = null;
    private String refreshUrl = null;
    private Scopes scopes = null;
    private java.util.Map<String, Object> extensions = null;

    /**
     * returns the authorizationUrl property from a OAuthFlow instance.
     *
     * @return String authorizationUrl
     **/

    public String getAuthorizationUrl() {
        return authorizationUrl;
    }

    public void setAuthorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
    }

    public OAuthFlow authorizationUrl(String authorizationUrl) {
        this.authorizationUrl = authorizationUrl;
        return this;
    }

    /**
     * returns the tokenUrl property from a OAuthFlow instance.
     *
     * @return String tokenUrl
     **/

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public OAuthFlow tokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
        return this;
    }

    /**
     * returns the refreshUrl property from a OAuthFlow instance.
     *
     * @return String refreshUrl
     **/

    public String getRefreshUrl() {
        return refreshUrl;
    }

    public void setRefreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
    }

    public OAuthFlow refreshUrl(String refreshUrl) {
        this.refreshUrl = refreshUrl;
        return this;
    }

    /**
     * returns the scopes property from a OAuthFlow instance.
     *
     * @return Scopes scopes
     **/

    public Scopes getScopes() {
        return scopes;
    }

    public void setScopes(Scopes scopes) {
        this.scopes = scopes;
    }

    public OAuthFlow scopes(Scopes scopes) {
        this.scopes = scopes;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OAuthFlow oauthFlow = (OAuthFlow) o;
        return Objects.equals(this.authorizationUrl, oauthFlow.authorizationUrl) &&
                Objects.equals(this.tokenUrl, oauthFlow.tokenUrl) &&
                Objects.equals(this.refreshUrl, oauthFlow.refreshUrl) &&
                Objects.equals(this.scopes, oauthFlow.scopes) &&
                Objects.equals(this.extensions, oauthFlow.extensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorizationUrl, tokenUrl, refreshUrl, scopes, extensions);
    }

    public java.util.Map<String, Object> getExtensions() {
        return extensions;
    }

    public void addExtension(String name, Object value) {
        if (name == null || name.isEmpty() || !name.startsWith("x-")) {
            return;
        }
        if (this.extensions == null) {
            this.extensions = new java.util.LinkedHashMap<>();
        }
        this.extensions.put(name, value);
    }

    @OpenAPI31
    public void addExtension31(String name, Object value) {
        if (name != null && (name.startsWith("x-oas-") || name.startsWith("x-oai-"))) {
            return;
        }
        addExtension(name, value);
    }

    public void setExtensions(java.util.Map<String, Object> extensions) {
        this.extensions = extensions;
    }

    public OAuthFlow extensions(java.util.Map<String, Object> extensions) {
        this.extensions = extensions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OAuthFlow {\n");

        sb.append("    authorizationUrl: ").append(toIndentedString(authorizationUrl)).append("\n");
        sb.append("    tokenUrl: ").append(toIndentedString(tokenUrl)).append("\n");
        sb.append("    refreshUrl: ").append(toIndentedString(refreshUrl)).append("\n");
        sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

