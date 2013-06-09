package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PersistencePackage_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.PersistencePackage instance) throws SerializationException {
    instance.batchId = (java.lang.Integer) streamReader.readObject();
    instance.ceilingEntityFullyQualifiedClassname = streamReader.readString();
    instance.csrfToken = streamReader.readString();
    instance.customCriteria = (java.lang.String[]) streamReader.readObject();
    instance.entity = (org.broadleafcommerce.openadmin.client.dto.Entity) streamReader.readObject();
    instance.fetchTypeFullyQualifiedClassname = streamReader.readString();
    instance.persistencePerspective = (org.broadleafcommerce.openadmin.client.dto.PersistencePerspective) streamReader.readObject();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.PersistencePackage instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.PersistencePackage();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.PersistencePackage instance) throws SerializationException {
    streamWriter.writeObject(instance.batchId);
    streamWriter.writeString(instance.ceilingEntityFullyQualifiedClassname);
    streamWriter.writeString(instance.csrfToken);
    streamWriter.writeObject(instance.customCriteria);
    streamWriter.writeObject(instance.entity);
    streamWriter.writeString(instance.fetchTypeFullyQualifiedClassname);
    streamWriter.writeObject(instance.persistencePerspective);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.PersistencePackage)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.PersistencePackage)object);
  }
  
}
