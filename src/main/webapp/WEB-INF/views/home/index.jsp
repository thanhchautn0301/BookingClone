<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <title>Booking Index</title>
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/splide.min.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/flatpickr.min.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
   integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==
    " crossorigin="anonymous" referrerpolicy="no-referrer" />

  <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/style.css" />


</head>

<body>
  <header class="bg-primary" id="header">
    <div class="container-fluid fixed-top" id="nav-header">
      <div class="row bg-primary">
        <div class="col-sm-12">
          <div class="container px-sm-3 px-md-4">
            <nav class="navbar navbar-expand-md bg-primary">
              <div class="container-fluid px-0">
                <div class="navbar-brand">
                  <svg xmlns="http://www.w3.org/2000/svg" class="" xmlns:xlink="http://www.w3.org/1999/xlink" width="97" height="18" viewBox="0 0 523 99">
                            <image width="523" height="99" xlink:href="data:img/png;base64,iVBORw0KGgoAAAANSUhEUgAAAgsAAABjCAYAAAAVZ0PQAAAXAklEQVR4nO2d7XEbx9KFd275P+kICEdAKAJCEQgZEIxAVASiIxAcgcAIREYgIAIDEYiIQEAEe2vkM/YQXAD70Wc+dvupYtlvvb7AYHa250x3T7cpy7Is0mBbFMULRrIrimKNf1/a/9sYs05knIqiKIoyKFISC3VYQVBYAbE0xrx0/0hFURRFUU6Rm1g4ZAvh8GSMeUpraIqiKIrSD3IXCz77oigWRVHM1eOgKIqiKHL0SSz4PEM0LNMZkqIoiqLkSV/FguOxKIoH9TQoiqIoSnv+1/O5u7W3KsqyvE9gLIqiKIqSJX33LPjY0MTMGLNLZ0iKoiiKkj5DEguWTVEUExUMiqIoilKfvochDrlGWGKU1rAURVEUJV2GJhYsV7YuQ1mWlwmMRVEURVGSZ4hioYCHQYs4KYqiKEoNhioWLDdlWT4kMA5FURRFSZqhJThW8YfWYVAURVGU4wzZs+CYpzEMRVEURUkT9Sz8w3stDa0oiqIo1ahn4R9mKQxCURRFUVKE5Vl4X+O/sVcXx/j3Ef5uIs7R71qsSVEURVHeQhELxhjT9n9bluUYImJaFMUH2ZGd5M4Yswj4fYqiKIqSBcmJBR8UTrrH34XYAKt5NsZMyd+hKIqiKNmRtFhwQDTM0UWShvS4FUVRFKUPZCEWHGVZ2kTEr4zPBlnfikAI52wZa735UX+uwHrI+SxlWU5q/GcvWq9EDvSvOdXDZtBrsq8cPPeza6AoCrcG6Ovht5zm3OYUYDI/k77CbiDJb6SYAzvWCf45bhKm8fThyhp5LLp130QEPFL+HF22TaLFnG0xX+5v2SejDQHl5qtxwjHmaO/WE/6WKiLOg7mfYv5rzTvme2OMGZ//r5WUgAB371ljG35iPfg23b57a7GfXRIQG9zxMb8wxl2WZbIFmqwxseMry3JN+u2WXVmWtsnWLNdGW4Hm6RD7XVbITnOaNztWPOsFnj2LFzyT5Da1jr+3s7jG/HdZqzvvs6ak53ffeaKFgH2Shi728WxC26XSt+kSP0Ickdk9PeYZaWKTOlnDmN8TxdEpdthEkj+1YJ4eIs1TFWs8tyRbodtxBRAIx3jB3CQhqrr+mA7fOxNar8uDz2U8U7nTaQfwnjMQvwXnCXGGuGmLs+nt7BJjRNITf2TcjJciCbHgbX4xjHkVy5px66B4m17KLFPx1NhniPGkwA5rPOq8CMxDo/cCni/J0+WhWJgLfrZPdOFLPCSK2bYEBcIxmosGxiikJv7MuLN0R9X4XfcJiYRDFgmdCFMSU3Xopuq7zVXKomon4iJtPzddqd25Fu+2NE8H3zEmPafooQiSC79zPg3er3lm9shRe/3mXO6Z4Rpj13I4ChacPSV8iTmOM9irq9Z1Gq0ehTuZIck11Xmq4gLz9wOn+yCiC0Z+zb523AE7L19DzokwZ0+l8BQu8G5L88oOIqFtQ/ieqCXxIbKvCR/dOk/NiXD7ThdF8TEze+T4DBF2NtysYiEBcLJaRy53XRf7QnyLkQwKkbIkGY2QjNg3KLBBPSUuPn1uIESTC3ed4eQ7CwG0DCzWGO/mdeRQBOuA8lTjv3kDbNGPhEV4E6w9PRtqzlks9OW62hy1I3JTpR8Dn5CtoPqWqXo/hCq0vA0qZLl0Ceyz/R4zLNGGY6cy7zmEFretNsAaxKxwy1gTzx2u9S5xTbgvnH33tOtkRODC+pjxT7iBIqUKBiheZjGukFgDQ+tBgo3rJXPvy9fMBMOxE1kIofAmKRteq0fCd0V5JsQQRGtRhTlO9qp9B45ecc5ZLGRZB8ABodAnFxbleeBzWSelGDyxQhB4yZc98b7kJBjeiAW83zEFG+OdiRWKYHg09gKNA+c98y4UsB2V9jxnscC4/78lfOYbEHrog1BwXBNV9qInm5+DMk94ufs2V18zyWF4NUYklUZ9v40xTyR7FiMUwRCNnb17PfYuXFSJzZzFAkPh0svS4rSUc+jhGLfS16uwUeQWdz/FSrT86mv6kPhZxVOqxa08LpzrFv9k3Hqo5EyJdka4K6i3hxiCkJqbPnoXLDeHnr2cxQLjxEEVCzAkfVSiji/CFR+TKTMrBCVXAZ6qPgqFAqccWo6HIM4epTRWxlhChyIYnoyNlGjvsXfB8qoGQ5ZiASfOK8JHs69j9s1NXIWIgYJB6pNXYSsQI30D3oU+eqp8blLqT3CECQrcJCPakOm/Inx0yFBEkiGIA/rqXbjyvQtZtah2oHgRoybBO5abGIaE1S3Tx3X9O3RPXiLPI0Qth0/GmE5qG5tDMHduAP40xtSullYH5CmsScL5kI3Xzc7Hdc5jb5J7Rn0Khv0LyNmOk6S2/kE6XeLA8IPw0b8T1lEo+x6af591dmIBxTC+ET7aZseyMvpHMLJMr4K9KjWvI3Ywh1NiElZnw46CQizPwhYJPGtsgDt/3rykukuvfey446b8h3Sr5gAGaotT09O5sUO4TOG6ZIkXhuDKWSzYHJiT4Vg8lxeC7aEdrBykA8OjMUbcWyEwz1sc8Fzr+6P5KAj1unbyIRJp/3nWjGLTrBGj1C+r/jbz7juzLn/rBDBCUxufTkad1EGyUx8ClHdt0yiGEX4YEd+FXRe3P7m/iaigJ40xFLUa35HsDz1OT7JNtBAK+tXUxfWKmXXJAfGaDjJ5cF8mjuQD8CaFKRRK1hUtGHUWInFckjHp5OYjzZeY67RhC1rxtUUUoLXqxNcY35gk+MQ9CxlTa8MmNZdiJ4Mz7CZ7zJdn9ignEMQFC3l/XLsvEYcwEexOjLRFRDTqoq400jhbjZFk3JieoxHWaNXmKL62iH3915In9xrGsw3iOQsZ06TjJUO40fIWSB06Q3hDqlqEB2lTzxQM7gs4Hyzz42eB+u9T7g4TjTolM5ww122btEyEx1GGqgaIsS+Y30tyO+4YV+JIwk/sZEYYW1vWWDcPWENVVSHH+P9N8d/VXlu5bb6kEAT9yqfnEdlBOAStEUJ6zuWv9cj41A4/1MWEFwF7g9OSdEgPrlacsuV4GXHwxmqaJBaCXr2DULxnnCZIp8RUYrl1EPMSEeaxCeuuMesGvzMbtz5prDS7WTH+acx26yT7MPuNNNi67rFLr2xzrPbMzE2E8dm08dqMd5wWJDPsp4kUqqFf9fJhFWsh1RhZoTwwBXuDAadgqXHH7H4oga198HCm+qIoeLefhW8Y2Xv4Y8KtCMbzDWaDmO9STeaEWySj3GN2XWG60RjuV7pxIYROGr+kJM9CyYyxhoKUW0LffAleNpFnKTymc7zE7HWBE680DEEsHYLYxTzph4ZkPxdDblG9OSxnKQzDKNATdAjtbdvMA6UrI7qp5S4YpNfVNtBJSPpkl0ODKR97qh+H9CYcgucsXWlQVGiSekHQOr2mCGmNjYYqFuwLMyMvIPHTWkD3luT3XDVV9cRiL679apY9JyB0pEMQQdYU3jXJ0sM5iQVbCGiayIYlLdquMugHk0NvEWnEy08PVSxM2NXHCDkYjBrvx5BWpm2MCavW+gUaXi0zaX/swxhvyJOu5Hel3onS8cyoGNiB1DtRSh+ytjG9ORER39+GJhbsBnQXoExp1kYdJyDJXvhtxEIIMfc9M9GgYuE/cuiyuQ3d0vkcsH0b4Y8V2eBJnrM+d/kNypDEwh4ehRAuKUZcnL15HiJ5LapNclGoTcwXDUkZ9gqk19U+sGtcujdG6vkn7FBnW6Q3UKlQBOP9i30zoTcMRSxsAoUeHAwjRi1VSv6+Nifi0C+5FQ1fkbFOqY8ggPSpK6gAlW6k1VKEhmKVsPub8W5JbPTSIYhnwpobLJQ6C4lhM/vvAyt88XhqQKHjiPqS2d9bluU2UPtlnyvcUX5ABcqHFAwOKVQymAzxCDBvWnXC2sKyLB+FOxbOuiQn5py8ywI3Q47tJZdnDqXie1CfxYK78RBjwYgXmCrzbqXblkXEHvEXMKa3ZVna5NJFoBDWMRin6A+Zr6tJ4JyLumwySKp7EhYLF7aOQwd7Kx2C2Ed+X08CcTTChp9CccKz9FUsxPAmKMdpG5aZ47Qi3Yu/KfYFvkFlUmuA5hHWVvYFpQZE8idau6kTPHfTDr9dOgSRjFBASHOCv3HKguAUfctZsCfA9/aqUiyhkOF1vBC02uzxDFNy517B0/ETlRRzub6nhCWXq3rSG2qrDZ8UgogqFrxOtDZ8/LMoim9FUXzMVSgUPRMLViRMBnqntrcYY+aofpca1oX7I6BoUBGaCRnZIOkN9aJl6XDpEMQmQo7XL1ynZGsbkPuUwxXfWvRJLKgx7S8zwt1wKZxomA+p/rxyFMn6JFSQuCtd7K2NWMg+BAGRYOfza87eg1P0SSx8TuTetcaWhUE4Ykqs6iiBdTG+5FpKWhEjt6t6UUMRuYcg0LTJiYTQN7eC0rechRSSWvR0SQCnoFHCHobCKyW97kOHS2UQSDeXahqKkA5BPIbKV0PHze99FwmOvomFa2SsKz0ERmCSaA6Dj41T/i3sZdBkSkUcvFPStzeaiAXpEAT9Jgra+K/hTRwMrKuTTeJg0vEdG454ipXgonBxIQlsxA8JXKs8hfUyjIUaCQ3i9KJEYS5cc6GWACCEIOjt1pGXtOxT4mJdKGLB3kqo+9+iSt4H4SHYDPWJ1lnoL/aWBNbOnLB+JLFFnYrEOg8qyr8QqqXWLdAk/U6oUCCSQhjinpC4dp1yuVVFBpvHYIyxp5j3iecyWMHQNZ8m5eROJX+km0vV8S5IhyDYHSbnQxUKRQpiAYlrjI39oxZIGgb2Xrsxxro07xK+unbbsaulhtUUJkHzFgghiBWzhwuSNiVDNV3ZINxf9ffIsINJlHuGS3lGUG0LxIw1HDEAUAt+gbX0kGCc367zpXbCU1LDrsmyLJ8FQ3rnQhHSIQj2TTi21+KQDUIea1zHfWliN1AYStT+pXQbghHTvYoQjtAKkpGxosEYM0J4QrroTBcuIhgdRalLyJoLkiGIPTNfAYePEAePFbyjv1tPqTHmHrYsjQNGSaDDWOaM8YQMR6BIhzSaf9EB1Gm3HocdaX01pXENBntSSGEcfYMwp1kfFoTfkUqPLsFGUr0KqJvCZC29RxHsxTK1OgsPpESuRealeAdv1LuARMgZahV8SiCvoU39BUbOghYQUw6R3HiPFWjKprwzBDUzqfERXoTkRWZSYgG5BVmHI0gPXY26AHZ92fwYhCjuIoYo2hhLRt6NrivlEOmNt+rELCkWtuSNVlrY+DzmdKU6uQqOSIhhGPGcb0eoZ0EYxAInkfIaLlqsRYZnQdeV8goUs5O8hvxqnaNDq2T8n50DxNozNrnVXkm13PMs83CE9OZzEagN8uBA8lAM0dDUCDE8CyoWlCokN+DrA5srvfmyyzuzOkhmV6QtSbGAzE+GYrwKlI3OyFzVmhFEIoiGRuKP5GrVNaVUIb0B+6JUcs09k2srsA5oqwDtCMQPAsk2kjLGPJCq8t027IrWBsZCUMMeAE80fCJXTWxjiKTfhzbhEKXnIHfsUfBXTo78e1fYXgWWWAjRHVm8Z07qXSclu/b5sMMRjFPgbeY3OrLCJkJCnbPKSLd5lgwRqj0rlCokN2L/lCuVr7BHEbYcod58YB0AkhYLcL3+RfjoC6a6g4uJcSpVwx4QuDgnJMHQ5joWw8hMVYQqhyDRXOqK8a/1JbyJhRAKlJyeAAWWKONO3bNQEGsvfCCHIxgusns17GGBS5bl4WoKY01dJPT7lLSQ2pBdkqDkJhZCLDBsbYgaL5RDZfJigVh7oSCHIxinwCs17OGBhyt6V0u8C4xx3OttG6UCsQ0Z60vK1m4CJAhmCbw3lCJSOXgWmLUXmOGIJ5JH5LOW6Y0CO5mqLoz1Sg3LKXkCd7mU3R0JJmmHWquMcAG7xwSt+GAWYgGwvAuUcAROgawNZplqOAJ13zsvWPRy6HOmflsPActQ3rBr7LfFrvWyLO9VJEdBak1Ieq5yFgu0K5n2HSHWhchHLEDl/kn6eFY4grWoL1ITDLYzm22IUhTFd6EThO0d/x1NVmYJ/FbpjapVkSXCtTaf25QEAxqAzWG0v2h56ihIeUhHQhvZI96BnBE/BEFIf2HOSU6eBVd7gZEgQnHDItbNKvBj41LrmKct+93oFGpf3q+kWNk1PvsnvA3sGhlvwElAqs+/o8uphVlY7BbzHG1jhji0784PW6adcWdcqYegh1RqPYUMB7JuLYiGCuCB5TeiYrTdJI+X0QLaIR7qII/XEayFtScQXk6Mp/PCPfN7d044hNjUSO2hOyWqksbkI94298zvmdZoI844kUmTdYvqKvDOd0Wi9TX7yuEbCOvDISL4re0njtFnmZ1YKP6LZzPYMeJJAQx7ic1b3F2PeLEz5KcEgg9bLLz5Prw00j3hL4nPrpNHCC76ECxJm/QYeQhPDX6DioVINHj3mYQo1f8KiGYWrT14OIQyx3bI0pSEzd0YY6Q/0wcT/EJyT65Q7lcMbAx/E8Z6jGe4pdZ1ewpgTsdwF469vzbZu53nsOO6XLnfb9dJ02tWeF4z/DHWmK0+11nUwXh+lBnSWbZwAbt1VeuUh7l0a2qEf7aNXb+X7pFBsH/i9iMF4AmjxsRr8EeAgkavQA6PzZ9isUVYcXEuFwMH2SnsEuV65AlWWYqFAnFNxLIZfEK5X8nx2lDBZ9J4z7E/Uir4krToYouFKrYQmLsjc+E2NVo2sYdIH3sIvHWA61jH2B6J645JIkvFQiSwUf2IOIQo80reZw7Z4H3y7ZMvtGO950XWYqGAe59k3O3mOpZWsbgtEFoRxiBFsZASYpseXPPfezMzp1GxEBEbMiIk+tblLkYvCAjyn6G/N0FWWd2GqIBVe4FVpGZG7mSopM9KcsMj9k9RlENiXavdxyqKhtCADesOnqzFArn2wk3XjPVDEDvXcs3DRvzmijHmnnhFV1HcOmNVpT3HU+TaCoOvblrkLhbAnNic40H6dgRcaXeSn6lkw7O0G91jmkL/CqX3xNg4o27Wwh04Q/Is6RXJXiyQG02xijWpYBgee2aLcbwHrHbaiuIIvXFviQK7CbR3l8QGYxbzZPbBs+Ditqy4kng4olDBMEQmbFeqCgaFDUKpIddX8NoKVZD3GGn2zt5IPq9eiAXATB58YJRV9gSDJj32m7tQLXU9wcDqH6EoITfwVLq9FthjUg9H7CsOJiLeoN6IBUwOq+wxrYUvBIOeBvvJPsaVL5worGH7NKC5VsIRagN/Dl2E6RTYY6YJH+6cUDg8mKhYOASFlGiNm1g9GPBwJ3oFrlds8eJGS87C+/BOhagiCbnzqU9KXoVfeLY6NcFg3/FRlQdT6nn1SiwA5tXEz6wujzgN3sO453wNLtqd6IT4C0W9goQeTmHHYIwZw8uQc7hrRewCqDSH/Y7vYwrtUyQoGJ5r5ER1nsveiQU8SFbthYKdDQzjbhfi+8xEwxYb0kioVPZjhpubfV7vrOhLrec+nskI70ZO8/qMyo2TlFzSQyfAdcKkaxtgnxlHttF7tCaYnrM3SNDs9rwY7ak6DUgAdAtkdkkL3RL6XOveWLhW0ZTytniOs4adCWNAmwMWmNeQXeuasEZHSvEOsIcQxt7LrpNVkNsjUzy4DLBWQ9vnxh0rOz6vPLtO1iFAzfx3Id3MWBhT/E1IjXrq8G/3QZwuguD9/gn+YjZVKXDifUqgulwnIney81l58xnMg0Cwf73tDXEIsbnUBqGzbIB9miEMzrJNe3hc5m3ekY7P61cjKfGFnUgRjYJ82nuJ6RbFb5t0bCV9Dtetct20NTEbLPzJQTttloDae3OwTGV9SwOD568rVgdOv7te1Pkk2IhdCrkqoSDZ2Ki2tStei3s7N10FuH1XnN3pfDjzWsY3oyh2/wcnfBT+N4rjeAAAAABJRU5ErkJggg=="/>
                  </svg>
                </div>
                <div class="d-sm-block d-md-none flex-fill text-end me-2">
                  <a href="" class="p-2 btn-primary bd-r-2">
                    <i class="fa-regular fa-circle-user text-white fs-20"></i>
                  </a>
                </div>
                <button class="navbar-toggler btn-primary shadow-none" type="button" data-bs-toggle="collapse"
                  data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false"
                  aria-label="Toggle navigation">
                  <svg xmlns="http://www.w3.org/2000/svg" class="icon-size toggle-icon-mb" fill="none"
                    viewBox="0 0 24 24" stroke="currentColor" stroke-width="2">
                    <path stroke-linecap="round" stroke-linejoin="round" d="M4 6h16M4 12h16M4 18h16" />
                  </svg>
                </button>
                <div class="collapse navbar-collapse" id="navbarContent">
                  <ul class="navbar-nav ms-auto mb-2 mb-md-0 align-items-md-center d-md-flex d-sm-none">
                    <li class="nav-item me-2" data-bs-toggle="tooltip" data-bs-placement="bottom"
                      title="Chọn loại tiền tệ của bạn">
                      <button class="btn btn-primary fw-500 btn-icon-nav">
                        VND
                      </button>
                    </li>
                    <li class="nav-item me-2">
                      <button class="btn btn-primary btn-icon-nav" data-bs-toggle="tooltip" data-bs-placement="bottom"
                        title="Chọn ngôn ngữ của bạn">
                        <img src="${pageContext.request.contextPath}/resources/assets/img/iconVn.png" class="img-circle icon-size" alt="" />
                      </button>
                    </li>

                    <li class="nav-item me-2">
                      <button class="btn btn-primary btn-icon-nav" data-bs-toggle="tooltip" data-bs-placement="bottom"
                        title="Liên hệ dịch vụ khách hàng">
                        <svg class="icon-size" xmlns="http://www.w3.org/2000/svg" class="h-6 w-6" fill="none"
                          viewBox="0 0 24 24" stroke="currentColor" stroke-width="2">
                          <path stroke-linecap="round" stroke-linejoin="round"
                            d="M8.228 9c.549-1.165 2.03-2 3.772-2 2.21 0 4 1.343 4 3 0 1.4-1.278 2.575-3.006 2.907-.542.104-.994.54-.994 1.093m0 3h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z" />
                        </svg>
                      </button>
                    </li>
                    <li class="nav-item position-relative customer-check ${msg}">
                      <button class="btn btn-primary btn-icon-nav shadow-none" data-bs-toggle="collapse" href="#user-features" role="button" aria-expanded="false">
                        <div class="d-flex align-items-center">
                          <img src="https://hope.be/wp-content/uploads/2015/05/no-user-image.gif" alt="" class="rounded-circle me-2 border-user-filter user-icon-size-l">
                          <span class="fw-bold fs-14">Your account</span>
                        </div>
                      </button>
                      <ul class="bg-white user-features list-style-none dropdown-menu-cs bd-r-2 ps-0 collapse" id="user-features">
                        <li class="p-3"><a href="" class="text-decoration-none d-block text-dark"><i class="fa-regular fa-user p-2 me-2"></i>Account management</a></li>
                        <li class="p-3"><a href="index.html" class="text-decoration-none d-block text-dark"><i class="fa-solid fa-briefcase p-2 me-2"></i>Trip</a></li>
                        <li class="p-3"><a href="${pageContext.request.contextPath}/account/customer/logout" class="text-decoration-none d-block text-dark"><i class="fa-solid fa-arrow-right-from-bracket p-2 me-2"></i>Log out</a></li>
                      </ul>
                    </li>
                    <li class="nav-item me-2 customer-sign-in ${msg}">
                      <a href="login.html" class="btn btn-sm btn-primary fw-500 btn-sm text-white border">
                        Đăng chỗ nghỉ của quí vị
                      </a>
                    </li>
                    <li class="nav-item me-2 customer-sign-in ${msg}">
                      <a href="${pageContext.request.contextPath}/account/customer/login" class="btn btn-sm bg-white text-blue fw-500">Sign up</a>
                    </li>
                    <li class="nav-item customer-sign-in ${msg}">
                      <a href="${pageContext.request.contextPath}/account/customer/login" class="btn btn-sm bg-white text-blue fw-500">Sign in</a>
                    </li>
                  </ul>
                  <!-- Mobile navbar -->
                  <ul class="navbar-nav 
                  position-fixed top-0 bg-primary end-0 start-0 bottom-0 d-md-none d-sm-block">
                    <li class="position-fixed top-0 end-0">
                      <button class="navbar-toggler shadow-none btn-primary p-3" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false"
                        aria-label="Toggle navigation">
                        <i class="fa-solid fa-x"></i>
                      </button>
                    </li>
                    <li>
                      <h4 class="text-white fw-bolder p-3">Khác</h4>
                    </li>
                    <li class="nav-item nav-item-hv p-3">
                      <a href="" class="text-decoration-none text-white fw-500">
                        <i class="fa-solid fa-circle-info me-2"></i>
                        Về TLTC.com
                      </a>
                    </li>
                    <li class="nav-item nav-item-hv p-3">
                      <a href="" class="text-decoration-none text-white fw-500">
                        <i class="fa-solid fa-scale-balanced me-2"></i>
                        Pháp lý
                      </a>
                    </li>
                  </ul>
                </div>
              </div>
            </nav>
          </div>
        </div>
      </div>
    </div>
    <div class="container mt-5 py-4">
      <div class="row">
        <div class="col-sm-12">
          <ul class="nav mt-md-3 mt-lg-0">
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999 active">
                <i class="fa-solid fa-bed"></i>
                Lưu trú
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-plane"></i>
                Chuyến bay
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-earth-oceania"></i>
                Chuyến bay + Khách sạn
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-car"></i>
                Thuê xe
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-map-location"></i>
                Địa điểm tham quan
              </a>
            </li>
            <li class="nav-item me-2 my-sm-1 my-xl-0">
              <a href="" class="nav-link h-ft-btn text-white btn btn-primary fw-400 bd-rd-999">
                <i class="fa-solid fa-taxi"></i>
                Taxi sân bay
              </a>
            </li>
          </ul>
        </div>
        <div class="col-sm-12 mt-sm-1 mt-xl-5">
          <h1 class="text-white fw-700">Tìm chỗ nghỉ tiếp theo</h1>
          <h3 class="text-white fw-400">Tìm ưu đãi khách sạn, chỗ nghỉ dạng nhà và nhiều hơn nữa...</h3>
        </div>
      </div>

    </div>
    <div class="container-fluid pt-sm-0 pt-lg-3" id="accommodation-fieldset">
      <div class="row bg-primary">
        <div class="col-sm-12">
          <form action="${pageContext.request.contextPath}/home/search" method="get" class="container px-12 d-flex flex-sm-column flex-lg-row" id="accommodation-filter">
            <div class="input-group mb-3 border-filter rounded-start">
              <span class="input-group-text rounded-0 border-0 bg-white p-3">
                <i class="fa-solid fa-bed"></i>
              </span>

              <input type="text" class="form-control rounded-0 fw-500 border-0 shadow-none ps-0 p-3 input-drop-select"
                id="input-province" name="cityName" placeholder="Bạn muốn đi đâu?" aria-label="filterProvince"
                aria-describedby="filter-hotel" autocomplete="off" required>
              <span class="input-group-text rounded-0 border-0 bg-white p-3 d-none" id="filter-hotel">
                <i class="fa-solid fa-xmark"></i>
              </span>
              <ul class="list-group list-group-flush input-list-dropdown" id="list-province">
                <li class="list-group-item d-flex align-items-center" data-province="Vũng Tàu">
                  <svg xmlns="http://www.w3.org/2000/svg" class="icon-size me-2" fill="none" viewBox="0 0 24 24"
                    stroke="currentColor" stroke-width="2" data-province="Vũng Tàu">
                    <path stroke-linecap="round" stroke-linejoin="round"
                      d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z" />
                    <path stroke-linecap="round" stroke-linejoin="round" d="M15 11a3 3 0 11-6 0 3 3 0 016 0z" />
                  </svg>
                  <div class="d-flex flex-column w-100" data-province="Vũng Tàu">
                    <span class="fw-bold" data-province="Vũng Tàu">Vũng Tàu</span>
                    Việt Nam
                  </div>
                </li>
                <li class="list-group-item d-flex align-items-center" data-province="Đà Lạt">
                  <svg xmlns="http://www.w3.org/2000/svg" class="icon-size me-2" fill="none" viewBox="0 0 24 24"
                    stroke="currentColor" stroke-width="2" data-province="Đà Lạt">
                    <path stroke-linecap="round" stroke-linejoin="round"
                      d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z" />
                    <path stroke-linecap="round" stroke-linejoin="round" d="M15 11a3 3 0 11-6 0 3 3 0 016 0z" />
                  </svg>
                  <div class="d-flex flex-column w-100" data-province="Đà Lạt">
                    <span class="fw-bold" data-province="Đà Lạt">Đà lạt</span>
                    Việt Nam
                  </div>
                </li>
                <li class="list-group-item d-flex align-items-center" data-province="Đà Nẵng">
                  <svg xmlns="http://www.w3.org/2000/svg" class="icon-size me-2" fill="none" viewBox="0 0 24 24"
                    stroke="currentColor" stroke-width="2" data-province="Đà Nẵng">
                    <path stroke-linecap="round" stroke-linejoin="round"
                      d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z" />
                    <path stroke-linecap="round" stroke-linejoin="round" d="M15 11a3 3 0 11-6 0 3 3 0 016 0z" />
                  </svg>
                  <div class="d-flex flex-column w-100"data-province="Đà Nẵng">
                    <span class="fw-bold" data-province="Đà Nẵng">Đà Nẵng</span>
                    Việt Nam
                  </div>
                </li>
                <li class="list-group-item d-flex align-items-center" data-province="TP Hồ Chí Minh">
                  <svg xmlns="http://www.w3.org/2000/svg" class="icon-size me-2" fill="none" viewBox="0 0 24 24"
                    stroke="currentColor" stroke-width="2" data-province="TP Hồ Chí Minh">
                    <path stroke-linecap="round" stroke-linejoin="round"
                      d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z" />
                    <path stroke-linecap="round" stroke-linejoin="round" d="M15 11a3 3 0 11-6 0 3 3 0 016 0z" />
                  </svg>
                  <div class="d-flex flex-column w-100" data-province="TP Hồ Chí Minh">
                    <span class="fw-bold" data-province="TP Hồ Chí Minh">TP Hồ Chí Minh</span>
                    Việt Nam
                  </div>
                </li>
                <li class="list-group-item d-flex align-items-center" data-province="Nha Trang">
                  <svg xmlns="http://www.w3.org/2000/svg" class="icon-size me-2" fill="none" viewBox="0 0 24 24"
                    stroke="currentColor" stroke-width="2" data-province="Nha Trang">
                    <path stroke-linecap="round" stroke-linejoin="round"
                      d="M17.657 16.657L13.414 20.9a1.998 1.998 0 01-2.827 0l-4.244-4.243a8 8 0 1111.314 0z" />
                    <path stroke-linecap="round" stroke-linejoin="round" d="M15 11a3 3 0 11-6 0 3 3 0 016 0z" />
                  </svg>
                  <div class="d-flex flex-column w-100" data-province="Nha Trang">
                    <span class="fw-bold" data-province="Nha Trang">Nha Trang</span>
                    Việt Nam
                  </div>
                </li>
              </ul>
            </div>
            <div class="input-group mb-3 border-filter-y ">
              <span class="input-group-text rounded-0 border-0 bg-white p-3">
                <i class="fa-solid fa-calendar"></i>
              </span>

              <input type="text" class="form-control shadow-none fw-500 rounded-0 ps-0 p-c
               border-0 p-3 input-drop-select position-relative" id="input-filter-date" aria-label="filterDate"
                 placeholder="Nhận phòng - Trả phòng" aria-describedby="filter-date" autocomplete="off" name="daterange" >
            </div>
            <div class="input-group mb-3 border-filter rounded-end br-r-0">
              <span class="input-group-text rounded-0 border-0 bg-white p-3" id="filter-room">
                <i class="fa-solid fa-user"></i>
              </span>

              <input type="text" class="form-control shadow-none ps-0 fw-500 rounded-0 p-c border-0 p-3 input-drop-select"
                id="input-filter-room" value="2 người lớn - 0 trẻ em" aria-label="filterRoom" name="category"
                aria-describedby="filter-date" autocomplete="off" readonly>

              <div class="filter-room-form bg-white input-list-dropdown" id="filter-room-form">
                <div class="filter-room-info d-flex align-items-center justify-content-between p-2">
                  <span class="text-dark fw-500 ms-2">Người lớn</span>
                  <div class="filter-room__action d-flex align-items-center me-2">
                    <button type="button" class="btn btn-action" data-type="minus" data-field="adults">
                      <i class="fa-solid fa-minus"></i>
                    </button>
                    <span class="text-dark fw-500 w-40 h-40 d-flex
                       align-items-center justify-content-center amount-result" data-field="adults">2</span>
                    <button type="button" class="btn btn-action" data-type="plus" data-field="adults">
                      <i class="fa-solid fa-plus"></i>
                    </button>
                  </div>
                </div>
                <div class="filter-room-info d-flex align-items-center justify-content-between p-2">
                  <div class="d-flex aligns-item-center flex-column">
                    <span class="text-dark fw-500 ms-2">Trẻ em</span>
                    <span class="text-secondary fw-500 ms-2">0 - 17 tuổi</span>
                  </div>

                  <div class="filter-room__action d-flex align-items-center me-2">
                    <button type="button" class="btn btn-action disable" data-type="minus" data-field="childs">
                      <i class="fa-solid fa-minus"></i>
                    </button>
                    <span class="text-dark fw-500 w-40 h-40
                     d-flex align-items-center justify-content-center" data-field="childs">0</span>
                    <button type="button" class="btn btn-action" data-type="plus" data-field="childs">
                      <i class="fa-solid fa-plus"></i>
                    </button>
                  </div>
                </div>
                <div class="filter-room-info d-flex align-items-center justify-content-between p-2 d-none">
                  <span class="text-dark fw-500 ms-2">Phòng</span>
                  <div class="filter-room__action d-flex align-items-center me-2">
                    <button type="button" class="btn btn-action disable" data-type="minus" data-field="rooms">
                      <i class="fa-solid fa-minus"></i>
                    </button>
                    <span class="text-dark fw-500 w-40
                     h-40 d-flex align-items-center justify-content-center" data-field="rooms">1</span>
                    <button type="button" class="btn btn-action" data-type="plus" data-field="rooms">
                      <i class="fa-solid fa-plus"></i>
                    </button>
                  </div>
                </div>
              </div>

              <span
                class="input-group-text rounded-0 border-0 bg-white p-3 d-flex flex-column justify-content-center angle-icon-ud"
                id="filter-room">
                <i class="fa-solid fa-angle-up"></i>
                <i class="fa-solid fa-angle-down"></i>
              </span>
            </div>
            <div class="input-group mb-3 border-filter rounded-end w-sm-100 w-25 bl-f-0">
              <button type="submit"
                class="input-group-text w-100 h-100 btn btn-primary2 fs-1-2
                 rounded-0 border-0 text-white text-lg-center fw-bold py-sm-3">
                Tìm
              </button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </header>

  <div class="mt-4">
    <div class="container">
      <div class="row">
        <div class="col-sm-12 ">
            <div class="d-flex align-items-center border px-2 py-3">
              <div class="quiz-icon me-3 ms-2">
                <svg xmlns="http://www.w3.org/2000/svg" class="icon-size" fill="none" viewBox="0 0 24 24" stroke="currentColor" stroke-width="2">
                  <path stroke-linecap="round" stroke-linejoin="round" d="M13 16h-1v-4h-1m1-4h.01M21 12a9 9 0 11-18 0 9 9 0 0118 0z" />
                </svg>
              </div>
              <p class="mb-0">
                Nhận lời khuyên mà bạn cần. Xem các hạn chế liên quan đến COVID-19 mới nhất trước khi du lịch.
              </p>
              <a href="" class="text-decoration-none">&nbsp; Tìm hiểu thêm</a>
            </div>
        </div>
      </div>  
      <div class="row">
        <div class="col-sm-12 gy-4">
            <div class="preferential d-flex align-items-center">
              <div>
                <img src="${pageContext.request.contextPath}/resources/assets/img/gateway_banner.efe9b1ad.jpg" class="p-3 img-banner" alt="bannerPreferential">
              </div>
              <div>
                <p class="fw-bold mb-0">Tiết kiệm 15% trở lên</p>
                <p class="mt-1">Lên kế hoạch cho chuyến đi mơ ước với Ưu Đãi Mùa Du Lịch</p>
                <a href="" class="btn btn-primary2 text-white fw-bold d-inline-flex">Khám phá ưu đãi</a>
              </div>
            </div>
        </div>
      </div>
      <div class="row"> 
        <div class="col-sm-12 gy-4">
          <div class="splide">
          <h4 class="fw-bold">Khám phá Việt Nam</h4>
          <p class="text-secondary">Các điểm đến phổ biến này có nhiều điều chờ đón bạn</p>
            <div class="splide__track">
              <ul class="splide__list">
                <c:forEach var="item" items="${accommodationOfCity}">
                  <li class="splide__slide">
                    <a href="" class="text-decoration-none">
                      <img src="http://localhost:9596/api/image/getimage/${item.image}" class="img-carousel" alt="">
                      <div>
                        <p class="fw-bold text-black mb-0 mt-1">${item.name}</p>
                        <p class="text-secondary fs-14">${item.numberOfAccommodation} chỗ nghỉ</p>
                      </div>
                    </a> 
                  </li>
                </c:forEach>                
              </ul>
            </div>
          </div>
        </div>
      </div> 
      <div class="row"> 
        <div class="col-sm-12 gy-4">
          <div class="splide splide2">
          <h4 class="h4 fw-bold mb-3">Tìm theo loại chỗ nghỉ</h4>
            <div class="splide__track">
              <ul class="splide__list">
                <c:forEach var="item" items="${accommodationOfCategory}">
                  <li class="splide__slide">
                    <a href="" class="text-decoration-none">
                      <img src="http://localhost:9596/api/image/getimage/${item.image}" class="img-carousel" alt="">
                      <div>
                        <p class="fw-bold text-black mb-0 mt-1">${item.name}</p>
                        <p class="text-secondary fs-14">${item.numberOfAccommodation} ${item.name}</p>
                      </div>
                    </a>
                  </li> 
                </c:forEach>                               
              </ul>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-12 gy-5">
          <div class="row gx-3">
            <div class="col-sm-6 gx-3">
              <a href="" class="card-content text-decoration-none d-block position-relative" style="background-image: url('${pageContext.request.contextPath}/resources/assets/img/travelList/du_lich_da_lat.jpg');">
                <div class="p-3 position-absolute top-0 start-0">
                  <h4 class="h4 text-white fw-bold text-shadow">Đà Lạt</h4>
                  <p class="text-white text-shadow">2.149 chỗ ở</p>
                </div>
                <div class="p-1 fs-12 m-3 position-absolute bottom-0 end-0
                 text-black bg-bonus-r">
                  <p class="mb-0">Ưu đãi bắt đầu từ</p>
                  <p class="mb-0 text-center fs-14">VND 364.000</p>
                </div>
              </a>
            </div>
            <div class="col-sm-6 gx-3">
              <a href="" class="card-content text-decoration-none d-block position-relative" style="background-image: url('${pageContext.request.contextPath}/resources/assets/img/travelList/sapabg.jpg')">
                <div class="p-3 position-absolute top-0 start-0">
                  <h4 class="h4 text-white fw-bold text-shadow">Sa Pa</h4>
                  <p class="text-white text-shadow">443 chỗ ở</p>
                </div>
                <div class="p-1 fs-12 m-3 position-absolute bottom-0 end-0
                 text-black bg-bonus-r">
                  <p class="mb-0">Ưu đãi bắt đầu từ</p>
                  <p class="mb-0 text-center fs-14">VND 364.000</p>
                </div>
              </a>
            </div>
          </div>
        </div>
        <div class="col-sm-12">
          <div class="row">
            <div class="col-sm-4 gx-4 gy-3">
              <a href="" class="card-content text-decoration-none d-block position-relative" style="background-image: url('${pageContext.request.contextPath}/resources/assets/img/travelList/qn_top.jpg')">
                <div class="p-3 position-absolute top-0 start-0">
                  <h4 class="h4 text-white fw-bold text-shadow">Quy Nhơn</h4>
                  <p class="text-white text-shadow">485 chỗ ở</p>
                </div>
                <div class="p-1 fs-12 m-3 position-absolute bottom-0 end-0
                 text-black bg-bonus-r">
                  <p class="mb-0">Ưu đãi bắt đầu từ</p>
                  <p class="mb-0 text-center fs-14">VND 486.000</p>
                </div>
              </a>
            </div>
            <div class="col-sm-4 gx-2 gy-3">
              <a href="" class="card-content text-decoration-none d-block position-relative" style="background-image: url('${pageContext.request.contextPath}/resources/assets/img/travelList/buonme.jpg')">
                <div class="p-3 position-absolute top-0 start-0">
                  <h4 class="h4 text-white fw-bold text-shadow">Buôn Mê Thuột</h4>
                  <p class="text-white text-shadow">93 chỗ ở</p>
                </div>
                <div class="p-1 fs-12 m-3 position-absolute bottom-0 end-0
                 text-black bg-bonus-r">
                  <p class="mb-0">Ưu đãi bắt đầu từ</p>
                  <p class="mb-0 text-center fs-14">VND 532.000</p>
                </div>
              </a>
            </div>
            <div class="col-sm-4 gx-4 gy-3">
              <a href="" class="card-content text-decoration-none d-block position-relative" style="background-image: url('${pageContext.request.contextPath}/resources/assets/img/travelList/danang.jpg')">
                <div class="p-3 position-absolute top-0 start-0">
                  <h4 class="h4 text-white fw-bold text-shadow">Đà Nẵng</h4>
                  <p class="text-white text-shadow">2.511 chỗ ở</p>
                </div>
                <div class="p-1 fs-12 m-3 position-absolute bottom-0 end-0
                 text-black bg-bonus-r">
                  <p class="mb-0">Ưu đãi bắt đầu từ</p>
                  <p class="mb-0 text-center fs-14">VND 244.800</p>
                </div>
              </a>
            </div>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-12 gy-4">
          <h4 class="h4 fw-bold">Các điểm đến được chúng tôi ưa thích</h4>
        </div>
        <div class="col-sm-12 gy-3">
          <div>
            <button class="btn bd-rd-999 text-dark fw-500 btn-fv active">Khu vực</button>
            <button class="btn bd-rd-999 text-dark fw-500 btn-fv">Thành phố</button>
            <button class="btn bd-rd-999 text-dark fw-500 btn-fv">Địa điểm được quan tâm</button>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col gy-3 mb-4">
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Thừa Thiên - Huế</a>
            <p class="text-secondary mb-0">520 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Phú Yên</a>
            <p class="text-secondary mb-0">215 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Quảng Bình</a>
            <p class="text-secondary mb-0">269 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Vịnh Hạ Long</a>
            <p class="text-secondary mb-0">1,376 chỗ nghỉ</p>
          </div>   
        </div>
        <div class="col gy-3">
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Thanh Hoá</a>
            <p class="text-secondary mb-0">254 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Đắc Lắc</a>
            <p class="text-secondary mb-0">125 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Thành Phố Hồ Chí Minh</a>
            <p class="text-secondary mb-0">254 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Hà Tĩnh</a>
            <p class="text-secondary mb-0">254 chỗ nghỉ</p>
          </div>   
        </div>
        <div class="col gy-3">
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Gia Lai</a>
            <p class="text-secondary mb-0">86 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Vĩnh Long</a>
            <p class="text-secondary mb-0">42 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Bình Thuận</a>
            <p class="text-secondary mb-0">603 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Bạc Liêu</a>
            <p class="text-secondary mb-0">23 chỗ nghỉ</p>
          </div>   
        </div>
        <div class="col gy-3">
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Cà Mau</a>
            <p class="text-secondary mb-0">48chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Cần Thơ</a>
            <p class="text-secondary mb-0">352</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Bình Dương</a>
            <p class="text-secondary mb-0">78 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Ninh Thuận</a>
            <p class="text-secondary mb-0">145 chỗ nghỉ</p>
          </div>   
        </div>
        <div class="col gy-3">
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Trà Vinh</a>
            <p class="text-secondary mb-0">17 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">TP Đà Nẵng</a>
            <p class="text-secondary mb-0">2,514 chỗ nghỉ</p>
          </div>
          <div class="my-3 fs-14">
            <a href="" class="fw-500 text-decoration-none text-dark">Hà Nội</a>
            <p class="text-secondary mb-0">3,890 chỗ nghỉ</p>
          </div>
        </div>
      </div>
    </div>
  </div> 

  <section>
    <div class="container-fluid">
      <div class="row bg-footer">
        <div class="col-sm-12">
          <div class="pt-5 pb-2">
            <h4 class="h4 text-white fw-light text-center mb-0">Tiết kiệm thời gian và tiền bạc!</h4>
            <p class="text-center" style="color: #bdbdbd;">Hãy đăng ký và chúng tôi sẽ gửi những ưu đãi tốt nhất cho bạn</p>
          </div>
          <div class="">
            <form action="" class="needs-validation d-flex justify-content-center px-4">
              <input type="email" class="p-2 me-1 text-black-50 fs-20 flex-sm-grow-1 flex-xl-grow-0 w-25" placeholder="Địa chỉ email của bạn" required>
              <button class="btn btn-primary2 fs-1-2 text-white px-5" type="submit">Đăng ký</button>
            </form>
          </div>
          <div class="text-center pt-2 pb-5">
              <input type="checkbox" name="" id="checkbox-sendlink-down">
              <label for="checkbox-sendlink-down" class="text-white fs-14"> Gửi cho tôi đường dẫn để tải ứng dụng Booking.com MIỄN PHÍ!</label>
          </div>
        </div>
      </div>
      <div class="row bg-primary">
        <div class="col-sm-12">
          <div class="py-3 text-center">
            <a href="" class="btn btn-sm btn-primary fw-400 btn-sm text-white border fs-14 px-3">Đăng chỗ nghỉ của quí vị</a>
          </div>
        </div>
      </div>
      <div class="row bg-primary border-top">
        <div class="col sm-12">
          <div class="text-center p-2">
            <a href="" class="fw-bold text-white m-2 fs-14">Phiên bản di động</a>
            <a href="" class="fw-bold text-white m-2 fs-14">Tài khoản của bạn</a>
            <a href="" class="fw-bold text-white m-2 fs-14">Thay đổi đặt phòng của bạn trực tuyến</a>
            <a href="" class="fw-bold text-white m-2 fs-14">Dịch vụ khách hàng</a>
            <a href="" class="fw-bold text-white m-2 fs-14">Trở thành đối tác phân khối</a>
            <a href="" class="fw-bold text-white m-2 fs-14">TLTC.com dành cho doanh nghiệp</a>
          </div>
        </div>
      </div>
    </div>
  </section>

  <footer class="footer">
    <div class="container">
      <div class="row py-2">
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các quốc gia</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Khu vực</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Thành phố</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Quận</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các quốc gia</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Sân bay</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Khách sạn</a>
        </div>
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Nhà</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Căn hộ</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Resort</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Biệt thự</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Nhà trọ</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Nhà nghỉ B&B</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Nhà khách</a>
        </div>
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">
            Những chỗ nghỉ độc đáo</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Tất cả các điểm đến</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Khám phá</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Đánh giá của khách</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các bài viết</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Ưu đãi theo mùa và dịp lễ</a>
        </div>
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">
            Cho thuê xe hơi</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Tìm chuyến bay</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Đặt nhà hàng</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Booking.com dành cho Đại Lý Du Lịch</a>
        </div>
        <div class="col">
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Các câu hỏi thường gặp về virus corona (COVID-19)</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Về Booking.com</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Dịch vụ khách hàng</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Trợ giúp đối tác</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Careers</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Du lịch bền vững</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Truyền thông</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Trung tâm thông tin bảo mật</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Quan hệ cổ đông</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Điều khoản và điều kiện</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Tranh chấp đối tác</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Chúng tôi hoạt động như thế nào</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Thông báo về Bảo mật & Cookie</a>
          <a href="" class="text-decoration-none d-block my-1 fs-14 text-blue">Liên hệ công ty</a>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-12">
           <div class="text-center py-5">
              <a href="" class="fw-bold text-black-50 text-brown text-decoration-none">Đăng nhập vào trang Extranet</a>
           </div>
           <div>
            <p class="fs-12">Bản quyền © 1996–2022 Booking.com™. Bảo lưu mọi quyền.</div>
          </div>
      </div>
      <div class="row">
        <div class="col-sm-12">
          <div class="text-center mt-2">
            <p class="fs-12">Booking.com là một phần của Booking Holdings Inc., tập đoàn đứng đầu thế giới về du lịch trực tuyến và các dịch vụ liên quan.</p>
          </div>
          <div class="text-center">
            <img src="${pageContext.request.contextPath}/resources/assets/img/bookinglogo.png" alt="" class="m-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/pricelinelogo.png" alt="" class="m-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/kaykaklogo.png" alt="" class="m-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/agodalogo.png" alt="" class="m-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/rentalcarslogo.png" alt="" class="m-3">
            <img src="${pageContext.request.contextPath}/resources/assets/img/opentablelogo.png" alt="" class="m-3">
          </div>
        </div>
      </div>
    </div>
  </footer>


  

  <script src="${pageContext.request.contextPath}/resources/assets/js/jquery-3.6.0.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/popper.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/toolTip.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/splide.min.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/scrollCustom.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/customSelect.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/flatpickr"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/inputFilterDate.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/customFilter.js"></script>
  <script src="${pageContext.request.contextPath}/resources/assets/js/custom/carouselSplide.js"></script>
  <script>
    $(document).click(function(e){
      $('#user-features').removeClass('show');
    });
  </script>


</body>
</html>
