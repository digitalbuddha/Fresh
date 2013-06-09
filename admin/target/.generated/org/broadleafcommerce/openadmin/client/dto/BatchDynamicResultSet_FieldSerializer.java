package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BatchDynamicResultSet_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet instance) throws SerializationException {
    instance.dynamicResultSets = (org.broadleafcommerce.openadmin.client.dto.DynamicResultSet[]) streamReader.readObject();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet instance) throws SerializationException {
    streamWriter.writeObject(instance.dynamicResultSets);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet)object);
  }
  
}
