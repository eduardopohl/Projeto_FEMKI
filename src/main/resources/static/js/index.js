$(document).ready(function () {
    fixedHeader();
    showTestimonial();
    showRespMenu();

});

//Adding bg color to header on scroll
function fixedHeader() {
    var wScroll, heroHeight;
    heroHeight = $('.hero-wrapper').outerHeight();
    $(window).scroll(function () {
        wScroll = $(this).scrollTop();
        if (wScroll > heroHeight - 100) {
            $('header').addClass('fixed');
        } else {
            $('header').removeClass('fixed');
        }
    });
}

//Showing Testimonials
function showTestimonial() {
    var ele, eleIndex;
    $(document).on('click', '.bullet-item', function () {
        ele = $(this);
        eleIndex = ele.index() + 1;
        $('.bullet-item, .testimonial-item').removeClass('selected');
        ele.addClass('selected');
        $('.testimonial-item:nth-child(' + eleIndex + ')').addClass('selected');
    });
}

//Showing menu in small screen
function showRespMenu() {
    $(document).on('click', '.hamburger-menu', function () {
        var ele = $(this);
        $('body').toggleClass('show-menu');
    });
}

//valida o ID do Equipamento

function validaIdEquipamento(){
	var id= document.getElementByName('numero_serie')
	
	if(id === )
	
};

function myFunction() {
	  var inpObj = document.getElementById("id1");
	  if (!inpObj.checkValidity()) {
	    document.getElementById("demo").innerHTML = inpObj.validationMessage;
	  }
	}


function mascara(i,t){

	   var v = i.value;
	   if(isNaN(v[v.length-1])){
		      i.value = v.substring(0, v.length-1);
		      return;
		   }
	   if(t == "cnpj"){
		      i.setAttribute("maxlength", "18");
		      if (v.length == 2 || v.length == 6) i.value += ".";
		      if (v.length == 10) i.value += "/";
		      if (v.length == 15) i.value += "-";
		   }
	   if(t == "cep"){
		      i.setAttribute("maxlength", "9");
		      if (v.length == 5) i.value += "-";
		   }
	   
	   if(t == "telefone"){
		      if(v[3] == 9){
		         i.setAttribute("maxlength", "12");
		         if (v.length == 7) i.value += "-";
		      }else{
		         i.setAttribute("maxlength", "11");
		         if (v.length == 6) i.value += "-";
		      }
		   }
		}



