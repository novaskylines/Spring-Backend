/* 
    =====testB=====
*/
//  .bigImg img {display:none;}을 통해 기본적으로 모든 자식 노드를 가림.
// .bigImg img:first-child {display:block}으로 첫 번째 자식 노드만을 보여주고 있음.
// 즉 함수가 발동했을때 모든 자식 노드를 가리고 필요한 자식 노드만을 보여줄 필요가 있음.
let screenSwitch = (page) => {
    console.log(page);
    const bigImg = document.querySelectorAll(".bigImg img");
    const sImg = document.querySelectorAll(".sImg div");
    console.log(bigImg);
    console.log(bigImg[page].style);
    for(i=0; i<bigImg.length; i++) {
        if (i==page) {
            bigImg[i].style.display="block";
            sImg[i].style.border="5px solid red";
        } else {
            bigImg[i].style.display="none";
            sImg[i].style.border="0px";
        }
    }

}


/* 
    =====testD=====
*/
// tabContainer div on, tabBtn li on으로 활성화된 탭을 표시.
// 탭을 활성화시킬 경우 on 클래스를 부여해야 하며, 비활성화할 경우 on 클래스를 제거.
// 위랑 동일하게 필요한 자식 노드만을 보여주도록 코딩.
let tabSwitch = (tab) => {
    console.log(tab);
    const tabContainer = document.querySelectorAll("#tabContainer div")
    const tabBtn = document.querySelectorAll(".tabBtn li")
    console.log(tabContainer);
    console.log(tabBtn);
    for (i=0; i<tabContainer.length; i++) {
        if (i==tab) {
            tabContainer[i].classList.add("on")
            tabBtn[i].classList.add("on")
        } else {
            tabContainer[i].classList.remove("on")
            tabBtn[i].classList.remove("on")
        }
    }
}