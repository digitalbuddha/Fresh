var $intern_4618 = 'ProductOptionPresenter', $intern_4619 = 'ProductOptionPresenter$1', $intern_4620 = 'ProductOptionPresenter$2', $intern_4621 = 'ProductOptionPresenter$3', $intern_4622 = 'ProductOptionValueSubPresenter', $intern_4623 = 'ProductOptionValueSubPresenter$1', $intern_4624 = 'ProductOptionValueSubPresenter$2', $intern_4625 = 'ProductOptionValueSubPresenter$2$1', $intern_4615 = 'productOptionDS', $intern_4616 = 'productOptionLocaleDS', $intern_4617 = 'productOptionValueDS';
function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_ProductOptionPresenter__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$clinit__V();
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_DynamicEntityPresenter__V.call(this);
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter(){
}

_ = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_ProductOptionPresenter__V.prototype = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter.prototype = new org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter;
_.bind__V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_bind__V(){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$bind__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2V(this);
  org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_$bind__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_productOptionValuePresenter);
}
;
_.changeSelection__Lcom_smartgwt_client_data_Record_2V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_changeSelection__Lcom_smartgwt_client_data_Record_2V(selectedRecord){
  var dataSource;
  dataSource = com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(com_smartgwt_client_data_DataSource_getOrCreateRef__Lcom_google_gwt_core_client_JavaScriptObject_2Lcom_smartgwt_client_data_DataSource_2(com_smartgwt_client_widgets_BaseWidget_$getAttributeAsJavaScriptObject__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Lcom_google_gwt_core_client_JavaScriptObject_2(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2().getGrid__Lcom_smartgwt_client_widgets_grid_ListGrid_2(), $intern_2234)), Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource);
  org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_$load__Lorg_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_2Lcom_smartgwt_client_data_Record_2Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource_2Lcom_smartgwt_client_data_DSCallback_2Z(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_productOptionValuePresenter, selectedRecord, dataSource);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionPresenter_12_1classLit;
}
;
_.getDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay_2 = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_getDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay_2(){
  return com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display, Q$org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionDisplay);
}
;
_.postSetup__Lcom_smartgwt_client_widgets_Canvas_2V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_postSetup__Lcom_smartgwt_client_widgets_Canvas_2V(container){
  org_broadleafcommerce_openadmin_client_view_dynamic_grid_GridHelper_$addSubPresentableHandlers__Lorg_broadleafcommerce_openadmin_client_view_dynamic_grid_GridHelper_2Lcom_smartgwt_client_widgets_grid_ListGrid_2_3Lorg_broadleafcommerce_openadmin_client_presenter_entity_SubPresentable_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_gridHelper, this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2().getGrid__Lcom_smartgwt_client_widgets_grid_ListGrid_2(), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1SubPresentable_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_lang_Object_$1]), Q$org_broadleafcommerce_openadmin_client_presenter_entity_SubPresentable, [this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_productOptionValuePresenter]));
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$postSetup__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Lcom_smartgwt_client_widgets_Canvas_2V(this, container);
}
;
_.setup__V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_setup__V(){
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2Ljava_lang_Integer_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_4615, new org_broadleafcommerce_admin_client_datasource_catalog_product_ProductOptionListDataSourceFactory_ProductOptionListDataSourceFactory__V, new org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1_ProductOptionPresenter$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V(this)));
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2Ljava_lang_Integer_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_4616, new org_broadleafcommerce_admin_client_presenter_catalog_product_LocaleDataSourceFactory_LocaleDataSourceFactory__Ljava_lang_String_2V, new org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$2_ProductOptionPresenter$2__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V));
  org_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_$addOrReplaceItem__Lorg_broadleafcommerce_openadmin_client_setup_PresenterSequenceSetupManager_2Lorg_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_2Ljava_lang_Integer_2V(this.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_presenterSequenceSetupManager, new org_broadleafcommerce_openadmin_client_setup_PresenterSetupItem_PresenterSetupItem__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_DataSourceFactory_2Lorg_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter_2V($intern_4617, new org_broadleafcommerce_admin_client_datasource_catalog_product_ProductOptionValueDataSourceFactory_ProductOptionValueDataSourceFactory__V, new org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_ProductOptionPresenter$3__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V(this)));
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter, Q$org_broadleafcommerce_openadmin_client_presenter_entity_EntityPresenter]);
_.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_productOptionValuePresenter = null;
function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1_ProductOptionPresenter$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V(this$0){
  this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1_this$0 = this$0;
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1(){
}

_ = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1_ProductOptionPresenter$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V.prototype = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionPresenter$1_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(top){
  org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_$setupDisplayItems__Lorg_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_2Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1_this$0, top, com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Lcom_1smartgwt_1client_1data_1DataSource_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_lang_Object_$1]), Q$com_smartgwt_client_data_DataSource, []));
  com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(top, Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource).setupGridFields___3Ljava_lang_String_2_3Ljava_lang_Boolean_2_3Ljava_lang_String_2(com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, []), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1Boolean_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1]), Q$java_lang_Boolean, []));
}
;
_.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$1_this$0 = null;
function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$2_ProductOptionPresenter$2__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V(){
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$2(){
}

_ = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$2_ProductOptionPresenter$2__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V.prototype = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$2.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$2_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionPresenter$2_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$2_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(top){
}
;
function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_ProductOptionPresenter$3__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V(this$0){
  this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_this$0 = this$0;
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3(){
}

_ = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_ProductOptionPresenter$3__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_2V.prototype = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3.prototype = new org_broadleafcommerce_openadmin_client_setup_AsyncCallbackAdapter;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionPresenter$3_12_1classLit;
}
;
_.onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_onSetupSuccess__Lcom_smartgwt_client_data_DataSource_2V(result){
  this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_this$0.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_productOptionValuePresenter = new org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_ProductOptionValueSubPresenter__Lorg_broadleafcommerce_openadmin_client_view_dynamic_SubItemDisplay_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V(com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_DynamicEntityPresenter_display, Q$org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionDisplay), Q$org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView).org_broadleafcommerce_admin_client_view_catalog_product_ProductOptionView_productOptionValueDisplay, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1892), (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_FALSE), java_lang_Boolean_TRUE, java_lang_Boolean_FALSE);
  org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_$setDataSource__Lorg_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_2Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource_2_3Ljava_lang_String_2_3Ljava_lang_Boolean_2V(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_this$0.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_productOptionValuePresenter, com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(result, Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_ListGridDataSource), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, []), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1Boolean_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1]), Q$java_lang_Boolean, []));
}
;
_.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter$3_this$0 = null;
function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_$bind__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V(this$static){
  org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_$bind__Lorg_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_2V(this$static);
  com_smartgwt_client_widgets_Canvas_$addClickHandler__Lcom_smartgwt_client_widgets_Canvas_2Lcom_smartgwt_client_widgets_events_ClickHandler_2Lcom_google_gwt_event_shared_HandlerRegistration_2(this$static.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_display.org_broadleafcommerce_openadmin_client_view_dynamic_SubItemView_addButton, new org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_ProductOptionValueSubPresenter$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V(this$static));
  com_smartgwt_client_widgets_Canvas_$addClickHandler__Lcom_smartgwt_client_widgets_Canvas_2Lcom_smartgwt_client_widgets_events_ClickHandler_2Lcom_google_gwt_event_shared_HandlerRegistration_2(this$static.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_display.org_broadleafcommerce_openadmin_client_view_dynamic_SubItemView_removeButton, new org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_ProductOptionValueSubPresenter$2__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V(this$static));
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_ProductOptionValueSubPresenter__Lorg_broadleafcommerce_openadmin_client_view_dynamic_SubItemDisplay_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V(display, newEntityDialogTitle, showDisabledState, canEdit, showId){
  org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_SubPresenter__Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_view_dynamic_SubItemDisplay_2_3Ljava_lang_String_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V.call(this, display, showDisabledState, canEdit, showId);
  this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_initialValues = new java_util_HashMap_HashMap__V;
  this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_newEntityDialogTitle = newEntityDialogTitle;
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter(){
}

_ = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_ProductOptionValueSubPresenter__Lorg_broadleafcommerce_openadmin_client_view_dynamic_SubItemDisplay_2Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2Ljava_lang_Boolean_2V.prototype = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter.prototype = new org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter;
_.bind__V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_bind__V(){
  org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_$bind__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V(this);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionValueSubPresenter_12_1classLit;
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$org_broadleafcommerce_openadmin_client_presenter_entity_SubPresentable]);
_.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_newEntityDialogTitle = null;
function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_ProductOptionValueSubPresenter$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V(this$0){
  this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0 = this$0;
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1(){
}

_ = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_ProductOptionValueSubPresenter$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V.prototype = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionValueSubPresenter$1_12_1classLit;
}
;
_.onClick__Lcom_smartgwt_client_widgets_events_ClickEvent_2V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_onClick__Lcom_smartgwt_client_widgets_events_ClickEvent_2V(event){
  var ds, foreignKey, type;
  if (com_smartgwt_client_widgets_events_BrowserEvent_$isLeftButtonDown__Lcom_smartgwt_client_widgets_events_BrowserEvent_2Z()) {
    ds = com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(com_smartgwt_client_data_DataSource_getOrCreateRef__Lcom_google_gwt_core_client_JavaScriptObject_2Lcom_smartgwt_client_data_DataSource_2(com_smartgwt_client_widgets_BaseWidget_$getAttributeAsJavaScriptObject__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Lcom_google_gwt_core_client_JavaScriptObject_2(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_display.org_broadleafcommerce_openadmin_client_view_dynamic_SubItemView_grid, $intern_2234)), Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_DynamicEntityDataSource);
    foreignKey = com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(ds.org_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource_persistencePerspective.org_broadleafcommerce_openadmin_client_dto_PersistencePerspective_persistencePerspectiveItems.get__Ljava_lang_Object_2Ljava_lang_Object_2((org_broadleafcommerce_common_presentation_client_PersistencePerspectiveItemType_$clinit__V() , org_broadleafcommerce_common_presentation_client_PersistencePerspectiveItemType_FOREIGNKEY)), Q$org_broadleafcommerce_openadmin_client_dto_ForeignKey);
    this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_initialValues.put__Ljava_lang_Object_2Ljava_lang_Object_2Ljava_lang_Object_2(foreignKey.org_broadleafcommerce_openadmin_client_dto_ForeignKey_manyToField, org_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource_$getPrimaryKeyValue__Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource_2Lcom_smartgwt_client_data_Record_2Ljava_lang_String_2(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_abstractDynamicDataSource, this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_associatedRecord));
    type = com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, [com_google_gwt_lang_Cast_dynamicCast__Ljava_lang_Object_2ILjava_lang_Object_2(com_smartgwt_client_data_DataSource_getOrCreateRef__Lcom_google_gwt_core_client_JavaScriptObject_2Lcom_smartgwt_client_data_DataSource_2(com_smartgwt_client_widgets_BaseWidget_$getAttributeAsJavaScriptObject__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Lcom_google_gwt_core_client_JavaScriptObject_2(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_display.org_broadleafcommerce_openadmin_client_view_dynamic_SubItemView_grid, $intern_2234)), Q$org_broadleafcommerce_openadmin_client_datasource_dynamic_DynamicEntityDataSource).org_broadleafcommerce_openadmin_client_datasource_dynamic_AbstractDynamicDataSource_defaultNewEntityFullyQualifiedClassname]);
    this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_initialValues.put__Ljava_lang_Object_2Ljava_lang_Object_2Ljava_lang_Object_2($intern_2204, type);
    org_broadleafcommerce_openadmin_client_view_dynamic_dialog_EntityEditDialog_$editNewRecord__Lorg_broadleafcommerce_openadmin_client_view_dynamic_dialog_EntityEditDialog_2Ljava_lang_String_2Lorg_broadleafcommerce_openadmin_client_datasource_dynamic_DynamicEntityDataSource_2Ljava_util_Map_2Lorg_broadleafcommerce_openadmin_client_callback_ItemEditedHandler_2_3Ljava_lang_String_2_3Ljava_lang_String_2V((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_ENTITY_1ADD), this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_newEntityDialogTitle, ds, this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_initialValues, null, null);
  }
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$com_google_gwt_event_shared_EventHandler, Q$com_smartgwt_client_widgets_events_ClickHandler]);
_.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$1_this$0 = null;
function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_ProductOptionValueSubPresenter$2__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V(this$0){
  this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_this$0 = this$0;
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2(){
}

_ = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_ProductOptionValueSubPresenter$2__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter_2V.prototype = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionValueSubPresenter$2_12_1classLit;
}
;
_.onClick__Lcom_smartgwt_client_widgets_events_ClickEvent_2V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_onClick__Lcom_smartgwt_client_widgets_events_ClickEvent_2V(event){
  com_smartgwt_client_widgets_events_BrowserEvent_$isLeftButtonDown__Lcom_smartgwt_client_widgets_events_BrowserEvent_2Z() && com_smartgwt_client_widgets_grid_ListGrid_$removeData__Lcom_smartgwt_client_widgets_grid_ListGrid_2Lcom_smartgwt_client_data_Record_2Lcom_smartgwt_client_data_DSCallback_2V(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_display.org_broadleafcommerce_openadmin_client_view_dynamic_SubItemView_grid, this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_display.org_broadleafcommerce_openadmin_client_view_dynamic_SubItemView_grid.getSelectedRecord__Lcom_smartgwt_client_widgets_grid_ListGridRecord_2(), new org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1_ProductOptionValueSubPresenter$2$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_2V(this));
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$com_google_gwt_event_shared_EventHandler, Q$com_smartgwt_client_widgets_events_ClickHandler]);
_.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_this$0 = null;
function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1_ProductOptionValueSubPresenter$2$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_2V(this$1){
  this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1_this$1 = this$1;
}

function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1(){
}

_ = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1_ProductOptionValueSubPresenter$2$1__Lorg_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_2V.prototype = org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1.prototype = new java_lang_Object;
_.execute__Lcom_smartgwt_client_data_DSResponse_2Ljava_lang_Object_2Lcom_smartgwt_client_data_DSRequest_2V = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1_execute__Lcom_smartgwt_client_data_DSResponse_2Ljava_lang_Object_2Lcom_smartgwt_client_data_DSRequest_2V(response, rawData, request){
  com_smartgwt_client_widgets_Canvas_$disable__Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1_this$1.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2_this$0.org_broadleafcommerce_openadmin_client_presenter_entity_SubPresenter_display.org_broadleafcommerce_openadmin_client_view_dynamic_SubItemView_removeButton);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionValueSubPresenter$2$1_12_1classLit;
}
;
_.org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionValueSubPresenter$2$1_this$1 = null;
_ = org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$3.prototype;
_.onSuccess__V = function org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$3_onSuccess__V(){
  this.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$3_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_admin_client_presenter_catalog_product_ProductOptionPresenter_ProductOptionPresenter__V);
}
;
var com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionPresenter_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_4618, com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1DynamicEntityPresenter_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionPresenter$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_4619, com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1setup_1AsyncCallbackAdapter_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionPresenter$2_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_4620, com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1setup_1AsyncCallbackAdapter_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionPresenter$3_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_4621, com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1setup_1AsyncCallbackAdapter_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionValueSubPresenter_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_4622, com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1openadmin_1client_1presenter_1entity_1SubPresenter_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionValueSubPresenter$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_4623, com_google_gwt_lang_ClassLiteralHolder_Ljava_1lang_1Object_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionValueSubPresenter$2_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_4624, com_google_gwt_lang_ClassLiteralHolder_Ljava_1lang_1Object_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1admin_1client_1presenter_1catalog_1product_1ProductOptionValueSubPresenter$2$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_4588, $intern_4625, com_google_gwt_lang_ClassLiteralHolder_Ljava_1lang_1Object_12_1classLit);
$entry(com_google_gwt_core_client_impl_AsyncFragmentLoader_onLoad__IV)(3);
