var $intern_1534 = 'org.broadleafcommerce.cms.admin.client.view.file.';
function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_StaticAssetsView__V(){
  com_smartgwt_client_widgets_BaseWidget_$clinit__V();
  com_smartgwt_client_widgets_layout_HLayout_HLayout__V.call(this);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_311, $intern_1159):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_311] = $intern_1159 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_312, $intern_1159):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_312] = $intern_1159 , undefined);
}

function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView(){
}

_ = org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_StaticAssetsView__V.prototype = org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView.prototype = new com_smartgwt_client_widgets_layout_HLayout;
_.asCanvas__Lcom_smartgwt_client_widgets_Canvas_2 = function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_asCanvas__Lcom_smartgwt_client_widgets_Canvas_2(){
  return this;
}
;
_.build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(entityDataSource, additionalDataSources){
  var leftVerticalLayout;
  leftVerticalLayout = new com_smartgwt_client_widgets_layout_VLayout_VLayout__V;
  com_smartgwt_client_widgets_BaseWidget_$setID__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2V(leftVerticalLayout, 'staticFolderAssetsGridLayout');
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(leftVerticalLayout, $intern_311, $intern_1159):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_311] = $intern_1159 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(leftVerticalLayout)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(leftVerticalLayout, $intern_312, $intern_1531):(leftVerticalLayout.com_smartgwt_client_widgets_BaseWidget_config[$intern_312] = $intern_1531 , undefined);
  com_smartgwt_client_widgets_Canvas_$setShowResizeBar__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_Boolean_2V(leftVerticalLayout, (java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE));
  this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_DynamicEntityListView__Lcom_smartgwt_client_data_DataSource_2V(entityDataSource);
  com_smartgwt_client_widgets_Canvas_$setHoverMoveWithMouse__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay.org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_grid, java_lang_Boolean_TRUE);
  com_smartgwt_client_widgets_grid_ListGrid_$setCanHover__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay.org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_grid, java_lang_Boolean_TRUE);
  com_smartgwt_client_widgets_grid_ListGrid_$setShowHover__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay.org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_grid, java_lang_Boolean_TRUE);
  com_smartgwt_client_widgets_Canvas_$setHoverOpacity__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_Integer_2V(this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay.org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_grid, java_lang_Integer_valueOf__ILjava_lang_Integer_2(75));
  com_smartgwt_client_widgets_grid_ListGrid_$setHoverCustomizer__Lcom_smartgwt_client_widgets_grid_ListGrid_2Lcom_smartgwt_client_widgets_grid_HoverCustomizer_2V(this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay.org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListView_grid, new org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView$1_StaticAssetsView$1__Lorg_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_2V);
  leftVerticalLayout.addMember__Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay);
  this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_dynamicFormDisplay = new org_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormView_DynamicFormView__Lcom_smartgwt_client_data_DataSource_2V(entityDataSource);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, leftVerticalLayout);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_dynamicFormDisplay);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1view_1file_1StaticAssetsView_12_1classLit;
}
;
_.getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2 = function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_getDynamicFormDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_form_DynamicFormDisplay_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_dynamicFormDisplay;
}
;
_.getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2 = function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_getListDisplay__Lorg_broadleafcommerce_openadmin_client_view_dynamic_DynamicEntityListDisplay_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay;
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$com_google_gwt_event_logical_shared_HasAttachHandlers, Q$com_google_gwt_event_shared_HasHandlers, Q$com_google_gwt_user_client_EventListener, Q$com_google_gwt_user_client_ui_HasVisibility, Q$com_google_gwt_user_client_ui_IsWidget, Q$com_google_gwt_user_client_ui_UIObject, Q$com_google_gwt_user_client_ui_Widget, Q$com_smartgwt_client_widgets_BaseWidget, Q$com_smartgwt_client_widgets_Canvas, Q$com_smartgwt_client_widgets_events_HasClickHandlers, Q$com_smartgwt_client_widgets_events_HasDoubleClickHandlers, Q$com_smartgwt_client_widgets_events_HasDragMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionStopHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeStopHandlers, Q$com_smartgwt_client_widgets_events_HasDragStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragStopHandlers, Q$com_smartgwt_client_widgets_events_HasDropHandlers, Q$com_smartgwt_client_widgets_events_HasDropMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDropOutHandlers, Q$com_smartgwt_client_widgets_events_HasDropOverHandlers, Q$com_smartgwt_client_widgets_events_HasFocusChangedHandlers, Q$com_smartgwt_client_widgets_events_HasHoverHandlers, Q$com_smartgwt_client_widgets_events_HasHoverHiddenHandlers, Q$com_smartgwt_client_widgets_events_HasKeyDownHandlers, Q$com_smartgwt_client_widgets_events_HasKeyPressHandlers, Q$com_smartgwt_client_widgets_events_HasMouseDownHandlers, Q$com_smartgwt_client_widgets_events_HasMouseMoveHandlers, Q$com_smartgwt_client_widgets_events_HasMouseOutHandlers, Q$com_smartgwt_client_widgets_events_HasMouseOverHandlers, Q$com_smartgwt_client_widgets_events_HasMouseStillDownHandlers, Q$com_smartgwt_client_widgets_events_HasMouseUpHandlers, Q$com_smartgwt_client_widgets_events_HasMouseWheelHandlers, Q$com_smartgwt_client_widgets_events_HasMovedHandlers, Q$com_smartgwt_client_widgets_events_HasParentMovedHandlers, Q$com_smartgwt_client_widgets_events_HasResizedHandlers, Q$com_smartgwt_client_widgets_events_HasRightMouseDownHandlers, Q$com_smartgwt_client_widgets_events_HasScrolledHandlers, Q$com_smartgwt_client_widgets_events_HasShowContextMenuHandlers, Q$com_smartgwt_client_widgets_events_HasVisibilityChangedHandlers, Q$com_smartgwt_client_widgets_layout_HLayout, Q$com_smartgwt_client_widgets_layout_Layout, Q$org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsDisplay, Q$org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView, Q$org_broadleafcommerce_openadmin_client_view_Display, Q$org_broadleafcommerce_openadmin_client_view_dynamic_DynamicEditDisplay]);
_.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_dynamicFormDisplay = null;
_.org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_listDisplay = null;
function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView$1_StaticAssetsView$1__Lorg_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_2V(){
}

function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView$1(){
}

_ = org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView$1_StaticAssetsView$1__Lorg_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_2V.prototype = org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView$1.prototype = new java_lang_Object;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView$1_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1view_1file_1StaticAssetsView$1_12_1classLit;
}
;
_.hoverHTML__Ljava_lang_Object_2Lcom_smartgwt_client_widgets_grid_ListGridRecord_2IILjava_lang_String_2 = function org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView$1_hoverHTML__Ljava_lang_Object_2Lcom_smartgwt_client_widgets_grid_ListGridRecord_2IILjava_lang_String_2(value, record, rowNum, colNum){
  if (!!record && com_smartgwt_client_util_JSOHelper_getAttribute__Lcom_google_gwt_core_client_JavaScriptObject_2Ljava_lang_String_2Ljava_lang_String_2(record.com_smartgwt_client_core_JsObject_jsObj, $intern_1482) != null && (java_lang_Boolean_$clinit__V() , com_smartgwt_client_util_JSOHelper_getAttributeAsBoolean__Lcom_google_gwt_core_client_JavaScriptObject_2Ljava_lang_String_2Z(record.com_smartgwt_client_core_JsObject_jsObj, $intern_1482)?java_lang_Boolean_TRUE:java_lang_Boolean_FALSE).java_lang_Boolean_value) {
    return org_broadleafcommerce_openadmin_client_MessageManager_$replaceKeys__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2_3Ljava_lang_String_2_3Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_863)), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, [$intern_1438, $intern_413]), com_google_gwt_lang_Array_initValues__Ljava_lang_Class_2Lcom_google_gwt_core_client_JavaScriptObject_2ILcom_google_gwt_lang_Array_2Lcom_google_gwt_lang_Array_2(com_google_gwt_lang_ClassLiteralHolder__13Ljava_1lang_1String_12_1classLit, makeCastMap([Q$java_io_Serializable, Q$java_io_Serializable_$1, Q$java_lang_CharSequence_$1, Q$java_lang_Comparable_$1, Q$java_lang_Object_$1, Q$java_lang_String_$1]), Q$java_lang_String, [com_smartgwt_client_util_JSOHelper_getAttribute__Lcom_google_gwt_core_client_JavaScriptObject_2Ljava_lang_String_2Ljava_lang_String_2(record.com_smartgwt_client_core_JsObject_jsObj, $intern_1532), com_smartgwt_client_util_JSOHelper_getAttribute__Lcom_google_gwt_core_client_JavaScriptObject_2Ljava_lang_String_2Ljava_lang_String_2(record.com_smartgwt_client_core_JsObject_jsObj, $intern_1533)]));
  }
  return null;
}
;
_ = org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$19.prototype;
_.onSuccess__V = function org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$19_onSuccess__V(){
  this.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$19_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_cms_admin_client_view_file_StaticAssetsView_StaticAssetsView__V);
}
;
var com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1view_1file_1StaticAssetsView_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1534, 'StaticAssetsView', com_google_gwt_lang_ClassLiteralHolder_Lcom_1smartgwt_1client_1widgets_1layout_1HLayout_12_1classLit), com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1view_1file_1StaticAssetsView$1_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1534, 'StaticAssetsView$1', com_google_gwt_lang_ClassLiteralHolder_Ljava_1lang_1Object_12_1classLit);
$entry(com_google_gwt_core_client_impl_AsyncFragmentLoader_onLoad__IV)(19);
