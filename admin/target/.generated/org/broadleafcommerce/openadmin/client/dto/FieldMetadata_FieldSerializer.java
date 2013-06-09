package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FieldMetadata_FieldSerializer {
  private static native java.lang.String[] getAvailableToTypes(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::availableToTypes;
  }-*/;
  
  private static native void setAvailableToTypes(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String[] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::availableToTypes = value;
  }-*/;
  
  private static native java.lang.Boolean getChildrenExcluded(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::childrenExcluded;
  }-*/;
  
  private static native void setChildrenExcluded(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::childrenExcluded = value;
  }-*/;
  
  private static native java.lang.String getCurrencyCodeField(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::currencyCodeField;
  }-*/;
  
  private static native void setCurrencyCodeField(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::currencyCodeField = value;
  }-*/;
  
  private static native java.lang.Boolean getExcluded(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::excluded;
  }-*/;
  
  private static native void setExcluded(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::excluded = value;
  }-*/;
  
  private static native java.lang.String getFieldName(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::fieldName;
  }-*/;
  
  private static native void setFieldName(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::fieldName = value;
  }-*/;
  
  private static native java.lang.String getFriendlyName(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::friendlyName;
  }-*/;
  
  private static native void setFriendlyName(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::friendlyName = value;
  }-*/;
  
  private static native java.lang.String getInheritedFromType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::inheritedFromType;
  }-*/;
  
  private static native void setInheritedFromType(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::inheritedFromType = value;
  }-*/;
  
  private static native java.lang.Integer getOrder(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::order;
  }-*/;
  
  private static native void setOrder(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.Integer value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::order = value;
  }-*/;
  
  private static native java.lang.String getOwningClass(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::owningClass;
  }-*/;
  
  private static native void setOwningClass(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::owningClass = value;
  }-*/;
  
  private static native java.lang.String getOwningClassFriendlyName(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::owningClassFriendlyName;
  }-*/;
  
  private static native void setOwningClassFriendlyName(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::owningClassFriendlyName = value;
  }-*/;
  
  private static native java.lang.String getPrefix(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::prefix;
  }-*/;
  
  private static native void setPrefix(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::prefix = value;
  }-*/;
  
  private static native java.lang.String getSecurityLevel(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::securityLevel;
  }-*/;
  
  private static native void setSecurityLevel(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::securityLevel = value;
  }-*/;
  
  private static native java.lang.String getShowIfProperty(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::showIfProperty;
  }-*/;
  
  private static native void setShowIfProperty(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::showIfProperty = value;
  }-*/;
  
  private static native java.lang.String getTargetClass(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::targetClass;
  }-*/;
  
  private static native void setTargetClass(org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FieldMetadata::targetClass = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) throws SerializationException {
    setAvailableToTypes(instance, (java.lang.String[]) streamReader.readObject());
    setChildrenExcluded(instance, (java.lang.Boolean) streamReader.readObject());
    setCurrencyCodeField(instance, streamReader.readString());
    setExcluded(instance, (java.lang.Boolean) streamReader.readObject());
    setFieldName(instance, streamReader.readString());
    setFriendlyName(instance, streamReader.readString());
    setInheritedFromType(instance, streamReader.readString());
    setOrder(instance, (java.lang.Integer) streamReader.readObject());
    setOwningClass(instance, streamReader.readString());
    setOwningClassFriendlyName(instance, streamReader.readString());
    setPrefix(instance, streamReader.readString());
    setSecurityLevel(instance, streamReader.readString());
    setShowIfProperty(instance, streamReader.readString());
    setTargetClass(instance, streamReader.readString());
    
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.FieldMetadata instance) throws SerializationException {
    streamWriter.writeObject(getAvailableToTypes(instance));
    streamWriter.writeObject(getChildrenExcluded(instance));
    streamWriter.writeString(getCurrencyCodeField(instance));
    streamWriter.writeObject(getExcluded(instance));
    streamWriter.writeString(getFieldName(instance));
    streamWriter.writeString(getFriendlyName(instance));
    streamWriter.writeString(getInheritedFromType(instance));
    streamWriter.writeObject(getOrder(instance));
    streamWriter.writeString(getOwningClass(instance));
    streamWriter.writeString(getOwningClassFriendlyName(instance));
    streamWriter.writeString(getPrefix(instance));
    streamWriter.writeString(getSecurityLevel(instance));
    streamWriter.writeString(getShowIfProperty(instance));
    streamWriter.writeString(getTargetClass(instance));
    
  }
  
}
