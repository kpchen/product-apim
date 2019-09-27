/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicationKeyGenerateRequestDTO
 */

public class ApplicationKeyGenerateRequestDTO {
  /**
   * Gets or Sets keyType
   */
  @JsonAdapter(KeyTypeEnum.Adapter.class)
  public enum KeyTypeEnum {
    PRODUCTION("PRODUCTION"),
    
    SANDBOX("SANDBOX");

    private String value;

    KeyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyTypeEnum fromValue(String text) {
      for (KeyTypeEnum b : KeyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KeyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("keyType")
  private KeyTypeEnum keyType = null;

  @SerializedName("grantTypesToBeSupported")
  private List<String> grantTypesToBeSupported = new ArrayList<>();

  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  @SerializedName("scopes")
  private List<String> scopes = null;

  @SerializedName("validityTime")
  private String validityTime = null;

  @SerializedName("clientId")
  private String clientId = null;

  @SerializedName("clientSecret")
  private String clientSecret = null;

  public ApplicationKeyGenerateRequestDTO keyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
    return this;
  }

   /**
   * Get keyType
   * @return keyType
  **/
  @ApiModelProperty(required = true, value = "")
  public KeyTypeEnum getKeyType() {
    return keyType;
  }

  public void setKeyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
  }

  public ApplicationKeyGenerateRequestDTO grantTypesToBeSupported(List<String> grantTypesToBeSupported) {
    this.grantTypesToBeSupported = grantTypesToBeSupported;
    return this;
  }

  public ApplicationKeyGenerateRequestDTO addGrantTypesToBeSupportedItem(String grantTypesToBeSupportedItem) {
    this.grantTypesToBeSupported.add(grantTypesToBeSupportedItem);
    return this;
  }

   /**
   * Grant types that should be supported by the application
   * @return grantTypesToBeSupported
  **/
  @ApiModelProperty(required = true, value = "Grant types that should be supported by the application")
  public List<String> getGrantTypesToBeSupported() {
    return grantTypesToBeSupported;
  }

  public void setGrantTypesToBeSupported(List<String> grantTypesToBeSupported) {
    this.grantTypesToBeSupported = grantTypesToBeSupported;
  }

  public ApplicationKeyGenerateRequestDTO callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Callback URL
   * @return callbackUrl
  **/
  @ApiModelProperty(value = "Callback URL")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public ApplicationKeyGenerateRequestDTO scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public ApplicationKeyGenerateRequestDTO addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Allowed scopes for the access token
   * @return scopes
  **/
  @ApiModelProperty(example = "[\"am_application_scope\",\"default\"]", value = "Allowed scopes for the access token")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public ApplicationKeyGenerateRequestDTO validityTime(String validityTime) {
    this.validityTime = validityTime;
    return this;
  }

   /**
   * Get validityTime
   * @return validityTime
  **/
  @ApiModelProperty(example = "3600", value = "")
  public String getValidityTime() {
    return validityTime;
  }

  public void setValidityTime(String validityTime) {
    this.validityTime = validityTime;
  }

  public ApplicationKeyGenerateRequestDTO clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client ID for generating access token.
   * @return clientId
  **/
  @ApiModelProperty(example = "", value = "Client ID for generating access token.")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ApplicationKeyGenerateRequestDTO clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client secret for generating access token. This is given together with the client Id.
   * @return clientSecret
  **/
  @ApiModelProperty(example = "", value = "Client secret for generating access token. This is given together with the client Id.")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyGenerateRequestDTO applicationKeyGenerateRequest = (ApplicationKeyGenerateRequestDTO) o;
    return Objects.equals(this.keyType, applicationKeyGenerateRequest.keyType) &&
        Objects.equals(this.grantTypesToBeSupported, applicationKeyGenerateRequest.grantTypesToBeSupported) &&
        Objects.equals(this.callbackUrl, applicationKeyGenerateRequest.callbackUrl) &&
        Objects.equals(this.scopes, applicationKeyGenerateRequest.scopes) &&
        Objects.equals(this.validityTime, applicationKeyGenerateRequest.validityTime) &&
        Objects.equals(this.clientId, applicationKeyGenerateRequest.clientId) &&
        Objects.equals(this.clientSecret, applicationKeyGenerateRequest.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyType, grantTypesToBeSupported, callbackUrl, scopes, validityTime, clientId, clientSecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyGenerateRequestDTO {\n");
    
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    grantTypesToBeSupported: ").append(toIndentedString(grantTypesToBeSupported)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    validityTime: ").append(toIndentedString(validityTime)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

