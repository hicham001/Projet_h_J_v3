'use strict';
GestionEvaluateur.directive('ngDetailse',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Evaluateur/detailsEvaluateur.jsp'
	}
});

GestionEvaluateur.directive('ngAjoutere',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Evaluateur/evaluateur-creation.jsp'
	}
});

GestionEvaluateur.directive('ngUpdatee',function(){
	return{
		restrict : 'E',
		templateUrl : 'static/AngularJS/Templates/Evaluateur/edit.jsp'
	}
});

