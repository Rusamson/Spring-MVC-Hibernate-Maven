         <!-- Page Content -->
 <div id="page-content-wrapper">
     <div class="container-fluid"> 
             <!-- /.row -->
         <div class="row">
             <div class="col-lg-12"> 
                      <div class="panel panel-primary">
                        <div class="panel-heading">
                            <i class="fa fa-envelope fa-fw"></i> Trackers
                             
                        </div> 
                         <div class="panel panel-blue" style="background:#FFF;">
                            <div id="table" class="panel-heading">List of all trackers</div> 
                                 
                            </div>
                        </div>
                    </div>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                </div>
                   <!-- /#page-content-wrapper -->
<script type="text/javascript">
  function displayTable(){  
           $.get("trackers", function(data, status){ 
        	   var users  =  jQuery.parseJSON(data);  
        	   var result = '<table class="table table-hover table-bordered"><thead><tr><th>GSM</th><th>IMEI</th><th>Name</th><th>Description</th></tr></thead><tbody>'; 
        	
        	   for(var i =0; i < users.length ; i++){
                var str1 = '<tr><td>'+users[i]['gsm']+'</td><td>'+users[i]['imei']+'</td>';
                var str2 = '<td>'+users[i]['name']+'</td><td>'+users[i]['description']+'</td></tr>'; 
                result = result + str1 +str2;
        	   }
               var str3 = '</tbody></table>';
               result = result + str3; 
               $('#table').html(result);
              }
           );  
       }
  displayTable();
 </script>