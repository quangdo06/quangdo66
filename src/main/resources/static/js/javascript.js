var backgroundImages = [
    'https://www.whatspaper.com/wp-content/uploads/2023/12/hd-coffee-wallpaper-whatspaper-2.jpg',
    'https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiCOFgt7smC6rsX2QSZjz8kvyc4h34YZ4VZ3kozwTWhSfh0IxHrV4IU3bL4JLvm7kH4wSSIr2sDRSP-_RLgp157tynR45q85LHf8G7YdxXeffjQ4WckiYGaQsI5CHPKLj5POY4B3j5H1Xk/s1600/image.png=w660-h433-p-k-no-nu',
    'https://i.pinimg.com/originals/55/7c/7a/557c7a8c36af3acef060e357c58ae82b.jpg'
];
var intervalSeconds = 1;
var header = document.getElementById('header');
var imageIndex = 0;
function changeBackground() {
    header.style.backgroundImage = 'url(' + backgroundImages[imageIndex] + ')';

    imageIndex++;

    if (imageIndex === backgroundImages.length) {
        imageIndex = 0;
    }
}
setInterval(changeBackground, intervalSeconds * 2000);
