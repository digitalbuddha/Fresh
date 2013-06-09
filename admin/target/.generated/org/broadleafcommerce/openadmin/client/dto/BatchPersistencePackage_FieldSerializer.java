package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BatchPersistencePackage_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage instance) throws SerializationException {
    instance.persistencePackages = (org.broadleafcommerce.openadmin.client.dto.PersistencePackage[]) streamReader.readObject();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage instance) throws SerializationException {
    streamWriter.writeObject(instance.persistencePackages);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage)object);
  }
  
}
