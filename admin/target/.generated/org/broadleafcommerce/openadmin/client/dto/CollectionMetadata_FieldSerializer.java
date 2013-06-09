package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CollectionMetadata_FieldSerializer {
  private static native java.lang.String getCollectionCeilingEntity(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::collectionCeilingEntity;
  }-*/;
  
  private static native void setCollectionCeilingEntity(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::collectionCeilingEntity = value;
  }-*/;
  
  private static native java.lang.String[] getCustomCriteria(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::customCriteria;
  }-*/;
  
  private static native void setCustomCriteria(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance, java.lang.String[] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::customCriteria = value;
  }-*/;
  
  private static native java.lang.String getDataSourceName(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::dataSourceName;
  }-*/;
  
  private static native void setDataSourceName(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::dataSourceName = value;
  }-*/;
  
  private static native boolean getMutable(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::mutable;
  }-*/;
  
  private static native void setMutable(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance, boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::mutable = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.PersistencePerspective getPersistencePerspective(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::persistencePerspective;
  }-*/;
  
  private static native void setPersistencePerspective(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance, org.broadleafcommerce.openadmin.client.dto.PersistencePerspective value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::persistencePerspective = value;
  }-*/;
  
  private static native java.lang.String getTargetElementId(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::targetElementId;
  }-*/;
  
  private static native void setTargetElementId(org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CollectionMetadata::targetElementId = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance) throws SerializationException {
    setCollectionCeilingEntity(instance, streamReader.readString());
    setCustomCriteria(instance, (java.lang.String[]) streamReader.readObject());
    setDataSourceName(instance, streamReader.readString());
    setMutable(instance, streamReader.readBoolean());
    setPersistencePerspective(instance, (org.broadleafcommerce.openadmin.client.dto.PersistencePerspective) streamReader.readObject());
    setTargetElementId(instance, streamReader.readString());
    
    org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.CollectionMetadata instance) throws SerializationException {
    streamWriter.writeString(getCollectionCeilingEntity(instance));
    streamWriter.writeObject(getCustomCriteria(instance));
    streamWriter.writeString(getDataSourceName(instance));
    streamWriter.writeBoolean(getMutable(instance));
    streamWriter.writeObject(getPersistencePerspective(instance));
    streamWriter.writeString(getTargetElementId(instance));
    
    org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.serialize(streamWriter, instance);
  }
  
}
