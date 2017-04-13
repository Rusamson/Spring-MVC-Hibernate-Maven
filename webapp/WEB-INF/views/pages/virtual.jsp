         <!-- Page Content -->
 <div id="page-content-wrapper">
     <div class="container-fluid"> 
             <!-- /.row -->
         <div class="row">
             <div class="col-lg-12">
                      <div class="panel panel-primary">
                        <div class="panel-heading">
                            <i class="fa fa-compass fa-fw"></i> Virtual GPS tracker
                             
                        </div>
                        <!-- /.panel-heading -->
                         <div class="panel-body">

						    <div class="panel-heading">
						       Simulator
						    </div>
						    <form id="form1" action="g/coordinate/add" method="GET">
    						<table class="table table-hover table-bordered">
                                    <thead>
                                    <tr>
                                        <th>Number</th>
                                        <th>Start Coordinates</th>
                                        <th>Iteration</th>
                                        <th>Play/Stop</th>              
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr> 
                                      <td>
                                        <input class=
		                                "form-control" id="number1" placeholder=""
		                                type="text" name="number" value="089458622">
		                              </td> 
                                      <td>
                                        <input class=
		                                "form-control" id="coordinate1" placeholder=""
  type="text" name="location" value="lat:53.61255 long:-6.20539 speed:000.6 
T:08/29/16 16:03 
http://maps.google.com/maps?f=q&q=53.61255,-6.20539&z=16 " >
		                              </td> 
                                      <td>
                                        <input class=
		                                "form-control" id="iteration1" placeholder=""
		                                type="text" name="iteration">
		                              </td>
		                               <td>                                      
                                         <button onclick="tracker(1);">
                                             Play/Stop
                                         </button> 
                                         </td>   
                                    </tr>
                                   </tbody>  
                                </table>	
                                </form>
                                <button onclick="tracker(1);">
                                             Test
                                  </button> 
    						   <!--   <table class="table table-hover table-bordered">
                                    <thead>
                                    <tr>
                                        <th>Number</th>
                                        <th>Start Coordinates</th>
                                        <th>Iteration</th>
                                        <th>Play/Stop</th>              
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <tr> 
                                      <td>
                                        <input class=
		                                "form-control" id="number1" placeholder=""
		                                type="text" name="number1">
		                              </td>
                                      <td>
                                        <input class=
		                                "form-control" id="coordinate1" placeholder=""
		                                type="text" name="coordinate1">
		                              </td>
                                      <td>
                                        <input class=
		                                "form-control" id="iteration1" placeholder=""
		                                type="text" name="iteration1">
		                              </td>            
                                         <td>
                                         <button onclick="tracker(1);">
                                             Play/Stop
                                         </button> 
                                         </td>   
                                    </tr>
                                     <tr> 
                                      <td>
                                        <input class=
		                                "form-control" id="number2" placeholder=""
		                                type="text" name="number2">
		                              </td>
                                      <td>
                                        <input class=
		                                "form-control" id="coordinate2" placeholder=""
		                                type="text" name="coordinate2">
		                              </td>
                                      <td>
                                        <input class=
		                                "form-control" id="iteration2" placeholder=""
		                                type="text" name="iteration2">
		                              </td>            
                                         <td>
                                         <button onclick="tracker(2);">
                                             Play/Stop
                                         </button> 
                                         </td>   
                                    </tr>
                                     <tr> 
                                      <td>
                                        <input class=
		                                "form-control" id="number3" placeholder=""
		                                type="text" name="number3">
		                              </td>
                                      <td>
                                        <input class=
		                                "form-control" id="coordinate3" placeholder=""
		                                type="text" name="coordinate3">
		                              </td>
                                      <td>
                                        <input class=
		                                "form-control" id="iteration3" placeholder=""
		                                type="text" name="iteration3">
		                              </td>            
                                         <td>
                                         <button onclick="tracker(3);">
                                             Play/Stop
                                         </button> 
                                         </td>   
                                    </tr>
                                   </tbody>  
                                </table>	
   						    	-->					             
                        </div>
                        <!-- /.panel-body -->
                    </div>
                </div>
            </div>
           </div>
       </div>
       <script>
       var play1 = false;
       var play2 = false;
       var play3 = false;
       
      /* $('#number1').val('0894891201');
       $('#number2').val('0784562556');
       $('#number3').val('0358489862');
       $('#coordinate1').val('lat:53.61251 long:-6.20535');
       $('#coordinate2').val('lat:53.61251 long:-6.20535');
       $('#coordinate3').val('lat:53.61251 long:-6.20535');
       $('#iteration1').val('0.25');
       $('#iteration2').val('0.58');
       $('#iteration3').val('0.15');
       */
       function tracker(id){
      if(id==1){
       if(play1 == false){
    	   play1 = true; 
    	  // $( "#form1" ).submit(); 
    	 // $.get("g/coordinate/add?number=089458622&location=lat%3A53.61210+long%3A-6.20550+speed%3A000.6", function(data, status){
    	  // });
    	//   moveTracker1();
    	  // setTimeout(moveTracker1, 3000);
       }else{
    	   play1 = false; 
        } 
      }
      if(id==2){
          if(play2 == false){
       	   play2 = true;
       	   alert('Play '+id);
          }else{
       	   play2 = false;
       	   alert('Stop '+id);
           } 
         }
      if(id==3){
          if(play3 == false){
       	   play3 = true;
       	   alert('Play '+id);
          }else{
       	   play3 = false;
       	   alert('Stop '+id);
           } 
         }
       }

	   var latIteration = 0.00002;
	   var longIteration = 0.00005;
	   var lat = 53.61210;
	   var longt = -6.20550;
	   var interval;
       function moveTracker1(){
    	   lat = lat+longIteration;
    	   longt= longt+longIteration;
  		$.get("g/coordinate/add?number=089458622&location=lat%3A"+lat+"+long%3A"+longt+"+speed%3A000.6", function(data, status){
  			interval = setTimeout(moveTracker1, 5000); 
  		});
       }
       moveTracker1();
       </script>