package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class OperationTypes_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native org.broadleafcommerce.common.presentation.client.OperationType getAddType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::addType;
  }-*/;
  
  private static native void setAddType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.common.presentation.client.OperationType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::addType = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.OperationType getFetchType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::fetchType;
  }-*/;
  
  private static native void setFetchType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.common.presentation.client.OperationType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::fetchType = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.OperationType getInspectType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::inspectType;
  }-*/;
  
  private static native void setInspectType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.common.presentation.client.OperationType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::inspectType = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.OperationType getRemoveType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::removeType;
  }-*/;
  
  private static native void setRemoveType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.common.presentation.client.OperationType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::removeType = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.OperationType getUpdateType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::updateType;
  }-*/;
  
  private static native void setUpdateType(org.broadleafcommerce.openadmin.client.dto.OperationTypes instance, org.broadleafcommerce.common.presentation.client.OperationType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.OperationTypes::updateType = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) throws SerializationException {
    setAddType(instance, (org.broadleafcommerce.common.presentation.client.OperationType) streamReader.readObject());
    setFetchType(instance, (org.broadleafcommerce.common.presentation.client.OperationType) streamReader.readObject());
    setInspectType(instance, (org.broadleafcommerce.common.presentation.client.OperationType) streamReader.readObject());
    setRemoveType(instance, (org.broadleafcommerce.common.presentation.client.OperationType) streamReader.readObject());
    setUpdateType(instance, (org.broadleafcommerce.common.presentation.client.OperationType) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.OperationTypes instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.OperationTypes();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.OperationTypes instance) throws SerializationException {
    streamWriter.writeObject(getAddType(instance));
    streamWriter.writeObject(getFetchType(instance));
    streamWriter.writeObject(getInspectType(instance));
    streamWriter.writeObject(getRemoveType(instance));
    streamWriter.writeObject(getUpdateType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.OperationTypes)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.OperationTypes)object);
  }
  
}
