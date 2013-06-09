package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class CriteriaTransferObject_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.Map getCriteriaMap(org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject::criteriaMap;
  }-*/;
  
  private static native void setCriteriaMap(org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instance, java.util.Map value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject::criteriaMap = value;
  }-*/;
  
  private static native java.lang.Integer getFirstResult(org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject::firstResult;
  }-*/;
  
  private static native void setFirstResult(org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instance, java.lang.Integer value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject::firstResult = value;
  }-*/;
  
  private static native java.lang.Integer getMaxResults(org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject::maxResults;
  }-*/;
  
  private static native void setMaxResults(org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instance, java.lang.Integer value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject::maxResults = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instance) throws SerializationException {
    setCriteriaMap(instance, (java.util.Map) streamReader.readObject());
    setFirstResult(instance, (java.lang.Integer) streamReader.readObject());
    setMaxResults(instance, (java.lang.Integer) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject instance) throws SerializationException {
    streamWriter.writeObject(getCriteriaMap(instance));
    streamWriter.writeObject(getFirstResult(instance));
    streamWriter.writeObject(getMaxResults(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject)object);
  }
  
}
