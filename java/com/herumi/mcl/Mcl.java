/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.herumi.mcl;

public class Mcl {
  public static SWIGTYPE_p_bool new_p_bool() {
    long cPtr = MclJNI.new_p_bool();
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public static SWIGTYPE_p_bool copy_p_bool(boolean value) {
    long cPtr = MclJNI.copy_p_bool(value);
    return (cPtr == 0) ? null : new SWIGTYPE_p_bool(cPtr, false);
  }

  public static void delete_p_bool(SWIGTYPE_p_bool obj) {
    MclJNI.delete_p_bool(SWIGTYPE_p_bool.getCPtr(obj));
  }

  public static void p_bool_assign(SWIGTYPE_p_bool obj, boolean value) {
    MclJNI.p_bool_assign(SWIGTYPE_p_bool.getCPtr(obj), value);
  }

  public static boolean p_bool_value(SWIGTYPE_p_bool obj) {
    return MclJNI.p_bool_value(SWIGTYPE_p_bool.getCPtr(obj));
  }

  public static void SystemInit(String param) {
    MclJNI.SystemInit(param);
  }

}
