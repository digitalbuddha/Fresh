package org.broadleafcommerce.openadmin.client.dto;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class BasicFieldMetadata_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getBroadleafEnumeration(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::broadleafEnumeration;
  }-*/;
  
  private static native void setBroadleafEnumeration(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::broadleafEnumeration = value;
  }-*/;
  
  private static native java.lang.String getColumnWidth(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::columnWidth;
  }-*/;
  
  private static native void setColumnWidth(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::columnWidth = value;
  }-*/;
  
  private static native java.lang.String[] getCustomCriteria(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::customCriteria;
  }-*/;
  
  private static native void setCustomCriteria(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String[] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::customCriteria = value;
  }-*/;
  
  private static native java.lang.String getEnumerationClass(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::enumerationClass;
  }-*/;
  
  private static native void setEnumerationClass(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::enumerationClass = value;
  }-*/;
  
  private static native java.lang.String[][] getEnumerationValues(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::enumerationValues;
  }-*/;
  
  private static native void setEnumerationValues(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String[][] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::enumerationValues = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.SupportedFieldType getExplicitFieldType(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::explicitFieldType;
  }-*/;
  
  private static native void setExplicitFieldType(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, org.broadleafcommerce.common.presentation.client.SupportedFieldType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::explicitFieldType = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.SupportedFieldType getFieldType(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::fieldType;
  }-*/;
  
  private static native void setFieldType(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, org.broadleafcommerce.common.presentation.client.SupportedFieldType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::fieldType = value;
  }-*/;
  
  private static native java.lang.String getForeignKeyClass(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::foreignKeyClass;
  }-*/;
  
  private static native void setForeignKeyClass(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::foreignKeyClass = value;
  }-*/;
  
  private static native java.lang.Boolean getForeignKeyCollection(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::foreignKeyCollection;
  }-*/;
  
  private static native void setForeignKeyCollection(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::foreignKeyCollection = value;
  }-*/;
  
  private static native java.lang.String getForeignKeyDisplayValueProperty(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::foreignKeyDisplayValueProperty;
  }-*/;
  
  private static native void setForeignKeyDisplayValueProperty(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::foreignKeyDisplayValueProperty = value;
  }-*/;
  
  private static native java.lang.String getForeignKeyProperty(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::foreignKeyProperty;
  }-*/;
  
  private static native void setForeignKeyProperty(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::foreignKeyProperty = value;
  }-*/;
  
  private static native java.lang.String getGroup(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::group;
  }-*/;
  
  private static native void setGroup(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::group = value;
  }-*/;
  
  private static native java.lang.Boolean getGroupCollapsed(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::groupCollapsed;
  }-*/;
  
  private static native void setGroupCollapsed(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::groupCollapsed = value;
  }-*/;
  
  private static native java.lang.Integer getGroupOrder(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::groupOrder;
  }-*/;
  
  private static native void setGroupOrder(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Integer value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::groupOrder = value;
  }-*/;
  
  private static native java.lang.String getHelpText(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::helpText;
  }-*/;
  
  private static native void setHelpText(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::helpText = value;
  }-*/;
  
  private static native java.lang.String getHint(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::hint;
  }-*/;
  
  private static native void setHint(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::hint = value;
  }-*/;
  
  private static native java.lang.Boolean getLargeEntry(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::largeEntry;
  }-*/;
  
  private static native void setLargeEntry(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::largeEntry = value;
  }-*/;
  
  private static native java.lang.Integer getLength(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::length;
  }-*/;
  
  private static native void setLength(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Integer value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::length = value;
  }-*/;
  
  private static native java.lang.String getLookupDisplayProperty(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::lookupDisplayProperty;
  }-*/;
  
  private static native void setLookupDisplayProperty(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::lookupDisplayProperty = value;
  }-*/;
  
  private static native java.lang.String getLookupParentDataSourceName(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::lookupParentDataSourceName;
  }-*/;
  
  private static native void setLookupParentDataSourceName(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::lookupParentDataSourceName = value;
  }-*/;
  
  private static native org.broadleafcommerce.openadmin.client.dto.MergedPropertyType getMergedPropertyType(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::mergedPropertyType;
  }-*/;
  
  private static native void setMergedPropertyType(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, org.broadleafcommerce.openadmin.client.dto.MergedPropertyType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::mergedPropertyType = value;
  }-*/;
  
  private static native java.lang.Boolean getMutable(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::mutable;
  }-*/;
  
  private static native void setMutable(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::mutable = value;
  }-*/;
  
  private static native java.lang.String getName(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::name;
  }-*/;
  
  private static native void setName(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::name = value;
  }-*/;
  
  private static native java.lang.Boolean getOptionCanEditValues(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionCanEditValues;
  }-*/;
  
  private static native void setOptionCanEditValues(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionCanEditValues = value;
  }-*/;
  
  private static native java.lang.String getOptionDisplayFieldName(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionDisplayFieldName;
  }-*/;
  
  private static native void setOptionDisplayFieldName(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionDisplayFieldName = value;
  }-*/;
  
  private static native java.lang.String[][] getOptionFilterParams(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionFilterParams;
  }-*/;
  
  private static native void setOptionFilterParams(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String[][] value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionFilterParams = value;
  }-*/;
  
  private static native java.lang.String getOptionListEntity(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionListEntity;
  }-*/;
  
  private static native void setOptionListEntity(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionListEntity = value;
  }-*/;
  
  private static native java.lang.String getOptionValueFieldName(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionValueFieldName;
  }-*/;
  
  private static native void setOptionValueFieldName(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::optionValueFieldName = value;
  }-*/;
  
  private static native java.lang.Integer getPrecision(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::precision;
  }-*/;
  
  private static native void setPrecision(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Integer value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::precision = value;
  }-*/;
  
  private static native java.lang.Boolean getProminent(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::prominent;
  }-*/;
  
  private static native void setProminent(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::prominent = value;
  }-*/;
  
  private static native java.lang.Boolean getReadOnly(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::readOnly;
  }-*/;
  
  private static native void setReadOnly(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::readOnly = value;
  }-*/;
  
  private static native java.lang.Boolean getRequired(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::required;
  }-*/;
  
  private static native void setRequired(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::required = value;
  }-*/;
  
  private static native java.lang.Boolean getRequiredOverride(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::requiredOverride;
  }-*/;
  
  private static native void setRequiredOverride(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::requiredOverride = value;
  }-*/;
  
  private static native java.lang.Integer getScale(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::scale;
  }-*/;
  
  private static native void setScale(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Integer value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::scale = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.SupportedFieldType getSecondaryType(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::secondaryType;
  }-*/;
  
  private static native void setSecondaryType(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, org.broadleafcommerce.common.presentation.client.SupportedFieldType value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::secondaryType = value;
  }-*/;
  
  private static native java.lang.String getTargetDynamicFormDisplayId(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::targetDynamicFormDisplayId;
  }-*/;
  
  private static native void setTargetDynamicFormDisplayId(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::targetDynamicFormDisplayId = value;
  }-*/;
  
  private static native java.lang.Boolean getToOneLookupCreatedViaAnnotation(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::toOneLookupCreatedViaAnnotation;
  }-*/;
  
  private static native void setToOneLookupCreatedViaAnnotation(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::toOneLookupCreatedViaAnnotation = value;
  }-*/;
  
  private static native java.lang.String getTooltip(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::tooltip;
  }-*/;
  
  private static native void setTooltip(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.String value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::tooltip = value;
  }-*/;
  
  private static native java.lang.Boolean getUnique(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::unique;
  }-*/;
  
  private static native void setUnique(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::unique = value;
  }-*/;
  
  private static native java.lang.Boolean getUseServerSideInspectionCache(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::useServerSideInspectionCache;
  }-*/;
  
  private static native void setUseServerSideInspectionCache(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.lang.Boolean value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::useServerSideInspectionCache = value;
  }-*/;
  
  private static native java.util.Map getValidationConfigurations(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::validationConfigurations;
  }-*/;
  
  private static native void setValidationConfigurations(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, java.util.Map value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::validationConfigurations = value;
  }-*/;
  
  private static native org.broadleafcommerce.common.presentation.client.VisibilityEnum getVisibility(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) /*-{
    return instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::visibility;
  }-*/;
  
  private static native void setVisibility(org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance, org.broadleafcommerce.common.presentation.client.VisibilityEnum value) 
  /*-{
    instance.@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::visibility = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) throws SerializationException {
    setBroadleafEnumeration(instance, streamReader.readString());
    setColumnWidth(instance, streamReader.readString());
    setCustomCriteria(instance, (java.lang.String[]) streamReader.readObject());
    setEnumerationClass(instance, streamReader.readString());
    setEnumerationValues(instance, (java.lang.String[][]) streamReader.readObject());
    setExplicitFieldType(instance, (org.broadleafcommerce.common.presentation.client.SupportedFieldType) streamReader.readObject());
    setFieldType(instance, (org.broadleafcommerce.common.presentation.client.SupportedFieldType) streamReader.readObject());
    setForeignKeyClass(instance, streamReader.readString());
    setForeignKeyCollection(instance, (java.lang.Boolean) streamReader.readObject());
    setForeignKeyDisplayValueProperty(instance, streamReader.readString());
    setForeignKeyProperty(instance, streamReader.readString());
    setGroup(instance, streamReader.readString());
    setGroupCollapsed(instance, (java.lang.Boolean) streamReader.readObject());
    setGroupOrder(instance, (java.lang.Integer) streamReader.readObject());
    setHelpText(instance, streamReader.readString());
    setHint(instance, streamReader.readString());
    setLargeEntry(instance, (java.lang.Boolean) streamReader.readObject());
    setLength(instance, (java.lang.Integer) streamReader.readObject());
    setLookupDisplayProperty(instance, streamReader.readString());
    setLookupParentDataSourceName(instance, streamReader.readString());
    setMergedPropertyType(instance, (org.broadleafcommerce.openadmin.client.dto.MergedPropertyType) streamReader.readObject());
    setMutable(instance, (java.lang.Boolean) streamReader.readObject());
    setName(instance, streamReader.readString());
    setOptionCanEditValues(instance, (java.lang.Boolean) streamReader.readObject());
    setOptionDisplayFieldName(instance, streamReader.readString());
    setOptionFilterParams(instance, (java.lang.String[][]) streamReader.readObject());
    setOptionListEntity(instance, streamReader.readString());
    setOptionValueFieldName(instance, streamReader.readString());
    setPrecision(instance, (java.lang.Integer) streamReader.readObject());
    setProminent(instance, (java.lang.Boolean) streamReader.readObject());
    setReadOnly(instance, (java.lang.Boolean) streamReader.readObject());
    setRequired(instance, (java.lang.Boolean) streamReader.readObject());
    setRequiredOverride(instance, (java.lang.Boolean) streamReader.readObject());
    setScale(instance, (java.lang.Integer) streamReader.readObject());
    setSecondaryType(instance, (org.broadleafcommerce.common.presentation.client.SupportedFieldType) streamReader.readObject());
    setTargetDynamicFormDisplayId(instance, streamReader.readString());
    setToOneLookupCreatedViaAnnotation(instance, (java.lang.Boolean) streamReader.readObject());
    setTooltip(instance, streamReader.readString());
    setUnique(instance, (java.lang.Boolean) streamReader.readObject());
    setUseServerSideInspectionCache(instance, (java.lang.Boolean) streamReader.readObject());
    setValidationConfigurations(instance, (java.util.Map) streamReader.readObject());
    setVisibility(instance, (org.broadleafcommerce.common.presentation.client.VisibilityEnum) streamReader.readObject());
    
    org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata instance) throws SerializationException {
    streamWriter.writeString(getBroadleafEnumeration(instance));
    streamWriter.writeString(getColumnWidth(instance));
    streamWriter.writeObject(getCustomCriteria(instance));
    streamWriter.writeString(getEnumerationClass(instance));
    streamWriter.writeObject(getEnumerationValues(instance));
    streamWriter.writeObject(getExplicitFieldType(instance));
    streamWriter.writeObject(getFieldType(instance));
    streamWriter.writeString(getForeignKeyClass(instance));
    streamWriter.writeObject(getForeignKeyCollection(instance));
    streamWriter.writeString(getForeignKeyDisplayValueProperty(instance));
    streamWriter.writeString(getForeignKeyProperty(instance));
    streamWriter.writeString(getGroup(instance));
    streamWriter.writeObject(getGroupCollapsed(instance));
    streamWriter.writeObject(getGroupOrder(instance));
    streamWriter.writeString(getHelpText(instance));
    streamWriter.writeString(getHint(instance));
    streamWriter.writeObject(getLargeEntry(instance));
    streamWriter.writeObject(getLength(instance));
    streamWriter.writeString(getLookupDisplayProperty(instance));
    streamWriter.writeString(getLookupParentDataSourceName(instance));
    streamWriter.writeObject(getMergedPropertyType(instance));
    streamWriter.writeObject(getMutable(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getOptionCanEditValues(instance));
    streamWriter.writeString(getOptionDisplayFieldName(instance));
    streamWriter.writeObject(getOptionFilterParams(instance));
    streamWriter.writeString(getOptionListEntity(instance));
    streamWriter.writeString(getOptionValueFieldName(instance));
    streamWriter.writeObject(getPrecision(instance));
    streamWriter.writeObject(getProminent(instance));
    streamWriter.writeObject(getReadOnly(instance));
    streamWriter.writeObject(getRequired(instance));
    streamWriter.writeObject(getRequiredOverride(instance));
    streamWriter.writeObject(getScale(instance));
    streamWriter.writeObject(getSecondaryType(instance));
    streamWriter.writeString(getTargetDynamicFormDisplayId(instance));
    streamWriter.writeObject(getToOneLookupCreatedViaAnnotation(instance));
    streamWriter.writeString(getTooltip(instance));
    streamWriter.writeObject(getUnique(instance));
    streamWriter.writeObject(getUseServerSideInspectionCache(instance));
    streamWriter.writeObject(getValidationConfigurations(instance));
    streamWriter.writeObject(getVisibility(instance));
    
    org.broadleafcommerce.openadmin.client.dto.FieldMetadata_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata_FieldSerializer.deserialize(reader, (org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata_FieldSerializer.serialize(writer, (org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata)object);
  }
  
}
