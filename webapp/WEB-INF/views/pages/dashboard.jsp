        <!-- Page Content -->
 <div id="page-content-wrapper">
     <div class="container-fluid"> 
         <div class="row">
             <div class="col-lg-12">
                      <div class="panel panel-default">
                        <div class="panel-heading">
                            <i class="glyphicon glyphicon-globe text-info"></i> Map Overview Dashboard
                            <div class="pull-right">
                            <form class="navbar-search pull-left">
                            <input type="text" class="search-query rounded" placeholder="Search">
                            </form>
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                                         
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Icons</a>
                                        </li>
                                        <li><a href="#">Route</a>
                                        </li>
                                        <li><a href="#">Boundery</a>
                                        </li>
                                        <li class="divider"></li>
                                        <li><a href="#">Stationary</a>
                                        </li>
                                    </ul>
                                </div>

                            </div>
                        </div>
                        <!-- /.panel-heading -->
                         <div class="panel-body">
             <div id="map" style="width: 100%; height: 400px;"></div>
                
                
                    <a href="#menu-toggle" class="btn btn-default" id="menu-toggle"><img src="resources/images/toggle.png" width="25px" height="25px"/></a>
                        
                        </div>
                        <!-- /.panel-body -->
                    </div>
                </div>
            </div>
             <div class="row">
                <div class="col-lg-3 col-md-6">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-flag-checkered fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">26</div>
                                    <div>In Move!</div>
                                </div>
                            </div>
                        </div>
                        <a href="#">
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
                <div class="col-lg-3 col-md-6">
                    <div class="panel panel-yellow">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-flag fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">3</div>
                                    <div>Stationary </div>
                                </div>
                            </div>
                        </div>
                        <a href="#">
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
                 <div class="col-lg-3 col-md-6">
                    <div class="panel panel-red">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-flag-o fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">2</div>
                                    <div>Unresponsive</div>
                                </div>
                            </div>
                        </div>
                        <a href="#">
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>               
                <div class="col-lg-3 col-md-6">
                    <div class="panel panel-green">
                        <div class="panel-heading">
                            <div class="row">
                                <div class="col-xs-3">
                                    <i class="fa fa-tasks fa-5x"></i>
                                </div>
                                <div class="col-xs-9 text-right">
                                    <div class="huge">31</div>
                                    <div>Total</div>
                                </div>
                            </div>
                        </div>
                        <a href="#">
                            <div class="panel-footer">
                                <span class="pull-left">View Details</span>
                                <span class="pull-right"><i class="fa fa-arrow-circle-right"></i></span>
                                <div class="clearfix"></div>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
            <!-- /.row -->
         <div class="row">
             <div class="col-lg-12">
                      <div class="panel panel-default">
                        <div class="panel-heading">
                            <i class="fa fa-bar-chart-o fa-fw"></i> Area Chart Example
                            <div class="pull-right">
                                <div class="btn-group">
                                    <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                                        Actions
                                        <span class="caret"></span>
                                    </button>
                                    <ul class="dropdown-menu pull-right" role="menu">
                                        <li><a href="#">Action</a>
                                        </li>
                                        <li><a href="#">Another action</a>
                                        </li>
                                        <li><a href="#">Something else here</a>
                                        </li>
                                        <li class="divider"></li>
                                        <li><a href="#">Separated link</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                        <!-- /.panel-heading -->
                         <div class="panel-body" id="result">
                         http://www.cssauthor.com/bootstrap-admin-templates/
              http://themifycloud.com/demos/templates/KAdmin/KAdmin-Dark/dashboard.html
                            <div id="morris-bar-chart"></div>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                </div>
            </div>

        </div>
     </div>
        <!-- /#page-content-wrapper -->
     <script type="text/javascript">
                
                function moveClamp(){
                	//alert("here");
                $.get("g/coordinates", function(data, status){  
                	
                	 
                var locations  =  jQuery.parseJSON(data); 
                $("#result").html(data); 
                 var map = new google.maps.Map(document.getElementById('map'), {
                  zoom: 18,
                  center: new google.maps.LatLng(locations[0][1], locations[0][2]),
                  mapTypeId: google.maps.MapTypeId.ROADMAP
                });
                var infowindow = new google.maps.InfoWindow();
                var marker, i;
                var myPath = new Array;
                for (i = 0; i < locations.length; i++) {  
                  marker = new google.maps.Marker({
                    position: new google.maps.LatLng(locations[i][1], locations[i][2]),
                    map: map
                  });     
                 myPath.push(new google.maps.LatLng(locations[i][1], locations[i][2]));

                 google.maps.event.addListener(marker, 'click', (function(marker, i) {
                return function() {
                      infowindow.setContent(locations[i][0]);
                      infowindow.open(map, marker);
                    }
                  })(marker, i));
                } 
               var flightPath = new google.maps.Polyline({
                  path: myPath,
                  geodesic: true,
                  strokeColor: '#FF0000',
                  strokeOpacity: 1.0,
                  strokeWeight: 2
                });

                 flightPath.setMap(map); 

                 var from=new google.maps.LatLng(locations[0][1],locations[0][2]);
                 var to=new google.maps.LatLng(locations[50][1],locations[50][2]);

                var directionsService = new google.maps.DirectionsService();
                var directionsRequest = {
                  origin:from,
                  destination:to,
                  travelMode: google.maps.DirectionsTravelMode.DRIVING,
                  unitSystem: google.maps.UnitSystem.METRIC
                };
                directionsService.route(
                 directionsRequest,
                  function(response, status)
                  {
                    if (status == google.maps.DirectionsStatus.OK)
                    {
                      new google.maps.DirectionsRenderer({
                        map: map,
                        directions: response
                      });
                    }
                    else
                      $("#error").append("Unable to retrieve your route<br />");
                          }
                        ); 
                    });
                    }
                setInterval(moveClamp, 5000);
              // moveClamp();
                          
                </script>