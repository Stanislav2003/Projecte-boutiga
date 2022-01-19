





/**
        emailjs.send("SERVICE ID", "TEMPLATE NAME", {
          to_name: "USERNAME",
          from_name: "FROM NAME",
          message: "MESSAGE",
        });
       **/
       
      
   
    var nomPersonak=document.querySelector(".username");
    var correuPersonak=document.querySelector(".email");
   
   function posarDades(){
    nomPersonak = JSON.parse(localStorage.getItem('nomPerson'));
    correuPersonak = JSON.parse(localStorage.getItem('correuPerson'));
   }
   
   
   
   
   
   
    function validar() {
      let name = document.querySelector(".usuari");
      let email = document.querySelector(".correu");
      let btn = document.querySelector(".enviar");
      btn.addEventListener("click", (e) => {
        
        e.preventDefault();
        posarDades();
        
        if (name == nomPersonak || email == correuPersonak ) {
            success();
        }  
        
        else{
         error();
        }
      });
    }
    validar();

    


    function error() {
      Swal.fire({
        icon: "error",
        title: "Ostres...",
        text: "usuari o correu incorrectes!",
      });
    }
    
    

 

    function success() {
      Swal.fire({
        icon: "success",
        title: "Perfecte!...",
        text: "has iniciat sessio!",
      });
    }
    

