/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.brain.core;

public class Contact {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Contact(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Contact obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ContactWrapperJNI.delete_Contact(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Contact(String uuid, SWIGTYPE_p_FieldList fields, SWIGTYPE_p_CardList cards, String phoneBookUuid, SWIGTYPE_p_StringList groupNames) {
    this(ContactWrapperJNI.new_Contact__SWIG_0(uuid, SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_CardList.getCPtr(cards), phoneBookUuid, SWIGTYPE_p_StringList.getCPtr(groupNames)), true);
  }

  public Contact(SWIGTYPE_p_FieldList fields, SWIGTYPE_p_CardList cards, String phoneBookUuid, SWIGTYPE_p_StringList groupNames) {
    this(ContactWrapperJNI.new_Contact__SWIG_1(SWIGTYPE_p_FieldList.getCPtr(fields), SWIGTYPE_p_CardList.getCPtr(cards), phoneBookUuid, SWIGTYPE_p_StringList.getCPtr(groupNames)), true);
  }

  public Contact() {
    this(ContactWrapperJNI.new_Contact__SWIG_2(), true);
  }

  public SWIGTYPE_p_StringList conflicts() {
    return new SWIGTYPE_p_StringList(ContactWrapperJNI.Contact_conflicts(swigCPtr, this), false);
  }

  public void conflictsRemove(String conflict) {
    ContactWrapperJNI.Contact_conflictsRemove(swigCPtr, this, conflict);
  }

  public void conflictsAdd(String conflict) {
    ContactWrapperJNI.Contact_conflictsAdd__SWIG_0(swigCPtr, this, conflict);
  }

  public void conflictsAdd(SWIGTYPE_p_StringList conflicts) {
    ContactWrapperJNI.Contact_conflictsAdd__SWIG_1(swigCPtr, this, SWIGTYPE_p_StringList.getCPtr(conflicts));
  }

  public String pathToAvatar() {
    return ContactWrapperJNI.Contact_pathToAvatar(swigCPtr, this);
  }

  public void setPathToAvatar(String path) {
    ContactWrapperJNI.Contact_setPathToAvatar(swigCPtr, this, path);
  }

  public SWIGTYPE_p_CardList cards() {
    return new SWIGTYPE_p_CardList(ContactWrapperJNI.Contact_cards(swigCPtr, this), false);
  }

  public void addCards(SWIGTYPE_p_CardList other) {
    ContactWrapperJNI.Contact_addCards(swigCPtr, this, SWIGTYPE_p_CardList.getCPtr(other));
  }

  public void addCard(SWIGTYPE_p_CardPtr card) {
    ContactWrapperJNI.Contact_addCard(swigCPtr, this, SWIGTYPE_p_CardPtr.getCPtr(card));
  }

  public void clearCards() {
    ContactWrapperJNI.Contact_clearCards(swigCPtr, this);
  }

  public void removeCards(SWIGTYPE_p_CardPtr other) {
    ContactWrapperJNI.Contact_removeCards(swigCPtr, this, SWIGTYPE_p_CardPtr.getCPtr(other));
  }

  public void setMergedInUuid(String uuid) {
    ContactWrapperJNI.Contact_setMergedInUuid(swigCPtr, this, uuid);
  }

  public String mergedInUuid() {
    return ContactWrapperJNI.Contact_mergedInUuid(swigCPtr, this);
  }

  public void mergedWithUuidsAdd(String uuid) {
    ContactWrapperJNI.Contact_mergedWithUuidsAdd(swigCPtr, this, uuid);
  }

  public SWIGTYPE_p_StringList mergedWithUuids() {
    return new SWIGTYPE_p_StringList(ContactWrapperJNI.Contact_mergedWithUuids(swigCPtr, this), false);
  }

  public SWIGTYPE_p_StringList groupNames() {
    return new SWIGTYPE_p_StringList(ContactWrapperJNI.Contact_groupNames(swigCPtr, this), false);
  }

  public void groupNamesAdd(SWIGTYPE_p_StringList other) {
    ContactWrapperJNI.Contact_groupNamesAdd(swigCPtr, this, SWIGTYPE_p_StringList.getCPtr(other));
  }

  public void addGroupName(String name) {
    ContactWrapperJNI.Contact_addGroupName(swigCPtr, this, name);
  }

  public void setRetail(boolean val) {
    ContactWrapperJNI.Contact_setRetail(swigCPtr, this, val);
  }

  public boolean retail() {
    return ContactWrapperJNI.Contact_retail(swigCPtr, this);
  }

  public void setPhoneBookUuid(String uuid) {
    ContactWrapperJNI.Contact_setPhoneBookUuid(swigCPtr, this, uuid);
  }

  public String phoneBookUuid() {
    return ContactWrapperJNI.Contact_phoneBookUuid(swigCPtr, this);
  }

  public void sharedCardsUuidAdd(SWIGTYPE_p_StringList other) {
    ContactWrapperJNI.Contact_sharedCardsUuidAdd(swigCPtr, this, SWIGTYPE_p_StringList.getCPtr(other));
  }

  public SWIGTYPE_p_StringList sharedCardsUuid() {
    return new SWIGTYPE_p_StringList(ContactWrapperJNI.Contact_sharedCardsUuid(swigCPtr, this), false);
  }

  public String createdDate() {
    return ContactWrapperJNI.Contact_createdDate(swigCPtr, this);
  }

  public void setCreatedDate(String val) {
    ContactWrapperJNI.Contact_setCreatedDate(swigCPtr, this, val);
  }

  public String longitude() {
    return ContactWrapperJNI.Contact_longitude(swigCPtr, this);
  }

  public void setLongitude(String val) {
    ContactWrapperJNI.Contact_setLongitude(swigCPtr, this, val);
  }

  public String latitude() {
    return ContactWrapperJNI.Contact_latitude(swigCPtr, this);
  }

  public void setLatitude(String val) {
    ContactWrapperJNI.Contact_setLatitude(swigCPtr, this, val);
  }

  public SWIGTYPE_p_ProfileList potentialMatchProfiles() {
    return new SWIGTYPE_p_ProfileList(ContactWrapperJNI.Contact_potentialMatchProfiles(swigCPtr, this), false);
  }

  public void potentialMatchProfilesRemove(SWIGTYPE_p_ProfilePtr p) {
    ContactWrapperJNI.Contact_potentialMatchProfilesRemove(swigCPtr, this, SWIGTYPE_p_ProfilePtr.getCPtr(p));
  }

  public void potentialMatchProfilesAdd(SWIGTYPE_p_ProfileList other) {
    ContactWrapperJNI.Contact_potentialMatchProfilesAdd(swigCPtr, this, SWIGTYPE_p_ProfileList.getCPtr(other));
  }

  public void setCloudVerified(boolean val) {
    ContactWrapperJNI.Contact_setCloudVerified(swigCPtr, this, val);
  }

  public boolean cloudVerified() {
    return ContactWrapperJNI.Contact_cloudVerified(swigCPtr, this);
  }

  public SWIGTYPE_p_std__unordered_mapT_std__string_StringList_t potentialVars() {
    return new SWIGTYPE_p_std__unordered_mapT_std__string_StringList_t(ContactWrapperJNI.Contact_potentialVars(swigCPtr, this), false);
  }

  public void potentialVarsRemove(String key) {
    ContactWrapperJNI.Contact_potentialVarsRemove(swigCPtr, this, key);
  }

  public void setPotentialVars(SWIGTYPE_p_std__unordered_mapT_std__string_StringList_t o) {
    ContactWrapperJNI.Contact_setPotentialVars(swigCPtr, this, SWIGTYPE_p_std__unordered_mapT_std__string_StringList_t.getCPtr(o));
  }

  public void potentialVarsAdd(String key, String uuid) {
    ContactWrapperJNI.Contact_potentialVarsAdd(swigCPtr, this, key, uuid);
  }

  public void setName(String name) {
    ContactWrapperJNI.Contact_setName(swigCPtr, this, name);
  }

  public String name() {
    return ContactWrapperJNI.Contact_name(swigCPtr, this);
  }

  public void setAccountType(String accountType) {
    ContactWrapperJNI.Contact_setAccountType(swigCPtr, this, accountType);
  }

  public void setPublicKey(String publicKey) {
    ContactWrapperJNI.Contact_setPublicKey(swigCPtr, this, publicKey);
  }

  public void setProfileUuid(String profileUuid) {
    ContactWrapperJNI.Contact_setProfileUuid(swigCPtr, this, profileUuid);
  }

  public SWIGTYPE_p_StringList ignoredMatchProfileUuids() {
    return new SWIGTYPE_p_StringList(ContactWrapperJNI.Contact_ignoredMatchProfileUuids(swigCPtr, this), false);
  }

  public void setBackupId(String id) {
    ContactWrapperJNI.Contact_setBackupId(swigCPtr, this, id);
  }

  public String backupId() {
    return ContactWrapperJNI.Contact_backupId(swigCPtr, this);
  }

  public String calculateModelHash() {
    return ContactWrapperJNI.Contact_calculateModelHash(swigCPtr, this);
  }

  public String toJson() {
    return ContactWrapperJNI.Contact_toJson(swigCPtr, this);
  }

  public SWIGTYPE_p_json11__Json toJsonObj() {
    return new SWIGTYPE_p_json11__Json(ContactWrapperJNI.Contact_toJsonObj(swigCPtr, this), true);
  }

  public static SWIGTYPE_p_std__shared_ptrT_Contact_t build() {
    return new SWIGTYPE_p_std__shared_ptrT_Contact_t(ContactWrapperJNI.Contact_build(), true);
  }

  public static SWIGTYPE_p_std__shared_ptrT_Contact_t fromJson(String jsonString) {
    return new SWIGTYPE_p_std__shared_ptrT_Contact_t(ContactWrapperJNI.Contact_fromJson__SWIG_0(jsonString), true);
  }

  public static SWIGTYPE_p_std__shared_ptrT_Contact_t fromJson(SWIGTYPE_p_json11__Json jsonObj) {
    return new SWIGTYPE_p_std__shared_ptrT_Contact_t(ContactWrapperJNI.Contact_fromJson__SWIG_1(SWIGTYPE_p_json11__Json.getCPtr(jsonObj)), true);
  }

  public void setImportStatus(String importStatus) {
    ContactWrapperJNI.Contact_setImportStatus(swigCPtr, this, importStatus);
  }

  public String importStatus() {
    return ContactWrapperJNI.Contact_importStatus(swigCPtr, this);
  }

  public static boolean contains(SWIGTYPE_p_std__listT_std__shared_ptrT_Contact_t_t items, SWIGTYPE_p_std__shared_ptrT_Contact_t item) {
    return ContactWrapperJNI.Contact_contains(SWIGTYPE_p_std__listT_std__shared_ptrT_Contact_t_t.getCPtr(items), SWIGTYPE_p_std__shared_ptrT_Contact_t.getCPtr(item));
  }

  public static void remove(SWIGTYPE_p_std__shared_ptrT_Contact_t contact, SWIGTYPE_p_FieldList fieldsToRemove) {
    ContactWrapperJNI.Contact_remove__SWIG_0(SWIGTYPE_p_std__shared_ptrT_Contact_t.getCPtr(contact), SWIGTYPE_p_FieldList.getCPtr(fieldsToRemove));
  }

  public static boolean remove(SWIGTYPE_p_std__shared_ptrT_Contact_t field, SWIGTYPE_p_FieldPtr fieldToRemove) {
    return ContactWrapperJNI.Contact_remove__SWIG_1(SWIGTYPE_p_std__shared_ptrT_Contact_t.getCPtr(field), SWIGTYPE_p_FieldPtr.getCPtr(fieldToRemove));
  }

  public SWIGTYPE_p_FieldList allFields() {
    return new SWIGTYPE_p_FieldList(ContactWrapperJNI.Contact_allFields(swigCPtr, this), true);
  }

}