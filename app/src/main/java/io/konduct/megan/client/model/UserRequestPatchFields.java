/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2018-05-04 17:28:03 UTC)
 * on 2018-07-28 at 15:40:54 UTC 
 * Modify at your own risk.
 */

package io.konduct.megan.client.model;

/**
 * Model definition for UserRequestPatchFields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the megan. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserRequestPatchFields extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_strokee")
  private java.lang.Boolean isStrokee;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("is_stroker")
  private java.lang.Boolean isStroker;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nickname;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsStrokee() {
    return isStrokee;
  }

  /**
   * @param isStrokee isStrokee or {@code null} for none
   */
  public UserRequestPatchFields setIsStrokee(java.lang.Boolean isStrokee) {
    this.isStrokee = isStrokee;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsStroker() {
    return isStroker;
  }

  /**
   * @param isStroker isStroker or {@code null} for none
   */
  public UserRequestPatchFields setIsStroker(java.lang.Boolean isStroker) {
    this.isStroker = isStroker;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getNickname() {
    return nickname;
  }

  /**
   * @param nickname nickname or {@code null} for none
   */
  public UserRequestPatchFields setNickname(java.lang.String nickname) {
    this.nickname = nickname;
    return this;
  }

  @Override
  public UserRequestPatchFields set(String fieldName, Object value) {
    return (UserRequestPatchFields) super.set(fieldName, value);
  }

  @Override
  public UserRequestPatchFields clone() {
    return (UserRequestPatchFields) super.clone();
  }

}
