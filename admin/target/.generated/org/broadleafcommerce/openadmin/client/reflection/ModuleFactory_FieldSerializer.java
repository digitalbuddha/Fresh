package org.broadleafcommerce.openadmin.client.reflection;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ModuleFactory_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.reflection.ModuleFactory instance) throws SerializationException {
    instance.factory = (org.broadleafcommerce.openadmin.client.reflection.Factory) streamReader.readObject();
    instance.modifierMap = (java.util.Map) streamReader.readObject();
    
    com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.deserialize(streamReader, instance);
  }
  
  public static native org.broadleafcommerce.openadmin.client.reflection.ModuleFactory instantiate(SerializationStreamReader streamReader) throws SerializationException /*-{
    return @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory::new()();
  }-*/;
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.reflection.ModuleFactory instance) throws SerializationException {
    streamWriter.writeObject(instance.factory);
    streamWriter.writeObject(instance.modifierMap);
    
    com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.reflection.ModuleFactory)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.reflection.ModuleFactory)object);
  }
  
}
