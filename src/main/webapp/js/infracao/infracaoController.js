App.controller('InfracaoCtrl', function($scope, InfracaoService, AgenteService) {

	$scope.agentes = [];
	$scope.selected = {};
	$scope.endereco = '';
	AgenteService.list().then(function(data) {
		$scope.agentes = data.data;
		console.log("data", $scope.agentes);
		if (data.data.length == 0) {
			$scope.notFound = true;
		}
	}, function(data) {
		console.log("data", data);
	});
	
	var vm = this;


	$scope.lat = 0;
	$scope.lng = 0;
	$scope.result = '';

	vm.getCurrentLocation = (function() {
		if (navigator.geolocation) {
			navigator.geolocation.getCurrentPosition(function(position) {
				$scope.lat = position.coords.latitude;
				$scope.lng = position.coords.longitude;
				$scope.setAddres($scope.lat, $scope.lng)
				console.info("Position: " + $scope.lat + " " + $scope.lng);
			})
		}
	}());

	var newMap = new google.maps.LatLng(-15.7942, -47.8821);

	$scope.mapOptions = {
		center : newMap,
		zoom : 15,
		mapTypeId : google.maps.MapTypeId.ROADMAP
	};

	$scope.onMapIdle = function() {
		console.info("====> called onMapIdle")
		if ($scope.myMarkers === undefined) {
			var marker = new google.maps.Marker({
				map : $scope.myMap,
				draggable : true,
				position : newMap
			});
			google.maps.event.addListener(marker, 'dragend', function(evt) {
				$scope.setAddres(evt.latLng.lat().toFixed(3), evt.latLng.lng().toFixed(3));

			});
			$scope.myMarkers = [ marker, ];
		}
	};

	$scope.setAddres = function(lat, lng) {
		console.info("====> set addres " + lat, lng)
		$scope.lat = lat;
		$scope.lng = lng;
	}

	function geoCode(lat, lng) {
		console.log("getCode: " + lat + " " + lng);
		var geocoder = new google.maps.Geocoder();
		var latlng = new google.maps.LatLng(lat, lng);
		geocoder.geocode({
			'latLng' : latlng
		}, function(results, status) {
			if (status == google.maps.GeocoderStatus.OK) {
				if (results[1]) {
					console.log(results[1].formatted_address);
					$scope.endereco = results[1].formatted_address;
				} else {
					$scope.endereco = 'Ops, cidade não encontrada';
				}
			} else {
				console.log('Geocoder failed due to: ' + status);
				$scope.endereco = 'Ops, ocorreu um erro, contate o administrador do sistema';

			}
		});
	}

	$scope.$watchGroup([ 'lat', 'lng' ], function(newValues, oldValues, scope) {
		geoCode(newValues[0], newValues[1]);
	});


});