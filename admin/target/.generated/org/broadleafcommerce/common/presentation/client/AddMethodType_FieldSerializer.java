package org.broadleafcommerce.common.presentation.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AddMethodType_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.common.presentation.client.AddMethodType instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.broadleafcommerce.common.presentation.client.AddMethodType instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.broadleafcommerce.common.presentation.client.AddMethodType[] values = org.broadleafcommerce.common.presentation.client.AddMethodType.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.common.presentation.client.AddMethodType instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.common.presentation.client.AddMethodType_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.common.presentation.client.AddMethodType_FieldSerializer.deserialize(reader, (org.broadleafcommerce.common.presentation.client.AddMethodType)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.common.presentation.client.AddMethodType_FieldSerializer.serialize(writer, (org.broadleafcommerce.common.presentation.client.AddMethodType)object);
  }
  
}
