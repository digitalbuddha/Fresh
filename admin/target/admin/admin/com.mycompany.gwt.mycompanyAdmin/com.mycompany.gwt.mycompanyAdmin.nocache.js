function com_mycompany_gwt_mycompanyAdmin(){
  var $intern_0 = '', $intern_35 = '" for "gwt:onLoadErrorFn"', $intern_33 = '" for "gwt:onPropertyErrorFn"', $intern_21 = '"><\/script>', $intern_10 = '#', $intern_43 = '&', $intern_78 = '.cache.html', $intern_12 = '/', $intern_64 = '27164CD4D40BD6DBBE51BB966F5BE971', $intern_66 = '29ABA5C76054838DBAA8B3919F4DBA4D', $intern_67 = '3987E4A5156649CC314245320311C04C', $intern_68 = '685B29B95D67DA30A5FA6EF2BCF1EB37', $intern_77 = ':', $intern_27 = '::', $intern_99 = '<script defer="defer">com_mycompany_gwt_mycompanyAdmin.onInjectionDone(\'com.mycompany.gwt.mycompanyAdmin\')<\/script>', $intern_20 = '<script id="', $intern_81 = '<script language="javascript" src="', $intern_30 = '=', $intern_11 = '?', $intern_69 = 'A8B0C1BE01C37DD81DB1982454944008', $intern_51 = 'ActiveXObject', $intern_70 = 'B124DE7F8C83B5DF2737E2F143578D1A', $intern_71 = 'BB2C82CCCDA04D17F9F753D9E3DD64AD', $intern_32 = 'Bad handler "', $intern_72 = 'CE40A1C8D138D3ABA9CBA94D9FFD8F28', $intern_73 = 'CE940C2913BBCF84ECF13B4AFEF3FF12', $intern_52 = 'ChromeTab.ChromeFrame', $intern_74 = 'DB796014BB1AACA53684ABC8F4049575', $intern_79 = 'DOMContentLoaded', $intern_75 = 'ECAF03455F756CD1C5F2BE766DA39388', $intern_76 = 'F9E17768AD90F7ED6479C7A1BAA0E5FC', $intern_22 = 'SCRIPT', $intern_46 = 'Unexpected exception in locale detection, using default: ', $intern_45 = '_', $intern_44 = '__gwt_Locale', $intern_19 = '__gwt_marker_com.mycompany.gwt.mycompanyAdmin', $intern_23 = 'base', $intern_15 = 'baseUrl', $intern_4 = 'begin', $intern_3 = 'bootstrap', $intern_50 = 'chromeframe', $intern_14 = 'clear.cache.gif', $intern_1 = 'com.mycompany.gwt.mycompanyAdmin', $intern_17 = 'com.mycompany.gwt.mycompanyAdmin.nocache.js', $intern_26 = 'com.mycompany.gwt.mycompanyAdmin::', $intern_29 = 'content', $intern_41 = 'default', $intern_65 = 'en_US', $intern_9 = 'end', $intern_58 = 'gecko', $intern_59 = 'gecko1_8', $intern_5 = 'gwt.codesvr=', $intern_6 = 'gwt.hosted=', $intern_7 = 'gwt.hybrid', $intern_34 = 'gwt:onLoadErrorFn', $intern_31 = 'gwt:onPropertyErrorFn', $intern_28 = 'gwt:property', $intern_62 = 'hosted.html?com_mycompany_gwt_mycompanyAdmin', $intern_57 = 'ie6', $intern_56 = 'ie8', $intern_55 = 'ie9', $intern_36 = 'iframe', $intern_13 = 'img', $intern_37 = "javascript:''", $intern_61 = 'loadExternalRefs', $intern_40 = 'locale', $intern_42 = 'locale=', $intern_24 = 'meta', $intern_39 = 'moduleRequested', $intern_8 = 'moduleStartup', $intern_54 = 'msie', $intern_25 = 'name', $intern_48 = 'opera', $intern_38 = 'position:absolute;width:0;height:0;border:none', $intern_53 = 'safari', $intern_93 = 'sc/modules/ISC_Calendar.js', $intern_94 = 'sc/modules/ISC_Calendar.js"><\/script>', $intern_85 = 'sc/modules/ISC_Containers.js', $intern_86 = 'sc/modules/ISC_Containers.js"><\/script>', $intern_80 = 'sc/modules/ISC_Core.js', $intern_82 = 'sc/modules/ISC_Core.js"><\/script>', $intern_95 = 'sc/modules/ISC_DataBinding.js', $intern_96 = 'sc/modules/ISC_DataBinding.js"><\/script>', $intern_89 = 'sc/modules/ISC_Forms.js', $intern_90 = 'sc/modules/ISC_Forms.js"><\/script>', $intern_83 = 'sc/modules/ISC_Foundation.js', $intern_84 = 'sc/modules/ISC_Foundation.js"><\/script>', $intern_87 = 'sc/modules/ISC_Grids.js', $intern_88 = 'sc/modules/ISC_Grids.js"><\/script>', $intern_91 = 'sc/modules/ISC_RichTextEditor.js', $intern_92 = 'sc/modules/ISC_RichTextEditor.js"><\/script>', $intern_97 = 'sc/skins/Broadleaf/load_skin.js', $intern_98 = 'sc/skins/Broadleaf/load_skin.js"><\/script>', $intern_16 = 'script', $intern_63 = 'selectingPermutation', $intern_2 = 'startup', $intern_18 = 'undefined', $intern_60 = 'unknown', $intern_47 = 'user.agent', $intern_49 = 'webkit';
  var $wnd = window, $doc = document, $stats = $wnd.__gwtStatsEvent?function(a){
    return $wnd.__gwtStatsEvent(a);
  }
  :null, $sessionId = $wnd.__gwtStatsSessionId?$wnd.__gwtStatsSessionId:null, scriptsDone, loadDone, bodyDone, base = $intern_0, metaProps = {}, values = [], providers = [], answers = [], softPermutationId = 0, onLoadErrorFunc, propertyErrorFunc;
  $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_3, millis:(new Date).getTime(), type:$intern_4});
  if (!$wnd.__gwt_stylesLoaded) {
    $wnd.__gwt_stylesLoaded = {};
  }
  if (!$wnd.__gwt_scriptsLoaded) {
    $wnd.__gwt_scriptsLoaded = {};
  }
  function isHostedMode(){
    var result = false;
    try {
      var query = $wnd.location.search;
      return (query.indexOf($intern_5) != -1 || (query.indexOf($intern_6) != -1 || $wnd.external && $wnd.external.gwtOnLoad)) && query.indexOf($intern_7) == -1;
    }
     catch (e) {
    }
    isHostedMode = function(){
      return result;
    }
    ;
    return result;
  }

  function maybeStartModule(){
    if (scriptsDone && loadDone) {
      var iframe = $doc.getElementById($intern_1);
      var frameWnd = iframe.contentWindow;
      if (isHostedMode()) {
        frameWnd.__gwt_getProperty = function(name){
          return computePropValue(name);
        }
        ;
      }
      com_mycompany_gwt_mycompanyAdmin = null;
      frameWnd.gwtOnLoad(onLoadErrorFunc, $intern_1, base, softPermutationId);
      $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_8, millis:(new Date).getTime(), type:$intern_9});
    }
  }

  function computeScriptBase(){
    function getDirectoryOfFile(path){
      var hashIndex = path.lastIndexOf($intern_10);
      if (hashIndex == -1) {
        hashIndex = path.length;
      }
      var queryIndex = path.indexOf($intern_11);
      if (queryIndex == -1) {
        queryIndex = path.length;
      }
      var slashIndex = path.lastIndexOf($intern_12, Math.min(queryIndex, hashIndex));
      return slashIndex >= 0?path.substring(0, slashIndex + 1):$intern_0;
    }

    function ensureAbsoluteUrl(url){
      if (url.match(/^\w+:\/\//)) {
      }
       else {
        var img = $doc.createElement($intern_13);
        img.src = url + $intern_14;
        url = getDirectoryOfFile(img.src);
      }
      return url;
    }

    function tryMetaTag(){
      var metaVal = __gwt_getMetaProperty($intern_15);
      if (metaVal != null) {
        return metaVal;
      }
      return $intern_0;
    }

    function tryNocacheJsTag(){
      var scriptTags = $doc.getElementsByTagName($intern_16);
      for (var i = 0; i < scriptTags.length; ++i) {
        if (scriptTags[i].src.indexOf($intern_17) != -1) {
          return getDirectoryOfFile(scriptTags[i].src);
        }
      }
      return $intern_0;
    }

    function tryMarkerScript(){
      var thisScript;
      if (typeof isBodyLoaded == $intern_18 || !isBodyLoaded()) {
        var markerId = $intern_19;
        var markerScript;
        $doc.write($intern_20 + markerId + $intern_21);
        markerScript = $doc.getElementById(markerId);
        thisScript = markerScript && markerScript.previousSibling;
        while (thisScript && thisScript.tagName != $intern_22) {
          thisScript = thisScript.previousSibling;
        }
        if (markerScript) {
          markerScript.parentNode.removeChild(markerScript);
        }
        if (thisScript && thisScript.src) {
          return getDirectoryOfFile(thisScript.src);
        }
      }
      return $intern_0;
    }

    function tryBaseTag(){
      var baseElements = $doc.getElementsByTagName($intern_23);
      if (baseElements.length > 0) {
        return baseElements[baseElements.length - 1].href;
      }
      return $intern_0;
    }

    var tempBase = tryMetaTag();
    if (tempBase == $intern_0) {
      tempBase = tryNocacheJsTag();
    }
    if (tempBase == $intern_0) {
      tempBase = tryMarkerScript();
    }
    if (tempBase == $intern_0) {
      tempBase = tryBaseTag();
    }
    if (tempBase == $intern_0) {
      tempBase = getDirectoryOfFile($doc.location.href);
    }
    tempBase = ensureAbsoluteUrl(tempBase);
    base = tempBase;
    return tempBase;
  }

  function processMetas(){
    var metas = document.getElementsByTagName($intern_24);
    for (var i = 0, n = metas.length; i < n; ++i) {
      var meta = metas[i], name = meta.getAttribute($intern_25), content;
      if (name) {
        name = name.replace($intern_26, $intern_0);
        if (name.indexOf($intern_27) >= 0) {
          continue;
        }
        if (name == $intern_28) {
          content = meta.getAttribute($intern_29);
          if (content) {
            var value, eq = content.indexOf($intern_30);
            if (eq >= 0) {
              name = content.substring(0, eq);
              value = content.substring(eq + 1);
            }
             else {
              name = content;
              value = $intern_0;
            }
            metaProps[name] = value;
          }
        }
         else if (name == $intern_31) {
          content = meta.getAttribute($intern_29);
          if (content) {
            try {
              propertyErrorFunc = eval(content);
            }
             catch (e) {
              alert($intern_32 + content + $intern_33);
            }
          }
        }
         else if (name == $intern_34) {
          content = meta.getAttribute($intern_29);
          if (content) {
            try {
              onLoadErrorFunc = eval(content);
            }
             catch (e) {
              alert($intern_32 + content + $intern_35);
            }
          }
        }
      }
    }
  }

  function __gwt_isKnownPropertyValue(propName, propValue){
    return propValue in values[propName];
  }

  function __gwt_getMetaProperty(name){
    var value = metaProps[name];
    return value == null?null:value;
  }

  function unflattenKeylistIntoAnswers(propValArray, value){
    var answer = answers;
    for (var i = 0, n = propValArray.length - 1; i < n; ++i) {
      answer = answer[propValArray[i]] || (answer[propValArray[i]] = []);
    }
    answer[propValArray[n]] = value;
  }

  function computePropValue(propName){
    var value = providers[propName](), allowedValuesMap = values[propName];
    if (value in allowedValuesMap) {
      return value;
    }
    var allowedValuesList = [];
    for (var k in allowedValuesMap) {
      allowedValuesList[allowedValuesMap[k]] = k;
    }
    if (propertyErrorFunc) {
      propertyErrorFunc(propName, allowedValuesList, value);
    }
    throw null;
  }

  var frameInjected;
  function maybeInjectFrame(){
    if (!frameInjected) {
      frameInjected = true;
      var iframe = $doc.createElement($intern_36);
      iframe.src = $intern_37;
      iframe.id = $intern_1;
      iframe.style.cssText = $intern_38;
      iframe.tabIndex = -1;
      $doc.body.appendChild(iframe);
      $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_8, millis:(new Date).getTime(), type:$intern_39});
      iframe.contentWindow.location.replace(base + initialHtml);
    }
  }

  providers[$intern_40] = function(){
    var locale = null;
    var rtlocale = $intern_41;
    try {
      if (!locale) {
        var queryParam = location.search;
        var qpStart = queryParam.indexOf($intern_42);
        if (qpStart >= 0) {
          var value = queryParam.substring(qpStart + 7);
          var end = queryParam.indexOf($intern_43, qpStart);
          if (end < 0) {
            end = queryParam.length;
          }
          locale = queryParam.substring(qpStart + 7, end);
        }
      }
      if (!locale) {
        locale = __gwt_getMetaProperty($intern_40);
      }
      if (!locale) {
        locale = $wnd[$intern_44];
      }
      if (locale) {
        rtlocale = locale;
      }
      while (locale && !__gwt_isKnownPropertyValue($intern_40, locale)) {
        var lastIndex = locale.lastIndexOf($intern_45);
        if (lastIndex < 0) {
          locale = null;
          break;
        }
        locale = locale.substring(0, lastIndex);
      }
    }
     catch (e) {
      alert($intern_46 + e);
    }
    $wnd[$intern_44] = rtlocale;
    return locale || $intern_41;
  }
  ;
  values[$intern_40] = {'default':0, en_US:1};
  providers[$intern_47] = function(){
    var ua = navigator.userAgent.toLowerCase();
    var makeVersion = function(result){
      return parseInt(result[1]) * 1000 + parseInt(result[2]);
    }
    ;
    if (function(){
      return ua.indexOf($intern_48) != -1;
    }
    ())
      return $intern_48;
    if (function(){
      return ua.indexOf($intern_49) != -1 || function(){
        if (ua.indexOf($intern_50) != -1) {
          return true;
        }
        if (typeof window[$intern_51] != $intern_18) {
          try {
            var obj = new ActiveXObject($intern_52);
            if (obj) {
              obj.registerBhoIfNeeded();
              return true;
            }
          }
           catch (e) {
          }
        }
        return false;
      }
      ();
    }
    ())
      return $intern_53;
    if (function(){
      return ua.indexOf($intern_54) != -1 && $doc.documentMode >= 9;
    }
    ())
      return $intern_55;
    if (function(){
      return ua.indexOf($intern_54) != -1 && $doc.documentMode >= 8;
    }
    ())
      return $intern_56;
    if (function(){
      var result = /msie ([0-9]+)\.([0-9]+)/.exec(ua);
      if (result && result.length == 3)
        return makeVersion(result) >= 6000;
    }
    ())
      return $intern_57;
    if (function(){
      return ua.indexOf($intern_58) != -1;
    }
    ())
      return $intern_59;
    return $intern_60;
  }
  ;
  values[$intern_47] = {gecko1_8:0, ie6:1, ie8:2, ie9:3, opera:4, safari:5};
  com_mycompany_gwt_mycompanyAdmin.onScriptLoad = function(){
    if (frameInjected) {
      loadDone = true;
      maybeStartModule();
    }
  }
  ;
  com_mycompany_gwt_mycompanyAdmin.onInjectionDone = function(){
    scriptsDone = true;
    $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_61, millis:(new Date).getTime(), type:$intern_9});
    maybeStartModule();
  }
  ;
  processMetas();
  computeScriptBase();
  var strongName;
  var initialHtml;
  if (isHostedMode()) {
    if ($wnd.external && ($wnd.external.initModule && $wnd.external.initModule($intern_1))) {
      $wnd.location.reload();
      return;
    }
    initialHtml = $intern_62;
    strongName = $intern_0;
  }
  $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_3, millis:(new Date).getTime(), type:$intern_63});
  if (!isHostedMode()) {
    try {
      unflattenKeylistIntoAnswers([$intern_41, $intern_57], $intern_64);
      unflattenKeylistIntoAnswers([$intern_65, $intern_59], $intern_66);
      unflattenKeylistIntoAnswers([$intern_65, $intern_55], $intern_67);
      unflattenKeylistIntoAnswers([$intern_65, $intern_56], $intern_68);
      unflattenKeylistIntoAnswers([$intern_41, $intern_55], $intern_69);
      unflattenKeylistIntoAnswers([$intern_41, $intern_48], $intern_70);
      unflattenKeylistIntoAnswers([$intern_65, $intern_48], $intern_71);
      unflattenKeylistIntoAnswers([$intern_65, $intern_57], $intern_72);
      unflattenKeylistIntoAnswers([$intern_41, $intern_56], $intern_73);
      unflattenKeylistIntoAnswers([$intern_65, $intern_53], $intern_74);
      unflattenKeylistIntoAnswers([$intern_41, $intern_53], $intern_75);
      unflattenKeylistIntoAnswers([$intern_41, $intern_59], $intern_76);
      strongName = answers[computePropValue($intern_40)][computePropValue($intern_47)];
      var idx = strongName.indexOf($intern_77);
      if (idx != -1) {
        softPermutationId = Number(strongName.substring(idx + 1));
        strongName = strongName.substring(0, idx);
      }
      initialHtml = strongName + $intern_78;
    }
     catch (e) {
      return;
    }
  }
  var onBodyDoneTimerId;
  function onBodyDone(){
    if (!bodyDone) {
      bodyDone = true;
      maybeStartModule();
      if ($doc.removeEventListener) {
        $doc.removeEventListener($intern_79, onBodyDone, false);
      }
      if (onBodyDoneTimerId) {
        clearInterval(onBodyDoneTimerId);
      }
    }
  }

  if ($doc.addEventListener) {
    $doc.addEventListener($intern_79, function(){
      maybeInjectFrame();
      onBodyDone();
    }
    , false);
  }
  var onBodyDoneTimerId = setInterval(function(){
    if (/loaded|complete/.test($doc.readyState)) {
      maybeInjectFrame();
      onBodyDone();
    }
  }
  , 50);
  $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_3, millis:(new Date).getTime(), type:$intern_9});
  $stats && $stats({moduleName:$intern_1, sessionId:$sessionId, subSystem:$intern_2, evtGroup:$intern_61, millis:(new Date).getTime(), type:$intern_4});
  if (!__gwt_scriptsLoaded[$intern_80]) {
    __gwt_scriptsLoaded[$intern_80] = true;
    document.write($intern_81 + base + $intern_82);
  }
  if (!__gwt_scriptsLoaded[$intern_83]) {
    __gwt_scriptsLoaded[$intern_83] = true;
    document.write($intern_81 + base + $intern_84);
  }
  if (!__gwt_scriptsLoaded[$intern_85]) {
    __gwt_scriptsLoaded[$intern_85] = true;
    document.write($intern_81 + base + $intern_86);
  }
  if (!__gwt_scriptsLoaded[$intern_87]) {
    __gwt_scriptsLoaded[$intern_87] = true;
    document.write($intern_81 + base + $intern_88);
  }
  if (!__gwt_scriptsLoaded[$intern_89]) {
    __gwt_scriptsLoaded[$intern_89] = true;
    document.write($intern_81 + base + $intern_90);
  }
  if (!__gwt_scriptsLoaded[$intern_91]) {
    __gwt_scriptsLoaded[$intern_91] = true;
    document.write($intern_81 + base + $intern_92);
  }
  if (!__gwt_scriptsLoaded[$intern_93]) {
    __gwt_scriptsLoaded[$intern_93] = true;
    document.write($intern_81 + base + $intern_94);
  }
  if (!__gwt_scriptsLoaded[$intern_95]) {
    __gwt_scriptsLoaded[$intern_95] = true;
    document.write($intern_81 + base + $intern_96);
  }
  if (!__gwt_scriptsLoaded[$intern_97]) {
    __gwt_scriptsLoaded[$intern_97] = true;
    document.write($intern_81 + base + $intern_98);
  }
  $doc.write($intern_99);
}

com_mycompany_gwt_mycompanyAdmin();
