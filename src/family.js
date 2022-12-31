
const elements = document.querySelectorAll('.blob');

function handleScroll() {
  elements.forEach((element) => {
    if (isInViewport(element)) {
      element.classList.add('in_view');
    } else {
      element.classList.remove('in_view');
    }
  });
}

window.addEventListener('scroll', handleScroll);

function isInViewport(element) {
  const rect = element.getBoundingClientRect();
  return (
    rect.top >= 0 &&
    rect.left >= 0 &&
    rect.bottom <= (window.innerHeight || document.documentElement.clientHeight) &&
    rect.right <= (window.innerWidth || document.documentElement.clientWidth)
  );
}
