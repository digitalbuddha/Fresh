package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class Property_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getDisplayValue(org.broadleafcommerce.openadmin.client.dto.Property instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Property::displayValue;
  }-*/;
  
  private static native void setDisplayValue(org.broadleafcommerce.openadmin.client.dto.Property instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Property::displayValue = value;
  }-*/;
  
  private static native boolean getIsAdvancedCollection(org.broadleafcommerce.openadmin.client.dto.Property instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Property::isAdvancedCollection;
  }-*/;
  
  private static native void setIsAdvancedCollection(org.broadleafcommerce.openadmin.client.dto.Property instance, boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Property::isAdvancedCollection = value;
  }-*/;
  
  private static native java.lang.Boolean getIsDirty(org.broadleafcommerce.openadmin.client.dto.Property instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Property::isDirty;
  }-*/;
  
  private static native void setIsDirty(org.broadleafcommerce.openadmin.client.dto.Property instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Property::isDirty = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.FieldMetadata getMetadata(org.broadleafcommerce.openadmin.client.dto.Property instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Property::metadata;
  }-*/;
  
  private static native void setMetadata(org.broadleafcommerce.openadmin.client.dto.Property instance, org.broadleafcommerce.openadmin.client.dto.FieldMetadata value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Property::metadata = value;
  }-*/;
  
  private static native java.lang.String getName(org.broadleafcommerce.openadmin.client.dto.Property instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Property::name;
  }-*/;
  
  private static native void setName(org.broadleafcommerce.openadmin.client.dto.Property instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Property::name = value;
  }-*/;
  
  private static native java.lang.String getRawValue(org.broadleafcommerce.openadmin.client.dto.Property instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Property::rawValue;
  }-*/;
  
  private static native void setRawValue(org.broadleafcommerce.openadmin.client.dto.Property instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Property::rawValue = value;
  }-*/;
  
  private static native java.lang.String getUnHtmlEncodedValue(org.broadleafcommerce.openadmin.client.dto.Property instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Property::unHtmlEncodedValue;
  }-*/;
  
  private static native void setUnHtmlEncodedValue(org.broadleafcommerce.openadmin.client.dto.Property instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Property::unHtmlEncodedValue = value;
  }-*/;
  
  private static native java.lang.String getValue(org.broadleafcommerce.openadmin.client.dto.Property instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.Property::value;
  }-*/;
  
  private static native void setValue(org.broadleafcommerce.openadmin.client.dto.Property instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.Property::value = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.Property instance) throws SerializationException {
    setDisplayValue(instance, streamReader.readString());
    setIsAdvancedCollection(instance, streamReader.readBoolean());
    setIsDirty(instance, (java.lang.Boolean) streamReader.readObject());
    setMetadata(instance, (org.broadleafcommerce.openadmin.client.dto.FieldMetadata) streamReader.readObject());
    setName(instance, streamReader.readString());
    setRawValue(instance, streamReader.readString());
    setUnHtmlEncodedValue(instance, streamReader.readString());
    setValue(instance, streamReader.readString());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.Property instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.Property();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.Property instance) throws SerializationException {
    streamWriter.writeString(getDisplayValue(instance));
    streamWriter.writeBoolean(getIsAdvancedCollection(instance));
    streamWriter.writeObject(getIsDirty(instance));
    streamWriter.writeObject(getMetadata(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getRawValue(instance));
    streamWriter.writeString(getUnHtmlEncodedValue(instance));
    streamWriter.writeString(getValue(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.Property)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.Property)object);
  }
  
}
