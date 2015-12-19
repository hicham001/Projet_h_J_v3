'use strict';
GestionEvaluateur.directive('ngDetails',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Evaluateur/detailsEvaluateur.jsp'
	}
});

GestionEvaluateur.directive('ngAjouter',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Evaluateur/evaluateur-creation.jsp'
	}
});

GestionEvaluateur.directive('ngUpdate',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Evaluateur/edit.jsp'
	}
});

