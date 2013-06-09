package org.broadleafcommerce.common.presentation.client;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ForeignKeyRestrictionType_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType[] values = org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType_FieldSerializer.deserialize(reader, (org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType_FieldSerializer.serialize(writer, (org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType)object);
  }
  
}
