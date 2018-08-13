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
 * Model definition for UserResponseFields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the megan. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UserResponseFields extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("calculated_field_test")
  private java.lang.String calculatedFieldTest;

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
  @com.google.api.client.util.Key("join_date")
  private java.lang.String joinDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("last_online_datetime")
  private java.lang.String lastOnlineDatetime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nickname;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCalculatedFieldTest() {
    return calculatedFieldTest;
  }

  /**
   * @param calculatedFieldTest calculatedFieldTest or {@code null} for none
   */
  public UserResponseFields setCalculatedFieldTest(java.lang.String calculatedFieldTest) {
    this.calculatedFieldTest = calculatedFieldTest;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsStrokee() {
    return isStrokee;
  }

  /**
   * @param isStrokee isStrokee or {@code null} for none
   */
  public UserResponseFields setIsStrokee(java.lang.Boolean isStrokee) {
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
  public UserResponseFields setIsStroker(java.lang.Boolean isStroker) {
    this.isStroker = isStroker;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getJoinDate() {
    return joinDate;
  }

  /**
   * @param joinDate joinDate or {@code null} for none
   */
  public UserResponseFields setJoinDate(java.lang.String joinDate) {
    this.joinDate = joinDate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLastOnlineDatetime() {
    return lastOnlineDatetime;
  }

  /**
   * @param lastOnlineDatetime lastOnlineDatetime or {@code null} for none
   */
  public UserResponseFields setLastOnlineDatetime(java.lang.String lastOnlineDatetime) {
    this.lastOnlineDatetime = lastOnlineDatetime;
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
  public UserResponseFields setNickname(java.lang.String nickname) {
    this.nickname = nickname;
    return this;
  }

  @Override
  public UserResponseFields set(String fieldName, Object value) {
    return (UserResponseFields) super.set(fieldName, value);
  }

  @Override
  public UserResponseFields clone() {
    return (UserResponseFields) super.clone();
  }

}
