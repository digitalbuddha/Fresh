var $intern_1818 = 'org.broadleafcommerce.cms.admin.client.presenter.urlRedirect.';
function org_broadleafcommerce_cms_admin_client_datasource_url_UrlRedirectDataSourceFactory_UrlRedirectDataSourceFactory__V(){
  this.org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_entityClassName = 'org.broadleafcommerce.cms.url.domain.URLHandler';
}

function org_broadleafcommerce_cms_admin_client_datasource_url_UrlRedirectDataSourceFactory(){
}

_ = org_broadleafcommerce_cms_admin_client_datasource_url_UrlRedirectDataSourceFactory_UrlRedirectDataSourceFactory__V.prototype = org_broadleafcommerce_cms_admin_client_datasource_url_UrlRedirectDataSourceFactory.prototype = new org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory;
_.createDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_Object_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V = function org_broadleafcommerce_cms_admin_client_datasource_url_UrlRedirectDataSourceFactory_createDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_Object_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V(name, operationTypes, additionalItems, cb){
  var dataSource, modules, persistencePerspective;
  persistencePerspective = org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_$createPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2(this);
  modules = com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(java_util_ArrayList_$toArray__Ljava_util_ArrayList_2_3Ljava_lang_Object_2_3Ljava_lang_Object_2(org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_$createDataSourceModules__Lorg_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_2Ljava_util_List_2(this), com_google_gwt_lang_Array_initDim__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2IIILcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1dynamic_1module_1DataSourceModule_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_lang_Object_$1, Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule_$1]), Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule, 0, 0)), Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule_$1);
  dataSource = new org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_CustomCriteriaListGridDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_service_DynamicEntityServiceAsync_2_3Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule_2ZZZZZV(name, persistencePerspective, (org_broadleafcommerce_openadmin_client_service_AppServices_$clinit__V() , org_broadleafcommerce_openadmin_client_service_AppServices_DYNAMIC_1ENTITY), modules, true, true, true, true, true);
  org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_$buildFields__Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_2_3Ljava_lang_String_2Ljava_lang_Boolean_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V(dataSource, null, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE), cb);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_cms_admin_client_datasource_url_UrlRedirectDataSourceFactory_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1datasource_1url_1UrlRedirectDataSourceFactory_12_1classLit;
}
;
_.setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2 = function org_broadleafcommerce_cms_admin_client_datasource_url_UrlRedirectDataSourceFactory_setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2(persistencePerspective){
  org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_$setOperationTypes__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2V(persistencePerspective, new org_broadleafcommerce_openadmin_client_dto_OperationTypes_OperationTypes__Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2V((org_broadleafcommerce_common_presentation_client_OperationType_$clinit__V() , org_broadleafcommerce_common_presentation_client_OperationType_BASIC), org_broadleafcommerce_common_presentation_client_OperationType_BASIC, org_broadleafcommerce_common_presentation_client_OperationType_BASIC, org_broadleafcommerce_common_presentation_client_OperationType_BASIC, org_broadleafcommerce_common_presentation_client_OperationType_BASIC));
  return persistencePerspective;
}
;
function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_UrlRedirectPresenter__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$clinit__V();
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_DynamicEntityPresenter__V.call(this);
}

function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter(){
}

_ = org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_UrlRedirectPresenter__V.prototype = org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter.prototype = new org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter;
_.addClicked__V = function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_addClicked__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$addClicked__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Ljava_lang_String_2V(this, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1161));
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1presenter_1urlRedirect_1UrlRedirectPresenter_12_1classLit;
}
;
_.setup__V = function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_setup__V(){
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2Ljava_lang_Integer_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V('urlRedirectDS', new org_broadleafcommerce_cms_admin_client_datasource_url_UrlRedirectDataSourceFactory_UrlRedirectDataSourceFactory__V, new org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1_UrlRedirectPresenter$1__Lorg_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_2V(this)));
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter, Q$org_broadleafcommerce_openadmin_client_presenter_entity_EntityPresenter]);
function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1_UrlRedirectPresenter$1__Lorg_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_2V(this$0){
  this.org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1_this$0 = this$0;
}

function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1(){
}

_ = org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1_UrlRedirectPresenter$1__Lorg_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_2V.prototype = org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1presenter_1urlRedirect_1UrlRedirectPresenter$1_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(top){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$setupDisplayItems__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(this.org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1_this$0, top, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lcom_1smartgwt_1client_1data_1DataSource_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_lang_Object_$1]), Q$com_smartgwt_client_data_DataSource, []));
  com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(top, Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource).setupGridFields___3Ljava_lang_String_2_3Ljava_lang_Boolean_2_3Ljava_lang_String_2(com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, [$intern_721, 'incomingUrl', 'newURL', 'urlRedirectType']), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1Boolean_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1]), Q$java_lang_Boolean, [(java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE), java_lang_Boolean_TRUE, java_lang_Boolean_TRUE, java_lang_Boolean_TRUE]));
}
;
_.org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter$1_this$0 = null;
_ = org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$18.prototype;
_.onSuccess__V = function org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$18_onSuccess__V(){
  this.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$18_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_cms_admin_client_presenter_urlRedirect_UrlRedirectPresenter_UrlRedirectPresenter__V);
}
;
var com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1datasource_1url_1UrlRedirectDataSourceFactory_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2('org.broadleafcommerce.cms.admin.client.datasource.url.', 'UrlRedirectDataSourceFactory', com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1SimpleDataSourceFactory_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1presenter_1urlRedirect_1UrlRedirectPresenter_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1818, 'UrlRedirectPresenter', com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1DynamicEntityPresenter_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1presenter_1urlRedirect_1UrlRedirectPresenter$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1818, 'UrlRedirectPresenter$1', com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1setup_1AsyncCallbackAdapter_12_1classLit);
$entry(com_google_gwt_core_client_impl_AsyncFragmentLoader_onLoad__IV)(18);
