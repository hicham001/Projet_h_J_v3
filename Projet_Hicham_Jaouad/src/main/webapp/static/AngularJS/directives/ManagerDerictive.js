'use strict';
GestionManager.directive('ngDetails',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Manager/detailsManager.jsp'
	}
});

GestionManager.directive('ngAjouter',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Manager/manager-creation.jsp'
	}
});

GestionManager.directive('ngUpdate',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Manager/edit.jsp'
	}
});

