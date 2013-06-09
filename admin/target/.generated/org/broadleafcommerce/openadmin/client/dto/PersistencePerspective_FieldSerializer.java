package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class PersistencePerspective_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.PersistencePerspective instance) throws SerializationException {
    instance.additionalForeignKeys = (org.broadleafcommerce.openadmin.client.dto.ForeignKey[]) streamReader.readObject();
    instance.additionalNonPersistentProperties = (java.lang.String[]) streamReader.readObject();
    instance.configurationKey = streamReader.readString();
    instance.excludeFields = (java.lang.String[]) streamReader.readObject();
    instance.includeFields = (java.lang.String[]) streamReader.readObject();
    instance.operationTypes = (org.broadleafcommerce.openadmin.client.dto.OperationTypes) streamReader.readObject();
    instance.persistencePerspectiveItems = (java.util.Map) streamReader.readObject();
    instance.populateToOneFields = (java.lang.Boolean) streamReader.readObject();
    instance.showArchivedFields = (java.lang.Boolean) streamReader.readObject();
    instance.useServerSideInspectionCache = (java.lang.Boolean) streamReader.readObject();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.PersistencePerspective instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.PersistencePerspective();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.PersistencePerspective instance) throws SerializationException {
    streamWriter.writeObject(instance.additionalForeignKeys);
    streamWriter.writeObject(instance.additionalNonPersistentProperties);
    streamWriter.writeString(instance.configurationKey);
    streamWriter.writeObject(instance.excludeFields);
    streamWriter.writeObject(instance.includeFields);
    streamWriter.writeObject(instance.operationTypes);
    streamWriter.writeObject(instance.persistencePerspectiveItems);
    streamWriter.writeObject(instance.populateToOneFields);
    streamWriter.writeObject(instance.showArchivedFields);
    streamWriter.writeObject(instance.useServerSideInspectionCache);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.PersistencePerspective)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.PersistencePerspective)object);
  }
  
}
