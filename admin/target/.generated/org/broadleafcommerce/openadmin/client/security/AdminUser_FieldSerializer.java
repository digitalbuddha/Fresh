package org.broadleafcommerce.openadmin.client.security;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AdminUser_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.security.AdminUser instance) throws SerializationException {
    instance.currentSandBoxId = streamReader.readString();
    instance.email = streamReader.readString();
    instance.id = (java.lang.Long) streamReader.readObject();
    instance.name = streamReader.readString();
    instance.permissions = (java.util.List) streamReader.readObject();
    instance.phoneNumber = streamReader.readString();
    instance.roles = (java.util.List) streamReader.readObject();
    instance.userName = streamReader.readString();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.security.AdminUser instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.security.AdminUser();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.security.AdminUser instance) throws SerializationException {
    streamWriter.writeString(instance.currentSandBoxId);
    streamWriter.writeString(instance.email);
    streamWriter.writeObject(instance.id);
    streamWriter.writeString(instance.name);
    streamWriter.writeObject(instance.permissions);
    streamWriter.writeString(instance.phoneNumber);
    streamWriter.writeObject(instance.roles);
    streamWriter.writeString(instance.userName);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.security.AdminUser_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.security.AdminUser_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.security.AdminUser)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.security.AdminUser_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.security.AdminUser)object);
  }
  
}
