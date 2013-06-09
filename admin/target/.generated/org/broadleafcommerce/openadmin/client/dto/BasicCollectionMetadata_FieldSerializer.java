package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BasicCollectionMetadata_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.broadleafcommerce.common.presentation.client.AddMethodType getAddMethodType(org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata::addMethodType;
  }-*/;
  
  private static native void setAddMethodType(org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata instance, org.broadleafcommerce.common.presentation.client.AddMethodType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata::addMethodType = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata instance) throws SerializationException {
    setAddMethodType(instance, (org.broadleafcommerce.common.presentation.client.AddMethodType) streamReader.readObject());
    
    org.broadleafcommerce.openadmin.client.dto.CollectionMetadata_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata instance) throws SerializationException {
    streamWriter.writeObject(getAddMethodType(instance));
    
    org.broadleafcommerce.openadmin.client.dto.CollectionMetadata_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata)object);
  }
  
}
