package org.broadleafcommerce.openadmin.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class AdminExporterService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final MethodMap methodMapNative;
  private static final JsArrayString signatureMapNative;
  
  static {
    methodMapNative = loadMethodsNative();
    signatureMapNative = loadSignaturesNative();
  }
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native MethodMap loadMethodsNative() /*-{
    var result = {};
    result["com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533"] = [
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;),
        @com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/IncompatibleRemoteServiceException;)
      ];
    
    result["com.google.gwt.user.client.rpc.RpcTokenException/2345075298"] = [
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/google/gwt/user/client/rpc/RpcTokenException;),
      ];
    
    result["com.google.gwt.user.client.rpc.XsrfToken/4254043109"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lcom/google/gwt/user/client/rpc/XsrfToken;)
      ];
    
    result["com.gwtincubator.security.exception.AccessDeniedException/4287773925"] = [
        @com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.gwtincubator.security.exception.AccessDeniedException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/gwtincubator/security/exception/AccessDeniedException;),
      ];
    
    result["com.gwtincubator.security.exception.ApplicationSecurityException/1480264612"] = [
        @com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.gwtincubator.security.exception.ApplicationSecurityException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/gwtincubator/security/exception/ApplicationSecurityException;),
      ];
    
    result["com.gwtincubator.security.exception.AuthenticationException/597576682"] = [
        @com.gwtincubator.security.exception.AuthenticationException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.gwtincubator.security.exception.AuthenticationException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lcom/gwtincubator/security/exception/AuthenticationException;),
      ];
    
    result["java.lang.Boolean/476441737"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Boolean;),
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
      ];
    
    result["[[Ljava.lang.String;/4182515373"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[[Ljava/lang/String;),
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.Collections$EmptyMap/4174664486"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Map;),
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
      ];
    
    result["java.util.HashMap/1797211028"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
      ];
    
    result["java.util.IdentityHashMap/1839153020"] = [
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
      ];
    
    result["java.util.LinkedHashMap/3008245022"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
      ];
    
    result["java.util.Stack/1346942793"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Stack;),
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
      ];
    
    result["org.broadleafcommerce.common.presentation.client.AddMethodType/2079268984"] = [
        @org.broadleafcommerce.common.presentation.client.AddMethodType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.AddMethodType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/AddMethodType;),
      ];
    
    result["org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType/2955750945"] = [
        @org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/ForeignKeyRestrictionType;),
      ];
    
    result["org.broadleafcommerce.common.presentation.client.OperationType/3692399177"] = [
        @org.broadleafcommerce.common.presentation.client.OperationType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.OperationType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/OperationType;),
      ];
    
    result["org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType/1175025463"] = [
        @org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/PersistencePerspectiveItemType;),
      ];
    
    result["org.broadleafcommerce.common.presentation.client.SupportedFieldType/3316297090"] = [
        @org.broadleafcommerce.common.presentation.client.SupportedFieldType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.SupportedFieldType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/SupportedFieldType;),
      ];
    
    result["org.broadleafcommerce.common.presentation.client.VisibilityEnum/270902970"] = [
        @org.broadleafcommerce.common.presentation.client.VisibilityEnum_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.VisibilityEnum_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/VisibilityEnum;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO/1612225300"] = [
        @org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/AdminExporterDTO;),
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.AdminExporterDTO;/3409014814"] = [
        @org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/AdminExporterDTO;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata/3605526924"] = [
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/AdornedTargetCollectionMetadata;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.AdornedTargetList/3759284216"] = [
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetList_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/AdornedTargetList;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata/2687375595"] = [
        @org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/BasicCollectionMetadata;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata/1218065822"] = [
        @org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/BasicFieldMetadata;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.ForeignKey/186253258"] = [
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/ForeignKey;),
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.ForeignKey;/1162563663"] = [
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/ForeignKey;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.MapMetadata/444024748"] = [
        @org.broadleafcommerce.openadmin.client.dto.MapMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.MapMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/MapMetadata;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.MapStructure/3201855396"] = [
        @org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/MapStructure;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.MergedPropertyType/1790318142"] = [
        @org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/MergedPropertyType;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.OperationTypes/2063508238"] = [
        @org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/OperationTypes;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.PersistencePerspective/643827608"] = [
        @org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/PersistencePerspective;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.Property/1468380200"] = [
        @org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/Property;),
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.Property;/3064816717"] = [
        @org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/Property;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure/2131997666"] = [
        @org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/SimpleValueMapStructure;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.reflection.ModuleFactory/1008637663"] = [
        @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/reflection/ModuleFactory;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper/211579493"] = [
        @org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/reflection/ReflectiveFactoryWrapper;),
      ];
    
    return result;
  }-*/;
  
  @SuppressWarnings("deprecation")
  @GwtScriptOnly
  private static native JsArrayString loadSignaturesNative() /*-{
    var result = [];
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException::class)] = "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.RpcTokenException::class)] = "com.google.gwt.user.client.rpc.RpcTokenException/2345075298";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.google.gwt.user.client.rpc.XsrfToken::class)] = "com.google.gwt.user.client.rpc.XsrfToken/4254043109";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.gwtincubator.security.exception.AccessDeniedException::class)] = "com.gwtincubator.security.exception.AccessDeniedException/4287773925";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.gwtincubator.security.exception.ApplicationSecurityException::class)] = "com.gwtincubator.security.exception.ApplicationSecurityException/1480264612";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@com.gwtincubator.security.exception.AuthenticationException::class)] = "com.gwtincubator.security.exception.AuthenticationException/597576682";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Boolean::class)] = "java.lang.Boolean/476441737";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.Integer::class)] = "java.lang.Integer/3438268394";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String::class)] = "java.lang.String/2004016611";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[]::class)] = "[Ljava.lang.String;/2600011424";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.lang.String[][]::class)] = "[[Ljava.lang.String;/4182515373";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.ArrayList::class)] = "java.util.ArrayList/4159755760";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Arrays.ArrayList::class)] = "java.util.Arrays$ArrayList/2507071751";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyList::class)] = "java.util.Collections$EmptyList/4157118744";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.EmptyMap::class)] = "java.util.Collections$EmptyMap/4174664486";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Collections.SingletonList::class)] = "java.util.Collections$SingletonList/1586180994";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.HashMap::class)] = "java.util.HashMap/1797211028";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.IdentityHashMap::class)] = "java.util.IdentityHashMap/1839153020";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedHashMap::class)] = "java.util.LinkedHashMap/3008245022";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.LinkedList::class)] = "java.util.LinkedList/3953877921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Stack::class)] = "java.util.Stack/1346942793";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.TreeMap::class)] = "java.util.TreeMap/1493889780";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@java.util.Vector::class)] = "java.util.Vector/3057315478";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.AddMethodType::class)] = "org.broadleafcommerce.common.presentation.client.AddMethodType/2079268984";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType::class)] = "org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType/2955750945";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.OperationType::class)] = "org.broadleafcommerce.common.presentation.client.OperationType/3692399177";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType::class)] = "org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType/1175025463";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.SupportedFieldType::class)] = "org.broadleafcommerce.common.presentation.client.SupportedFieldType/3316297090";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.VisibilityEnum::class)] = "org.broadleafcommerce.common.presentation.client.VisibilityEnum/270902970";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO::class)] = "org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO/1612225300";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.AdminExporterDTO[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.AdminExporterDTO;/3409014814";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata/3605526924";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::class)] = "org.broadleafcommerce.openadmin.client.dto.AdornedTargetList/3759284216";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata/2687375595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata/1218065822";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ForeignKey::class)] = "org.broadleafcommerce.openadmin.client.dto.ForeignKey/186253258";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ForeignKey[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.ForeignKey;/1162563663";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.MapMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.MapMetadata/444024748";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.MapStructure::class)] = "org.broadleafcommerce.openadmin.client.dto.MapStructure/3201855396";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.MergedPropertyType::class)] = "org.broadleafcommerce.openadmin.client.dto.MergedPropertyType/1790318142";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.OperationTypes::class)] = "org.broadleafcommerce.openadmin.client.dto.OperationTypes/2063508238";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.PersistencePerspective::class)] = "org.broadleafcommerce.openadmin.client.dto.PersistencePerspective/643827608";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Property::class)] = "org.broadleafcommerce.openadmin.client.dto.Property/1468380200";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Property[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.Property;/3064816717";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure::class)] = "org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure/2131997666";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.reflection.ModuleFactory::class)] = "org.broadleafcommerce.openadmin.client.reflection.ModuleFactory/1008637663";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper::class)] = "org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper/211579493";
    return result;
  }-*/;
  
  public AdminExporterService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
