package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ForeignKey_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCurrentValue(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::currentValue;
  }-*/;
  
  private static native void setCurrentValue(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::currentValue = value;
  }-*/;
  
  private static native java.lang.String getDataSourceName(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::dataSourceName;
  }-*/;
  
  private static native void setDataSourceName(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::dataSourceName = value;
  }-*/;
  
  private static native java.lang.String getDisplayValueProperty(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::displayValueProperty;
  }-*/;
  
  private static native void setDisplayValueProperty(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::displayValueProperty = value;
  }-*/;
  
  private static native java.lang.String getForeignKeyClass(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::foreignKeyClass;
  }-*/;
  
  private static native void setForeignKeyClass(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::foreignKeyClass = value;
  }-*/;
  
  private static native java.lang.String getManyToField(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::manyToField;
  }-*/;
  
  private static native void setManyToField(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::manyToField = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType getRestrictionType(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::restrictionType;
  }-*/;
  
  private static native void setRestrictionType(org.broadleafcommerce.openadmin.client.dto.ForeignKey instance, org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.ForeignKey::restrictionType = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.ForeignKey instance) throws SerializationException {
    setCurrentValue(instance, streamReader.readString());
    setDataSourceName(instance, streamReader.readString());
    setDisplayValueProperty(instance, streamReader.readString());
    setForeignKeyClass(instance, streamReader.readString());
    setManyToField(instance, streamReader.readString());
    setRestrictionType(instance, (org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.ForeignKey instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.ForeignKey();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.ForeignKey instance) throws SerializationException {
    streamWriter.writeString(getCurrentValue(instance));
    streamWriter.writeString(getDataSourceName(instance));
    streamWriter.writeString(getDisplayValueProperty(instance));
    streamWriter.writeString(getForeignKeyClass(instance));
    streamWriter.writeString(getManyToField(instance));
    streamWriter.writeObject(getRestrictionType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.ForeignKey)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.ForeignKey)object);
  }
  
}
