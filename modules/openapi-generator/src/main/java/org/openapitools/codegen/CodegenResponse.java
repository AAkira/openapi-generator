/*
 * Copyright 2018 OpenAPI-Generator Contributors (https://openapi-generator.tech)
 * Copyright 2018 SmartBear Software
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openapitools.codegen;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

public class CodegenResponse implements IJsonSchemaValidationProperties {
    public final List<CodegenProperty> headers = new ArrayList<CodegenProperty>();
    @Getter @Setter
    private List<CodegenParameter> responseHeaders = new ArrayList<CodegenParameter>();
    public String code;
    public boolean is1xx;
    public boolean is2xx;
    public boolean is3xx;
    public boolean is4xx;
    public boolean is5xx;
    public String message;
    public List<Map<String, Object>> examples;
    public String dataType;
    public String baseType;
    public String containerType;
    public String containerTypeMapped; // language-specified container type (e.g. `dict` in python for map)
    public boolean hasHeaders;
    public boolean isString;
    public boolean isNumeric;
    public boolean isInteger;
    public boolean isShort;
    public boolean isLong;
    public boolean isUnboundedInteger;
    public boolean isNumber;
    public boolean isFloat;
    public boolean isDouble;
    public boolean isDecimal;
    public boolean isByteArray;
    public boolean isBoolean;
    public boolean isDate;
    public boolean isDateTime;
    public boolean isUuid;
    public boolean isEmail;
    public boolean isPassword;
    public boolean isModel;
    public boolean isFreeFormObject;
    public boolean isAnyType;
    public boolean isDefault;
    public boolean simpleType;
    public boolean primitiveType;
    public boolean isMap;
    /**
     * datatype is the generic inner parameter of a std::optional for C++, or Optional (Java)
     */
    public boolean isOptional;
    public boolean isArray;
    public boolean isBinary = false;
    public boolean isFile = false;
    public boolean isNull;
    public boolean isVoid = false;
    public Object schema;
    public String jsonSchema;
    public Map<String, Object> vendorExtensions = new HashMap<String, Object>();
    private Integer maxProperties;
    private Integer minProperties;
    private boolean uniqueItems;
    private Boolean uniqueItemsBoolean;
    private Integer maxItems;
    private Integer minItems;
    private Integer maxLength;
    private Integer minLength;
    private boolean exclusiveMinimum;
    private boolean exclusiveMaximum;
    private String minimum;
    private String maximum;
    public String pattern;
    public Number multipleOf;
    public CodegenProperty items;
    public CodegenProperty additionalProperties;
    public List<CodegenProperty> vars = new ArrayList<CodegenProperty>(); // all properties (without parent's properties)
    public List<CodegenProperty> requiredVars = new ArrayList<CodegenProperty>();
    private boolean hasValidation;
    private boolean additionalPropertiesIsAnyType;
    private boolean hasVars;
    private boolean hasRequired;
    private boolean hasDiscriminatorWithNonEmptyMapping;
    private CodegenComposedSchemas composedSchemas;
    private boolean hasMultipleTypes = false;
    @Getter @Setter
    private LinkedHashMap<String, CodegenMediaType> content;
    private Map<String, CodegenProperty> requiredVarsMap;
    private String ref;
    public CodegenProperty returnProperty;
    private boolean schemaIsFromAdditionalProperties;

    @Override
    public int hashCode() {
        return Objects.hash(headers, code, message, examples, dataType, baseType, containerType, containerTypeMapped, hasHeaders,
                isString, isNumeric, isInteger, isLong, isNumber, isFloat, isDouble, isDecimal, isByteArray, isBoolean, isDate,
                isDateTime, isUuid, isEmail, isPassword, isModel, isFreeFormObject, isAnyType, isDefault, simpleType, primitiveType,
                isMap, isOptional, isArray, isBinary, isFile, schema, jsonSchema, vendorExtensions, items, additionalProperties,
                vars, requiredVars, isNull, isVoid, hasValidation, isShort, isUnboundedInteger,
                getMaxProperties(), getMinProperties(), uniqueItems, getMaxItems(), getMinItems(), getMaxLength(),
                getMinLength(), exclusiveMinimum, exclusiveMaximum, getMinimum(), getMaximum(), getPattern(),
                is1xx, is2xx, is3xx, is4xx, is5xx, additionalPropertiesIsAnyType, hasVars, hasRequired,
                hasDiscriminatorWithNonEmptyMapping, composedSchemas, hasMultipleTypes, responseHeaders, content,
                requiredVarsMap, ref, uniqueItemsBoolean, schemaIsFromAdditionalProperties);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CodegenResponse)) return false;
        CodegenResponse that = (CodegenResponse) o;
        return hasHeaders == that.hasHeaders &&
                isString == that.isString &&
                isNumeric == that.isNumeric &&
                isInteger == that.isInteger &&
                isShort == that.isShort &&
                isLong == that.isLong &&
                isUnboundedInteger == that.isUnboundedInteger &&
                isNumber == that.isNumber &&
                isFloat == that.isFloat &&
                isDouble == that.isDouble &&
                isDecimal == that.isDecimal &&
                isByteArray == that.isByteArray &&
                isBoolean == that.isBoolean &&
                isDate == that.isDate &&
                isDateTime == that.isDateTime &&
                isUuid == that.isUuid &&
                isEmail == that.isEmail &&
                isPassword == that.isPassword &&
                isModel == that.isModel &&
                isFreeFormObject == that.isFreeFormObject &&
                isAnyType == that.isAnyType &&
                isDefault == that.isDefault &&
                simpleType == that.simpleType &&
                primitiveType == that.primitiveType &&
                isMap == that.isMap &&
                isOptional == that.isOptional &&
                isArray == that.isArray &&
                isBinary == that.isBinary &&
                isFile == that.isFile &&
                items == that.items &&
                additionalProperties == that.additionalProperties &&
                isNull == that.isNull &&
                isVoid == that.isVoid &&
                hasValidation == that.hasValidation &&
                is1xx == that.is1xx &&
                is2xx == that.is2xx &&
                is3xx == that.is3xx &&
                is4xx == that.is4xx &&
                is5xx == that.is5xx &&
                hasDiscriminatorWithNonEmptyMapping == that.getHasDiscriminatorWithNonEmptyMapping() &&
                hasMultipleTypes == that.getHasMultipleTypes() &&
                getSchemaIsFromAdditionalProperties() == that.getSchemaIsFromAdditionalProperties() &&
                getAdditionalPropertiesIsAnyType() == that.getAdditionalPropertiesIsAnyType() &&
                getHasVars() == that.getHasVars() &&
                getHasRequired() == that.getHasRequired() &&
                Objects.equals(uniqueItemsBoolean, that.getUniqueItemsBoolean()) &&
                Objects.equals(ref, that.getRef()) &&
                Objects.equals(requiredVarsMap, that.getRequiredVarsMap()) &&
                Objects.equals(content, that.getContent()) &&
                Objects.equals(responseHeaders, that.getResponseHeaders()) &&
                Objects.equals(composedSchemas, that.getComposedSchemas()) &&
                Objects.equals(vars, that.vars) &&
                Objects.equals(requiredVars, that.requiredVars) &&
                Objects.equals(headers, that.headers) &&
                Objects.equals(code, that.code) &&
                Objects.equals(message, that.message) &&
                Objects.equals(examples, that.examples) &&
                Objects.equals(dataType, that.dataType) &&
                Objects.equals(baseType, that.baseType) &&
                Objects.equals(containerType, that.containerType) &&
                Objects.equals(containerTypeMapped, that.containerTypeMapped) &&
                Objects.equals(schema, that.schema) &&
                Objects.equals(jsonSchema, that.jsonSchema) &&
                Objects.equals(vendorExtensions, that.vendorExtensions) &&
                Objects.equals(getMaxProperties(), that.getMaxProperties()) &&
                Objects.equals(getMinProperties(), that.getMinProperties()) &&
                Objects.equals(uniqueItems, that.uniqueItems) &&
                Objects.equals(getMaxItems(), that.getMaxItems()) &&
                Objects.equals(getMinItems(), that.getMinItems()) &&
                Objects.equals(getMaxLength(), that.getMaxLength()) &&
                Objects.equals(getMinLength(), that.getMinLength()) &&
                Objects.equals(exclusiveMinimum, that.exclusiveMinimum) &&
                Objects.equals(exclusiveMaximum, that.exclusiveMaximum) &&
                Objects.equals(getMinimum(), that.getMinimum()) &&
                Objects.equals(getMaximum(), that.getMaximum()) &&
                Objects.equals(getPattern(), that.getPattern()) &&
                Objects.equals(getMultipleOf(), that.getMultipleOf());

    }

    // use content.mediaType.schema.getContains instead of this
    @Override
    public CodegenProperty getContains() {
        return null;
    }

    // use content.mediaType.schema.setContains instead of this
    @Override
    public void setContains(CodegenProperty contains) {
    }

    // use content.mediaType.schema.getDependentRequired instead of this
    @Override
    public LinkedHashMap<String, List<String>> getDependentRequired() {
        return null;
    }

    // use content.mediaType.schema.setDependentRequired instead of this
    @Override
    public void setDependentRequired(LinkedHashMap<String, List<String>> dependentRequired) {
    }

    // use content.mediaType.schema.getIsBooleanSchemaTrue instead of this
    @Override
    public boolean getIsBooleanSchemaTrue() {
        return false;
    }

    // use content.mediaType.schema.setIsBooleanSchemaTrue instead of this
    @Override
    public void setIsBooleanSchemaTrue(boolean isBooleanSchemaTrue) {
    }

    // use content.mediaType.schema.getIsBooleanSchemaFalse instead of this
    @Override
    public boolean getIsBooleanSchemaFalse() {
        return false;
    }

    // use content.mediaType.schema.setIsBooleanSchemaFalse instead of this
    @Override
    public void setIsBooleanSchemaFalse(boolean isBooleanSchemaFalse) {
    }

    // use content.mediaType.schema.getFormat instead of this
    @Override
    public String getFormat() {
        return null;
    }

    // use content.mediaType.schema.setFormat instead of this
    @Override
    public void setFormat(String format) {
    }

    @Override
    public String getPattern() {
        return pattern;
    }

    @Override
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String getMaximum() {
        return maximum;
    }

    @Override
    public void setMaximum(String maximum) {
        this.maximum = maximum;
    }

    @Override
    public String getMinimum() {
        return minimum;
    }

    @Override
    public void setMinimum(String minimum) {
        this.minimum = minimum;
    }

    @Override
    public boolean getExclusiveMaximum() {
        return exclusiveMaximum;
    }

    @Override
    public void setExclusiveMaximum(boolean exclusiveMaximum) {
        this.exclusiveMaximum = exclusiveMaximum;
    }

    @Override
    public boolean getExclusiveMinimum() {
        return exclusiveMinimum;
    }

    @Override
    public void setExclusiveMinimum(boolean exclusiveMinimum) {
        this.exclusiveMinimum = exclusiveMinimum;
    }

    @Override
    public Integer getMinLength() {
        return minLength;
    }

    @Override
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    @Override
    public Integer getMaxLength() {
        return maxLength;
    }

    @Override
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Integer getMinItems() {
        return minItems;
    }

    @Override
    public void setMinItems(Integer minItems) {
        this.minItems = minItems;
    }

    @Override
    public Integer getMaxItems() {
        return maxItems;
    }

    @Override
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    @Override
    public boolean getUniqueItems() {
        return uniqueItems;
    }

    @Override
    public void setUniqueItems(boolean uniqueItems) {
        this.uniqueItems = uniqueItems;
    }

    @Override
    public Boolean getUniqueItemsBoolean() {
        return uniqueItemsBoolean;
    }

    @Override
    public void setUniqueItemsBoolean(Boolean uniqueItemsBoolean) {
        this.uniqueItemsBoolean = uniqueItemsBoolean;
    }


    @Override
    public Integer getMinProperties() {
        return minProperties;
    }

    @Override
    public void setMinProperties(Integer minProperties) {
        this.minProperties = minProperties;
    }

    @Override
    public Integer getMaxProperties() {
        return maxProperties;
    }

    @Override
    public void setMaxProperties(Integer maxProperties) {
        this.maxProperties = maxProperties;
    }

    @Override
    public Number getMultipleOf() {
        return multipleOf;
    }

    @Override
    public void setMultipleOf(Number multipleOf) {
        this.multipleOf = multipleOf;
    }

    @Override
    public CodegenProperty getItems() {
        return items;
    }

    @Override
    public void setItems(CodegenProperty items) {
        this.items = items;
    }

    @Override
    public boolean getIsModel() {
        return isModel;
    }

    @Override
    public boolean getIsArray() {
        return isArray;
    }

    @Override
    public void setIsArray(boolean isArray) {
        this.isArray = isArray;
    }

    @Override
    public boolean getIsShort() {
        return isShort;
    }

    @Override
    public void setIsShort(boolean isShort) {
        this.isShort = isShort;
    }

    @Override
    public boolean getIsBoolean() {
        return isBoolean;
    }

    @Override
    public void setIsBoolean(boolean isBoolean) {
        this.isBoolean = isBoolean;
    }

    @Override
    public boolean getIsUnboundedInteger() {
        return isUnboundedInteger;
    }

    @Override
    public void setIsUnboundedInteger(boolean isUnboundedInteger) {
        this.isUnboundedInteger = isUnboundedInteger;
    }

    @Override
    public boolean getIsPrimitiveType() {
        return primitiveType;
    }

    @Override
    public void setIsPrimitiveType(boolean isPrimitiveType) {
        this.primitiveType = isPrimitiveType;
    }

    @Override
    public void setIsModel(boolean isModel) {
        this.isModel = isModel;
    }

    @Override
    public boolean getIsDate() {
        return isDate;
    }

    @Override
    public void setIsDate(boolean isDate) {
        this.isDate = isDate;
    }

    @Override
    public boolean getIsDateTime() {
        return isDateTime;
    }

    @Override
    public void setIsDateTime(boolean isDateTime) {
        this.isDateTime = isDateTime;
    }

    @Override
    public boolean getIsMap() {
        return isMap;
    }

    @Override
    public void setIsMap(boolean isMap) {
        this.isMap = isMap;
    }

    @Override
    public boolean getIsOptional() {
        return isOptional;
    }

    @Override
    public void setIsOptional(boolean isOptional) {
        this.isOptional = isOptional;
    }

    @Override
    public CodegenProperty getAdditionalProperties() {
        return additionalProperties;
    }

    @Override
    public void setAdditionalProperties(CodegenProperty additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public List<CodegenProperty> getVars() {
        return vars;
    }

    @Override
    public void setVars(List<CodegenProperty> vars) {
        this.vars = vars;
    }

    @Override
    public List<CodegenProperty> getRequiredVars() {
        return requiredVars;
    }

    @Override
    public void setRequiredVars(List<CodegenProperty> requiredVars) {
        this.requiredVars = requiredVars;
    }

    @Override
    public boolean getHasRequired() {
        return this.hasRequired;
    }

    @Override
    public void setHasRequired(boolean hasRequired) {
        this.hasRequired = hasRequired;
    }

    @Override
    public boolean getIsUuid() {
        return isUuid;
    }

    @Override
    public void setIsUuid(boolean isUuid) {
        this.isUuid = isUuid;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CodegenResponse{");
        sb.append("headers=").append(headers);
        sb.append(", code='").append(code).append('\'');
        sb.append(", is1xx='").append(is1xx).append('\'');
        sb.append(", is2xx='").append(is2xx).append('\'');
        sb.append(", is3xx='").append(is3xx).append('\'');
        sb.append(", is4xx='").append(is4xx).append('\'');
        sb.append(", is5xx='").append(is5xx).append('\'');
        sb.append(", message='").append(message).append('\'');
        sb.append(", examples=").append(examples);
        sb.append(", dataType='").append(dataType).append('\'');
        sb.append(", baseType='").append(baseType).append('\'');
        sb.append(", containerType='").append(containerType).append('\'');
        sb.append(", containerTypeMapped='").append(containerTypeMapped).append('\'');
        sb.append(", hasHeaders=").append(hasHeaders);
        sb.append(", isString=").append(isString);
        sb.append(", isNumeric=").append(isNumeric);
        sb.append(", isInteger=").append(isInteger);
        sb.append(", isShort=").append(isShort);
        sb.append(", isLong=").append(isLong);
        sb.append(", isUnboundedInteger=").append(isUnboundedInteger);
        sb.append(", isNumber=").append(isNumber);
        sb.append(", isFloat=").append(isFloat);
        sb.append(", isDouble=").append(isDouble);
        sb.append(", isDecimal=").append(isDecimal);
        sb.append(", isByteArray=").append(isByteArray);
        sb.append(", isBoolean=").append(isBoolean);
        sb.append(", isDate=").append(isDate);
        sb.append(", isDateTime=").append(isDateTime);
        sb.append(", isUuid=").append(isUuid);
        sb.append(", isEmail=").append(isEmail);
        sb.append(", isPassword=").append(isPassword);
        sb.append(", isModel=").append(isModel);
        sb.append(", isFreeFormObject=").append(isFreeFormObject);
        sb.append(", isAnyType=").append(isAnyType);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", simpleType=").append(simpleType);
        sb.append(", primitiveType=").append(primitiveType);
        sb.append(", isMap=").append(isMap);
        sb.append(", isOptional=").append(isOptional);
        sb.append(", isArray=").append(isArray);
        sb.append(", isBinary=").append(isBinary);
        sb.append(", isFile=").append(isFile);
        sb.append(", schema=").append(schema);
        sb.append(", jsonSchema='").append(jsonSchema).append('\'');
        sb.append(", vendorExtensions=").append(vendorExtensions);
        sb.append(", maxProperties=").append(maxProperties);
        sb.append(", minProperties=").append(minProperties);
        sb.append(", uniqueItems=").append(uniqueItems);
        sb.append(", uniqueItemsBoolean=").append(uniqueItemsBoolean);
        sb.append(", maxItems=").append(maxItems);
        sb.append(", minItems=").append(minItems);
        sb.append(", maxLength=").append(maxLength);
        sb.append(", minLength=").append(minLength);
        sb.append(", exclusiveMinimum=").append(exclusiveMinimum);
        sb.append(", exclusiveMaximum=").append(exclusiveMaximum);
        sb.append(", minimum='").append(minimum).append('\'');
        sb.append(", maximum='").append(maximum).append('\'');
        sb.append(", pattern='").append(pattern).append('\'');
        sb.append(", multipleOf='").append(multipleOf).append('\'');
        sb.append(", items='").append(items).append('\'');
        sb.append(", additionalProperties='").append(additionalProperties).append('\'');
        sb.append(", vars='").append(vars).append('\'');
        sb.append(", requiredVars='").append(requiredVars).append('\'');
        sb.append(", isNull='").append(isNull);
        sb.append(", isVoid='").append(isVoid);
        sb.append(", hasValidation='").append(hasValidation);
        sb.append(", getAdditionalPropertiesIsAnyType=").append(additionalPropertiesIsAnyType);
        sb.append(", getHasVars=").append(hasVars);
        sb.append(", getHasRequired=").append(hasRequired);
        sb.append(", getHasDiscriminatorWithNonEmptyMapping=").append(hasDiscriminatorWithNonEmptyMapping);
        sb.append(", composedSchemas=").append(composedSchemas);
        sb.append(", hasMultipleTypes=").append(hasMultipleTypes);
        sb.append(", responseHeaders=").append(responseHeaders);
        sb.append(", content=").append(content);
        sb.append(", requiredVarsMap=").append(requiredVarsMap);
        sb.append(", ref=").append(ref);
        sb.append(", schemaIsFromAdditionalProperties=").append(schemaIsFromAdditionalProperties);
        sb.append('}');
        return sb.toString();
    }

    // this is used in templates. Do not remove it.
    @SuppressWarnings("unused")
    public boolean isWildcard() {
        return "0".equals(code) || "default".equals(code);
    }

    /*
     * Boolean value indicating whether the status code is a range
     *
     * @return True if the status code is a range (e.g. 2XX)
     */
    public boolean isRange() {
        if (code != null && code.length() == 3 && "XX".equalsIgnoreCase(code.substring(1)))
            return true;
        return false;
    }

    @Override
    public boolean getIsNull() {
        return isNull;
    }

    @Override
    public void setIsNull(boolean isNull) {
        this.isNull = isNull;
    }

    @Override
    public boolean getIsVoid() {
        return isVoid;
    }

    @Override
    public void setIsVoid(boolean isVoid) {
        this.isVoid = isVoid;
    }

    @Override
    public boolean getHasValidation() {
        return hasValidation;
    }

    @Override
    public void setHasValidation(boolean hasValidation) {
        this.hasValidation = hasValidation;
    }

    @Override
    public boolean getAdditionalPropertiesIsAnyType() {
        return additionalPropertiesIsAnyType;
    }

    @Override
    public void setAdditionalPropertiesIsAnyType(boolean additionalPropertiesIsAnyType) {
        this.additionalPropertiesIsAnyType = additionalPropertiesIsAnyType;
    }

    @Override
    public boolean getHasVars() {
        return this.hasVars;
    }

    @Override
    public void setHasVars(boolean hasVars) {
        this.hasVars = hasVars;
    }

    @Override
    public boolean getHasDiscriminatorWithNonEmptyMapping() {
        return hasDiscriminatorWithNonEmptyMapping;
    }

    @Override
    public void setHasDiscriminatorWithNonEmptyMapping(boolean hasDiscriminatorWithNonEmptyMapping) {
        this.hasDiscriminatorWithNonEmptyMapping = hasDiscriminatorWithNonEmptyMapping;
    }

    @Override
    public boolean getIsString() {
        return isString;
    }

    @Override
    public void setIsString(boolean isString) {
        this.isString = isString;
    }

    @Override
    public boolean getIsNumber() {
        return isNumber;
    }

    @Override
    public void setIsNumber(boolean isNumber) {
        this.isNumber = isNumber;
    }

    @Override
    public boolean getIsAnyType() {
        return isAnyType;
    }

    @Override
    public void setIsAnyType(boolean isAnyType) {
        this.isAnyType = isAnyType;
    }

    @Override
    public boolean getIsFreeFormObject() {
        return isFreeFormObject;
    }

    @Override
    public void setIsFreeFormObject(boolean isFreeFormObject) {
        this.isFreeFormObject = isFreeFormObject;
    }

    @Override
    public void setComposedSchemas(CodegenComposedSchemas composedSchemas) {
        this.composedSchemas = composedSchemas;
    }

    @Override
    public CodegenComposedSchemas getComposedSchemas() {
        return composedSchemas;
    }

    @Override
    public boolean getHasMultipleTypes() {
        return hasMultipleTypes;
    }

    @Override
    public void setHasMultipleTypes(boolean hasMultipleTypes) {
        this.hasMultipleTypes = hasMultipleTypes;
    }

    @Override
    public String getBaseType() {
        return baseType;
    }

    @Override
    public Map<String, CodegenProperty> getRequiredVarsMap() {
        return requiredVarsMap;
    }

    @Override
    public void setRequiredVarsMap(Map<String, CodegenProperty> requiredVarsMap) {
        this.requiredVarsMap = requiredVarsMap;
    }

    @Override
    public String getRef() {
        return ref;
    }

    @Override
    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public boolean getSchemaIsFromAdditionalProperties() {
        return schemaIsFromAdditionalProperties;
    }

    @Override
    public void setSchemaIsFromAdditionalProperties(boolean schemaIsFromAdditionalProperties) {
        this.schemaIsFromAdditionalProperties = schemaIsFromAdditionalProperties;
    }

    @Override
    public String getDataType() {
        return dataType;
    }

    @Override
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public boolean getIsFloat() {
        return isFloat;
    }

    @Override
    public void setIsFloat(boolean isFloat) {
        this.isFloat = isFloat;
    }

    @Override
    public boolean getIsDouble() {
        return isDouble;
    }

    @Override
    public void setIsDouble(boolean isDouble) {
        this.isDouble = isDouble;
    }

    @Override
    public boolean getIsInteger() {
        return isInteger;
    }

    @Override
    public void setIsInteger(boolean isInteger) {
        this.isInteger = isInteger;
    }

    @Override
    public boolean getIsLong() {
        return isLong;
    }

    @Override
    public void setIsLong(boolean isLong) {
        this.isLong = isLong;
    }

    @Override
    public boolean getIsBinary() {
        return isBinary;
    }

    @Override
    public void setIsBinary(boolean isBinary) {
        this.isBinary = isBinary;
    }

    @Override
    public boolean getIsByteArray() {
        return isByteArray;
    }

    @Override
    public void setIsByteArray(boolean isByteArray) {
        this.isByteArray = isByteArray;
    }

    @Override
    public boolean getIsDecimal() {
        return isDecimal;
    }

    @Override
    public void setIsDecimal(boolean isDecimal) {
        this.isDecimal = isDecimal;
    }

    @Override
    public boolean getIsEnum() {
        return false;
    }

    @Override
    public void setIsEnum(boolean isEnum) {
    }
}
