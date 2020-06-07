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