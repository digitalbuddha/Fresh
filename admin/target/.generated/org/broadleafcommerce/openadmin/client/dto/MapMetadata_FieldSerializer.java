package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class MapMetadata_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native boolean getIsSimpleValue(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::isSimpleValue;
  }-*/;
  
  private static native void setIsSimpleValue(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance, boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::isSimpleValue = value;
  }-*/;
  
  private static native java.lang.String[][] getKeys(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::keys;
  }-*/;
  
  private static native void setKeys(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance, java.lang.String[][] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::keys = value;
  }-*/;
  
  private static native java.lang.String getMapKeyOptionEntityClass(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::mapKeyOptionEntityClass;
  }-*/;
  
  private static native void setMapKeyOptionEntityClass(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::mapKeyOptionEntityClass = value;
  }-*/;
  
  private static native java.lang.String getMapKeyOptionEntityDisplayField(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::mapKeyOptionEntityDisplayField;
  }-*/;
  
  private static native void setMapKeyOptionEntityDisplayField(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::mapKeyOptionEntityDisplayField = value;
  }-*/;
  
  private static native java.lang.String getMapKeyOptionEntityValueField(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::mapKeyOptionEntityValueField;
  }-*/;
  
  private static native void setMapKeyOptionEntityValueField(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::mapKeyOptionEntityValueField = value;
  }-*/;
  
  private static native java.lang.String getMediaField(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::mediaField;
  }-*/;
  
  private static native void setMediaField(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::mediaField = value;
  }-*/;
  
  private static native java.lang.String getValueClassName(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::valueClassName;
  }-*/;
  
  private static native void setValueClassName(org.broadleafcommerce.openadmin.client.dto.MapMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.MapMetadata::valueClassName = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) throws SerializationException {
    setIsSimpleValue(instance, streamReader.readBoolean());
    setKeys(instance, (java.lang.String[][]) streamReader.readObject());
    setMapKeyOptionEntityClass(instance, streamReader.readString());
    setMapKeyOptionEntityDisplayField(instance, streamReader.readString());
    setMapKeyOptionEntityValueField(instance, streamReader.readString());
    setMediaField(instance, streamReader.readString());
    setValueClassName(instance, streamReader.readString());
    
    org.broadleafcommerce.openadmin.client.dto.CollectionMetadata_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.MapMetadata instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.MapMetadata();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.MapMetadata instance) throws SerializationException {
    streamWriter.writeBoolean(getIsSimpleValue(instance));
    streamWriter.writeObject(getKeys(instance));
    streamWriter.writeString(getMapKeyOptionEntityClass(instance));
    streamWriter.writeString(getMapKeyOptionEntityDisplayField(instance));
    streamWriter.writeString(getMapKeyOptionEntityValueField(instance));
    streamWriter.writeString(getMediaField(instance));
    streamWriter.writeString(getValueClassName(instance));
    
    org.broadleafcommerce.openadmin.client.dto.CollectionMetadata_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.MapMetadata_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.MapMetadata_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.MapMetadata)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.MapMetadata_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.MapMetadata)object);
  }
  
}
