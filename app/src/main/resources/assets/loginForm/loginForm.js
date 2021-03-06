'use strict';

angular.module('myApp.loginForm', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
    $routeProvider.when('/login', {
        templateUrl: 'loginForm/loginForm.html',
        controller: 'LoginFormCtrl'
    });
}])

.controller('LoginFormCtrl', ['$scope', '$http', '$location', '$rootScope', function($scope, $http, $location, $rootScope) {
    $scope.login = {};

    $scope.logIn = function(){
        $http
            .post('/api/login', $scope.login)
            .then(function(response){
                $rootScope.fixerUser = response.data;
                if (angular.equals($rootScope.fixerUser.role, "repair_employee")) {
                    $location.path('/repairs');
                }
                else $location.path('/view1');

            }, function(){});
    }
}]);