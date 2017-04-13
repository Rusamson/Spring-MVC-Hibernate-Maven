 <jsp:include page="theme/header.jsp" />
 
 <div id="wrapper">
 
 <jsp:include page="theme/sidebar.jsp" />
  <jsp:include page="theme/topbar.jsp" />
    <jsp:include page="${page}" flush="true" />
 </div>
    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>


 <jsp:include page="theme/footer.jsp" />