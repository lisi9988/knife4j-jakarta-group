package io.swagger.v3.oas.models.media;

import java.util.Base64;
import java.util.List;
import java.util.Objects;

/**
 * BinarySchema
 */

public class BinarySchema extends Schema<byte[]> {

    public BinarySchema() {
        super("string", "binary");
    }

    @Override
    public BinarySchema type(String type) {
        super.setType(type);
        return this;
    }

    @Override
    public BinarySchema format(String format) {
        super.setFormat(format);
        return this;
    }

    public BinarySchema _default(byte[] _default) {
        super.setDefault(_default);
        return this;
    }

    @Override
    protected byte[] cast(Object value) {
        if (value != null) {
            try {
                if (value instanceof byte[]) {
                    return (byte[]) value;
                } else if (value instanceof String) {
                    if (
                            (System.getProperty(BINARY_STRING_CONVERSION_PROPERTY) != null && System.getProperty(BINARY_STRING_CONVERSION_PROPERTY).equals(BynaryStringConversion.BINARY_STRING_CONVERSION_BASE64.toString())) ||
                            (System.getenv(BINARY_STRING_CONVERSION_PROPERTY) != null && System.getenv(BINARY_STRING_CONVERSION_PROPERTY).equals(BynaryStringConversion.BINARY_STRING_CONVERSION_BASE64.toString()))) {
                        return Base64.getDecoder().decode((String) value);
                    }
                    return value.toString().getBytes();
                } else {
                    return value.toString().getBytes();
                }
            } catch (Exception e) {
            }
        }
        return null;
    }

    public BinarySchema _enum(List<byte[]> _enum) {
        super.setEnum(_enum);
        return this;
    }

    public BinarySchema addEnumItem(byte[] _enumItem) {
        super.addEnumItemObject(_enumItem);
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
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_default, _enum, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BinarySchema {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

