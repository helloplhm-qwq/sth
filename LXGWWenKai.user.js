// ==UserScript==
//
// @match *
// @name 无
// @description 无
// @author helloplhm-qwq
// @version 0.1
//

function loadStyle(url) {
  var link = document.createElement('link')
  link.type = 'text/css'
  link.rel = 'stylesheet'
  link.href = url
  var head = document.getElementsByTagName('head')[0]
  head.appendChild(link)
}

// 使用方法引入css
loadStyle('https://jsd.cdn.zzko.cn/gh/helloplhm-qwq/sth@main/style.css')
