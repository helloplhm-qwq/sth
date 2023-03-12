/*!
 * @name 彭狸花喵自用源~开源版
 * @description 这里似乎什么也没有~
 * @version v1.0.0+beta.3
 * @collaborators Folltoshe
 * @author helloplhm-qwq
 */


/******/ (() => { // webpackBootstrap
/******/  "use strict";
var __webpack_exports__ = {};

const thisversioncode = 10003
const thisversionname = '1.0.0.beta3'

const { EVENT_NAMES, on, send, request, utils: lxUtils, version } = window.lx
console.log(window.lx)

const md5 = str => utils.crypto.md5(str)

const utils = {
  buffer: {
    from: lxUtils.buffer.from,
    bufToString: lxUtils.buffer.bufToString,
  },
  crypto: {
    aesEncrypt: lxUtils.crypto.aesEncrypt,
    md5: lxUtils.crypto.md5,
    randomBytes: lxUtils.crypto.randomBytes,
    rsaEncrypt: lxUtils.crypto.rsaEncrypt,
  },
}

const kw = ({
  info: {
    name: '酷我音乐',
    type: 'music',
    actions: ['musicUrl'],
    qualitys: ['128k','320k','flac','flac24bit'],
  },

  musicUrl({ songmid }, quality) {
    console.log(quality)
    const kw_qualitymap = {
      '128k': 'LQ',
      '192k': 'PQ',
      '320k' :'HQ',
      'flac': 'SQ',
      'flac24bit': 'ZQ'
    }
    const target_url = `https://thewind.xyz/api/next/download?src=KW&quality=${kw_qualitymap[quality]}&songid=${songmid}`
    return new Promise((resolve, reject) => {
      console.log(songmid, quality)
      request(target_url, {
        method: 'GET',
        headers: {
          'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:82.0) Gecko/20100101 Firefox/82.0',
          // Referer: 'http://kuwo.cn/',
        },
      }, (err, resp) => {
        console.log(resp.body)
        if (err) return reject(err)
        if (resp.body.downloadLinkMap[kw_qualitymap[quality]] === '') return reject(new Error(`出错惹…`))

        resolve(resp.body.downloadLinkMap[kw_qualitymap[quality]])
      })
    })
  },
});

const kg = ({
  info: {
    name: '酷狗音乐',
    type: 'music',
    actions: ['musicUrl'],
    qualitys: ['128k'],
  },

  musicUrl({ hash, albumId }, quality) {
    let key = md5(hash.toLowerCase()+'kgcloudv2100500')
    let target_url = `http://trackercdn.kugou.com/i/v2/?cmd=26&key=${key}&hash=${hash.toLowerCase()}&pid=1&behavior=play&mid=0&appid=1005&userid=0&version=8876&vipType=0&token=0`
    return new Promise((resolve, reject) => {
      console.log(target_url, hash, quality, key)
      request(target_url, {
        method: 'GET',
      }, (err, resp) => {
        console.log(resp.body)
        if (err) return reject(err)
        const data = resp.body

        if (data.status !== 1) return reject(new Error(`该歌曲似乎要收费……,code:${data.status}`))

        resolve(resp.body.url[0])
      })
    })
  },
});

const fileConfig = {
  '128k': {
    s: 'M500',
    e: '.mp3',
    bitrate: '128kbps',
  },
  '320k': {
    s: 'M800',
    e: '.mp3',
    bitrate: '320kbps',
  },
  flac: {
    s: 'F000',
    e: '.flac',
    bitrate: 'FLAC',
  },
}

const tx = ({
  info: {
    name: '企鹅音乐',
    type: 'music',
    actions: ['musicUrl'],
    qualitys: ['128k'],
  },

  musicUrl({ songmid }, quality) {
    const target_url = 'https://u.y.qq.com/cgi-bin/musicu.fcg'
    const guid = '10000'
    const songmidList = [songmid]
    const uin = '0'

    const fileInfo = fileConfig[quality]
    const file =
      songmidList.length === 1 &&
      `${fileInfo.s}${songmid}${songmid}${fileInfo.e}`

    const reqData = {
      req_0: {
        module: 'vkey.GetVkeyServer',
        method: 'CgiGetVkey',
        param: {
          filename: file ? [file] : [],
          guid,
          songmid: songmidList,
          songtype: [0],
          uin,
          loginflag: 1,
          platform: '20',
        },
      },
      loginUin: uin,
      comm: {
        uin,
        format: 'json',
        ct: 24,
        cv: 0,
      },
    }
    return new Promise((resolve, reject) => {
      console.log(songmid, quality)
      request(`${target_url}?format=json&data=${JSON.stringify(reqData)}`, {
        method: 'GET',
        headers: {
          channel: '0146951',
          uid: 1234,
        },
      }, (err, resp) => {
        console.log(resp.body)
        if (err) return reject(err)
        const data = resp.body
        const { purl } = data.req_0.data.midurlinfo[0]

        if (purl === '') return reject(new Error('出错惹……'))

        const url = data.req_0.data.sip[0] + purl

        resolve(url)
      })
    })
  },
});



const buf2hex = buffer => { 
  return version
    ? utils.buffer.bufToString(buffer, 'hex')
    : [...new Uint8Array(buffer)]
        .map(x => x.toString(16).padStart(2, '0'))
        .join('')
}

const aesEncrypt = (data, eapiKey, iv, mode) => {
  if (!version) {
    mode = mode.split('-').pop()
  }
  return utils.crypto.aesEncrypt(data, mode, eapiKey, iv)
}



const qualitys = {
  '128k': 128000,
  '320k': 320000,
  flac: 999000,
}
const eapi = (url, object) => {
  const eapiKey = 'e82ckenh8dichen8'

  const text = typeof object === 'object' ? JSON.stringify(object) : object
  const message = `nobody${url}use${text}md5forencrypt`
  const digest = md5(message)
  const data = `${url}-36cd479b6b5-${text}-36cd479b6b5-${digest}`
  return {
    params: buf2hex(aesEncrypt(data, eapiKey, '', 'aes-128-ecb')).toUpperCase(),
  }
}

let cookie = 'os=pc'

const wy = ({
  info: {
    name: '网易音乐',
    type: 'music',
    actions: ['musicUrl'],
    qualitys: ['128k'],
  },

  musicUrl({ songmid }, quality) {
    quality = qualitys[quality]
    const target_url = 'https://interface3.music.163.com/eapi/song/enhance/player/url'
    const eapiUrl = '/api/song/enhance/player/url'

    const d = {
      ids: `[${songmid}]`,
      br: quality,
    }
    const data = eapi(eapiUrl, d)

    return new Promise((resolve, reject) => {
      console.log(songmid, quality)
      request(target_url, {
        method: 'POST',
        form: data,
        headers: {
          cookie,
        },
      }, (err, resp) => {
        console.log(resp.body)
        if (err) return reject(err)
        if (resp.headers.cookie) cookie = resp.headers.cookie

        let res_data = resp.body
        const { url } = res_data.data[0]
        if (!url) return reject(new Error('出错惹……'))
        resolve(url)
      })
    })
  },
});


const mg_qualitys = {
  '128k': '1',
  '320k': '2',
  flac: '3',
  flac24bit: '4',
}

const mg = ({
  info: {
    name: '咪咕音乐',
    type: 'music',
    actions: ['musicUrl'],
    qualitys: ['128k', '320k', 'flac', 'flac24bit'],
  },

  musicUrl({ songmid }, quality) {
    quality = mg_qualitys[quality]
    const target_url = `https://api.dog886.com/v1/getMiGuSong?id=${songmid}&type=${quality}`
    return new Promise((resolve, reject) => {
      console.log(songmid, quality)
      request(target_url, {
        method: 'GET',
        headers: {
          'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:82.0) Gecko/20100101 Firefox/82.0',
          // Referer: 'http://kuwo.cn/',
        },
      }, (err, resp) => {
        console.log(resp.body)
        if (err) return reject(err)
        let playUrl = resp.body.data?.url
        if (!playUrl) return reject(new Error('失败惹…'))

        if (playUrl.startsWith('//')) playUrl = `https:${playUrl}`

        resolve(playUrl.replace(/\+/g, '%2B'))
      })
    })
  },
});

const apis = ({
  kw: kw,
  kg: kg,
  tx: tx,
  wy: wy,
  mg: mg,
});



on(EVENT_NAMES.request, ({ source, action, info }) => {
  switch (action) {
    case 'musicUrl':
      return apis[source].musicUrl(info.musicInfo, info.type).catch((err) => {
        console.log(err.message)
        return Promise.reject(err)
      })
  }
})

const sources = {}
for (const [source, apiInfo] of Object.entries(apis)) {
  sources[source] = apiInfo.info
}

send(EVENT_NAMES.inited, {
  status: true,
  openDevTools: false,
  sources,
})

console.log('准备检查更新')

request('https://cdn.jsdelivr.net/gh/helloplhm-qwq/sth@main/version_info.json', {
  method: 'GET',
  timeout: 5000,
  headers: {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:82.0) Gecko/20100101 Firefox/82.0',
  },
}, (err, resp) => {
  console.log('检查更新')
  console.log(resp.body)
  if (err) {
    throw new Error(err.message)
  }
  if (resp.body.console.latestversioncode > thisversioncode) {
    send(EVENT_NAMES.updateAlert, {log: `${resp.body.console.update_log_part1}${thisversionname}${resp.console.main.update_log_part2}`,updateUrl: resp.body.console.update_url})
    console.log(resp.body.console.versioncode)
  }
})
})()
;
