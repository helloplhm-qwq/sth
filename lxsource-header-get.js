const getScriptHeader = () => {
  // 获取完整的HTML，并逐行解析为Array
  let html = decodeURIComponent(window.location.href).split('\n');
  let htmlArray = []
  html.forEach((i) => {
    htmlArray.push(i.trim())
  })
  // 变量不必多说
  let headerArray = [];
  let headerStarted = false;
  let completed = false;
  // 遍历Array
  for (let i = 0; i < htmlArray.length; i++) {
    let h = htmlArray[i];
    if (completed) {
      return headerArray.join('\n');
    }
    if (h.startsWith('<script')) {
      headerArray.push(h.split('>')[1]);
      headerStarted = true;
      continue;
    }
    if (h.trim().includes('*/')) {
      headerArray.push(h);
      completed = true;
      continue;
    }
    if (headerStarted) {
      headerArray.push(h);
      continue;
    }
  }
}
