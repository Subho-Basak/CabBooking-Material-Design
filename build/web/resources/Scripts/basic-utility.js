/**
 * Created by SoftSuave-50 on 7/3/2017.
 */

$(document).ready(function(){
  $('.booking-stepper fieldset:not(:nth-of-type(1))').hide();
  $('.dialog-wrapper').hide();

  $('.more-filter,.view-route').click(function(){
    $('.dialog-wrapper').fadeIn(300).slideDialogUp();
  });

  $('.dialog-wrapper').click(function(){
    $('.dialog-main').animate({'margin-top':'10%'},200).fadeOutDialog();
  });


  $.fn.slideDialogUp = function(){
    $('.dialog-main').animate({'margin-top':'5%'},200);
  }
  $.fn.fadeOutDialog = function(){
    $('.dialog-wrapper').fadeOut(300);
  }

  $('.md-select').on('click', function(){
    $(this).toggleClass('active')
  })

  $('.md-select ul li').on('click', function() {
    var v = $(this).text();
    $('.md-select ul li').not($(this)).removeClass('active');
    $(this).addClass('active');
    $('.md-select label button').text(v)
  })

});

function swapLocation(){

  var pLoc = $('#origin-input').val();
  var dLoc = $('#destination-input').val();

  if(pLoc != "" || dLoc != ""){
    var temp = pLoc;
    pLoc= dLoc;
    dLoc = temp;
    $('#origin-input').val(pLoc);
    $('#destination-input').val(dLoc);
  }

}

function goToNext(obj){
  $(obj).parents("fieldset").hide().next().fadeIn(500);
}
