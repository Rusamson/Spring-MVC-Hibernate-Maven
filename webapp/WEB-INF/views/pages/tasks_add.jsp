         <!-- Page Content -->
 <div id="page-content-wrapper">
     <div class="container-fluid"> 
             <!-- /.row -->
         <div class="row">
             <div class="col-lg-12">
                      <div class="panel panel-primary">
                        <div class="panel-heading">
                            <i class="fa fa-tasks fa-fw"></i> Add Tasks
                             
                        </div>
                        <!-- /.panel-heading -->
                         <div class="panel-body">

    <div class="panel-heading">
        Link the user to the tracker and the truck
    </div>
    <div class="panel-body pan">
        <form action="task/add" method="POST">
            <div class="form-body pal">
 
     <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label" for=
                            "inputName">Tracker ID</label>
                            <div class="input-icon right">
                                <i class="fa fa-user"></i> <input class=
                                "form-control" id="inputName" placeholder=""
                                type="text" name="tracker_id">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label" for=
                            "inputEmail">User ID </label>
                            <div class="input-icon right">
                                <i class="fa fa-user"></i> <input class=
                                "form-control" id="inputEmail" placeholder=""
                                type="text" name="user_id">
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label" for=
                            "inputName">Truck ID</label>
                            <div class="input-icon right">
                                <i class="fa fa-phone"></i> <input class=
                                "form-control" id="inputName" placeholder=""
                                type="text" name="truck_id">
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group">
                            <label class="control-label" for=
                            "inputEmail">Description</label>
                            <div class="input-icon right">
                                <i class="fa fa-envelope"></i> <input class=
                                "form-control" id="inputEmail" placeholder=""
                                type="text" name="description">
                            </div>
                        </div>
                    </div>
                </div>
                 
            </div>
            <div class="form-actions text-right pal">
                <button class="btn btn-primary" type="submit">Save Task</button>
            </div>
        </form>
    </div> 
                        </div>
                        <!-- /.panel-body -->
                    </div>
                </div>
            </div>
           </div>
       </div>