package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class AdornedTargetList_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAdornedTargetEntityClassname(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::adornedTargetEntityClassname;
  }-*/;
  
  private static native void setAdornedTargetEntityClassname(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::adornedTargetEntityClassname = value;
  }-*/;
  
  private static native java.lang.String getAdornedTargetEntityPolymorphicType(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::adornedTargetEntityPolymorphicType;
  }-*/;
  
  private static native void setAdornedTargetEntityPolymorphicType(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::adornedTargetEntityPolymorphicType = value;
  }-*/;
  
  private static native java.lang.String getCollectionFieldName(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::collectionFieldName;
  }-*/;
  
  private static native void setCollectionFieldName(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::collectionFieldName = value;
  }-*/;
  
  private static native java.lang.Boolean getInverse(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::inverse;
  }-*/;
  
  private static native void setInverse(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::inverse = value;
  }-*/;
  
  private static native java.lang.String getLinkedIdProperty(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::linkedIdProperty;
  }-*/;
  
  private static native void setLinkedIdProperty(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::linkedIdProperty = value;
  }-*/;
  
  private static native java.lang.String getLinkedObjectPath(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::linkedObjectPath;
  }-*/;
  
  private static native void setLinkedObjectPath(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::linkedObjectPath = value;
  }-*/;
  
  private static native java.lang.Boolean getSortAscending(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::sortAscending;
  }-*/;
  
  private static native void setSortAscending(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::sortAscending = value;
  }-*/;
  
  private static native java.lang.String getSortField(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::sortField;
  }-*/;
  
  private static native void setSortField(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::sortField = value;
  }-*/;
  
  private static native java.lang.String getTargetIdProperty(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::targetIdProperty;
  }-*/;
  
  private static native void setTargetIdProperty(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::targetIdProperty = value;
  }-*/;
  
  private static native java.lang.String getTargetObjectPath(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::targetObjectPath;
  }-*/;
  
  private static native void setTargetObjectPath(org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::targetObjectPath = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) throws SerializationException {
    setAdornedTargetEntityClassname(instance, streamReader.readString());
    setAdornedTargetEntityPolymorphicType(instance, streamReader.readString());
    setCollectionFieldName(instance, streamReader.readString());
    setInverse(instance, (java.lang.Boolean) streamReader.readObject());
    setLinkedIdProperty(instance, streamReader.readString());
    setLinkedObjectPath(instance, streamReader.readString());
    setSortAscending(instance, (java.lang.Boolean) streamReader.readObject());
    setSortField(instance, streamReader.readString());
    setTargetIdProperty(instance, streamReader.readString());
    setTargetObjectPath(instance, streamReader.readString());
    
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.AdornedTargetList();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.AdornedTargetList instance) throws SerializationException {
    streamWriter.writeString(getAdornedTargetEntityClassname(instance));
    streamWriter.writeString(getAdornedTargetEntityPolymorphicType(instance));
    streamWriter.writeString(getCollectionFieldName(instance));
    streamWriter.writeObject(getInverse(instance));
    streamWriter.writeString(getLinkedIdProperty(instance));
    streamWriter.writeString(getLinkedObjectPath(instance));
    streamWriter.writeObject(getSortAscending(instance));
    streamWriter.writeString(getSortField(instance));
    streamWriter.writeString(getTargetIdProperty(instance));
    streamWriter.writeString(getTargetObjectPath(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.AdornedTargetList_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.AdornedTargetList_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.AdornedTargetList)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.AdornedTargetList_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.AdornedTargetList)object);
  }
  
}
