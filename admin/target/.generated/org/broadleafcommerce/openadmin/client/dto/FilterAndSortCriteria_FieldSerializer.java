package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FilterAndSortCriteria_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getFilterValues(org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::filterValues;
  }-*/;
  
  private static native void setFilterValues(org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance, java.util.List value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::filterValues = value;
  }-*/;
  
  private static native java.lang.Boolean getIgnoreCase(org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::ignoreCase;
  }-*/;
  
  private static native void setIgnoreCase(org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::ignoreCase = value;
  }-*/;
  
  private static native java.lang.String getPropertyId(org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::propertyId;
  }-*/;
  
  private static native void setPropertyId(org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::propertyId = value;
  }-*/;
  
  private static native java.lang.Boolean getSortAscending(org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::sortAscending;
  }-*/;
  
  private static native void setSortAscending(org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::sortAscending = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance) throws SerializationException {
    setFilterValues(instance, (java.util.List) streamReader.readObject());
    setIgnoreCase(instance, (java.lang.Boolean) streamReader.readObject());
    setPropertyId(instance, streamReader.readString());
    setSortAscending(instance, (java.lang.Boolean) streamReader.readObject());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria instance) throws SerializationException {
    streamWriter.writeObject(getFilterValues(instance));
    streamWriter.writeObject(getIgnoreCase(instance));
    streamWriter.writeString(getPropertyId(instance));
    streamWriter.writeObject(getSortAscending(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria)object);
  }
  
}
