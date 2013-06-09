package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AdornedTargetCollectionMetadata_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String[] getGridVisibleFields(org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::gridVisibleFields;
  }-*/;
  
  private static native void setGridVisibleFields(org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance, java.lang.String[] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::gridVisibleFields = value;
  }-*/;
  
  private static native boolean getIgnoreAdornedProperties(org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::ignoreAdornedProperties;
  }-*/;
  
  private static native void setIgnoreAdornedProperties(org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance, boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::ignoreAdornedProperties = value;
  }-*/;
  
  private static native java.lang.String[] getMaintainedAdornedTargetFields(org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::maintainedAdornedTargetFields;
  }-*/;
  
  private static native void setMaintainedAdornedTargetFields(org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance, java.lang.String[] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::maintainedAdornedTargetFields = value;
  }-*/;
  
  private static native java.lang.String getParentObjectClass(org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::parentObjectClass;
  }-*/;
  
  private static native void setParentObjectClass(org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::parentObjectClass = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance) throws SerializationException {
    setGridVisibleFields(instance, (java.lang.String[]) streamReader.readObject());
    setIgnoreAdornedProperties(instance, streamReader.readBoolean());
    setMaintainedAdornedTargetFields(instance, (java.lang.String[]) streamReader.readObject());
    setParentObjectClass(instance, streamReader.readString());
    
    org.broadleafcommerce.openadmin.client.dto.CollectionMetadata_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata instance) throws SerializationException {
    streamWriter.writeObject(getGridVisibleFields(instance));
    streamWriter.writeBoolean(getIgnoreAdornedProperties(instance));
    streamWriter.writeObject(getMaintainedAdornedTargetFields(instance));
    streamWriter.writeString(getParentObjectClass(instance));
    
    org.broadleafcommerce.openadmin.client.dto.CollectionMetadata_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata)object);
  }
  
}
