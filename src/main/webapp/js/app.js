var app = angular.module("geektic", ['ngRoute']);

app.controller('Search', function($scope, $http,$location) {
    $scope.search=function(){
        $location.path('geek');
        $http.get('/service/getInteret').success(function(listeGeek) {

        });
    }

});

app.config(['$routeProvider',
    function($routeProvider) {
        $routeProvider.
            when('/search', {
                templateUrl: '../template/searchView.html',
                controller: 'Search'
            }).
            when('/geek', {
                templateUrl: '../template/listGeek.html',
                controller: 'Search'
            }).
            otherwise({
                redirectTo: '/search'
            });
    }]);



