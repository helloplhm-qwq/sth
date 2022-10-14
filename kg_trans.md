这个页面的歌曲是[ロクデナシ - ただ声一つ](https://www.kugou.com/song/#hash=CDC9C582043C512FBBE52EF8624391A2&album_id=61760431)  
在源码中找到了解析krc的部分，解析完以后对应的外语歌会有一个翻译项  
这是从[[太长了点击跳转]](http://lyrics.kugou.com/download?ver=1&client=pc&id=103076179&accesskey=8F110C1A85C149513E23ADF22A769F3B&fmt=krc&charset=utf8)请求下来的数据（和洛雪音乐本体歌词来源相同）：  
```json
{"charset":"","content":"a3JjMTjbpCwFXWAQ50gO\/zfdUqUjWMiB8AleWlhVikSlaELyNjDLMa3SmmEsG3ntrqVRzC3BRefaIlIEQ1B1PdKQJmFMAFv0eKWNdt87SLdx4gXEPWq6vhp1vgujZuR4dSTUFKscvgHKjQu65uk9lwmti6E\/OZroocPvsqLxRlrQPQBWmZoYBCnVnqmnacHECDKWh6yJj5uNjw8I7knP6yA+UFctCO+U+40K5i4KOffyJlTGejmluaZfox5e1T+mFLVUuLr9thmN7BcdLlfhFoXlwdYO0OwERcLyQp25bNGzPLs+b9u4TxDc+JCewB+DORxyVnMee8Hn3ZBqjp884juIgOwBvLUP7Ow+oBr56KiPdeYT9YYH2AhexJ2Y7LT3B3c\/F7qDgaB5fXidlLRJWvjv2Re6w9loZsCtLQ6b\/sk0p3CclPCKog+dL8qF7Fg6UG0cE\/OQ+1sTgac0to1DcEklMcKN2MKMmOhMeixMmNYlQR0E8J7OImn86y4IyCyUwCXwcum6t6rrrICspEOBjrK5YT0MPd4Gs+aoIT+LptN3P+cRRjlbaoK9ovTg6ub8\/3h2pyrc78XJZVUwMtFzQN+gwp6o+UegE4jTSKkFIfLlCZSQmbbELeudBjqPSgZ\/v0awoFiJ1lAt9GM+vMQ0yGkgLa1nuj0gqxhIPqQZGFKbfne\/630zzw6EW11dGsV5YAVPbx3Qy8ZdSyGxJJjm2FB5+SP+zr2AUdTDGq2lRv\/YMOmDY6UwAfmr+VArIViSvVE1jIv+M9qVRN0Y\/YquEj1YMgow5t5IhiFCyYeP++zc6T7Os2KaTei3KsDGTIWR0TZauniW1IOPdeGwjZy6w7lRx+KKALzw+27eeWBhqKrczIoTJquqK4ZqIp8RSuCXVBY1Ew6qRICPSjPLumgcO0AKrZ2LFq5NuKvx2pnCsoRJiBm\/7BQQ+lKtPHt5qZkbRNHWo5+VmVeog1tyh\/tK\/nG1uWe6BtzWLUmwcAWZklfOK4p5L8hvFvbvJqwGV17kexeoyJpWrv4rqGMSLebWPqtxBRgQAK7i\/YLTtSiW3ze5ma7uOhEweQvd4aHb+JazncnX5Hc9tpqJfFnupvr1hLICNoZfqybqWe+794b5znMBil22DEgVOPO8mVlRql7FsAdSyysouKqeSqwGza0Ig7+gFpcYeg6CL+0EOqYmJjMLt4O\/gobdKJLNvXw4PUhEvLrQ8Fkkg+6Sb0ifOuymj7GqqEP7Ami81hHLPFGpDhBJpsF28jZV8HW\/RsHr3gmLFFSwZiftp7EbJ2clMmvAawelrejayG+A6fC1gqRJfhAb4WX2S3oM\/EGY46Gj2Jh5N2z\/dIQ8gPghyKloxcVycT\/hCLCh\/hmZTtVifSZwPsW5nrsBKDe4wjSdj4fg2FwQrGbSpHN44xadN\/To+0FRkCdVoruVAAksmYQLIy\/8gMR0fZ12pQzSkY7upXJoyaL1\/e7csHGY98PY+4\/B2HnIBjqr\/vJ85J9P9uGYn34oDVa6ecQu7X4KQ0mBg39lLfsx82NenL\/fgojEDDC4kZjuhGDf+G5ncajotNCxmzzAQgNQb2QCoPsblpIZP+g0eEuEw6zYpu6H2s4oWSaU7JJMGilmIN6RW7eQLY76tHBois5yZ2S+Thj\/sDX0sLTkm0VTQh3TjCpUzuQqjCeZ1r3ExLpcwJxpOVaVR2+P5CXs9Mqg6DKC\/TUL+jvhjlENi411PzNkn6rpk2KB1dlCf+jmcLJN2Ftu6Qrb6IqxFaFXKIJyZPurNf7bQ\/bRmy63k8VRDx\/0nZuKCIo2oepwR8pUUZCPtaVGdUYUhLWlvDD5kFBlwmXHW3HqAxKNwy\/u8FMMOJ9pnNOhmpKn91Z62IeelNcV8p0YgVCBi4O8HuL+l4RbCRI1p8xDAAtu4yqEbUXwAnQFPy684tvfi7thpPATwFllPMI2ukPQhPKHxTsBmGK\/DwZC03Ko8S0AgwoLqXzAFKcWV4Qy3Noieooq97Ns3t+NSJaWu1uuQwPF+XrbcIC3YXK+MAv5vUQQiuuEoimdI3xXQA+uO+ioOmc+ZK3RGFPtjwitrJIEHYpOPnLbusZHnz+S5fnJMpP9xHGU\/KWDloHSX5IGyMHTRjis1j3icWAZnx7xcUBbUonXk5e4m1StE8+ek\/vx78aUIoo4qXQ21dlwlx7ZPu7U1abYE+wex51bfxH3b858KHzSPjpnUax+sQQ37+kzOsjbrjQViXBaeD6BLtseQmLGWVnOr1v9ME9vUJn\/+9chFMSnrvv2Y04bYNHfaatK+\/B\/cDFqZoK3O69QxQ+8Y+QL8L7hkb7DUnt65ZGcfQA8rzQULAvEUh5TldCBOZ41gxAMq2ioMek9sB4ZE8TKt+3dziRYfxaelReiexCECjpCnCYU1S81J2r4HUJeVsClXJ1U6\/eGNgwMNnYmcCImCFsmMozC\/4Oc16fJbaTh75wffEvxonSIoRGbBkgcgXQ6Au9cNl84A8ql+zrfCHpukOYG5S5tRWkgkvu49avvK0PGYv+wPN7AWEmwT16xXKE3eHIFkr0kEN0n4vgix3iVfva7kLKOHu867aWwM2IqIKZKMry92HMrUFPmjeV\/fwWu5mOHO1LlYphaPJMAhPNL3TSlh57c48FtvNm5sbp2mKvN3i\/lwLduybxBttBtz0iG\/eSvI9Lm8PupImaEOsw4GAnwkqrqNxjEwX4xiD8eJlzYhcvYaaShJDNUEBCvzLin+Hjf7wk69D\/N48VySqaS0bT77ZG9UtH50dnw4U44KRBliutn+NDRKNOgWFIYKShpK4yGTAogq\/U2NgehoK7NOsWFagVu3\/D7uTxVG36PcPa+wSHvXnrXX57g6gP7ESjiarysCBP2D7mQ4WpLQip4oALmnB2KXq7q3vF7KwkusmTQyoqXZ4Yq1WEr3RyO4qPN4iHTyLpg2M7oIywskIY6Ek5tqGLg8riQ0MknT8erSYv6263lQJEl2CQe18uwRTk2eLpT3LNE+w\/NtGBRf3PvWi9IARbdZ1oMmJR2+qbMkCiQdq7a\/iQn7hXlNqIEJH86i+pqbhzLIsVw8HL3aNwC0hKEQ7BrCPQoz6l\/e6badsEsuHTcIOO07+50DOr3T8L3cjAceq9ZcVvi8I8PFoGugsa6QrWS\/FqCibd1Xi7JXCG4hW55\/kXN89jG3Dm1SzlouTXXtNUT\/ZepVzQOMLTVOuiUbFN6jhp1o1tUMvLkBcZPq1OdO2F4lie9eTpCcfgaSa6poFQaYLy85XZgAW0dG3E0cYIQlt9Nghrpl9krsuudf9IOhTVBZdspxYTc5gSGyG2duMqgiT77Py44BbWcJOA7n9o\/J7xExGKFWk5ded+jQOb2na1UvdLPAMdZpkLeOsI4iLyOjQqiL\/xkmDa8KHVp\/mWIjnop0KwmhQOC5CmKhMy\/9pW70yc9I4kWXQwdeChHTPnK63gvQXn72g\/UsQS78Mk8HqUZ2yppgfb\/1qXGce2Zib+1XsWXF5kqtAnPjai9fZlgKUZSNzaz1j+0KLUjhZZ9TwqZ+iTnkkc0myuXJsppkI7XrKWoLZhavInkcHCeQJio6j4HoDKUkeWoZYe094s6w9YsXjJKctI+awAJvvlbsG7ot+nKg6tKRzmZtJO2h9cGCu6KG41LmWvD1sOm+TtUxo+JGHCvn5\/bL1Xx8xnaUGJE5trmd3FNOIA5N+XsytVhuXTXI\/4PaFimU7BRgkLZnfffwbwQN3EBRWMtIt9sv0FPJGFdembRTmnoyjit9kjNzUB9P1D26WBlmhaoLFrDnrKg2tzNDAuMzqTZvjBMYAzuSCJ9wsase5jhfL6dXyu9iqRdwUGMgeQDwD2Uxas5zY4NL302seLP+CzXXJyI\/mrNE1wtmoPVP7wYlS8lpqoWlCvFszYunWxJfOYf6JK2vj8mh8C9S8hTEh2OtTug11aYf+Sr+kdiNA1xDM7+ZNshlfFBdOmV83aic4BpIYgFVz9gaK6QSA27bYOjz4KsPCsrOkWEJg+rAuF2uEAXWKFbR8q6IZLU0TIgHpAp6hitvNjdFLQ1L59r11dg4yE1qQ6IrM3TddpLxEV+Vn3InR5DddS5M1V+VnO2vnCxgg6VzNmBm18Wb2tGNaoDHyxTm7SohDWE0dCBPqBw+Crsa+Til9asp+2c5PM8logW\/I51KGlxlw7t34CeQK6nYZQnPOziQ+LxxUNOYPaWoFkyQik7wiHRDQC\/3m8hLjNZeBBFP08t6\/RkgXk7G56LUu6BXyILVSxfiayFnsoOZeIhUZ4qycic6tBQWYkisW9kNXv2iYaYwdIaAOHtZX2Noy8QZYz9glrrs+aj4Dgg34x7\/6Rh5ICQxTzUZVaMAacDHXhnbQFV75OO1h65FuMA9FbD1UG\/\/I3TaTYxnPiUSOVdiEmg2VtZsteXDOGzAIi\/ERihCSUwyOa2rryctCS8Ly5svK5NPm5fDtJS+9HZFvJThiKzcX2cNeTayouyq1wXJg19KmlxXoyvezkuOmMfqmpRZbO3c623DRkKWGQ\/l0eMNrSVYYO5GVrYDOvFmKeP0X+LAp1b3gLbOsLCOlF3mzW8tQFWcbgk\/P\/byq9\/d2bikqkTgfS4\/nIH0P3Eaf87B9z4cphb0TwzdflnL3ion4bJ+6AAKyHSUk+59l8X1kaBR+NYexhi3BDbGVOZZLf\/uP43B3EL95XCf48edF8EA1lS5uz+NuNKbA9LwyX2sGohEf9qubnc2xSx6NxC6ypx7TkvcZxtcYjsu\/eOKUHoRkiNW5I+BdCx2pjIWnn3r0vGnk5nyWKvufiwHmCGWY87fEsHwRROPQwtmHjwFYHdkLex14N2xjE6n+5qCMnGeP+\/\/GXJuv3oCtjpN7ymOJWkk\/5K5kQSQz6saTNJ50rE6c9iPb5xAF2GxifIoA0ntGVra4UJnoFUOx38SDRYMvUce53w8fUzrUXNppiORG\/EyLm8IF72VcFMxXv+Bcngi6ltK9LBUZO+D9PtJpAd2xfW5GyttH1xE\/ZUYMHJu4O8Rfrc5j+3GvUG+AoVS0sEsb0nAECBuJwDCHGuQjbnody8K0Oz5cKKtrZz+B6QZ2BAkDN1w+AUZgXYEjvKJ7xiQ0mDfKRFFW99Nd3x6dqFH+MryExOzfabdyo5f+\/CzjiP2luXQdsoGFcKdQWsR5Rpml1DPw6VU9bPU2CfP8KkKkFRBg3DU\/\/mMC\/qz984VHuz159tArhhtdZK\/ixwIwsEA8p3Ixylg8xqyuPADF\/j+577rRUMewKNUTVbcpiKetN\/IrAxSy2VgTznqsnBq0YAPXS+Q7kVHmNsc4egg13WNKLgXedOzuo+bwEekP4fOErz1FbirHSWD7\/oSoIscKY5pMUU3\/VZtRtNiAswemjJ6SA\/FQZnI\/ZOQbmgrnpKTPXl+aH1DXgAQ8rXhOCw5aV3vT6qj9HmFqRvETRkRypnH0kYYEYkqQ0ViA4YeeYIYyoqGxVqQao3glVSSisCZfsSwghwXWCOl2XfZhzAJWYv1id8udBVOAFwfOZHVpv+a5Q0itfMdsxCYQeLfPdel9c9KzMk0NVKs0unspSAk05NZEjSdw362+J7+dm2nZSnZ181BRhNyVjMEE9IR8p7EyBvI2HyhfkvPWPk66H4PSKRA5cm5aYS4QAdZOtCexGORsxTjhrAfjgTfmJpiScNdW1XYqyWK5EbcN6\/mFg61wlsELROplAvrSbrBthhOA3Xg\/Mye+VcItsKjzma9DP+KoIwKxdfeuCXvGMGruPkcF5AmSaZM3k1e7UzFKCyHumA9FCZBNFvyFL6cdPApDcFX0DZYq9FfG6qhnjHFWXgauhTI20Eg1Q00z\/5EXLRnm9VYpKX9r65yMNh9cgkasKYYJ7i3ObO3JPqLqYhPWwKZkkCW5G+dMrNegBWe0T5QqyltBMr\/wswFA0GhY3EUkDCSsNP3Cknzt8QoXusjEWpNasLqCeD+XFFDHgocOaPTgYQd1JtL5bN0QWLM9Fvd0TjL8yl2HpD1AhFNH9dWJIXQ\/UmcdykNsUD+Rw+MaWyEBHivODO9u2rCKF4fD4miyZDUwIfhPESfZMOV0FPtSblrYOUOv5BQIFQy0Fh81TBrLRkpf+JsHtmNJT+HrMQlxXosqs8p9vifL2+fhNq\/9RqNWKT6w3br9gLPVmiudz0\/iV8vcT1nhO8s0E8zW1xKeSBDauYtDOiLcmD18oyE8ZJRDntZIE7HCfA8SmP1YZaboyOgLkRmNQPD9RQ343IlpprgwZe\/wT5tbgotEbL+pHbn9WV6MNhKtd\/NL2Os7OkIcE20oVsTEmSl0OE8X+9AnDY5JDcePHRa96lqXPdoZwAASsIT2Prpna13jSjT6GCQneKGu4EL7AAY5nGf8uFUqKasCOiC8E75WVxxhBrnBPt09BrvUIUwbt3+YIh9nBIFvhNAL6LvyDKTPPuC52IzP05haiDL9PnyfAQhoJ1o2GZV+TNpuZzxLAW1G+EJ\/LqKikfNXoE0Xjs\/DhXP4hYX9cyUjSLzF730eREpS5FJd1mGiJQcw1mUu3mSTDsg3Bu+Lnpxbhtkzk3p3wuvOuf6N6RjKkD6LWNnZlzRGBsAjrOxIbG6UpUAmmlrk7gvlhKdazYJg+ooos0u9B80NtvQvgDipk2cBRtRfCpxSgeAs8lcGPeulhtRRzs\/yY6DjFC5729SMFB+AU=","info":"OK","_source":"bss","status":200,"contenttype":0,"error_code":0,"fmt":"krc"}
```
解析后是这样：
```
[id:$0624D153]
[ar:ロクデナシ]
[ti:ただ声一つ]
[by:]
[hash:66b274cf0581e5b30a79c18bec8aa4bb]
[al:]
[sign:]
[qq:]
[total:161593]
[offset:0]
[language:eyJjb250ZW50IjpbeyJsYW5ndWFnZSI6MCwibHlyaWNDb250ZW50IjpbWyJybyAiLCJrdSAiLCJkZSAiLCJuYSAiLCJzaGkgICIsIi0gIiwidGEgIiwiZGEgIiwia28gZSAiLCJoaSB0byAiLCJ0c3UgIl0sWyJzYSBrdSAiLCJzaGkgOiIsIk1JTUkiXSxbInNhIGtreW8gIiwia3UgOiIsIk1JTUkiXSxbInRzdSBkdSAiLCJrdSAgIiwiamkga2EgIiwibiAiLCJubyAiLCJrZSBwcGUgIiwibiAiXSxbIndvICIsImEgdHN1ICIsIm1lICIsInRlICIsImkgIiwicnUgICIsInRhICIsImRhICJdLFsic3UgIiwiZ2kgIiwicnUgIiwibm8gIiwiIiwidG8gIiwibm8gIiwieW8gaGEgIiwia3UgIiwibmkgIiwia2EgIiwia3UgIl0sWyJrbyB0YSAiLCJlICIsIndhICAiLCJpICIsInRzdSAiXSxbImhvICIsIm4gIiwibm8gIiwicmkgIiwiY2hpIGkgIiwic2EgIiwibmEgIiwia2EgbiAiLCJqbyB1ICIsImhlICJdLFsiYSBpICIsIndvICIsImhpICIsInRvICIsInRzdSAiLCJtYSAiLCJ0YSAiLCJuZSAiLCJtYSAiLCJ0YSAiLCJuZSAiXSxbInlvIHJ1ICIsIm5pICIsInNhICIsImt1ICIsIm8gbiAiLCJkbyAiLCJ0byAiLCJoaSAiLCJydSAiLCJtYSAiLCJkZSAiXSxbImtvIGt5dSAiLCJ1ICAiLCJoaSAiLCJ0byAiLCJ0c3UgIiwiaSAiLCJraSAiLCJydSAiLCJpICIsImtpICIsInJ1ICJdLFsieWEgc2EgIiwic2hpICIsImkgIiwiaGkgYmkgIiwibm8gIiwieW8ga28gIiwiZGUgIl0sWyJuYSAiLCJrYSAiLCJudSAiLCJ5byAiLCJ1ICIsIm5pICAiLCJhICIsImEgIl0sWyJuYSAiLCJrYSAiLCJudSAiLCJ5byAiLCJ1ICIsIm5pICJdLFsiY2hpICIsIiIsImNjaGEgIiwiIiwibmEgIiwia28gdG8gIiwiYmEgIl0sWyJjaGkgIiwia3UgIiwiY2hpICIsImt1ICIsInNoaSAiLCJ0YSAiLCJubyAiXSxbImtpICIsInJpICIsImdhICIsIm5hICIsImkgIiwia2UgIiwiZG8gIiwic2EgIl0sWyJzbyAiLCJyZSAiLCJ3byAiLCJ3YSBzdSAiLCJyZSAiLCJ0YSAiLCJmdSAiLCJyaSAiLCJ0c3Uga2EgIiwicmUgIiwidGEgIiwieW8gIl0sWyJ5byBydSAiLCJ5byAiLCJkYSAiLCJraSAiLCJzaGkgIiwibWUgIiwidGUgIl0sWyJreW8gIiwidSAiLCJkYSAiLCJ0dGUgIiwiICIsIndhIHJhICIsInUgIiwid2EgcmEgIiwidSAiXSxbIm5hICIsImkgIiwiY2hhICIsIiIsInUgIiwiYm8ga3UgIiwid28gIl0sWyJrYSBrdSAiLCJzdSAiLCJ0YSAiLCJtZSAiLCJuaSAiLCJ3YSByYSAiLCJ1ICJdLFsiaSAiLCJlICIsIm5hICIsImkgIiwia28gIiwidG8gIiwid2EgIl0sWyJpICIsImUgIiwibmEgIiwiaSAiLCJkZSAiLCJ5byAiLCJpICJdLFsidHRlICIsIiIsIm8gbW8gIiwiZSAiLCJ0YSAiLCJyYSAiXSxbImthIHJ1ICIsImt1ICIsIm5hICIsInJlICIsInJ1ICIsIm5vICIsImthICIsIm5hICJdLFsiYSBpICIsIndvICIsImhpICIsInRvICIsInRzdSAiLCJtYSAiLCJ0YSAiLCJuZSAiLCJtYSAiLCJ0YSAiLCJuZSAiXSxbInlvIHJ1ICIsIm5pICIsInNhICIsImt1ICIsIm8gbiAiLCJkbyAiLCJ0byAiLCJoaSAiLCJydSAiLCJtYSAiLCJkZSAiXSxbImtvIGt5dSAiLCJ1ICIsImhpICIsInRvICIsInRzdSAiLCJpICIsImtpICIsInJ1ICIsImkgIiwia2kgIiwicnUgIl0sWyJ5YSBzYSAiLCJzaGkgIiwiaSAiLCJoaSBiaSAiLCJubyAiLCJ5byBrbyAiLCJkZSAiXSxbIm5hICIsImthICIsIm51ICIsInlvICIsInUgIiwibmkgIl0sWyJhIGkgIiwid28gIiwiaGkgIiwidG8gIiwidHN1ICIsIm1hICIsInRhICIsIm5lICIsIm1hICIsInRhICIsIm5lICJdLFsiYSAiLCJhICJdLFsiYSBpICIsIndvICIsImhpICIsInRvICIsInRzdSAiLCJtYSAiLCJ0YSAiLCJuZSAiLCJtYSAiLCJ0YSAiLCJuZSAiXSxbInlhIHNhICIsInNoaSAiLCJpICIsImhpIGJpICIsIm5vICIsInlvIGtvICIsImRlICJdLFsid2EgcmEgIiwidSAiLCJ5byAiLCJ1ICIsIm5pICJdLFsiYSAiLCJhICJdLFsiaGEgIiwia2kgIiwiZGEgIiwic3UgIiwia2kgIiwibW8gIiwiY2hpICIsIndhICIsImthIG4gIiwidGEgbiAiLCJkZSAiXSxbImRlICIsIm1vICIsImkgIiwia2kgIiwicnUgIiwibm8gIiwibmEgbiAiLCJpICIsImRvICIsInRhIGthICIsInN1ICIsImdpICIsInRlICJdLFsiZG8gIiwidSAiLCJuaSAiLCJtbyAiLCJ0byAiLCJrZSAiLCJuYSAiLCJpICIsInRvICIsImkgIiwiZGEgIiwicmEgIiwia2UgIl0sWyJhICIsImEgIl0sWyJzYSAiLCJwcGEgIiwicmkgIiwiIiwia2kgIiwia2thICIsInJpICIsIiIsInplIG4gIiwia28gdSAiLCJpICIsInRlICJdLFsibmEgIiwibiAiLCJ0ZSAiLCJzaGkgIiwibmEgIiwia3UgIiwidGUgIiwieW8gIiwiaSAiLCJrYSAiLCJyYSAiXSxbImRhICIsImtpICIsInNoaSAiLCJtZSAiLCJ0ZSAiXSxbImEgaSAiLCJ3byAiLCJoaSAiLCJ0byAiLCJ0c3UgIiwibWEgIiwidGEgIiwibmUgIiwibWEgIiwidGEgIiwibmUgIl1dLCJ0eXBlIjowfSx7Imxhbmd1YWdlIjowLCJseXJpY0NvbnRlbnQiOltbIiAiXSxbIiAiXSxbIiAiXSxbIlx1NUMwNlx1NUVGNlx1N0VFRFx1NzY4NFx1NjVGNlx1NTE0OVx1Nzg4RVx1NzI0NyJdLFsiXHU1QzNEXHU2NTcwXHU2NTM2XHU5NkM2XHU4RDc3XHU2NzY1IFx1NUMzMVx1OEZEOVx1NjgzNyJdLFsiXHU1RUE2XHU4RkM3XHU2NUY2XHU2NUU1IFx1NTcyOFx1N0IxNFx1OEJCMFx1NzY4NFx1N0E3QVx1NzY3RFx1NTkwNFx1NTE5OVx1NEUwQiJdLFsiXHU3QjU0XHU2ODQ4XHU0RjU1XHU2NUY2XHU0RjFBXHU1MUZBXHU3M0IwIl0sWyJcdTgxRjQgXHU1N0NCXHU4NUNGXHU0RThFXHU1RkMzXHU3Njg0XHU2RTNBXHU1QzBGXHU2MTFGXHU2MEM1Il0sWyJcdThCQTlcdTYyMTFcdTRFRUNcdTVDMDZcdThGRDlcdTRFRkRcdTcyMzFcdTkxQ0RcdTY1QjBcdTY3NjVcdThGQzciXSxbIlx1NzZGNFx1ODFGM1x1NzA2Rlx1NTE0OVx1OTY4Rlx1NTkxQ1x1OTVGNFx1N0VGRFx1NjUzRVx1NzY4NFx1NkUyOVx1NUVBNlx1NEVBRVx1OEQ3NyJdLFsiXHU1NDdDXHU1NDM4IFx1NURGMlx1NTQwOFx1ODAwQ1x1NEUzQVx1NEUwMCBcdTUyQUFcdTUyOUJcdTZEM0JcdTRFMEJcdTUzQkIiXSxbIlx1NTNFQVx1NjEzRlx1NEUwRVx1NkUyOVx1NjdENFx1NzY4NFx1NjVGNlx1NTE0OVx1NzZGOFx1NEYzNCJdLFsiXHU0RTBEXHU0RjFBXHU1MThEXHU4NDNEXHU0RTBCXHU2Q0VBXHU2QzM0IFx1NTU0QVx1NTU0QSJdLFsiXHU1M0VBXHU2MTNGXHU2MjExXHU0RTBEXHU1MThEXHU4NDNEXHU2Q0VBIl0sWyJcdTkwQTNcdTRFOUJcdTY1RTBcdTVGQzNcdTc2ODRcdThCRERcdThCRUQiXSxbIlx1NTM3NFx1NEVFNFx1NjIxMVx1NTAwRFx1NjExRlx1NTIzQVx1NzVEQiJdLFsiXHU2QzM4XHU4RkRDXHU5MEZEXHU0RTBEXHU0RjFBXHU2NzA5XHU1QzNEXHU1OTM0Il0sWyJcdTUwNDdcdTg4QzVcdTVGRDhcdTUzNzRcdTRFMDBcdTUyMDcgXHU0RUU0XHU2MjExXHU3QjRCXHU3NUIyXHU1MjlCXHU3QUVEIl0sWyJcdTU5MUNcdTY2NUFcdTU1NEEgXHU4QkY3XHU2MkU1XHU2MkIxXHU2MjExIl0sWyJcdTRFQ0FcdTU5MjlcdTRFNUZcdTRGMUFcdTU3MjhcdTZCMjJcdTdCMTFcdTRFMkRcdTVFQTZcdThGQzciXSxbIlx1N0IxMVx1NUJGOVx1NEUwMFx1NTIwN1x1NjYyRlx1NEUzQVx1NEU4Nlx1OTY5MFx1ODVDRiJdLFsiXHU5MEEzXHU0RTJBXHU2Q0VBXHU2RDQxXHU0RTBEXHU2QjYyXHU3Njg0XHU4MUVBXHU1REYxIl0sWyJcdTY1RTBcdTZDRDVcdThCRjRcdTUxRkFcdTUzRTNcdTc2ODRcdThCREQiXSxbIlx1NEZCRlx1NjVFMFx1OTcwMFx1NUMwNlx1NTE3Nlx1OEJGNFx1NTFGQSJdLFsiXHU4MkU1XHU1M0VGXHU0RUU1XHU4RkQ5XHU0RTQ4XHU2MEYzIl0sWyJcdTY2MkZcdTU0MjZcdTVDMzFcdTgwRkRcdThGN0JcdTY3N0VcdTRFODZcdTU0NjIiXSxbIlx1OEJBOVx1NjIxMVx1NEVFQ1x1NUMwNlx1OEZEOVx1NEVGRFx1NzIzMVx1OTFDRFx1NjVCMFx1Njc2NVx1OEZDNyJdLFsiXHU3NkY0XHU4MUYzXHU3MDZGXHU1MTQ5XHU5NjhGXHU1OTFDXHU5NUY0XHU3RUZEXHU2NTNFXHU3Njg0XHU2RTI5XHU1RUE2XHU0RUFFXHU4RDc3Il0sWyJcdTU0N0NcdTU0MzhcdTVERjJcdTU0MDhcdTgwMENcdTRFM0FcdTRFMDAgXHU1MkFBXHU1MjlCXHU2RDNCXHU0RTBCXHU1M0JCIl0sWyJcdTUzRUFcdTYxM0ZcdTRFMEVcdTZFMjlcdTY3RDRcdTc2ODRcdTY1RjZcdTUxNDlcdTc2RjhcdTRGMzQiXSxbIlx1NEUwRFx1NEYxQVx1NTE4RFx1ODQzRFx1NEUwQlx1NkNFQVx1NkMzNCJdLFsiXHU4QkE5XHU2MjExXHU0RUVDXHU1QzA2XHU4RkQ5XHU0RUZEXHU3MjMxXHU5MUNEXHU2NUIwXHU2NzY1XHU4RkM3Il0sWyJcdTU1NEFcdTU1NEEiXSxbIlx1OEJBOVx1NjIxMVx1NEVFQ1x1NUMwNlx1OEZEOVx1NEVGRFx1NzIzMVx1OTFDRFx1NjVCMFx1Njc2NVx1OEZDNyJdLFsiXHU1M0VBXHU2MTNGXHU0RTBFXHU2RTI5XHU2N0Q0XHU3Njg0XHU2NUY2XHU1MTQ5XHU3NkY4XHU0RjM0Il0sWyJcdTUzRUZcdTRFRTVcdTVDM0RcdTYwQzVcdTZCMjJcdTdCMTEiXSxbIlx1NTU0QVx1NTU0QSJdLFsiXHU1MDNFXHU1NDEwXHU1RkMzXHU2MTBGXHU4RkQ5XHU0RUY2XHU0RThCXHU5NzVFXHU1RTM4XHU3QjgwXHU1MzU1Il0sWyJcdTRGNDZcdTY2MkZcdTZEM0JcdTU3MjhcdTRFQkFcdTRFMTYgXHU5NkJFXHU1RUE2XHU3Q0ZCXHU2NTcwXHU1Mzc0XHU1OTJBXHU5QUQ4Il0sWyJcdTRFMERcdThCQkFcdTU5ODJcdTRGNTUgXHU5MEZEXHU0RjFBXHU1MTQ1XHU2NUE1XHU3NzQwXHU4OUUzXHU0RTBEXHU1RjAwXHU3Njg0XHU3NTkxXHU5NUVFIl0sWyJcdTU1NEFcdTU1NEEiXSxbIlx1NjVFMFx1OTcwMFx1OTg3RVx1NUZDQyBcdTU3NUFcdTVCOUFcdTU3MzBcdTUyQzdcdTVGODBcdTc2RjRcdTUyNERcdTU0MjciXSxbIlx1NUU3Nlx1NEUwRFx1OTcwMFx1ODk4MVx1NTIzQlx1NjEwRlx1NTNCQlx1NTA1QVx1NEU5Qlx1NEVDMFx1NEU0OCJdLFsiXHU4QkY3XHU1QzA2XHU2MjExXHU2MkU1XHU3RDI3Il0sWyJcdThCQTlcdTYyMTFcdTRFRUNcdTVDMDZcdThGRDlcdTRFRkRcdTcyMzFcdTkxQ0RcdTY1QjBcdTY3NjVcdThGQzciXV0sInR5cGUiOjF9XSwidmVyc2lvbiI6MX0=]
[0,1146]<0,0,0>ロ<0,87,0>ク<87,100,0>デ<187,101,0>ナ<288,101,0>シ <389,151,0>- <540,102,0>た<642,101,0>だ<743,151,0>声<894,101,0>一<995,151,0>つ
[1146,557]<0,101,0>作<101,152,0>词：<253,304,0>MIMI
[1703,604]<0,201,0>作<201,100,0>曲：<301,303,0>MIMI
[15256,3635]<0,506,0>続<506,1059,0>く <1565,303,0>時<1868,404,0>間<2272,455,0>の<2727,403,0>欠<3130,505,0>片
[19105,3491]<0,254,0>を<254,1164,0>集<1418,254,0>め<1672,202,0>て<1874,304,0>い<2178,606,0>る <2784,253,0>た<3037,454,0>だ
[22596,4696]<0,303,0>過<303,252,0>ぎ<555,1109,0>る<1664,202,0>ノ<1866,252,0>ー<2118,354,0>ト<2472,405,0>の<2877,403,0>余<3280,353,0>白<3633,353,0>に<3986,252,0>書<4238,458,0>く
[28074,1970]<0,253,0>答<253,455,0>え<708,555,0>は <1263,253,0>い<1516,454,0>つ
[30473,3386]<0,253,0>ほ<253,201,0>ん<454,354,0>の<808,202,0>り<1010,404,0>小<1414,304,0>さ<1718,202,0>な<1920,506,0>感<2426,454,0> 情<2880,506,0>へ
[34166,3283]<0,455,0>愛<455,203,0>を<658,251,0>ひ<909,304,0>と<1213,253,0>つ<1466,202,0>ま<1668,303,0>た<1971,353,0>ね<2324,202,0>ま<2526,302,0>た<2828,455,0>ね
[37449,3585]<0,455,0>夜<455,554,0>に<1009,202,0>咲<1211,354,0>く<1565,303,0>温<1868,252,0>度<2120,253,0>と<2373,354,0>灯<2727,252,0>る<2979,303,0>ま<3282,303,0>で
[41134,3633]<0,405,0>呼<405,454,0>吸 <859,251,0>ひ<1110,302,0>と<1412,352,0>つ<1764,254,0>生<2018,254,0>き<2272,404,0>る<2676,302,0>生<2978,253,0>き<3231,402,0>る
[44767,2371]<0,403,0>優<403,353,0>し<756,353,0>い<1109,404,0>日々<1513,304,0>の<1817,302,0>横<2119,252,0>で
[47195,2450]<0,227,0>泣<227,152,0>か<379,202,0>ぬ<581,151,0>よ<732,152,0>う<884,302,0>に <1186,455,0>嗚<1641,809,0>呼
[55393,1464]<0,303,0>泣<303,203,0>か<506,201,0>ぬ<707,101,0>よ<808,252,0>う<1060,404,0>に
[63349,2733]<0,254,0>ち<254,202,0>っ<456,203,0>ち<659,760,0>ゃ<1419,403,0>な<1822,404,0>言<2226,507,0>葉
[66082,1787]<0,171,0>チ<171,202,0>ク<373,304,0>チ<677,201,0>ク<878,201,0>し<1079,253,0>た<1332,455,0>の
[68574,2121]<0,301,0>キ<301,254,0>リ<555,251,0>が<806,253,0>無<1059,202,0>い<1261,202,0>け<1463,253,0>ど<1716,405,0>さ
[70756,4536]<0,248,0> そ<248,202,0>れ<450,1060,0>を<1510,453,0>忘<1963,303,0>れ<2266,352,0>た<2618,302,0>フ<2920,251,0>リ<3171,405,0>疲<3576,253,0>れ<3829,252,0>た<4081,455,0>よ
[75899,3885]<0,503,0>夜<503,304,0>よ<807,303,0>抱<1110,353,0>き<1463,706,0>し<2169,456,0>め<2625,1260,0>て
[93408,3180]<0,303,0>今<303,201,0>日<504,202,0>だ<706,253,0>っ<959,503,0>て <1462,405,0>笑<1867,404,0>う<2271,455,0>笑<2726,454,0>う
[96597,1586]<0,171,0>泣<171,203,0>い<374,101,0>ち<475,151,0>ゃ<626,253,0>う<879,454,0>僕<1333,253,0>を
[98183,2070]<0,354,0>隠<354,252,0>す<606,252,0>た<858,303,0>め<1161,202,0>に<1363,353,0> 笑<1716,354,0>う
[100253,1766]<0,302,0>言<302,252,0>え<554,301,0>な<855,152,0>い<1007,202,0>こ<1209,253,0>と<1462,304,0>は
[102019,1718]<0,302,0>言<302,253,0>え<555,252,0>な<807,204,0>い<1011,253,0>で<1264,202,0>良<1466,252,0>い
[103737,1565]<0,101,0>っ<101,403,0>て<504,455,0>思<959,202,0>え<1161,202,0>た<1363,202,0>ら
[105302,2674]<0,455,0>軽<455,251,0>く<706,253,0>な<959,201,0>れ<1160,252,0>る<1412,202,0>の<1614,253,0>か<1867,807,0>な
[108004,3171]<0,446,0>愛<446,252,0>を<698,303,0>ひ<1001,253,0>と<1254,252,0>つ<1506,253,0>ま<1759,252,0>た<2011,252,0>ね<2263,353,0>ま<2616,202,0>た<2818,353,0>ね
[111175,3842]<0,555,0>夜<555,354,0>に<909,555,0>咲<1464,203,0>く<1667,304,0>温<1971,303,0>度<2274,201,0>と<2475,356,0>灯<2831,202,0>る<3033,354,0>ま<3387,455,0>で
[115017,3579]<0,454,0>呼<454,303,0>吸<757,251,0>ひ<1008,353,0>と<1361,352,0>つ<1713,252,0>生<1965,352,0>き<2317,354,0>る<2671,252,0>生<2923,254,0>き<3177,402,0>る
[118596,2374]<0,404,0>優<404,405,0>し<809,253,0>い<1062,454,0>日々<1516,302,0>の<1818,304,0>横<2122,252,0>で
[120970,1921]<0,202,0>泣<202,252,0>か<454,152,0>ぬ<606,202,0>よ<808,203,0>う<1011,910,0>に
[122891,3282]<0,455,0>愛<455,202,0>を<657,253,0>ひ<910,201,0>と<1111,252,0>つ<1363,253,0>ま<1616,253,0>た<1869,353,0>ね<2222,252,0>ま<2474,253,0>た<2727,555,0> ね
[126173,2019]<0,353,0>嗚<353,1666,0>呼
[130160,3231]<0,453,0>愛<453,253,0>を<706,252,0>ひ<958,253,0>と<1211,201,0>つ<1412,251,0>ま<1663,255,0>た<1918,354,0>ね<2272,252,0>ま<2524,253,0>た<2777,454,0>ね
[133391,2372]<0,455,0>優<455,354,0>し<809,251,0>い<1060,353,0>日々<1413,354,0>の<1767,353,0>横<2120,252,0>で
[135763,1363]<0,354,0>笑<354,202,0>う<556,203,0>よ<759,202,0>う<961,402,0>に
[137126,521]<0,369,0>嗚<369,152,0>呼
[137647,1479]<0,117,0>吐<117,101,0>き<218,153,0>出<371,100,0>す<471,101,0>気<572,100,0>持<672,152,0>ち<824,100,0>は<924,252,0>簡<1176,152,0>単<1328,151,0> で
[139126,1966]<0,151,0>で<151,152,0>も<303,100,0>生<403,101,0>き<504,152,0>る<656,101,0>の<757,151,0>難<908,201,0> 易<1109,202,0>度<1311,151,0>高<1462,151,0>す<1613,101,0>ぎ<1714,252,0>て
[141223,3233]<0,304,0>ど<304,252,0>う<556,252,0>に<808,201,0>も<1009,252,0>解<1261,152,0>け<1413,303,0>な<1716,203,0>い<1919,254,0>問<2173,201,0>い<2374,202,0>だ<2576,252,0>ら<2828,405,0>け
[144456,422]<0,220,0>嗚<220,202,0>呼
[144878,1551]<0,100,0>さ<100,134,0>っ<234,101,0>ぱ<335,152,0>り<487,101,0>き<588,101,0>っ<689,152,0>か<841,153,0>り<994,203,0>前<1197,101,0>向<1298,152,0>い<1450,101,0>て
[146429,1362]<0,151,0>な<151,152,0>ん<303,100,0>て<403,101,0>し<504,151,0>な<655,101,0>く<756,152,0>て<908,100,0>良<1008,151,0>い<1159,101,0>か<1260,102,0>ら
[147791,859]<0,151,0>抱<151,101,0>き<252,102,0>し<354,152,0>め<506,353,0>て
[148650,161593]<0,404,0>愛<404,353,0>を<757,152,0>ひ<909,252,0>と<1161,302,0>つ<1463,255,0>ま<1718,201,0>た<1919,356,0>ね<2275,252,0>ま<2527,202,0>た<2729,1109,0>ね
```
在解码后的数据中有一个language项，我们把它拎出来，解码base64，是一段json
```json
{"content":[{"language":0,"lyricContent":[["ro ","ku ","de ","na ","shi  ","- ","ta ","da ","ko e ","hi to ","tsu "],["sa ku ","shi :","MIMI"],["sa kkyo ","ku :","MIMI"],["tsu du ","ku  ","ji ka ","n ","no ","ke ppe ","n "],["wo ","a tsu ","me ","te ","i ","ru  ","ta ","da "],["su ","gi ","ru ","no ","","to ","no ","yo ha ","ku ","ni ","ka ","ku "],["ko ta ","e ","wa  ","i ","tsu "],["ho ","n ","no ","ri ","chi i ","sa ","na ","ka n ","jo u ","he "],["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "],["yo ru ","ni ","sa ","ku ","o n ","do ","to ","hi ","ru ","ma ","de "],["ko kyu ","u  ","hi ","to ","tsu ","i ","ki ","ru ","i ","ki ","ru "],["ya sa ","shi ","i ","hi bi ","no ","yo ko ","de "],["na ","ka ","nu ","yo ","u ","ni  ","a ","a "],["na ","ka ","nu ","yo ","u ","ni "],["chi ","","ccha ","","na ","ko to ","ba "],["chi ","ku ","chi ","ku ","shi ","ta ","no "],["ki ","ri ","ga ","na ","i ","ke ","do ","sa "],["so ","re ","wo ","wa su ","re ","ta ","fu ","ri ","tsu ka ","re ","ta ","yo "],["yo ru ","yo ","da ","ki ","shi ","me ","te "],["kyo ","u ","da ","tte "," ","wa ra ","u ","wa ra ","u "],["na ","i ","cha ","","u ","bo ku ","wo "],["ka ku ","su ","ta ","me ","ni ","wa ra ","u "],["i ","e ","na ","i ","ko ","to ","wa "],["i ","e ","na ","i ","de ","yo ","i "],["tte ","","o mo ","e ","ta ","ra "],["ka ru ","ku ","na ","re ","ru ","no ","ka ","na "],["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "],["yo ru ","ni ","sa ","ku ","o n ","do ","to ","hi ","ru ","ma ","de "],["ko kyu ","u ","hi ","to ","tsu ","i ","ki ","ru ","i ","ki ","ru "],["ya sa ","shi ","i ","hi bi ","no ","yo ko ","de "],["na ","ka ","nu ","yo ","u ","ni "],["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "],["a ","a "],["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "],["ya sa ","shi ","i ","hi bi ","no ","yo ko ","de "],["wa ra ","u ","yo ","u ","ni "],["a ","a "],["ha ","ki ","da ","su ","ki ","mo ","chi ","wa ","ka n ","ta n ","de "],["de ","mo ","i ","ki ","ru ","no ","na n ","i ","do ","ta ka ","su ","gi ","te "],["do ","u ","ni ","mo ","to ","ke ","na ","i ","to ","i ","da ","ra ","ke "],["a ","a "],["sa ","ppa ","ri ","","ki ","kka ","ri ","","ze n ","ko u ","i ","te "],["na ","n ","te ","shi ","na ","ku ","te ","yo ","i ","ka ","ra "],["da ","ki ","shi ","me ","te "],["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "]],"type":0},{"language":0,"lyricContent":[[" "],[" "],[" "],["\\u5C06\\u5EF6\\u7EED\\u7684\\u65F6\\u5149\\u788E\\u7247"],["\\u5C3D\\u6570\\u6536\\u96C6\\u8D77\\u6765 \\u5C31\\u8FD9\\u6837"],["\\u5EA6\\u8FC7\\u65F6\\u65E5 \\u5728\\u7B14\\u8BB0\\u7684\\u7A7A\\u767D\\u5904\\u5199\\u4E0B"],["\\u7B54\\u6848\\u4F55\\u65F6\\u4F1A\\u51FA\\u73B0"],["\\u81F4 \\u57CB\\u85CF\\u4E8E\\u5FC3\\u7684\\u6E3A\\u5C0F\\u611F\\u60C5"],["\\u8BA9\\u6211\\u4EEC\\u5C06\\u8FD9\\u4EFD\\u7231\\u91CD\\u65B0\\u6765\\u8FC7"],["\\u76F4\\u81F3\\u706F\\u5149\\u968F\\u591C\\u95F4\\u7EFD\\u653E\\u7684\\u6E29\\u5EA6\\u4EAE\\u8D77"],["\\u547C\\u5438 \\u5DF2\\u5408\\u800C\\u4E3A\\u4E00 \\u52AA\\u529B\\u6D3B\\u4E0B\\u53BB"],["\\u53EA\\u613F\\u4E0E\\u6E29\\u67D4\\u7684\\u65F6\\u5149\\u76F8\\u4F34"],["\\u4E0D\\u4F1A\\u518D\\u843D\\u4E0B\\u6CEA\\u6C34 \\u554A\\u554A"],["\\u53EA\\u613F\\u6211\\u4E0D\\u518D\\u843D\\u6CEA"],["\\u90A3\\u4E9B\\u65E0\\u5FC3\\u7684\\u8BDD\\u8BED"],["\\u5374\\u4EE4\\u6211\\u500D\\u611F\\u523A\\u75DB"],["\\u6C38\\u8FDC\\u90FD\\u4E0D\\u4F1A\\u6709\\u5C3D\\u5934"],["\\u5047\\u88C5\\u5FD8\\u5374\\u4E00\\u5207 \\u4EE4\\u6211\\u7B4B\\u75B2\\u529B\\u7AED"],["\\u591C\\u665A\\u554A \\u8BF7\\u62E5\\u62B1\\u6211"],["\\u4ECA\\u5929\\u4E5F\\u4F1A\\u5728\\u6B22\\u7B11\\u4E2D\\u5EA6\\u8FC7"],["\\u7B11\\u5BF9\\u4E00\\u5207\\u662F\\u4E3A\\u4E86\\u9690\\u85CF"],["\\u90A3\\u4E2A\\u6CEA\\u6D41\\u4E0D\\u6B62\\u7684\\u81EA\\u5DF1"],["\\u65E0\\u6CD5\\u8BF4\\u51FA\\u53E3\\u7684\\u8BDD"],["\\u4FBF\\u65E0\\u9700\\u5C06\\u5176\\u8BF4\\u51FA"],["\\u82E5\\u53EF\\u4EE5\\u8FD9\\u4E48\\u60F3"],["\\u662F\\u5426\\u5C31\\u80FD\\u8F7B\\u677E\\u4E86\\u5462"],["\\u8BA9\\u6211\\u4EEC\\u5C06\\u8FD9\\u4EFD\\u7231\\u91CD\\u65B0\\u6765\\u8FC7"],["\\u76F4\\u81F3\\u706F\\u5149\\u968F\\u591C\\u95F4\\u7EFD\\u653E\\u7684\\u6E29\\u5EA6\\u4EAE\\u8D77"],["\\u547C\\u5438\\u5DF2\\u5408\\u800C\\u4E3A\\u4E00 \\u52AA\\u529B\\u6D3B\\u4E0B\\u53BB"],["\\u53EA\\u613F\\u4E0E\\u6E29\\u67D4\\u7684\\u65F6\\u5149\\u76F8\\u4F34"],["\\u4E0D\\u4F1A\\u518D\\u843D\\u4E0B\\u6CEA\\u6C34"],["\\u8BA9\\u6211\\u4EEC\\u5C06\\u8FD9\\u4EFD\\u7231\\u91CD\\u65B0\\u6765\\u8FC7"],["\\u554A\\u554A"],["\\u8BA9\\u6211\\u4EEC\\u5C06\\u8FD9\\u4EFD\\u7231\\u91CD\\u65B0\\u6765\\u8FC7"],["\\u53EA\\u613F\\u4E0E\\u6E29\\u67D4\\u7684\\u65F6\\u5149\\u76F8\\u4F34"],["\\u53EF\\u4EE5\\u5C3D\\u60C5\\u6B22\\u7B11"],["\\u554A\\u554A"],["\\u503E\\u5410\\u5FC3\\u610F\\u8FD9\\u4EF6\\u4E8B\\u975E\\u5E38\\u7B80\\u5355"],["\\u4F46\\u662F\\u6D3B\\u5728\\u4EBA\\u4E16 \\u96BE\\u5EA6\\u7CFB\\u6570\\u5374\\u592A\\u9AD8"],["\\u4E0D\\u8BBA\\u5982\\u4F55 \\u90FD\\u4F1A\\u5145\\u65A5\\u7740\\u89E3\\u4E0D\\u5F00\\u7684\\u7591\\u95EE"],["\\u554A\\u554A"],["\\u65E0\\u9700\\u987E\\u5FCC \\u575A\\u5B9A\\u5730\\u52C7\\u5F80\\u76F4\\u524D\\u5427"],["\\u5E76\\u4E0D\\u9700\\u8981\\u523B\\u610F\\u53BB\\u505A\\u4E9B\\u4EC0\\u4E48"],["\\u8BF7\\u5C06\\u6211\\u62E5\\u7D27"],["\\u8BA9\\u6211\\u4EEC\\u5C06\\u8FD9\\u4EFD\\u7231\\u91CD\\u65B0\\u6765\\u8FC7"]],"type":1}],"version":1}
```
将Unicode编码为字符后并美化是这样的
```json
{
	"content": [
		{
			"language": 0,
			"lyricContent": [
				["ro ","ku ","de ","na ","shi  ","- ","ta ","da ","ko e ","hi to ","tsu "],
				["sa ku ", "shi :", "MIMI"],
				["sa kkyo ", "ku :", "MIMI"],
				["tsu du ","ku  ","ji ka ","n ","no ","ke ppe ","n "],
				["wo ","a tsu ","me ","te ","i ","ru  ","da "],
				["su ","gi ","ru ","no ","","to ","no ","yo ha ","ku ","ni ","ka ","ku "],
				["ko ta ", "e ", "wa  ", "i ", "tsu "],
				["ho ","n ","no ","ri ","chi i ","sa ","na ","ka n ","jo u ","he "],
				["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "],
				["yo ru ","ni ","sa ","ku ","o n ","do ","to ","hi ","ru ","ma ","de "],
				["ko kyu ","u  ","hi ","to ","tsu ","i ","ki ","ru ","i ","ki ","ru "],
				["ya sa ","shi ","i ","hi bi ","no ","yo ko ","de "],
				["na ","ka ","nu ","yo ","u ","ni  ","a ","a "],
				["na ", "ka ", "nu ", "yo ", "u ", "ni "],
				["chi ","","ccha ","","na ","ko to ","ba "],
				["chi ","ku ","chi ","ku ","shi ","ta ","no "],
				["ki ","ri ","ga ","na ","i ","ke ","do ","sa "],
				["so ","re ","wo ","wa su ","re ","ta ","fu ","ri ","tsu ka ","re ","ta ","yo "],
				["yo ru ","yo ","da ","ki ","shi ","me ","te "],
				["kyo ","u ","da ","tte "," ","wa ra ","u ","wa ra ","u "],
				["na ", "i ", "cha ", "", "u ", "bo ku ", "wo "],
				["ka ku ","su ","ta ","me ","ni ","wa ra ","u "],
				["i ", "e ", "na ", "i ", "ko ", "to ", "wa "],
				["i ", "e ", "na ", "i ", "de ", "yo ", "i "],
				["tte ", "", "o mo ", "e ", "ta ", "ra "],
				["ka ru ","ku ","na ","re ","ru ","no ","ka ","na "],
				["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "],
				["yo ru ","ni ","sa ","ku ","o n ","do ","to ","hi ","ru ","ma ","de "],
				["ko kyu ","u ","hi ","to ","tsu ","i ","ki ","ru ","i ","ki ","ru "],
				["ya sa ","shi ","i ","hi bi ","no ","yo ko ","de "],
				["na ", "ka ", "nu ", "yo ", "u ", "ni "],
				["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "],
				["a ", "a "],
				["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "],
				["ya sa ","shi ","i ","hi bi ","no ","yo ko ","de "],
				["wa ra ", "u ", "yo ", "u ", "ni "],
				["a ", "a "],
				["ha ","ki ","da ","su ","ki ","mo ","chi ","wa ","ka n ","ta n ","de "],
				["de ","mo ","i ","ki ","ru ","no ","na n ","i ","do ","ta ka ","su ","gi ","te "],
				["do ","u ","ni ","mo ","to ","ke ","na ","i ","to ","i ","da ","ra ","ke "],
				["a ", "a "],
				["sa ","ppa ","ri ","","ki ","kka ","ri ","","ze n ","ko u ","i ","te "],
				["na ","n ","te ","shi ","na ","ku ","te ","yo ","i ","ka ","ra "],
				["da ", "ki ", "shi ", "me ", "te "],
				["a i ","wo ","hi ","to ","tsu ","ma ","ta ","ne ","ma ","ta ","ne "]
			],
			"type": 0
		},
		{
			"language": 0,
			"lyricContent": [
				[" "],
				[" "],
				[" "],
				["将延续的时光碎片"],
				["尽数收集起来 就这样"],
				["度过时日 在笔记的空白处写下"],
				["答案何时会出现"],
				["致 埋藏于心的渺小感情"],
				["让我们将这份爱重新来过"],
				["直至灯光随夜间绽放的温度亮起"],
				["呼吸 已合而为一 努力活下去"],
				["只愿与温柔的时光相伴"],
				["不会再落下泪水 啊啊"],
				["只愿我不再落泪"],
				["那些无心的话语"],
				["却令我倍感刺痛"],
				["永远都不会有尽头"],
				["假装忘却一切 令我筋疲力竭"],
				["夜晚啊 请拥抱我"],
				["今天也会在欢笑中度过"],
				["笑对一切是为了隐藏"],
				["那个泪流不止的自己"],
				["无法说出口的话"],
				["便无需将其说出"],
				["若可以这么想"],
				["是否就能轻松了呢"],
				["让我们将这份爱重新来过"],
				["直至灯光随夜间绽放的温度亮起"],
				["呼吸已合而为一 努力活下去"],
				["只愿与温柔的时光相伴"],
				["不会再落下泪水"],
				["让我们将这份爱重新来过"],
				["啊啊"],
				["让我们将这份爱重新来过"],
				["只愿与温柔的时光相伴"],
				["可以尽情欢笑"],
				["啊啊"],
				["倾吐心意这件事非常简单"],
				["但是活在人世 难度系数却太高"],
				["不论如何 都会充斥着解不开的疑问"],
				["啊啊"],
				["无需顾忌 坚定地勇往直前吧"],
				["并不需要刻意去做些什么"],
				["请将我拥紧"],
				["让我们将这份爱重新来过"]
			],
			"type": 1
		}
		],
 	"version": 1
 }
```
可以看出前面一部分是它的音译（即罗马音），后面一部分是翻译
罗马音的type值为0，翻译的type值为1，可以用这个区分
