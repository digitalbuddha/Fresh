package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AdminExporterDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO instance) throws SerializationException {
    instance.additionalCriteriaProperties = (java.util.List) streamReader.readObject();
    instance.friendlyName = streamReader.readString();
    instance.name = streamReader.readString();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO instance) throws SerializationException {
    streamWriter.writeObject(instance.additionalCriteriaProperties);
    streamWriter.writeString(instance.friendlyName);
    streamWriter.writeString(instance.name);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO)object);
  }
  
}
