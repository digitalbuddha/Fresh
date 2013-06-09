package com.gwtincubator.security.exception;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AuthenticationException_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.gwtincubator.security.exception.AuthenticationException instance) throws SerializationException {
    
    com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.gwtincubator.security.exception.AuthenticationException instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.gwtincubator.security.exception.AuthenticationException();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.gwtincubator.security.exception.AuthenticationException instance) throws SerializationException {
    
    com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.gwtincubator.security.exception.AuthenticationException_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.gwtincubator.security.exception.AuthenticationException_FieldSerializer.deserialize(reader, (com.gwtincubator.security.exception.AuthenticationException)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.gwtincubator.security.exception.AuthenticationException_FieldSerializer.serialize(writer, (com.gwtincubator.security.exception.AuthenticationException)object);
  }
  
}
