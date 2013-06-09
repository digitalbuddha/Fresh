package org.broadleafcommerce.openadmin.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class DynamicEntityService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
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
        @com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Boolean;)
      ];
    
    result["java.lang.Integer/3438268394"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/Integer;),
        @com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/Integer;)
      ];
    
    result["java.lang.String/2004016611"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/lang/String;)
      ];
    
    result["[Ljava.lang.String;/2600011424"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Ljava/lang/String;)
      ];
    
    result["[[Ljava.lang.String;/4182515373"] = [
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[[Ljava/lang/String;),
        @com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_2_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[[Ljava/lang/String;)
      ];
    
    result["java.util.ArrayList/4159755760"] = [
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/ArrayList;),
        @com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/ArrayList;)
      ];
    
    result["java.util.Arrays$ArrayList/2507071751"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyList/4157118744"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.Collections$EmptyMap/4174664486"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Map;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Map;)
      ];
    
    result["java.util.Collections$SingletonList/1586180994"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/List;),
        @com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/List;)
      ];
    
    result["java.util.HashMap/1797211028"] = [
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/HashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/HashMap;)
      ];
    
    result["java.util.IdentityHashMap/1839153020"] = [
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/IdentityHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.IdentityHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/IdentityHashMap;)
      ];
    
    result["java.util.LinkedHashMap/3008245022"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedHashMap;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedHashMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedHashMap;)
      ];
    
    result["java.util.LinkedList/3953877921"] = [
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/LinkedList;),
        @com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/LinkedList;)
      ];
    
    result["java.util.Stack/1346942793"] = [
        ,
        ,
        @com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Stack;)
      ];
    
    result["java.util.TreeMap/1493889780"] = [
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/TreeMap;),
        @com.google.gwt.user.client.rpc.core.java.util.TreeMap_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/TreeMap;)
      ];
    
    result["java.util.Vector/3057315478"] = [
        @com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Ljava/util/Vector;),
        @com.google.gwt.user.client.rpc.core.java.util.Vector_CustomFieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Ljava/util/Vector;)
      ];
    
    result["org.broadleafcommerce.common.exception.ServiceException/1744595097"] = [
        @org.broadleafcommerce.common.exception.ServiceException_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.exception.ServiceException_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/exception/ServiceException;),
      ];
    
    result["org.broadleafcommerce.common.presentation.client.AddMethodType/2079268984"] = [
        @org.broadleafcommerce.common.presentation.client.AddMethodType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.AddMethodType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/AddMethodType;),
        @org.broadleafcommerce.common.presentation.client.AddMethodType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/common/presentation/client/AddMethodType;)
      ];
    
    result["org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType/2955750945"] = [
        @org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/ForeignKeyRestrictionType;),
        @org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/common/presentation/client/ForeignKeyRestrictionType;)
      ];
    
    result["org.broadleafcommerce.common.presentation.client.OperationType/3692399177"] = [
        @org.broadleafcommerce.common.presentation.client.OperationType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.OperationType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/OperationType;),
        @org.broadleafcommerce.common.presentation.client.OperationType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/common/presentation/client/OperationType;)
      ];
    
    result["org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType/1175025463"] = [
        @org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/PersistencePerspectiveItemType;),
        @org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/common/presentation/client/PersistencePerspectiveItemType;)
      ];
    
    result["org.broadleafcommerce.common.presentation.client.SupportedFieldType/3316297090"] = [
        @org.broadleafcommerce.common.presentation.client.SupportedFieldType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.SupportedFieldType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/SupportedFieldType;),
        @org.broadleafcommerce.common.presentation.client.SupportedFieldType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/common/presentation/client/SupportedFieldType;)
      ];
    
    result["org.broadleafcommerce.common.presentation.client.VisibilityEnum/270902970"] = [
        @org.broadleafcommerce.common.presentation.client.VisibilityEnum_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.common.presentation.client.VisibilityEnum_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/common/presentation/client/VisibilityEnum;),
        @org.broadleafcommerce.common.presentation.client.VisibilityEnum_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/common/presentation/client/VisibilityEnum;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata/3605526924"] = [
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/AdornedTargetCollectionMetadata;),
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/AdornedTargetCollectionMetadata;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.AdornedTargetList/3759284216"] = [
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetList_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetList_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/AdornedTargetList;),
        @org.broadleafcommerce.openadmin.client.dto.AdornedTargetList_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/AdornedTargetList;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata/2687375595"] = [
        @org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/BasicCollectionMetadata;),
        @org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/BasicCollectionMetadata;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata/1218065822"] = [
        @org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/BasicFieldMetadata;),
        @org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/BasicFieldMetadata;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet/2970874833"] = [
        @org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/BatchDynamicResultSet;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage/1993539294"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/BatchPersistencePackage;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.ClassMetadata/1245459528"] = [
        @org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ClassMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/ClassMetadata;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.ClassTree/4076374869"] = [
        @org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ClassTree_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/ClassTree;),
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.ClassTree;/3852535837"] = [
        @org.broadleafcommerce.openadmin.client.dto.ClassTree_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ClassTree_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/ClassTree;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject/4064728921"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/CriteriaTransferObject;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.DynamicResultSet/2249169375"] = [
        @org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/DynamicResultSet;),
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.DynamicResultSet;/3248831231"] = [
        @org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.DynamicResultSet_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/DynamicResultSet;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.Entity/840046097"] = [
        @org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/Entity;),
        @org.broadleafcommerce.openadmin.client.dto.Entity_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/Entity;)
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.Entity;/476253880"] = [
        @org.broadleafcommerce.openadmin.client.dto.Entity_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Entity_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/Entity;),
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria/2812370177"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/FilterAndSortCriteria;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.ForeignKey/186253258"] = [
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/ForeignKey;),
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/ForeignKey;)
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.ForeignKey;/1162563663"] = [
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/ForeignKey;),
        @org.broadleafcommerce.openadmin.client.dto.ForeignKey_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/broadleafcommerce/openadmin/client/dto/ForeignKey;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.MapMetadata/444024748"] = [
        @org.broadleafcommerce.openadmin.client.dto.MapMetadata_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.MapMetadata_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/MapMetadata;),
        @org.broadleafcommerce.openadmin.client.dto.MapMetadata_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/MapMetadata;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.MapStructure/3201855396"] = [
        @org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/MapStructure;),
        @org.broadleafcommerce.openadmin.client.dto.MapStructure_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/MapStructure;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.MergedPropertyType/1790318142"] = [
        @org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/MergedPropertyType;),
        @org.broadleafcommerce.openadmin.client.dto.MergedPropertyType_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/MergedPropertyType;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.OperationTypes/2063508238"] = [
        @org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/OperationTypes;),
        @org.broadleafcommerce.openadmin.client.dto.OperationTypes_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/OperationTypes;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.PersistencePackage/1253682042"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.PersistencePackage_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/PersistencePackage;)
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.PersistencePackage;/2755905236"] = [
        ,
        ,
        @org.broadleafcommerce.openadmin.client.dto.PersistencePackage_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/broadleafcommerce/openadmin/client/dto/PersistencePackage;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.PersistencePerspective/643827608"] = [
        @org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/PersistencePerspective;),
        @org.broadleafcommerce.openadmin.client.dto.PersistencePerspective_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/PersistencePerspective;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.Property/1468380200"] = [
        @org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/Property;),
        @org.broadleafcommerce.openadmin.client.dto.Property_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/Property;)
      ];
    
    result["[Lorg.broadleafcommerce.openadmin.client.dto.Property;/3064816717"] = [
        @org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;[Lorg/broadleafcommerce/openadmin/client/dto/Property;),
        @org.broadleafcommerce.openadmin.client.dto.Property_Array_Rank_1_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;[Lorg/broadleafcommerce/openadmin/client/dto/Property;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure/2131997666"] = [
        @org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/dto/SimpleValueMapStructure;),
        @org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/dto/SimpleValueMapStructure;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.reflection.ModuleFactory/1008637663"] = [
        @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/reflection/ModuleFactory;),
        @org.broadleafcommerce.openadmin.client.reflection.ModuleFactory_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/reflection/ModuleFactory;)
      ];
    
    result["org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper/211579493"] = [
        @org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer::instantiate(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;),
        @org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer::deserialize(Lcom/google/gwt/user/client/rpc/SerializationStreamReader;Lorg/broadleafcommerce/openadmin/client/reflection/ReflectiveFactoryWrapper;),
        @org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper_FieldSerializer::serialize(Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;Lorg/broadleafcommerce/openadmin/client/reflection/ReflectiveFactoryWrapper;)
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
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.exception.ServiceException::class)] = "org.broadleafcommerce.common.exception.ServiceException/1744595097";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.AddMethodType::class)] = "org.broadleafcommerce.common.presentation.client.AddMethodType/2079268984";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType::class)] = "org.broadleafcommerce.common.presentation.client.ForeignKeyRestrictionType/2955750945";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.OperationType::class)] = "org.broadleafcommerce.common.presentation.client.OperationType/3692399177";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType::class)] = "org.broadleafcommerce.common.presentation.client.PersistencePerspectiveItemType/1175025463";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.SupportedFieldType::class)] = "org.broadleafcommerce.common.presentation.client.SupportedFieldType/3316297090";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.common.presentation.client.VisibilityEnum::class)] = "org.broadleafcommerce.common.presentation.client.VisibilityEnum/270902970";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.AdornedTargetCollectionMetadata/3605526924";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.AdornedTargetList::class)] = "org.broadleafcommerce.openadmin.client.dto.AdornedTargetList/3759284216";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.BasicCollectionMetadata/2687375595";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.BasicFieldMetadata/1218065822";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet::class)] = "org.broadleafcommerce.openadmin.client.dto.BatchDynamicResultSet/2970874833";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage::class)] = "org.broadleafcommerce.openadmin.client.dto.BatchPersistencePackage/1993539294";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ClassMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.ClassMetadata/1245459528";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ClassTree::class)] = "org.broadleafcommerce.openadmin.client.dto.ClassTree/4076374869";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ClassTree[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.ClassTree;/3852535837";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject::class)] = "org.broadleafcommerce.openadmin.client.dto.CriteriaTransferObject/4064728921";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet::class)] = "org.broadleafcommerce.openadmin.client.dto.DynamicResultSet/2249169375";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.DynamicResultSet[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.DynamicResultSet;/3248831231";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Entity::class)] = "org.broadleafcommerce.openadmin.client.dto.Entity/840046097";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Entity[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.Entity;/476253880";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria::class)] = "org.broadleafcommerce.openadmin.client.dto.FilterAndSortCriteria/2812370177";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ForeignKey::class)] = "org.broadleafcommerce.openadmin.client.dto.ForeignKey/186253258";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.ForeignKey[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.ForeignKey;/1162563663";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.MapMetadata::class)] = "org.broadleafcommerce.openadmin.client.dto.MapMetadata/444024748";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.MapStructure::class)] = "org.broadleafcommerce.openadmin.client.dto.MapStructure/3201855396";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.MergedPropertyType::class)] = "org.broadleafcommerce.openadmin.client.dto.MergedPropertyType/1790318142";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.OperationTypes::class)] = "org.broadleafcommerce.openadmin.client.dto.OperationTypes/2063508238";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.PersistencePackage::class)] = "org.broadleafcommerce.openadmin.client.dto.PersistencePackage/1253682042";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.PersistencePackage[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.PersistencePackage;/2755905236";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.PersistencePerspective::class)] = "org.broadleafcommerce.openadmin.client.dto.PersistencePerspective/643827608";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Property::class)] = "org.broadleafcommerce.openadmin.client.dto.Property/1468380200";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.Property[]::class)] = "[Lorg.broadleafcommerce.openadmin.client.dto.Property;/3064816717";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure::class)] = "org.broadleafcommerce.openadmin.client.dto.SimpleValueMapStructure/2131997666";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.reflection.ModuleFactory::class)] = "org.broadleafcommerce.openadmin.client.reflection.ModuleFactory/1008637663";
    result[@com.google.gwt.core.client.impl.Impl::getHashCode(Ljava/lang/Object;)(@org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper::class)] = "org.broadleafcommerce.openadmin.client.reflection.ReflectiveFactoryWrapper/211579493";
    return result;
  }-*/;
  
  public DynamicEntityService_TypeSerializer() {
    super(null, methodMapNative, null, signatureMapNative);
  }
  
}
