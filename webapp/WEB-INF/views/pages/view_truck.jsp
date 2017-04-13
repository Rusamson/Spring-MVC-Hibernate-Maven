         <!-- Page Content -->
 <div id="page-content-wrapper">
     <div class="container-fluid"> 
             <!-- /.row -->
         <div class="row">
             <div class="col-lg-12"> 
                      <div class="panel panel-primary">
                        <div class="panel-heading">
                            <i class="fa fa-envelope fa-fw"></i> Trucks
                             
                        </div> 
                         <div class="panel panel-blue" style="background:#FFF;">
                            <div id="table" class="panel-heading">Variations Table</div> 
                                 
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
           $.get("trucks", function(data, status){ 
        	   var users  =  jQuery.parseJSON(data);  
        	   var result = '<table class="table table-hover table-bordered"><thead><tr><th>plate</th><th>model</th><th>color</th><th>description</th></tr></thead><tbody>'; 
        	
        	   for(var i =0; i < users.length ; i++){
                var str1 = '<tr><td>'+users[i]['plate']+'</td><td>'+users[i]['model']+'</td>';
                var str2 = '<td>'+users[i]['color']+'</td><td>'+users[i]['description']+'</td></tr>'; 
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