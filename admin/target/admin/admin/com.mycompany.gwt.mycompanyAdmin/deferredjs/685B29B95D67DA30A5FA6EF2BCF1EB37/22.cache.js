function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_SandBoxView__V(){
  com_smartgwt_client_widgets_BaseWidget_$clinit__V();
  com_smartgwt_client_widgets_layout_VLayout_VLayout__V.call(this);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_607, $intern_1447):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_607] = $intern_1447 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_606, $intern_1447):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_606] = $intern_1447 , undefined);
  com_smartgwt_client_widgets_layout_Layout_$setLayoutMargin__Lcom_smartgwt_client_widgets_layout_Layout_2Ljava_lang_Integer_2V(this, java_lang_Integer_valueOf__ILjava_lang_Integer_2(20));
}

function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView(){
}

_ = org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_SandBoxView__V.prototype = org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView.prototype = new com_smartgwt_client_widgets_layout_VLayout;
_.asCanvas__Lcom_smartgwt_client_widgets_Canvas_2 = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_asCanvas__Lcom_smartgwt_client_widgets_Canvas_2(){
  return this;
}
;
_.build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_build__Lcom_smartgwt_client_data_DataSource_2_3Lcom_smartgwt_client_data_DataSource_2V(entityDataSource, additionalDataSources){
  var header, insideLayout;
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_606, $intern_1447):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_606] = $intern_1447 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(this)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(this, $intern_607, $intern_1447):(this.com_smartgwt_client_widgets_BaseWidget_config[$intern_607] = $intern_1447 , undefined);
  insideLayout = new com_smartgwt_client_widgets_layout_VLayout_VLayout__V;
  header = new com_smartgwt_client_widgets_Label_Label__Ljava_lang_String_2V(org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2((org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_$clinit__V() , org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER), $intern_1136));
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(header)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2V(header, $intern_1733, $intern_1734):(header.com_smartgwt_client_widgets_BaseWidget_config[$intern_1733] = $intern_1734 , undefined);
  com_smartgwt_client_widgets_BaseWidget_$isCreated__Lcom_smartgwt_client_widgets_BaseWidget_2Z(header)?com_smartgwt_client_widgets_BaseWidget_$setProperty__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2FV(header, $intern_606, 15):(header.com_smartgwt_client_widgets_BaseWidget_config[$intern_606] = 15 , undefined);
  insideLayout.addMember__Lcom_smartgwt_client_widgets_Canvas_2V(header);
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar = new com_smartgwt_client_widgets_toolbar_ToolStrip_ToolStrip__V;
  com_smartgwt_client_widgets_Canvas_$setHeight__Lcom_smartgwt_client_widgets_Canvas_2IV(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, 30);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2ZV(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, $intern_607, $intern_1447, true);
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addSpacer__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripSpacer_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, new com_smartgwt_client_widgets_toolbar_ToolStripSpacer_ToolStripSpacer__IV(6));
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteAllButton = new com_smartgwt_client_widgets_toolbar_ToolStripButton_ToolStripButton__V;
  com_smartgwt_client_widgets_StretchImgButton_$setIcon__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteAllButton, $moduleBase + $intern_1827);
  com_smartgwt_client_widgets_StretchImgButton_$setTitle__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteAllButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1260));
  com_smartgwt_client_widgets_Canvas_$setTooltip__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteAllButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1289));
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addButton__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteAllButton);
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addSpacer__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripSpacer_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, new com_smartgwt_client_widgets_toolbar_ToolStripSpacer_ToolStripSpacer__IV(3));
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectAllButton = new com_smartgwt_client_widgets_toolbar_ToolStripButton_ToolStripButton__V;
  com_smartgwt_client_widgets_StretchImgButton_$setIcon__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectAllButton, $moduleBase + $intern_1828);
  com_smartgwt_client_widgets_StretchImgButton_$setTitle__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectAllButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1284));
  com_smartgwt_client_widgets_Canvas_$setTooltip__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectAllButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1304));
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addButton__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectAllButton);
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addSpacer__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripSpacer_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, new com_smartgwt_client_widgets_toolbar_ToolStripSpacer_ToolStripSpacer__IV(3));
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, new com_smartgwt_client_widgets_toolbar_ToolStripSeparator_ToolStripSeparator__V);
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addSpacer__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripSpacer_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, new com_smartgwt_client_widgets_toolbar_ToolStripSpacer_ToolStripSpacer__IV(3));
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteSelectionButton = new com_smartgwt_client_widgets_toolbar_ToolStripButton_ToolStripButton__V;
  com_smartgwt_client_widgets_StretchImgButton_$setIcon__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteSelectionButton, $moduleBase + $intern_1827);
  com_smartgwt_client_widgets_StretchImgButton_$setTitle__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteSelectionButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1253));
  com_smartgwt_client_widgets_Canvas_$setTooltip__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteSelectionButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1296));
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addButton__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteSelectionButton);
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addSpacer__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripSpacer_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, new com_smartgwt_client_widgets_toolbar_ToolStripSpacer_ToolStripSpacer__IV(3));
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectSelectionButton = new com_smartgwt_client_widgets_toolbar_ToolStripButton_ToolStripButton__V;
  com_smartgwt_client_widgets_StretchImgButton_$setIcon__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectSelectionButton, $moduleBase + $intern_1828);
  com_smartgwt_client_widgets_StretchImgButton_$setTitle__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectSelectionButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1270));
  com_smartgwt_client_widgets_Canvas_$setTooltip__Lcom_smartgwt_client_widgets_Canvas_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectSelectionButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1295));
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addButton__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectSelectionButton);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, new com_smartgwt_client_widgets_layout_LayoutSpacer_LayoutSpacer__V);
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_refreshButton = new com_smartgwt_client_widgets_toolbar_ToolStripButton_ToolStripButton__V;
  com_smartgwt_client_widgets_StretchImgButton_$setIcon__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_refreshButton, $moduleBase + $intern_1829);
  com_smartgwt_client_widgets_StretchImgButton_$setTitle__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_refreshButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1250));
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addButton__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_refreshButton);
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_previewButton = new com_smartgwt_client_widgets_toolbar_ToolStripButton_ToolStripButton__V;
  com_smartgwt_client_widgets_StretchImgButton_$setIcon__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_previewButton, $moduleBase + $intern_1830);
  com_smartgwt_client_widgets_StretchImgButton_$setTitle__Lcom_smartgwt_client_widgets_StretchImgButton_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_previewButton, org_broadleafcommerce_openadmin_client_MessageManager_$getString__Lorg_broadleafcommerce_openadmin_client_MessageManager_2Ljava_lang_String_2Ljava_lang_String_2(org_broadleafcommerce_openadmin_client_BLCMain_MESSAGE_1MANAGER, $intern_1288));
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addButton__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_previewButton);
  com_smartgwt_client_widgets_toolbar_ToolStrip_$addSpacer__Lcom_smartgwt_client_widgets_toolbar_ToolStrip_2Lcom_smartgwt_client_widgets_toolbar_ToolStripSpacer_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar, new com_smartgwt_client_widgets_toolbar_ToolStripSpacer_ToolStripSpacer__IV(6));
  insideLayout.addMember__Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar);
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid = new com_smartgwt_client_widgets_grid_ListGrid_ListGrid__V;
  this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid.setCanReorderRecords__Ljava_lang_Boolean_2V((java_lang_Boolean_$clinit__V() , java_lang_Boolean_$clinit__V() , java_lang_Boolean_TRUE));
  com_smartgwt_client_widgets_grid_ListGrid_$setAlternateRecordStyles__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, java_lang_Boolean_TRUE);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Ljava_lang_String_2ZV(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, $intern_1453, (com_smartgwt_client_types_SelectionStyle_$clinit__V() , com_smartgwt_client_types_SelectionStyle_MULTIPLE).com_smartgwt_client_types_SelectionStyle_value, true);
  com_smartgwt_client_widgets_grid_ListGrid_$setCanEdit__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, java_lang_Boolean_FALSE);
  com_smartgwt_client_widgets_BaseWidget_$setAttribute__Lcom_smartgwt_client_widgets_BaseWidget_2Ljava_lang_String_2Lcom_google_gwt_core_client_JavaScriptObject_2ZV(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, $intern_1120, com_smartgwt_client_core_BaseClass_$getOrCreateJsObj__Lcom_smartgwt_client_core_BaseClass_2Lcom_google_gwt_core_client_JavaScriptObject_2(entityDataSource), true);
  com_smartgwt_client_widgets_grid_ListGrid_$setAutoFetchData__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, java_lang_Boolean_TRUE);
  com_smartgwt_client_widgets_grid_ListGrid_$setDrawAllMaxCells__Lcom_smartgwt_client_widgets_grid_ListGrid_2IV(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, 10);
  com_smartgwt_client_widgets_grid_ListGrid_$setCanSort__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, java_lang_Boolean_TRUE);
  com_smartgwt_client_widgets_grid_ListGrid_$setCanResizeFields__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, java_lang_Boolean_TRUE);
  com_smartgwt_client_widgets_grid_ListGrid_$setShowFilterEditor__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, java_lang_Boolean_FALSE);
  com_smartgwt_client_widgets_grid_ListGrid_$setCanGroupBy__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_Boolean_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, java_lang_Boolean_FALSE);
  com_smartgwt_client_widgets_grid_ListGrid_$setDataPageSize__Lcom_smartgwt_client_widgets_grid_ListGrid_2IV(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid);
  com_smartgwt_client_widgets_grid_ListGrid_$setAlternateBodyStyleName__Lcom_smartgwt_client_widgets_grid_ListGrid_2Ljava_lang_String_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid, $intern_1736);
  insideLayout.addMember__Lcom_smartgwt_client_widgets_Canvas_2V(this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid);
  com_smartgwt_client_widgets_layout_Layout_$addMember__Lcom_smartgwt_client_widgets_layout_Layout_2Lcom_smartgwt_client_widgets_Canvas_2V(this, insideLayout);
}
;
_.getClass__Ljava_lang_Class_2$ = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_getClass__Ljava_lang_Class_2(){
  return com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1view_1sandbox_1SandBoxView_12_1classLit;
}
;
_.getGrid__Lcom_smartgwt_client_widgets_grid_ListGrid_2 = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_getGrid__Lcom_smartgwt_client_widgets_grid_ListGrid_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid;
}
;
_.getPreviewButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2 = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_getPreviewButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_previewButton;
}
;
_.getPromoteAllButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2 = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_getPromoteAllButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteAllButton;
}
;
_.getPromoteSelectionButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2 = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_getPromoteSelectionButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteSelectionButton;
}
;
_.getRefreshButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2 = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_getRefreshButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_refreshButton;
}
;
_.getRevertRejectAllButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2 = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_getRevertRejectAllButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectAllButton;
}
;
_.getRevertRejectSelectionButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2 = function org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_getRevertRejectSelectionButton__Lcom_smartgwt_client_widgets_toolbar_ToolStripButton_2(){
  return this.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectSelectionButton;
}
;
_.java_lang_Object_castableTypeMap$ = makeCastMap([Q$com_google_gwt_event_logical_shared_HasAttachHandlers, Q$com_google_gwt_event_shared_HasHandlers, Q$com_google_gwt_user_client_EventListener, Q$com_google_gwt_user_client_ui_HasVisibility, Q$com_google_gwt_user_client_ui_IsWidget, Q$com_google_gwt_user_client_ui_UIObject, Q$com_google_gwt_user_client_ui_Widget, Q$com_smartgwt_client_widgets_BaseWidget, Q$com_smartgwt_client_widgets_Canvas, Q$com_smartgwt_client_widgets_events_HasClickHandlers, Q$com_smartgwt_client_widgets_events_HasDoubleClickHandlers, Q$com_smartgwt_client_widgets_events_HasDragMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragRepositionStopHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragResizeStopHandlers, Q$com_smartgwt_client_widgets_events_HasDragStartHandlers, Q$com_smartgwt_client_widgets_events_HasDragStopHandlers, Q$com_smartgwt_client_widgets_events_HasDropHandlers, Q$com_smartgwt_client_widgets_events_HasDropMoveHandlers, Q$com_smartgwt_client_widgets_events_HasDropOutHandlers, Q$com_smartgwt_client_widgets_events_HasDropOverHandlers, Q$com_smartgwt_client_widgets_events_HasFocusChangedHandlers, Q$com_smartgwt_client_widgets_events_HasHoverHandlers, Q$com_smartgwt_client_widgets_events_HasHoverHiddenHandlers, Q$com_smartgwt_client_widgets_events_HasKeyDownHandlers, Q$com_smartgwt_client_widgets_events_HasKeyPressHandlers, Q$com_smartgwt_client_widgets_events_HasMouseDownHandlers, Q$com_smartgwt_client_widgets_events_HasMouseMoveHandlers, Q$com_smartgwt_client_widgets_events_HasMouseOutHandlers, Q$com_smartgwt_client_widgets_events_HasMouseOverHandlers, Q$com_smartgwt_client_widgets_events_HasMouseStillDownHandlers, Q$com_smartgwt_client_widgets_events_HasMouseUpHandlers, Q$com_smartgwt_client_widgets_events_HasMouseWheelHandlers, Q$com_smartgwt_client_widgets_events_HasMovedHandlers, Q$com_smartgwt_client_widgets_events_HasParentMovedHandlers, Q$com_smartgwt_client_widgets_events_HasResizedHandlers, Q$com_smartgwt_client_widgets_events_HasRightMouseDownHandlers, Q$com_smartgwt_client_widgets_events_HasScrolledHandlers, Q$com_smartgwt_client_widgets_events_HasShowContextMenuHandlers, Q$com_smartgwt_client_widgets_events_HasVisibilityChangedHandlers, Q$com_smartgwt_client_widgets_layout_Layout, Q$org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxDisplay, Q$org_broadleafcommerce_openadmin_client_view_Display]);
_.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_grid = null;
_.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_previewButton = null;
_.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteAllButton = null;
_.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_promoteSelectionButton = null;
_.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_refreshButton = null;
_.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectAllButton = null;
_.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_revertRejectSelectionButton = null;
_.org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_toolBar = null;
_ = org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$22.prototype;
_.onSuccess__V = function org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$22_onSuccess__V(){
  this.org_broadleafcommerce_openadmin_client_reflection_ReflectiveFactoryWrapper$22_val$asyncClient.onSuccess__Ljava_lang_Object_2V(new org_broadleafcommerce_cms_admin_client_view_sandbox_SandBoxView_SandBoxView__V);
}
;
var com_google_gwt_lang_ClassLiteralHolder_Lorg_1broadleafcommerce_1cms_1admin_1client_1view_1sandbox_1SandBoxView_12_1classLit = java_lang_Class_createForClass__Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_String_2Ljava_lang_Class_2Ljava_lang_Class_2($intern_1833, 'SandBoxView', com_google_gwt_lang_ClassLiteralHolder_Lcom_1smartgwt_1client_1widgets_1layout_1VLayout_12_1classLit);
$entry(com_google_gwt_core_client_impl_AsyncFragmentLoader_onLoad__IV)(22);
