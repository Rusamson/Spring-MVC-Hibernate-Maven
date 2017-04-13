         <!-- Page Content -->
 <div id="page-content-wrapper">
     <div class="container-fluid"> 
             <!-- /.row -->
         <div class="row">
             <div class="col-lg-12"> 
                      <div class="panel panel-primary">
                        <div class="panel-heading">
                            <i class="fa fa-envelope fa-fw"></i> Tasks
                             
                        </div> 
                         <div class="panel panel-blue" style="background:#FFF;">
                            <div id="table" class="panel-heading">List of all tasks</div> 
                                 
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
           $.get("tasks", function(data, status){ 
        	   var users  =  jQuery.parseJSON(data);  
        	   var result = '<table class="table table-hover table-bordered"><thead><tr><th>Tracker ID</th><th>User ID</th><th>Truck ID</th><th>Description</th></tr></thead><tbody>'; 
        	
        	   for(var i =0; i < users.length ; i++){
                var str1 = '<tr><td>'+users[i]['tracker_id']+'</td><td>'+users[i]['user_id']+'</td>';
                var str2 = '<td>'+users[i]['truck_id']+'</td><td>'+users[i]['description']+'</td></tr>'; 
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