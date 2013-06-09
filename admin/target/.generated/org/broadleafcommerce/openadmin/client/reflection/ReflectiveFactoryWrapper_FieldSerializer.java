package org.broadleafcommerce.openadmin.client.reflection;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ReflectiveFactoryWrapper_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper instance) throws SerializationException {
    
  }
  
  public static org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper instance) throws SerializationException {
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper)object);
  }
  
}
