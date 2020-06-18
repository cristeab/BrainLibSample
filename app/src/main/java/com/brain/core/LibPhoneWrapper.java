/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brain.core;

public class LibPhoneWrapper {
  public static boolean isPhoneValid(String ph) {
    return LibPhoneWrapperJNI.isPhoneValid(ph);
  }

  public static boolean hasCountryCode(String phone) {
    return LibPhoneWrapperJNI.hasCountryCode(phone);
  }

  public static String formatE164(String phone) {
    return LibPhoneWrapperJNI.formatE164(phone);
  }

  public static boolean isFixedLineValid(String ph) {
    return LibPhoneWrapperJNI.isFixedLineValid(ph);
  }

  public static boolean isMobilePhoneValid(String ph) {
    return LibPhoneWrapperJNI.isMobilePhoneValid(ph);
  }

  public static boolean validateMobilePhone(String ph) {
    return LibPhoneWrapperJNI.validateMobilePhone(ph);
  }

  public static String getWithoutCode(String phone) {
    return LibPhoneWrapperJNI.getWithoutCode(phone);
  }

  public static String getCountryCode(String phone) {
    return LibPhoneWrapperJNI.getCountryCode(phone);
  }

}