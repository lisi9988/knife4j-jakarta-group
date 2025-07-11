package io.swagger.v3.oas.models.info;

import io.swagger.v3.oas.models.annotations.OpenAPI31;

import java.util.Objects;

/**
 * License
 *
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.0.4/versions/3.0.4.md#license-object"
 * @see "https://github.com/OAI/OpenAPI-Specification/blob/3.1.1/versions/3.1.1.md#license-object"
 */

public class License {
    private String name = null;
    private String url = null;

    /**
     * @since 2.2.0 (OpenAPI 3.1.0)
     */
    @OpenAPI31
    private String identifier = null;
    private java.util.Map<String, Object> extensions = null;

    /**
     * returns the name property from a License instance.
     *
     * @return String name
     **/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public License name(String name) {
        this.name = name;
        return this;
    }

    /**
     * returns the url property from a License instance.
     *
     * @return String url
     **/

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public License url(String url) {
        this.url = url;
        return this;
    }

    /**
     * returns the identifier property from a License instance.
     *
     * @since 2.2.0 (OpenAPI 3.1.0)
     * @return String identifier
     **/
    @OpenAPI31
    public String getIdentifier() {
        return identifier;
    }
    @OpenAPI31
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }
    @OpenAPI31
    public License identifier(String identifier) {
        this.identifier = identifier;
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
        License license = (License) o;
        return Objects.equals(this.name, license.name) &&
                Objects.equals(this.url, license.url) &&
                Objects.equals(this.identifier, license.identifier) &&
                Objects.equals(this.extensions, license.extensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url, identifier, extensions);
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

    public License extensions(java.util.Map<String, Object> extensions) {
        this.extensions = extensions;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class License {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

