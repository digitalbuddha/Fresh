package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ClassTree_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.ClassTree instance) throws SerializationException {
    instance.children = (org.broadleafcommerce.openadmin.client.dto.ClassTree[]) streamReader.readObject();
    instance.friendlyName = streamReader.readString();
    instance.fullyQualifiedClassname = streamReader.readString();
    instance.left = streamReader.readInt();
    instance.name = streamReader.readString();
    instance.right = streamReader.readInt();
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.ClassTree instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.ClassTree();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.ClassTree instance) throws SerializationException {
    streamWriter.writeObject(instance.children);
    streamWriter.writeString(instance.friendlyName);
    streamWriter.writeString(instance.fullyQualifiedClassname);
    streamWriter.writeInt(instance.left);
    streamWriter.writeString(instance.name);
    streamWriter.writeInt(instance.right);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.ClassTree)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.ClassTree)object);
  }
  
}
