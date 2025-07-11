package io.swagger.v3.oas.models.servers;

import io.swagger.v3.oas.models.annotations.OpenAPI31;

import java.util.Objects;

/**
 * Server
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.4/versions/3.0.4.md#server-object"
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.1.1/versions/3.1.1.md#server-object"
 */

public class Server {
    private String url = null;
    private String description = null;
    private ServerVariables variables = null;
    private java.util.Map<String, Object> extensions = null;

    /**
     * returns the url property from a Server instance.
     *
     * @return String url
     **/

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Server url(String url) {
        this.url = url;
        return this;
    }

    /**
     * returns the description property from a Server instance.
     *
     * @return String description
     **/

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Server description(String description) {
        this.description = description;
        return this;
    }

    /**
     * returns the variables property from a Server instance.
     *
     * @return ServerVariables variables
     **/

    public ServerVariables getVariables() {
        return variables;
    }

    public void setVariables(ServerVariables variables) {
        this.variables = variables;
    }

    public Server variables(ServerVariables variables) {
        this.variables = variables;
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
        Server server = (Server) o;
        return Objects.equals(this.url, server.url) &&
                Objects.equals(this.description, server.description) &&
                Objects.equals(this.variables, server.variables) &&
                Objects.equals(this.extensions, server.extensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, description, variables, extensions);
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

    public Server extensions(java.util.Map<String, Object> extensions) {
        this.extensions = extensions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Server {\n");

        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

