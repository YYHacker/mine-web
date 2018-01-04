<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<%
String path = request.getContextPath();//
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=10, user-scalable=yes">
    <title>mine-web</title>
    <link href="<%=basePath %>/theme/ext-6.2.0/classic/theme-triton/resources/theme-triton-all.css" rel="stylesheet" />
    <script type="text/javascript" src="<%=basePath %>/theme/ext-6.2.0/ext-all.js"></script>
    <script type="text/javascript" src="<%=basePath %>/theme/ext-6.2.0/classic/locale/locale-zh_CN.js"></script>
    <script type="text/javascript">
		    Ext.onReady(function(){
		    	var vport = new Ext.Viewport({  
		    	       enableTabScroll:true,  
		    	        layout:"border",//采用border布局  
		    	        fill : true,
		    	        tabBar: {
		    	            flex: 1,
		    	            layout: {
		    	                align: 'stretch',
		    	                overflowHandler: 'none'
		    	            }
		    	        },
		    	        responsiveConfig: {
		    	            tall: {
		    	                headerPosition: 'top'
		    	            },
		    	            wide: {
		    	                headerPosition: 'left'
		    	            }
		    	        },
		    	        defaults: {
		    	            bodyPadding: 20,
		    	            tabConfig: {
		    	                plugins: 'responsive',
		    	                responsiveConfig: {
		    	                    wide: {
		    	                        iconAlign: 'left',
		    	                        textAlign: 'left'
		    	                    },
		    	                    tall: {
		    	                        iconAlign: 'top',
		    	                        textAlign: 'center',
		    	                        width: 120
		    	                    }
		    	                }
		    	            }
		    	        },
		    	        items:[  
		    	         {  
		    	          region:"north",  
		    	          bodyStyle:'background-color:#E6E6FA',
		    	          height:50,  
		    	         },  
		    	         {  
		    	          region:"west",  
		    	          bodyStyle:'background-color:#E6E6FA',
		    	          width:200,  
		    	          title:"菜单",  
		    	          html:""  
		    	         },  
		    	         {  
		    	          region:"center", 
		    	          xtype:"tabpanel",//面板的类型  
		    	          bodyStyle:'background-color:#E6E6FA',
		    	          items:[  
		    	                 {title:"新闻管理"},  
		    	                 {title:"用户管理"}  
		    	               ]  
		    	         }]  
		    	      });  
		    });
    </script>
</head>
<body>

</body>
</html>
