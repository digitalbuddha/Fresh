package org.broadleafcommerce.common.exception;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ServiceException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.common.exception.ServiceException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.broadleafcommerce.common.exception.ServiceException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.common.exception.ServiceException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.common.exception.ServiceException instance) throws SerializationException {
    
    com.google.gwt.user.client.rpc.core.java.lang.Exception_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.common.exception.ServiceException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.common.exception.ServiceException_FieldSerializer.deserialize(reader, (org.broadleafcommerce.common.exception.ServiceException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.common.exception.ServiceException_FieldSerializer.serialize(writer, (org.broadleafcommerce.common.exception.ServiceException)object);
  }
  
}
