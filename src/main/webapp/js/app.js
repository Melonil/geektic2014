var app = angular.module("geektic", ['ngRoute']);

app.controller('Search', function($scope, $http,$location) {
    $scope.search=function(){
        $location.url('/geek?sexe='+$scope.criteria.sexe);
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
                controller: 'listGeek'
            }).
            otherwise({
                redirectTo: '/search'
            });
    }]);


app.controller('listGeek', function($scope, $http, $location) {
    $http.get('/getGeek',{params:$location.search()}).success(function(listeGeek) {
        $scope.Geeks=listeGeek;
    });

});
