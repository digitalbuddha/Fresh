function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_AdminCreateRoleListDataSourceFactory__V(){
}

function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory(){
}

_ = org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_AdminCreateRoleListDataSourceFactory__V.prototype = org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory.prototype = new java_lang_Object;
_.createDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_Object_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V = function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_createDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_Object_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V(name, operationTypes, additionalItems, cb){
  var modules, persistencePerspective;
  if (!org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource) {
    operationTypes = new org_broadleafcommerce_openadmin_client_dto_OperationTypes_OperationTypes__Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2V((org_broadleafcommerce_common_presentation_client_OperationType_$clinit__V() , org_broadleafcommerce_common_presentation_client_OperationType_BASIC), org_broadleafcommerce_common_presentation_client_OperationType_NONDESTRUCTIVEREMOVE, org_broadleafcommerce_common_presentation_client_OperationType_NONDESTRUCTIVEREMOVE, org_broadleafcommerce_common_presentation_client_OperationType_BASIC, org_broadleafcommerce_common_presentation_client_OperationType_BASIC);
    persistencePerspective = new org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_PersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2_3Ljava_lang_String_2_3Lorg_broadleafcommerce_openadmin_client_dto_ForeignKey_2V(operationTypes, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, []), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lorg_1broadleafcommerce_1openadmin_1client_1dto_1ForeignKey_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_Object_$1, Q$org_broadleafcommerce_openadmin_client_dto_ForeignKey_$1]), Q$org_broadleafcommerce_openadmin_client_dto_ForeignKey, []));
    org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_$addPersistencePerspectiveItem__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_common_presentation_client_PersistencePerspectiveItemType_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspectiveItem_2V(persistencePerspective, (org_broadleafcommerce_common_presentation_client_PersistencePerspectiveItemType_$clinit__V() , org_broadleafcommerce_common_presentation_client_PersistencePerspectiveItemType_FOREIGNKEY), new org_broadleafcommerce_openadmin_client_dto_ForeignKey_ForeignKey__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2V($intern_1862, $intern_1444));
    modules = com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1dynamic_1module_1DataSourceModule_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_lang_Object_$1, Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule_$1]), Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule, [new org_broadleafcommerce_openadmin_client_datasource_dynamic_module_BasicClientEntityModule_BasicClientEntityModule__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_service_DynamicEntityServiceAsync_2V($intern_1863, persistencePerspective, (org_broadleafcommerce_openadmin_client_service_AppServices_$clinit__V() , org_broadleafcommerce_openadmin_client_service_AppServices_DYNAMIC_1ENTITY))]);
    org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource = new org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_CustomCriteriaListGridDataSource__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_service_DynamicEntityServiceAsync_2_3Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_module_DataSourceModule_2ZZZZZV(name, persistencePerspective, org_broadleafcommerce_openadmin_client_service_AppServices_DYNAMIC_1ENTITY, modules, true, true, true, true, true);
    org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_$setCustomCriteria__Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_2_3Ljava_lang_String_2V(org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, ['createNewRole']));
    org_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_$buildFields__Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_CustomCriteriaListGridDataSource_2_3Ljava_lang_String_2Ljava_lang_Boolean_2Lcom_google_gwt_user_client_rpc_AsyncCallback_2V(org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource, null, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE), cb);
  }
   else {
    !!cb && org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_$onSuccess__Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2Lcom_smartgwt_client_data_DataSource_2V(cb, org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource);
  }
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminCreateRoleListDataSourceFactory_12_1classLit;
}
;
var org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_dataSource = null;
function org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_AdminPermissionRelatedToUserListDataSourceFactory__V(){
  this.org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory_entityClassName = $intern_1858;
}

function org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory(){
}

_ = org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_AdminPermissionRelatedToUserListDataSourceFactory__V.prototype = org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory.prototype = new org_broadleafcommerce_openadmin_client_datasource_SimpleDataSourceFactory;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminPermissionRelatedToUserListDataSourceFactory_12_1classLit;
}
;
_.setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2 = function org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_setupPersistencePerspective__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2(persistencePerspective){
  org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_$addPersistencePerspectiveItem__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_common_presentation_client_PersistencePerspectiveItemType_2Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspectiveItem_2V(persistencePerspective, (org_broadleafcommerce_common_presentation_client_PersistencePerspectiveItemType_$clinit__V() , org_broadleafcommerce_common_presentation_client_PersistencePerspectiveItemType_FOREIGNKEY), new org_broadleafcommerce_openadmin_client_dto_ForeignKey_ForeignKey__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2V($intern_1864, $intern_1865));
  org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_$setOperationTypes__Lorg_broadleafcommerce_openadmin_client_dto_PersistencePerspective_2Lorg_broadleafcommerce_openadmin_client_dto_OperationTypes_2V(persistencePerspective, new org_broadleafcommerce_openadmin_client_dto_OperationTypes_OperationTypes__Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2Lorg_broadleafcommerce_common_presentation_client_OperationType_2V((org_broadleafcommerce_common_presentation_client_OperationType_$clinit__V() , org_broadleafcommerce_common_presentation_client_OperationType_BASIC), org_broadleafcommerce_common_presentation_client_OperationType_NONDESTRUCTIVEREMOVE, org_broadleafcommerce_common_presentation_client_OperationType_NONDESTRUCTIVEREMOVE, org_broadleafcommerce_common_presentation_client_OperationType_NONDESTRUCTIVEREMOVE, org_broadleafcommerce_common_presentation_client_OperationType_BASIC));
  return persistencePerspective;
}
;
function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_RoleManagementPresenter__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$clinit__V();
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_DynamicEntityPresenter__V.call(this);
}

function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_RoleManagementPresenter__V.prototype = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter.prototype = new org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter;
_.addClicked__V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_addClicked__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$addClicked__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Ljava_lang_String_2V(this, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1298));
}
;
_.bind__V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_bind__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$bind__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2V(this);
  org_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchListPresenter_$bind__Lorg_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchListPresenter_2V(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter);
}
;
_.changeSelection__Lcom_smartgwt_client_data_Record_2V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_changeSelection__Lcom_smartgwt_client_data_Record_2V(selectedRecord){
  var dataSource;
  dataSource = com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(com_smartgwt_client_data_DataSource_getOrCreateRef__Lcom_google_gwt_core_client_JavaScriptObject_2Lcom_smartgwt_client_data_DataSource_2(com_smartgwt_client_widgets_BaseWidget_$getAttributeAsJavaScriptObject__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Lcom_google_gwt_core_client_JavaScriptObject_2(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2().getGrid__Lcom_smartgwt_client_widgets_grid_ListGrid_2(), $intern_1142)), Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource);
  org_broadleafcommerce_openadmin_client_presenter_entity_AbstractSubPresentable_$load__Lorg_broadleafcommerce_openadmin_client_presenter_entity_AbstractSubPresentable_2Lcom_smartgwt_client_data_Record_2Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource_2Lcom_smartgwt_client_data_DSCallback_2Z(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter, selectedRecord, dataSource, null);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter_12_1classLit;
}
;
_.getDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay_2 = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_getDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay_2(){
  return com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display, Q$org_broadleafcommerce_openadmin_client_view_user_RoleManagementDisplay);
}
;
_.setup__V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_setup__V(){
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2Ljava_lang_Integer_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_1866, new org_broadleafcommerce_openadmin_client_datasource_user_AdminCreateRoleListDataSourceFactory_AdminCreateRoleListDataSourceFactory__V, new org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_RoleManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V(this)));
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2Ljava_lang_Integer_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_1859, new org_broadleafcommerce_openadmin_client_datasource_user_AdminPermissionRelatedToUserListDataSourceFactory_AdminPermissionRelatedToUserListDataSourceFactory__V, new org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_RoleManagementPresenter$2__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V(this)));
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter, Q$org_broadleafcommerce_openadmin_client_presenter_entity_EntityPresenter]);
_.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter = null;
function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_RoleManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V(this$0){
  this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_this$0 = this$0;
}

function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_RoleManagementPresenter$1__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V.prototype = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter$1_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(top){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$setupDisplayItems__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_this$0, top, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lcom_1smartgwt_1client_1data_1DataSource_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_lang_Object_$1]), Q$com_smartgwt_client_data_DataSource, []));
  com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(top, Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource).setupGridFields___3Ljava_lang_String_2_3Ljava_lang_Boolean_2_3Ljava_lang_String_2(com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, [$intern_1691]), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1Boolean_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1]), Q$java_lang_Boolean, [(java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE)]));
}
;
_.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$1_this$0 = null;
function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_RoleManagementPresenter$2__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V(this$0){
  this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0 = this$0;
}

function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2(){
}

_ = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_RoleManagementPresenter$2__Lorg_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_2V.prototype = org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter$2_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(dataSource){
  this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter = new org_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchListPresenter_SimpleSearchListPresenter__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_view_dynamic_grid_GridStructureDisplay_2Lorg_broadleafcommerce_openadmin_client_view_dynamic_dialog_EntitySearchDialog_2_3Ljava_lang_String_2Ljava_lang_String_2V($intern_2, com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display, Q$org_broadleafcommerce_openadmin_client_view_user_RoleManagementDisplay), Q$org_broadleafcommerce_openadmin_client_view_user_RoleManagementView).org_broadleafcommerce_openadmin_client_view_user_RoleManagementView_permissionsDisplay, new org_broadleafcommerce_openadmin_client_view_dynamic_dialog_EntitySearchDialog_EntitySearchDialog__Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource_2V(com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(dataSource, Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource)), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, [$intern_1865]), org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1296));
  org_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchListPresenter_$setDataSource__Lorg_broadleafcommerce_openadmin_client_presenter_structure_SimpleSearchListPresenter_2Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource_2_3Ljava_lang_String_2_3Ljava_lang_Boolean_2V(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter, com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(dataSource, Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, [$intern_17, $intern_1691, $intern_668]), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1Boolean_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1]), Q$java_lang_Boolean, [(java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE), java_lang_Boolean_FALSE, java_lang_Boolean_FALSE]));
  org_broadleafcommerce_openadmin_client_view_dynamic_grid_GridHelper_$addSubPresentableHandlers__Lorg_broadleafcommerce_openadmin_client_view_dynamic_grid_GridHelper_2Lcom_smartgwt_client_widgets_grid_ListGrid_2_3Lorg_broadleafcommerce_openadmin_client_presenter_entity_SubPresentable_2V(this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_gridHelper, this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2().getGrid__Lcom_smartgwt_client_widgets_grid_ListGrid_2(), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1SubPresentable_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_lang_Object_$1]), Q$org_broadleafcommerce_openadmin_client_presenter_entity_SubPresentable, [this.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_permissionsPresenter]));
}
;
_.org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter$2_this$0 = null;
_ = org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$27.prototype;
_.onSuccess__V = function org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$27_onSuccess__V(){
  this.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$27_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_openadmin_client_presenter_user_RoleManagementPresenter_RoleManagementPresenter__V);
}
;
var com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminCreateRoleListDataSourceFactory_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1860, 'AdminCreateRoleListDataSourceFactory', com_google_gwt_lang_ClassLiteralHolder_Ljava_1lang_1Object_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1user_1AdminPermissionRelatedToUserListDataSourceFactory_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1860, 'AdminPermissionRelatedToUserListDataSourceFactory', com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1datasource_1SimpleDataSourceFactory_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1861, 'RoleManagementPresenter', com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1DynamicEntityPresenter_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1861, 'RoleManagementPresenter$1', com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1setup_1AsyncCallbackAdapter_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1user_1RoleManagementPresenter$2_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1861, 'RoleManagementPresenter$2', com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1setup_1AsyncCallbackAdapter_12_1classLit);
$entry(com_google_gwt_core_client_impl_AsyncFragmentLoader_onLoad__IV)(27);
