package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Entity_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.Boolean getIsActive(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isActive;
  }-*/;
  
  private static native void setIsActive(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isActive = value;
  }-*/;
  
  private static native java.lang.Boolean getIsDeleted(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isDeleted;
  }-*/;
  
  private static native void setIsDeleted(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isDeleted = value;
  }-*/;
  
  private static native boolean getIsDirty(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isDirty;
  }-*/;
  
  private static native void setIsDirty(org.broadleafcommerce.openadmin.client.dto.Entity instance, boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isDirty = value;
  }-*/;
  
  private static native java.lang.Boolean getIsInactive(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isInactive;
  }-*/;
  
  private static native void setIsInactive(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isInactive = value;
  }-*/;
  
  private static native java.lang.Boolean getIsLocked(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isLocked;
  }-*/;
  
  private static native void setIsLocked(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isLocked = value;
  }-*/;
  
  private static native boolean getIsValidationFailure(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isValidationFailure;
  }-*/;
  
  private static native void setIsValidationFailure(org.broadleafcommerce.openadmin.client.dto.Entity instance, boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::isValidationFailure = value;
  }-*/;
  
  private static native java.lang.String getLockedBy(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::lockedBy;
  }-*/;
  
  private static native void setLockedBy(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::lockedBy = value;
  }-*/;
  
  private static native java.lang.String getLockedDate(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::lockedDate;
  }-*/;
  
  private static native void setLockedDate(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::lockedDate = value;
  }-*/;
  
  private static native boolean getMultiPartAvailableOnThread(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::multiPartAvailableOnThread;
  }-*/;
  
  private static native void setMultiPartAvailableOnThread(org.broadleafcommerce.openadmin.client.dto.Entity instance, boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::multiPartAvailableOnThread = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.Property[] getProperties(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::properties;
  }-*/;
  
  private static native void setProperties(org.broadleafcommerce.openadmin.client.dto.Entity instance, org.broadleafcommerce.openadmin.client.dto.Property[] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::properties = value;
  }-*/;
  
  private static native java.lang.String[] getType(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::type;
  }-*/;
  
  private static native void setType(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.String[] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::type = value;
  }-*/;
  
  private static native java.lang.String[][] getValidationErrors(org.broadleafcommerce.openadmin.client.dto.Entity instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Entity::validationErrors;
  }-*/;
  
  private static native void setValidationErrors(org.broadleafcommerce.openadmin.client.dto.Entity instance, java.lang.String[][] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Entity::validationErrors = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.Entity instance) throws SerializationException {
    setIsActive(instance, (java.lang.Boolean) streamReader.readObject());
    setIsDeleted(instance, (java.lang.Boolean) streamReader.readObject());
    setIsDirty(instance, streamReader.readBoolean());
    setIsInactive(instance, (java.lang.Boolean) streamReader.readObject());
    setIsLocked(instance, (java.lang.Boolean) streamReader.readObject());
    setIsValidationFailure(instance, streamReader.readBoolean());
    setLockedBy(instance, streamReader.readString());
    setLockedDate(instance, streamReader.readString());
    setMultiPartAvailableOnThread(instance, streamReader.readBoolean());
    setProperties(instance, (org.broadleafcommerce.openadmin.client.dto.Property[]) streamReader.readObject());
    setType(instance, (java.lang.String[]) streamReader.readObject());
    setValidationErrors(instance, (java.lang.String[][]) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.Entity instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.Entity();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.Entity instance) throws SerializationException {
    streamWriter.writeObject(getIsActive(instance));
    streamWriter.writeObject(getIsDeleted(instance));
    streamWriter.writeBoolean(getIsDirty(instance));
    streamWriter.writeObject(getIsInactive(instance));
    streamWriter.writeObject(getIsLocked(instance));
    streamWriter.writeBoolean(getIsValidationFailure(instance));
    streamWriter.writeString(getLockedBy(instance));
    streamWriter.writeString(getLockedDate(instance));
    streamWriter.writeBoolean(getMultiPartAvailableOnThread(instance));
    streamWriter.writeObject(getProperties(instance));
    streamWriter.writeObject(getType(instance));
    streamWriter.writeObject(getValidationErrors(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.Entity)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.Entity)object);
  }
  
}
